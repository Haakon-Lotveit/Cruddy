// Generated from Cruddy by ANTLR 4.7
package cruddy.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CruddyParser}.
 */
public interface CruddyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CruddyParser#crudExpression}.
	 * @param ctx the parse tree
	 */
	void enterCrudExpression(CruddyParser.CrudExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CruddyParser#crudExpression}.
	 * @param ctx the parse tree
	 */
	void exitCrudExpression(CruddyParser.CrudExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CruddyParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(CruddyParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CruddyParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(CruddyParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CruddyParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(CruddyParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CruddyParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(CruddyParser.FieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CruddyParser#readers}.
	 * @param ctx the parse tree
	 */
	void enterReaders(CruddyParser.ReadersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CruddyParser#readers}.
	 * @param ctx the parse tree
	 */
	void exitReaders(CruddyParser.ReadersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CruddyParser#deleters}.
	 * @param ctx the parse tree
	 */
	void enterDeleters(CruddyParser.DeletersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CruddyParser#deleters}.
	 * @param ctx the parse tree
	 */
	void exitDeleters(CruddyParser.DeletersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CruddyParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(CruddyParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CruddyParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(CruddyParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CruddyParser#readerDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterReaderDeclaration(CruddyParser.ReaderDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CruddyParser#readerDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitReaderDeclaration(CruddyParser.ReaderDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CruddyParser#deleterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDeleterDeclaration(CruddyParser.DeleterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CruddyParser#deleterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDeleterDeclaration(CruddyParser.DeleterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CruddyParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(CruddyParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CruddyParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(CruddyParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CruddyParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CruddyParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CruddyParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CruddyParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CruddyParser#fieldType}.
	 * @param ctx the parse tree
	 */
	void enterFieldType(CruddyParser.FieldTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CruddyParser#fieldType}.
	 * @param ctx the parse tree
	 */
	void exitFieldType(CruddyParser.FieldTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CruddyParser#objectIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterObjectIdentifier(CruddyParser.ObjectIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CruddyParser#objectIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitObjectIdentifier(CruddyParser.ObjectIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CruddyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(CruddyParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CruddyParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(CruddyParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CruddyParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void enterFieldName(CruddyParser.FieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CruddyParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void exitFieldName(CruddyParser.FieldNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CruddyParser#fieldDBKey}.
	 * @param ctx the parse tree
	 */
	void enterFieldDBKey(CruddyParser.FieldDBKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CruddyParser#fieldDBKey}.
	 * @param ctx the parse tree
	 */
	void exitFieldDBKey(CruddyParser.FieldDBKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CruddyParser#genericType}.
	 * @param ctx the parse tree
	 */
	void enterGenericType(CruddyParser.GenericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CruddyParser#genericType}.
	 * @param ctx the parse tree
	 */
	void exitGenericType(CruddyParser.GenericTypeContext ctx);
}