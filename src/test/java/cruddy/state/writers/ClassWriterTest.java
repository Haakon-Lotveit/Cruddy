package cruddy.state.writers;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collection;

import org.testng.annotations.Test;

import cruddy.model.classes.GeneratedClass;
import cruddy.model.classes.ValueObject;
import cruddy.model.classes.fragments.FieldDeclaration;
import cruddy.model.writers.ClassWriter;

public class ClassWriterTest {

	@Test
	public void writeClass() throws IOException {

		Collection<FieldDeclaration> fields = Arrays.asList(
				new FieldDeclaration("String", "name", "widget_name"),
				new FieldDeclaration("int", "amount", "amount"),
				new FieldDeclaration("List<String>", "instructions", "instructions"));
		String packageDeclaration = "no.test.without.it";
		Collection<String> importStatements = Arrays.asList("java.util.List", "java.util.Map");		
		String className = "Widget";
		
		GeneratedClass gc = new ValueObject(fields, packageDeclaration, importStatements, className);
		
		StringWriter sw = new StringWriter();
		ClassWriter csWriter = new ClassWriter(sw, "    ");
		csWriter.writeClass(gc);
		
		System.out.println(sw.toString());
		
		System.err.println("Test not fully implemented yet though.");
	}
}
