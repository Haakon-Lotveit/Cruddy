package cruddy.model.classes;

import java.util.List;

import cruddy.model.classes.fragments.Argument;
import cruddy.model.classes.fragments.FieldDeclaration;
import cruddy.model.classes.fragments.MethodDeclaration;

/**
 * This is a common interface for defining readers and deleters in the DAO.
 * There are of course other methods that needs to be defined, but we can
 * deal with those later.
 */
public interface DaoMethod {
	public String getMethodName();
	public String getQuery();
	public List<Argument> getArguments();
	public List<FieldDeclaration> getFields();
	/**
	 * <p>
	 * This is the money-method. Calling this will create a MethodDeclaration object
	 * that can be used directly by the class to build the method.
	 * Note that this method can be implemented by using some of the default methods
	 * that are provided, but it does not have to be.
	 * </p><p>
	 * When it comes to the method's priority, reader methods are required to have a priority of 100,
	 * and deleter methods of 50.
	 * This leaves plenty of space for other methods that for whatever reason wants to go inbetween.
	 * @return A fully functioning MethodDeclaration, that will never be null. 
	 */
	public MethodDeclaration toMethod();
}

/*
readers (
getByUuid:
  query: "SELECT * FROM Widget WHERE id = ?"
  args: (UUID id))
*/