package cruddy;

import org.antlr.v4.runtime.tree.ErrorNode;

import cruddy.generated.CruddyBaseListener;
import cruddy.generated.CruddyParser.CrudExpressionContext;
import cruddy.generated.CruddyParser.DeleterDeclarationContext;
import cruddy.generated.CruddyParser.DeletersContext;
import cruddy.generated.CruddyParser.FieldDBKeyContext;
import cruddy.generated.CruddyParser.FieldDeclarationContext;
import cruddy.generated.CruddyParser.FieldNameContext;
import cruddy.generated.CruddyParser.FieldTypeContext;
import cruddy.generated.CruddyParser.FieldsContext;
import cruddy.generated.CruddyParser.QueryContext;
import cruddy.generated.CruddyParser.ReaderDeclarationContext;
import cruddy.generated.CruddyParser.ReadersContext;
import cruddy.generated.CruddyParser.TypeNameContext;
import cruddy.generated.CruddyParser.VariableContext;

public class CruddyVisitorListener extends CruddyBaseListener {
	private ValueObjectExtractor voe;
	
	public CruddyVisitorListener(ValueObjectExtractor voe) {
		super();
		this.voe = voe;
	}
	
	@Override
	public void visitErrorNode(ErrorNode node) {
		System.err.println("We have an error here: " + node.getText());
	}

	@Override
	public void enterCrudExpression(CrudExpressionContext ctx) {
		System.out.println("Defining a new CRUD package");
	}

	@Override
	public void exitCrudExpression(CrudExpressionContext ctx) {
		System.out.println("all done");
		
	}
	
	@Override
	public void enterTypeName(TypeNameContext ctx) {
		System.out.println("We now know that the typename of our CRUD object is: " + ctx.getText());
		voe.setClassName(ctx.getText());
	}

	@Override
	public void enterFields(FieldsContext ctx) {
		System.out.println("defining some fields");
	}
	
	@Override
	public void exitFields(FieldsContext ctx) {
		System.out.println("fields all defined");
	}

	@Override
	public void enterReaders(ReadersContext ctx) {
		System.out.println("getting the db selection methods");
	}

	@Override
	public void enterDeleters(DeletersContext ctx) {
		System.out.println("Defining some deleters");
	}

	@Override
	public void enterFieldDeclaration(FieldDeclarationContext ctx) {
		System.out.println("getting a specific field (type, name, queryString)");
	}
	
	@Override
	public void exitFieldDeclaration(FieldDeclarationContext ctx) {
		voe.doneWithField();
	}

	@Override
	public void enterReaderDeclaration(ReaderDeclarationContext ctx) {
		System.out.println("We're now parsing out some readers");
	}

	@Override
	public void enterDeleterDeclaration(DeleterDeclarationContext ctx) {
		System.out.println("Declaring deleters");
	}

	@Override
	public void enterQuery(QueryContext ctx) {
		System.out.println("Getting a query here:" + ctx.getText());
	}

	@Override
	public void enterVariable(VariableContext ctx) {
		System.out.println("we're getting a variable");
	}

	@Override
	public void enterFieldType(FieldTypeContext ctx) {
		System.out.println("Our field has the type of: " + ctx.getText());
		voe.fieldType(ctx.getText());
	}

	@Override
	public void enterFieldName(FieldNameContext ctx) {
		System.out.println("the variable name of our object is: " + ctx.getText());
		voe.fieldName(ctx.getText());
	}

	@Override
	public void enterFieldDBKey(FieldDBKeyContext ctx) {
		System.out.println("and the database key (column key for sql) is: " + ctx.getText());
		voe.dbKey(ctx.getText());
	}
}
