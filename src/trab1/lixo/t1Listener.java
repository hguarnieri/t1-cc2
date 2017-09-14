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
	 * Enter a parse tree produced by {@link t1Parser#mais_var}.
	 * @param ctx the parse tree
	 */
	void enterMais_var(t1Parser.Mais_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#mais_var}.
	 * @param ctx the parse tree
	 */
	void exitMais_var(t1Parser.Mais_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(t1Parser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(t1Parser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#ponteiros_opcionais}.
	 * @param ctx the parse tree
	 */
	void enterPonteiros_opcionais(t1Parser.Ponteiros_opcionaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#ponteiros_opcionais}.
	 * @param ctx the parse tree
	 */
	void exitPonteiros_opcionais(t1Parser.Ponteiros_opcionaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#outros_ident}.
	 * @param ctx the parse tree
	 */
	void enterOutros_ident(t1Parser.Outros_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#outros_ident}.
	 * @param ctx the parse tree
	 */
	void exitOutros_ident(t1Parser.Outros_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(t1Parser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(t1Parser.DimensaoContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link t1Parser#mais_ident}.
	 * @param ctx the parse tree
	 */
	void enterMais_ident(t1Parser.Mais_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#mais_ident}.
	 * @param ctx the parse tree
	 */
	void exitMais_ident(t1Parser.Mais_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#mais_variaveis}.
	 * @param ctx the parse tree
	 */
	void enterMais_variaveis(t1Parser.Mais_variaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#mais_variaveis}.
	 * @param ctx the parse tree
	 */
	void exitMais_variaveis(t1Parser.Mais_variaveisContext ctx);
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
	 * Enter a parse tree produced by {@link t1Parser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(t1Parser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(t1Parser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(t1Parser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(t1Parser.Tipo_estendidoContext ctx);
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
	 * Enter a parse tree produced by {@link t1Parser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(t1Parser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(t1Parser.RegistroContext ctx);
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
	 * Enter a parse tree produced by {@link t1Parser#parametros_opcional}.
	 * @param ctx the parse tree
	 */
	void enterParametros_opcional(t1Parser.Parametros_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#parametros_opcional}.
	 * @param ctx the parse tree
	 */
	void exitParametros_opcional(t1Parser.Parametros_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(t1Parser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(t1Parser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#var_opcional}.
	 * @param ctx the parse tree
	 */
	void enterVar_opcional(t1Parser.Var_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#var_opcional}.
	 * @param ctx the parse tree
	 */
	void exitVar_opcional(t1Parser.Var_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#mais_parametros}.
	 * @param ctx the parse tree
	 */
	void enterMais_parametros(t1Parser.Mais_parametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#mais_parametros}.
	 * @param ctx the parse tree
	 */
	void exitMais_parametros(t1Parser.Mais_parametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#declaracoes_locais}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes_locais(t1Parser.Declaracoes_locaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#declaracoes_locais}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes_locais(t1Parser.Declaracoes_locaisContext ctx);
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
	 * Enter a parse tree produced by {@link t1Parser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(t1Parser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(t1Parser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(t1Parser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(t1Parser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#mais_expressao}.
	 * @param ctx the parse tree
	 */
	void enterMais_expressao(t1Parser.Mais_expressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#mais_expressao}.
	 * @param ctx the parse tree
	 */
	void exitMais_expressao(t1Parser.Mais_expressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#senao_opcional}.
	 * @param ctx the parse tree
	 */
	void enterSenao_opcional(t1Parser.Senao_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#senao_opcional}.
	 * @param ctx the parse tree
	 */
	void exitSenao_opcional(t1Parser.Senao_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#chamada_atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterChamada_atribuicao(t1Parser.Chamada_atribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#chamada_atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitChamada_atribuicao(t1Parser.Chamada_atribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#argumentos_opcional}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos_opcional(t1Parser.Argumentos_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#argumentos_opcional}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos_opcional(t1Parser.Argumentos_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(t1Parser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(t1Parser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#mais_selecao}.
	 * @param ctx the parse tree
	 */
	void enterMais_selecao(t1Parser.Mais_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#mais_selecao}.
	 * @param ctx the parse tree
	 */
	void exitMais_selecao(t1Parser.Mais_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(t1Parser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(t1Parser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#mais_constantes}.
	 * @param ctx the parse tree
	 */
	void enterMais_constantes(t1Parser.Mais_constantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#mais_constantes}.
	 * @param ctx the parse tree
	 */
	void exitMais_constantes(t1Parser.Mais_constantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(t1Parser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(t1Parser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#intervalo_opcional}.
	 * @param ctx the parse tree
	 */
	void enterIntervalo_opcional(t1Parser.Intervalo_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#intervalo_opcional}.
	 * @param ctx the parse tree
	 */
	void exitIntervalo_opcional(t1Parser.Intervalo_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(t1Parser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(t1Parser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(t1Parser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(t1Parser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#op_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void enterOp_multiplicacao(t1Parser.Op_multiplicacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#op_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void exitOp_multiplicacao(t1Parser.Op_multiplicacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#op_adicao}.
	 * @param ctx the parse tree
	 */
	void enterOp_adicao(t1Parser.Op_adicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#op_adicao}.
	 * @param ctx the parse tree
	 */
	void exitOp_adicao(t1Parser.Op_adicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(t1Parser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(t1Parser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos(t1Parser.Outros_termosContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos(t1Parser.Outros_termosContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(t1Parser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(t1Parser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#outros_fatores}.
	 * @param ctx the parse tree
	 */
	void enterOutros_fatores(t1Parser.Outros_fatoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#outros_fatores}.
	 * @param ctx the parse tree
	 */
	void exitOutros_fatores(t1Parser.Outros_fatoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(t1Parser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(t1Parser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(t1Parser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(t1Parser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(t1Parser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(t1Parser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#outras_parcelas}.
	 * @param ctx the parse tree
	 */
	void enterOutras_parcelas(t1Parser.Outras_parcelasContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#outras_parcelas}.
	 * @param ctx the parse tree
	 */
	void exitOutras_parcelas(t1Parser.Outras_parcelasContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#chamada_partes}.
	 * @param ctx the parse tree
	 */
	void enterChamada_partes(t1Parser.Chamada_partesContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#chamada_partes}.
	 * @param ctx the parse tree
	 */
	void exitChamada_partes(t1Parser.Chamada_partesContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(t1Parser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(t1Parser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#op_opcional}.
	 * @param ctx the parse tree
	 */
	void enterOp_opcional(t1Parser.Op_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#op_opcional}.
	 * @param ctx the parse tree
	 */
	void exitOp_opcional(t1Parser.Op_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(t1Parser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(t1Parser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(t1Parser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(t1Parser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#op_nao}.
	 * @param ctx the parse tree
	 */
	void enterOp_nao(t1Parser.Op_naoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#op_nao}.
	 * @param ctx the parse tree
	 */
	void exitOp_nao(t1Parser.Op_naoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(t1Parser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(t1Parser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#outros_termos_logicos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos_logicos(t1Parser.Outros_termos_logicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#outros_termos_logicos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos_logicos(t1Parser.Outros_termos_logicosContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#outros_fatores_logicos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_fatores_logicos(t1Parser.Outros_fatores_logicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#outros_fatores_logicos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_fatores_logicos(t1Parser.Outros_fatores_logicosContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(t1Parser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(t1Parser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t1Parser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(t1Parser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t1Parser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(t1Parser.Parcela_logicaContext ctx);
}