package cruddy.model.classes.fragments;

import static java.util.Collections.unmodifiableCollection;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

import lombok.NonNull;
/**
 * A MethodDeclaration represents the source code of a method.
 * You can get an immutable collection of the contents, format the whole thing, ask for the method name, etc.
 * The priority says something about what order you want to have the methods in.
 * Higher priorities are inserted before other priorities. Methods created with no explicit order will have it set to 0.
 */
@lombok.Value
final public class MethodDeclaration implements Comparable<MethodDeclaration>{
	private static final Comparator<MethodDeclaration> cmp = Comparator.comparingInt(MethodDeclaration::getPriority).reversed().thenComparing(MethodDeclaration::getName);
	String name;
	Collection<CodeLine> codeLines;
	int priority;
	
	public MethodDeclaration(@NonNull final String name, int priority, @NonNull final Collection<CodeLine> codeLines) {
		this.name = name;
		ArrayList<CodeLine> defensiveCopy = new ArrayList<>(codeLines);
		this.codeLines = unmodifiableCollection(defensiveCopy);
		this.priority = priority;
	}
	
	public MethodDeclaration(@NonNull final String name, @NonNull final Collection<CodeLine> codeLines) {
		this(name, 0, codeLines);
	}

	@Override
	public int compareTo(MethodDeclaration other) {
		return cmp.compare(this, other);
	}
		
	public Collection<String> formatAll(String whitespace) {
		return codeLines.stream()
				.map(l -> l.format(whitespace))
				.collect(toList()); 
	}
}
