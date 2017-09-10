package cruddy.model.classes;

import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import cruddy.ConnectionProvider;
import cruddy.model.classes.fragments.CodeLine;
import cruddy.model.classes.fragments.MethodDeclaration;

public class GeneratedDAO extends AbstractGeneratedClass {
	private Collection<DaoMethod> daoMethods;
	
	public GeneratedDAO(Collection<DaoMethod> daoMethods, String packageDeclaration, Collection<String> classesToImport, String className) {
		super(packageDeclaration, classesToImport, className);
		super.classesToImport.add(ConnectionProvider.class.getCanonicalName()); // This makes refactorings safe.
		// TODO: Add all the classes that's needed from the Reader class. THere's quite a few.
		this.daoMethods = daoMethods;
	}

	@Override
	public Collection<CodeLine> getFieldDeclarations() {
		/* What fields do we actually need to know about? *
		 * ConnectionProvider.
		 * Queries?
		 * Start with CP. 
		 */
		return Arrays.asList(new CodeLine("private final ConnectionProvider connectionProvider;"));
	}

	@Override
	public Collection<MethodDeclaration> getConstructorDeclarations() {
		// TODO: Define a constructor
		return Collections.emptyList();
	}

	@Override
	public Collection<MethodDeclaration> getMethodDeclarations() {
		return daoMethods.stream().map(DaoMethod::toMethod).collect(toList());
	}

	@Override
	public String getClassStatement() {
		return String.format("public final class %s {", getClassName());
	}

}
