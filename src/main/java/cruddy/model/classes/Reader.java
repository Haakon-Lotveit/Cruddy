package cruddy.model.classes;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import cruddy.model.classes.fragments.Argument;
import cruddy.model.classes.fragments.CodeLine;
import cruddy.model.classes.fragments.FieldDeclaration;
import cruddy.model.classes.fragments.MethodDeclaration;
import lombok.Value;

/**
 * A reader is a method that reads data from a database.
 * This class does not represent such a method, but the declaration of such a method in the cruddy spec.
 */
@Value
public final class Reader implements DaoMethod {
	private final String methodName;
	private final String query;
	private final List<Argument> arguments;
	private final List<FieldDeclaration> fields;
	// TODO: "// import: java.sql.Connection, java.sql.PreparedStatement, java.sql.ResultSet, java.util.List, java.util.ArrayList\r\n" + 

	@Override
	public MethodDeclaration toMethod() {
		final int priority = 100;
		final String name = generateName();
		final List<CodeLine> codeLines = new ArrayList<>();
		codeLines.add(new CodeLine(0, "public List<Widget> " + generateCallName() + " throws SQLException {"));
		codeLines.add(new CodeLine(0, "try(Connection conn = connectionProvider.provideConnection();"));
		codeLines.add(new CodeLine(1, "PreparedStatment ps = conn.prepareStatement(\"" + query + "\")) {"));
		codeLines.addAll(generatePsSetLines());
		codeLines.add(new CodeLine(2, "ps.setObject(1, uuid);")); // TODO: Generate these based on arguments field
		codeLines.add(new CodeLine(2, "try(ResultSet rs = ps.executeQuery()) {"));
		codeLines.add(new CodeLine(3, "List<Widget> out = new ArrayList<>();"));
		codeLines.add(new CodeLine(3, "while(rs.next()) {"));
		codeLines.add(new CodeLine(4, "String name = rs.getString(\"widget_name\");")); // These needs to be updated based on fields
		codeLines.add(new CodeLine(4, "int storedAmount = rs.getInt(\"storage_amount\");"));
		codeLines.add(new CodeLine(4, "LocalDateTime lastUpdated = rs.getTimeStamp(\"last_updated\").toLocalDateTime();"));
		codeLines.add(new CodeLine(4, "out.add(new Widget(name, storedAmount, lastUpdated));"));
		codeLines.add(new CodeLine(3, "}"));
		codeLines.add(new CodeLine(3, "return out;"));
		codeLines.add(new CodeLine(2, "}"));
		codeLines.add(new CodeLine(1, "}"));
		codeLines.add(new CodeLine(0, "}"));

		return new MethodDeclaration(name, priority, codeLines);
	}

	// TODO: This is actually a massive undertaking. We're not just asking for ps.setString,Int, etc., we need to map
	//       pretty much ALL types to the correct set-method.
	/*
	 * List of methods and their status:
	 * -- I'll need to get a full list of java.sql.* stuff here and what types map to them, from them and how.
	 * -- I'll special case it here first to get something up and running and then refactor it out afterwards.
	 */
	private Collection<? extends CodeLine> generatePsSetLines() {
		// TODO Auto-generated method stub
		return null;
	}

	private String generateName() {
		StringBuilder sb = new StringBuilder();

		sb.append(methodName).append("(");
		sb.append(String.join(", ", arguments.stream().map(Argument::getType).collect(toList())));
		sb.append(")");

		return sb.toString();
	}
	
	private String generateCallName() {
		StringBuilder sb = new StringBuilder();
		sb.append(methodName).append("(");
		sb.append(String.join(", ", arguments.stream().map(arg -> arg.getType() + " " + arg.getName()).collect(toList())));
		sb.append(")");
		
		return sb.toString();
	}
}
