package cruddy.model.classes;

import java.io.File;
import java.util.Collection;

import cruddy.model.classes.fragments.CodeLine;
import cruddy.model.classes.fragments.MethodDeclaration;

public interface GeneratedClass {
	/**
	 * Given a base path (like say the src/main/java folder in a maven directory setup), returns the filename where this 
	 * @param basePath the base path. It can be relative or absolute, but must end with a separator.
	 * @return A File suitable for writing to to fill out a given class.
	 */
	public File getPath(String basePath);
	
	/**
	 * A package declaration is the "package bla.bla.Classname;" thing at the top of a java file.
	 * @return this class' package declaration, ready to print.
	 */
	public Collection<CodeLine> getPackageDeclaration();
	
	/**
	 * This method returns an array of Strings,
	 * each of which contains a well formatted import statement. This is meant to be used by classes that write these types of files to disk or wherever else. 
	 * @return an array of well formatted import statements ready to be printed into a java class.
	 */
	public Collection<CodeLine> getImportStatements();
	
	/**
	 * Gets you the classname of this class.
	 * @return the (unqualified) classname of this class.
	 */
	public String getClassName();
	
	/**
	 * @return the field declarations, in a printable form. 
	 */
	public Collection<CodeLine> getFieldDeclarations(); 
	
	/**
	 * The constructors here are not guaranteed to be in any particular order.
	 * However, it would be neat if there were.
	 * This collection cannot be empty.
	 * @return a non-empty collection of constructor declarations.
	 */
	public Collection<MethodDeclaration> getConstructorDeclarations();
	
	/**
	 * The methods here should be in some form of order, but there's no guarantees as per the interface. Check the docs for the implementing class.
	 * @return an array of method declarations as an array of String, where every element of the array is a String to be written.
	 */
	public Collection<MethodDeclaration> getMethodDeclarations();
	
	/**
	 * @return This returns the opening line that declares the class, such as "public final class Foo {" as an example.
	 */
	public String getClassStatement();
	
}
