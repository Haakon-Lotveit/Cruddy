	package cruddy.model.classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import cruddy.model.classes.fragments.CodeLine;
import cruddy.model.classes.fragments.FieldDeclaration;
import cruddy.model.classes.fragments.MethodDeclaration;

public class ValueObject extends AbstractGeneratedClass {

	protected final Collection<FieldDeclaration> fields;

	public ValueObject(Collection<FieldDeclaration> fields, String packageDeclaration, Collection<String> importStatements, String className) {
		super(packageDeclaration, importStatements, className);
		List<FieldDeclaration> defensiveCopy = new LinkedList<FieldDeclaration>(fields);
		Collections.sort(defensiveCopy);
		this.fields = defensiveCopy;
		super.classesToImport.add("java.util.Objects");		
	}

	@Override
	public Collection<CodeLine> getFieldDeclarations() {
		return fields.stream()
				.sorted(FieldDeclaration.STANDARD_COMPARATOR)
				.map(f -> f.format("private final"))
				.map(s -> new CodeLine(0, s))
				.collect(Collectors.toList());
	}

	@Override
	public Collection<MethodDeclaration> getMethodDeclarations() {
		ArrayList<MethodDeclaration> methods = new ArrayList<>();

		for(FieldDeclaration field : fields) {
			List<CodeLine> codeLines = new ArrayList<>();
			String methodName = String.format("get%C%s()", field.getName().charAt(0), field.getName().substring(1));
			codeLines.add(new CodeLine(0, String.format("public %s %s {", field.getType(), methodName)));
			codeLines.add(new CodeLine(1, String.format("return %s;", field.getName())));
			codeLines.add(new CodeLine(0, "}"));

			methods.add(new MethodDeclaration(methodName, 5, codeLines));
		}

		methods.add(equalsMethod());
		methods.add(hashCodeMethod());
		methods.add(toStringMethod());

		return methods;
	}


	public MethodDeclaration hashCodeMethod() {
		List<CodeLine> codeLines = new LinkedList<>();
		int priority = -10;

		codeLines.add(new CodeLine(0, "@Override"));
		codeLines.add(new CodeLine(0, "public int hashCode() {"));
		StringBuilder hashBuilder = new StringBuilder("return 31");
		for(FieldDeclaration fd : fields) {
			hashBuilder.append(" * Objects.hashCode(").append(fd.getName()).append(")");
		}
		hashBuilder.append(";");
		codeLines.add(new CodeLine(1, hashBuilder.toString()));
		codeLines.add(new CodeLine(0, "}"));

		return new MethodDeclaration("hashCode()", priority, codeLines);
	}


	public MethodDeclaration equalsMethod() {
		int priority = -10;
		List<CodeLine> codeLines = new LinkedList<>();

		codeLines.add(new CodeLine(0, "@Override"));
		codeLines.add(new CodeLine(0, "public boolean equals(Object other) {"));
		codeLines.add(new CodeLine(1, "if(!(other instanceof " + getClassName() + ")) { return false; }"));
		codeLines.add(new CodeLine(1, String.format("%s that = (%s) other;", getClassName(), getClassName())));
		codeLines.add(new CodeLine(1, "return"));
		for(FieldDeclaration field : fields) {
			String fn = field.getName();
			codeLines.add(new CodeLine(2, String.format("Objects.equals(this.%s, that.%s) &&", fn, fn)));
		}
		codeLines.add(new CodeLine(2, "true;"));
		codeLines.add(new CodeLine(0, "}"));

		return new MethodDeclaration("equals(Object other)", priority, codeLines);
	}

	public MethodDeclaration toStringMethod() {
		int priority = -10;
		List<CodeLine> codeLines = new LinkedList<>();

		codeLines.add(new CodeLine(0, "@Override"));
		codeLines.add(new CodeLine(0, "public String toString() {"));
		StringBuilder sb = new StringBuilder("return \"").append(getClassName()).append("[\" + ");
		for(FieldDeclaration field : fields) {
			String fn = field.getName();
			sb.append(String.format("\" %s=\" + %s + ", fn, fn));			
		}
		codeLines.add(new CodeLine(1, sb.append("\" ]\";").toString()));
		codeLines.add(new CodeLine(0, "}"));

		return new MethodDeclaration("toString()", priority, codeLines);
	}

	@Override
	public String getClassStatement() {
		return String.format("public class %s {", getClassName());
	}

	@Override
	public Collection<MethodDeclaration> getConstructorDeclarations() {
		ArrayList<MethodDeclaration> out = new ArrayList<>();
		ArrayList<CodeLine> codeLines = new ArrayList<>();
		
		String constructorArguments = String.join(", ", fields.stream().map(field -> String.format("%s %s", field.getType(), field.getName())).collect(Collectors.toList()));
		
		String constructorSignature =  "public " + getClassName() + "(" + constructorArguments +") {";
		codeLines.add(new CodeLine(0, constructorSignature));
		fields.stream().map(FieldDeclaration::getName).forEach(name -> codeLines.add(new CodeLine(1, "this." + name + " = " + name + ";")));
		codeLines.add(new CodeLine(0, "}"));
		
		MethodDeclaration allArgs = new MethodDeclaration("Constructor", codeLines);
		out.add(allArgs);
		
		return out;
	}

}
