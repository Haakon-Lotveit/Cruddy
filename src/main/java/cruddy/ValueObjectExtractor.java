package cruddy;

import java.util.ArrayList;

import cruddy.model.classes.ValueObject;
import cruddy.model.classes.fragments.FieldDeclaration;

/**
 * Used by a visitor to build a value object, by walking the parse tree
 * and calling this at specific events.
 */
public class ValueObjectExtractor {
	private String className;
	private String packageDeclaration;
	private ArrayList<String> importStatements;
	private ArrayList<FieldDeclaration> fields;
	private FieldDeclaration.FieldDeclarationBuilder fieldDeclarationBuilder;
	
	public ValueObjectExtractor() {
		className = "";
		packageDeclaration = "";
		importStatements = new ArrayList<>();
		fields = new ArrayList<>();
		fieldDeclarationBuilder = FieldDeclaration.builder();
	}

	public void setClassName(String newClassName) {
		this.className = newClassName;
	}

	public void doneWithField() {
		fields.add(fieldDeclarationBuilder.build());
		fieldDeclarationBuilder = FieldDeclaration.builder();
	}

	public void fieldType(String typeName) {
		fieldDeclarationBuilder.type(typeName);
	}

	public void fieldName(String fieldName) {
		fieldDeclarationBuilder.name(fieldName);
	}

	public void dbKey(String dbName) {
		fieldDeclarationBuilder.dbKey(dbName);
	}
	
	public ValueObject generate() {
		return new ValueObject(fields, packageDeclaration, importStatements, className);
	}
	
}
