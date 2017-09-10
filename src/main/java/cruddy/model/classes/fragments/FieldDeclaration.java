package cruddy.model.classes.fragments;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value @Builder @AllArgsConstructor
public class FieldDeclaration implements Comparable<FieldDeclaration> {
	public static Comparator<FieldDeclaration> STANDARD_COMPARATOR = 
			Comparator.comparing(FieldDeclaration::getName)
			.thenComparing(FieldDeclaration::getType)
			.thenComparing(FieldDeclaration::getDbKey);

	String type;
	String name;
	String dbKey;
	
	/**
	 * @param modifiers public, static, final, etc. stuff. Remember to add spaces between them. ;)
	 * @return a field declaration ready to be put into source code.
	 */
	public String format(String modifiers) {
		return String.format("%s %s %s;", modifiers, type, name);
	}

	@Override
	public int compareTo(FieldDeclaration other) {
		return STANDARD_COMPARATOR.compare(this, other);
	}
}
