package cruddy.model.classes;

import java.io.StringWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.testng.annotations.Test;

import cruddy.model.classes.fragments.Argument;
import cruddy.model.classes.fragments.FieldDeclaration;
import cruddy.model.writers.ClassWriter;

public class GeneratedDAOTest {
	/*
	 * The goal here is to grow some sort of definition of what information the GeneratedDAO needs,
	 * and in what format said information should come in.
	 */
  @Test
  public void createAndPrint() throws Throwable {
	  final String packageDeclaration = "no.haakon.test.dao";
	  final Collection<String> classesToImport = Arrays.asList(LocalDateTime.class.getCanonicalName(), java.util.UUID.class.getCanonicalName());
	  final String className = "WidgetDAO";
	  final List<DaoMethod> daoMethods = new ArrayList<>();
	  final List<FieldDeclaration> fields = Arrays.asList(
			  new FieldDeclaration("String", "name", "widget_name"),
			  new FieldDeclaration("int", "storedAmount", "storage_amount"),
			  new FieldDeclaration("LocalDateTime", "lastUpdated", "last_updated"));
	  
	  daoMethods.add(
			  new Reader("getByUuid", "SELECT * FROM Widget WHERE id = ?", Arrays.asList(new Argument("UUID", "id")), fields));

	  GeneratedDAO someDao = new GeneratedDAO(daoMethods, packageDeclaration, classesToImport, className);
	  
	  StringWriter sw = new StringWriter();
	  ClassWriter.tabs(sw).writeClass(someDao);
	  
	  System.out.println(sw);
  }
}
/*
type Widget (
fields (
  String name "widget_name"
  int storedAmount "storage_amount"
  java.time.LocalDateTime lastUpdated "last_updated")
readers (
  getByUuid:
    query: "SELECT * FROM Widget WHERE id = ?"
    args: (java.util.UUID id))
deleters (
  deleteByUuid:
    query: "DELETE FROM Widget WHERE id = ?"
    args: (java.util.UUID id)))

*/