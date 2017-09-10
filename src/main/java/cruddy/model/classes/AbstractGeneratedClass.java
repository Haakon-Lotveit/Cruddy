package cruddy.model.classes;

import static java.lang.String.format;
import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

import java.io.File;
import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;

import cruddy.model.classes.fragments.CodeLine;

/**
 * This is a basic type class. It contains information that is common to ALL generated classes, such as:
 *  - The package statement
 *  - The import statements for types (not for specific annotations. classes that generated annotations are responsible for pulling them in themselves and adding them in afterwards.)
 *  - The classname
 *  - The generated filename (based on a base folder + package statement + classname)
 */
public abstract class AbstractGeneratedClass implements GeneratedClass {
	protected String packageDeclaration;
	protected TreeSet<String> classesToImport; // Tree sets are always sorted, and so are a really good fit for this. Don't have to do ANY checks or sorting commands. :D
	protected String className;
	
	/**
	 * This sets up the base class with information, so that it can print stuff.
	 * You can add to the import statements later, so if you need to put annotation imports in, just do it after your call to super.
	 * Imagine a constructor for an imaginary class like so:
	 * <code><br>
	 * GeneratedClass(String packageDeclaration, Collection<String> importStatements, String className) {<br>
	 * &nbsp;&nbsp;super(packageDeclaration, importStatements, className);<br>
	 * &nbsp;&nbsp;super.importStatements.add("javax.xml.bind.annotation.XmlID");<br>
	 * }<br>
	 * </code>
	 * Works JUST FINE. Just do that, it has protected visibility specifically so you can call it.
	 * 
	 * If you need to import something statically, remember that:<br>
	 * classesToImport.add("java.lang.String"); // will turn into "import java.lang.String;"<br>
	 * classesToImport.add("static java.lang.String.format";
	 * 
	 * Do notice however that the job of this class is NOT to write itself to a file. That's the job of a separate class.
	 * @param packageDeclaration the package declaration. It is completely naïve and does not check if it's valid.
	 * @param classesToImport assumes every String is valid. It will sort the strings, and make sure that they're all unique.
	 * @param className is completely naïve and does not check if it's valid.
	 */
	public AbstractGeneratedClass(String packageDeclaration, Collection<String> classesToImport, String className) {
		this.packageDeclaration = packageDeclaration;
		this.classesToImport = new TreeSet<>(classesToImport);
		this.className = className;
	}
	
	@Override
	public File getPath(String basepath) {
		char dot = '.';
		char sep = File.separatorChar;
		
		return new File(basepath + packageDeclaration.replace(dot, sep) + sep + className + ".java");
	}
	
	@Override
	public Collection<CodeLine> getPackageDeclaration() {
		if(packageDeclaration.isEmpty()) {
			return emptyList();
		}
		
		return asList(new CodeLine(0, format("package %s;", packageDeclaration)));
	}
	
	@Override
	public Collection<CodeLine> getImportStatements() {
		
		LinkedList<CodeLine> out = new LinkedList<>();
		for(String importStatement : classesToImport) {
			out.add(new CodeLine(0, format("import %s;", importStatement)));
		}		
		return out;
	}
	
	@Override
	public String getClassName() {
		return className;
	}
}					
