// Generated from t1.g4 by ANTLR 4.7
package trab1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link t1Parser}.
 */
public interface t1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link t1Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(t1Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(t1Parser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(t1Parser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(t1Parser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(t1Parser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(t1Parser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(t1Parser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(t1Parser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(t1Parser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(t1Parser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(t1Parser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(t1Parser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(t1Parser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(t1Parser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(t1Parser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(t1Parser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(t1Parser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(t1Parser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(t1Parser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(t1Parser.TipoContext ctx);
}