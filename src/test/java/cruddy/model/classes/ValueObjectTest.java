package cruddy.model.classes;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import cruddy.model.classes.ValueObject;
import cruddy.model.classes.fragments.CodeLine;
import cruddy.model.classes.fragments.FieldDeclaration;
import cruddy.model.classes.fragments.MethodDeclaration;

public class ValueObjectTest {

	public Collection<FieldDeclaration> fields = Arrays.asList(new FieldDeclaration("String", "name", "\"widget_name\""), new FieldDeclaration("int", "amount", "\"amount\""));
	public String packageDeclaration = "no.test.without.it";
	public Collection<String> importStatements = Arrays.asList("static java.lang.String.format", "java.util.List");
	public String className = "Widget";

	public ValueObject candidate = new ValueObject(fields, packageDeclaration, importStatements, className);

	@BeforeTest
	public void setUp() {
		System.out.println("Resetting any state...");
		candidate = new ValueObject(fields, packageDeclaration, importStatements, className);
	}

	@Test
	public void equalsMethod() {
		String ws = "__";

		Collection<String> actuals = candidate.equalsMethod().formatAll(ws);
		Collection<String> expecteds = Arrays.asList(
				"@Override",
				"public boolean equals(Object other) {",
				ws + "if(!(other instanceof Widget)) { return false; }",
				ws + "Widget that = (Widget) other;",
				ws + "return",
				ws + ws + "Objects.equals(this.amount, that.amount) &&",
				ws + ws + "Objects.equals(this.name, that.name) &&",
				ws + ws +"true;",
				"}");

		actuals.forEach(System.out::println);
		assertEquals(actuals, expecteds);
	}

	@Test
	public void getFieldDeclarations() {
		String ws = "  there should be no whitespace at all  ".toUpperCase().replace(' ', '_');
		
		Iterator<CodeLine> iter = candidate.getFieldDeclarations().iterator();
		String actual1 = iter.next().format(ws);
		String actual2 = iter.next().format(ws);

		String expected1 = "private final int amount;";
		String expected2 = "private final String name;";

		assertEquals(actual1, expected1);
		assertEquals(actual2, expected2);
	}

	@Test
	public void getMethodDeclarations() {
		assertTrue(candidate.getMethodDeclarations().size() == 5); // This must be updated to take constructors into account.
		String whitespace = "    ";
		System.out.println("Printing all methods:");
		for(MethodDeclaration method : candidate.getMethodDeclarations()) {
			method.formatAll(whitespace).forEach(System.out::println);
		}
	}

	@Test
	public void hashCodeMethod() {
		String ws = "_";
		Collection<String> actual = candidate.hashCodeMethod().formatAll(ws);
		Collection<String> expected = Arrays.asList(
				"@Override",
				"public int hashCode() {",
				ws + "return 31 * Objects.hashCode(amount) * Objects.hashCode(name);",
				"}");

		assertEquals(actual, expected);
	}

	@Test
	public void toStringMethod() {
		String whitespace = "_";

		Collection<String> expected = Arrays.asList(
				"@Override",
				"public String toString() {",
				whitespace + "return \"Widget[\" + \" amount=\" + amount + \" name=\" + name + \" ]\";",
				"}");
		Collection<String> actual = candidate.toStringMethod().formatAll(whitespace);

		assertEquals(actual, expected);

	}

	@Test
	public void testPackage() {
		Iterator<CodeLine> iter = candidate.getPackageDeclaration().iterator();
		String actual = iter.next().format("!!!!!!!!!!!!!!!!!!!!!!!!");
		
		assertFalse(iter.hasNext());
		
		String expected = "package no.test.without.it;";

		assertEquals(actual, expected);
	}

	@Test
	public void testEmptyStringPackageDeclaration() {
		ValueObject noPackageDeclaration = new ValueObject(fields, "", importStatements, className);
		Collection<CodeLine> actual = noPackageDeclaration.getPackageDeclaration();
		
		assertTrue(actual.size() == 0);
	}
	
	@Test
	public void testClassStuff() {
		String actual = candidate.getClassName();
		String expected = className;

		assertEquals(actual, expected);
	}

	@Test
	public void checkFileGeneration() {
		final char sep = File.separatorChar;
		// It would be a bit sad if the test failed because we were running on the wrong OS.
		String basepath = sep == '/'? "/spurious/test/folder/" : "C:\\spurious\\test\\folder\\";
		String expectedPath = basepath + "no" + sep + "test" + sep + "without" + sep + "it" + sep + className + ".java";

		File expected = new File(expectedPath); 
		File actual = candidate.getPath(basepath);

		assertEquals(actual, expected);
	}

	@Test 
	public void checkConstructors() {
		final String ws = "__";
		Collection<MethodDeclaration> constructors = candidate.getConstructorDeclarations();
		assertTrue(constructors.size() == 1);
		MethodDeclaration constructor = constructors.iterator().next();

		Collection<String> actuals = constructor.formatAll(ws);
		
		Collection<String> expecteds = Arrays.asList(
				"public Widget(int amount, String name) {",
				ws + "this.amount = amount;",
				ws + "this.name = name;",
				"}");

		assertEquals(actuals, expecteds);
	}
}
