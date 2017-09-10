package cruddy.model.writers;

import java.io.IOException;
import java.io.Writer;
import java.util.Collection;

import cruddy.model.classes.GeneratedClass;
import cruddy.model.classes.fragments.CodeLine;
import cruddy.model.classes.fragments.MethodDeclaration;

public class ClassWriter {
	private final Writer writer;
	private int indentLevel;
	private String ws;


	public ClassWriter(Writer writer, int startingIndentLevel, String whitespace) {
		this.writer = writer;
		this.indentLevel = startingIndentLevel;
		this.ws = whitespace;
	}

	public ClassWriter(Writer writer, String whitespace) {
		this(writer, 0, whitespace);
	}
	
	public static ClassWriter space2(Writer writer) { return new ClassWriter(writer, 0, "  "); }
	public static ClassWriter space4(Writer writer) { return new ClassWriter(writer, 0, "    "); }
	public static ClassWriter space8(Writer writer) { return new ClassWriter(writer, 0, "        "); }
	public static ClassWriter   tabs(Writer writer) { return new ClassWriter(writer, 0, "\t"); }
	
	public void writeClass(GeneratedClass writeMe) throws IOException {
		try {
			writePackageDeclaration(writeMe);
			writeImportsDeclarations(writeMe);
			openClassStatement(writeMe);
			writeFields(writeMe);
			writeConstructors(writeMe);
			writeMethods(writeMe);
			closeClassStatement(writeMe);
		}
		catch(RuntimeException re) {
			Throwable cause = re.getCause();
			if(null == cause || !(cause instanceof IOException)) {
				throw new IOException(re);
			}
			else {
				throw (IOException) cause;
			}
		}
	}

	private void openClassStatement(GeneratedClass writeMe) {
		writeRawString(writeMe.getClassStatement());
		newline();
		++indentLevel;
	}

	private void closeClassStatement(GeneratedClass writeMe) {
		--indentLevel;
		writeRawString("}");
	}
	
	private void writePackageDeclaration(GeneratedClass writeMe) {
		Collection<CodeLine> packageDeclaration = writeMe.getPackageDeclaration();
		packageDeclaration.forEach(this::write);
		if(!packageDeclaration.isEmpty()) { newline(); }
	}
	
	private void writeImportsDeclarations(GeneratedClass writeMe) {
		Collection<CodeLine> imports = writeMe.getImportStatements();
		imports.stream().sorted().forEach(this::write);
		if(!imports.isEmpty()) { newline(); }
	}
	
	private void writeFields(GeneratedClass writeMe) {
		Collection<CodeLine> fields = writeMe.getFieldDeclarations();
		fields.forEach(this::write);
		if(!fields.isEmpty()) { newline(); }
	}
	
	private void writeConstructors(GeneratedClass writeMe) {
		writeMe.getConstructorDeclarations().forEach(this::writeMethodDeclaration);
	}
	
	private void writeMethods(GeneratedClass writeMe) {
		writeMe.getMethodDeclarations().stream()
		.sorted()
		.forEach(this::writeMethodDeclaration);
	}
	
	private void writeMethodDeclaration(MethodDeclaration md) {
		md.formatAll(ws).forEach(this::writeRawString);
		newline();
	}
	
	private void write(CodeLine cl) {
		writeRawString(cl.format(ws));
	}

	private void writeRawString(String string) {
		indent();
		rew(string);
		newline();
	}

	private void newline()  {
		rew("\n");
	}

	private void indent() {
		for(int i = 0; i < indentLevel; ++i) {
			rew(ws);
		}
	}

	private void rew(String str) {
		try {
			writer.write(str);
		}
		catch(IOException ioe) {
			throw new RuntimeException(ioe);
		}
	}

}
