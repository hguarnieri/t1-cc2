// Generated from ../linguagem/T1.g4 by ANTLR 4.7
package trab1.linguagem;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link T1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface T1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link T1Parser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(T1Parser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(T1Parser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#decl_local_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_local_global(T1Parser.Decl_local_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#declaracao_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_local(T1Parser.Declaracao_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(T1Parser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#mais_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_var(T1Parser.Mais_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(T1Parser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#ponteiros_opcionais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPonteiros_opcionais(T1Parser.Ponteiros_opcionaisContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#outros_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutros_ident(T1Parser.Outros_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(T1Parser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(T1Parser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#mais_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_ident(T1Parser.Mais_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#mais_variaveis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_variaveis(T1Parser.Mais_variaveisContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#tipo_basico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico(T1Parser.Tipo_basicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico_ident(T1Parser.Tipo_basico_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#tipo_estendido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_estendido(T1Parser.Tipo_estendidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#valor_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_constante(T1Parser.Valor_constanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(T1Parser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#declaracao_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_global(T1Parser.Declaracao_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#parametros_opcional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_opcional(T1Parser.Parametros_opcionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(T1Parser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#var_opcional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_opcional(T1Parser.Var_opcionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#mais_parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_parametros(T1Parser.Mais_parametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#declaracoes_locais}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes_locais(T1Parser.Declaracoes_locaisContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(T1Parser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(T1Parser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(T1Parser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#mais_expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_expressao(T1Parser.Mais_expressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#senao_opcional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenao_opcional(T1Parser.Senao_opcionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#chamada_atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada_atribuicao(T1Parser.Chamada_atribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#argumentos_opcional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos_opcional(T1Parser.Argumentos_opcionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(T1Parser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#mais_selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_selecao(T1Parser.Mais_selecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(T1Parser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#mais_constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais_constantes(T1Parser.Mais_constantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#numero_intervalo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero_intervalo(T1Parser.Numero_intervaloContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#intervalo_opcional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalo_opcional(T1Parser.Intervalo_opcionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#op_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_unario(T1Parser.Op_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#exp_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_aritmetica(T1Parser.Exp_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#op_multiplicacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_multiplicacao(T1Parser.Op_multiplicacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#op_adicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_adicao(T1Parser.Op_adicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(T1Parser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#outros_termos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutros_termos(T1Parser.Outros_termosContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(T1Parser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#outros_fatores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutros_fatores(T1Parser.Outros_fatoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(T1Parser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#parcela_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_unario(T1Parser.Parcela_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_nao_unario(T1Parser.Parcela_nao_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#outras_parcelas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutras_parcelas(T1Parser.Outras_parcelasContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#chamada_partes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamada_partes(T1Parser.Chamada_partesContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#exp_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_relacional(T1Parser.Exp_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#op_opcional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_opcional(T1Parser.Op_opcionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(T1Parser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(T1Parser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#op_nao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_nao(T1Parser.Op_naoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#termo_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_logico(T1Parser.Termo_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#outros_termos_logicos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutros_termos_logicos(T1Parser.Outros_termos_logicosContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#outros_fatores_logicos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutros_fatores_logicos(T1Parser.Outros_fatores_logicosContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#fator_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_logico(T1Parser.Fator_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link T1Parser#parcela_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_logica(T1Parser.Parcela_logicaContext ctx);
}