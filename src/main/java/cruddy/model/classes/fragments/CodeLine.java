package cruddy.model.classes.fragments;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value @AllArgsConstructor
public class CodeLine implements Comparable<CodeLine> {
	int indentationDepth;
	String line;
	
	public CodeLine(String line) {
		this(0, line);
	}
	
	public String format(String whitespace) {
		StringBuilder out = new StringBuilder();
		for(int i = 0; i < indentationDepth; ++i) {
			out.append(whitespace);
		}
		
		return out.append(line).toString();
	}

	/**
	 * Sort order is purely lexical: It sorts by comparing the lines,
	 * and it ignores indentation depth entirely.
	 */
	@Override
	public int compareTo(CodeLine other) {
		return this.line.compareTo(other.line);
	}
}
