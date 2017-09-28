// Generated from ../linguagem/T1.g4 by ANTLR 4.7
package trab1.linguagem;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link T1Parser}.
 */
public interface T1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link T1Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(T1Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(T1Parser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(T1Parser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(T1Parser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(T1Parser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(T1Parser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(T1Parser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(T1Parser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(T1Parser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(T1Parser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#mais_var}.
	 * @param ctx the parse tree
	 */
	void enterMais_var(T1Parser.Mais_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#mais_var}.
	 * @param ctx the parse tree
	 */
	void exitMais_var(T1Parser.Mais_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(T1Parser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(T1Parser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#ponteiros_opcionais}.
	 * @param ctx the parse tree
	 */
	void enterPonteiros_opcionais(T1Parser.Ponteiros_opcionaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#ponteiros_opcionais}.
	 * @param ctx the parse tree
	 */
	void exitPonteiros_opcionais(T1Parser.Ponteiros_opcionaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#outros_ident}.
	 * @param ctx the parse tree
	 */
	void enterOutros_ident(T1Parser.Outros_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#outros_ident}.
	 * @param ctx the parse tree
	 */
	void exitOutros_ident(T1Parser.Outros_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(T1Parser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(T1Parser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(T1Parser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(T1Parser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#mais_ident}.
	 * @param ctx the parse tree
	 */
	void enterMais_ident(T1Parser.Mais_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#mais_ident}.
	 * @param ctx the parse tree
	 */
	void exitMais_ident(T1Parser.Mais_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#mais_variaveis}.
	 * @param ctx the parse tree
	 */
	void enterMais_variaveis(T1Parser.Mais_variaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#mais_variaveis}.
	 * @param ctx the parse tree
	 */
	void exitMais_variaveis(T1Parser.Mais_variaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(T1Parser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(T1Parser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(T1Parser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(T1Parser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(T1Parser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(T1Parser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(T1Parser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(T1Parser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(T1Parser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(T1Parser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(T1Parser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(T1Parser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#parametros_opcional}.
	 * @param ctx the parse tree
	 */
	void enterParametros_opcional(T1Parser.Parametros_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#parametros_opcional}.
	 * @param ctx the parse tree
	 */
	void exitParametros_opcional(T1Parser.Parametros_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(T1Parser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(T1Parser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#var_opcional}.
	 * @param ctx the parse tree
	 */
	void enterVar_opcional(T1Parser.Var_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#var_opcional}.
	 * @param ctx the parse tree
	 */
	void exitVar_opcional(T1Parser.Var_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#mais_parametros}.
	 * @param ctx the parse tree
	 */
	void enterMais_parametros(T1Parser.Mais_parametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#mais_parametros}.
	 * @param ctx the parse tree
	 */
	void exitMais_parametros(T1Parser.Mais_parametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#declaracoes_locais}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes_locais(T1Parser.Declaracoes_locaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#declaracoes_locais}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes_locais(T1Parser.Declaracoes_locaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(T1Parser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(T1Parser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(T1Parser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(T1Parser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(T1Parser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(T1Parser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#mais_expressao}.
	 * @param ctx the parse tree
	 */
	void enterMais_expressao(T1Parser.Mais_expressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#mais_expressao}.
	 * @param ctx the parse tree
	 */
	void exitMais_expressao(T1Parser.Mais_expressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#senao_opcional}.
	 * @param ctx the parse tree
	 */
	void enterSenao_opcional(T1Parser.Senao_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#senao_opcional}.
	 * @param ctx the parse tree
	 */
	void exitSenao_opcional(T1Parser.Senao_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#chamada_atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterChamada_atribuicao(T1Parser.Chamada_atribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#chamada_atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitChamada_atribuicao(T1Parser.Chamada_atribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#argumentos_opcional}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos_opcional(T1Parser.Argumentos_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#argumentos_opcional}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos_opcional(T1Parser.Argumentos_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(T1Parser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(T1Parser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#mais_selecao}.
	 * @param ctx the parse tree
	 */
	void enterMais_selecao(T1Parser.Mais_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#mais_selecao}.
	 * @param ctx the parse tree
	 */
	void exitMais_selecao(T1Parser.Mais_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(T1Parser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(T1Parser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#mais_constantes}.
	 * @param ctx the parse tree
	 */
	void enterMais_constantes(T1Parser.Mais_constantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#mais_constantes}.
	 * @param ctx the parse tree
	 */
	void exitMais_constantes(T1Parser.Mais_constantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(T1Parser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(T1Parser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#intervalo_opcional}.
	 * @param ctx the parse tree
	 */
	void enterIntervalo_opcional(T1Parser.Intervalo_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#intervalo_opcional}.
	 * @param ctx the parse tree
	 */
	void exitIntervalo_opcional(T1Parser.Intervalo_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(T1Parser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(T1Parser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(T1Parser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(T1Parser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#op_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void enterOp_multiplicacao(T1Parser.Op_multiplicacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#op_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void exitOp_multiplicacao(T1Parser.Op_multiplicacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#op_adicao}.
	 * @param ctx the parse tree
	 */
	void enterOp_adicao(T1Parser.Op_adicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#op_adicao}.
	 * @param ctx the parse tree
	 */
	void exitOp_adicao(T1Parser.Op_adicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(T1Parser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(T1Parser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos(T1Parser.Outros_termosContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos(T1Parser.Outros_termosContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(T1Parser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(T1Parser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#outros_fatores}.
	 * @param ctx the parse tree
	 */
	void enterOutros_fatores(T1Parser.Outros_fatoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#outros_fatores}.
	 * @param ctx the parse tree
	 */
	void exitOutros_fatores(T1Parser.Outros_fatoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(T1Parser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(T1Parser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(T1Parser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(T1Parser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(T1Parser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(T1Parser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#outras_parcelas}.
	 * @param ctx the parse tree
	 */
	void enterOutras_parcelas(T1Parser.Outras_parcelasContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#outras_parcelas}.
	 * @param ctx the parse tree
	 */
	void exitOutras_parcelas(T1Parser.Outras_parcelasContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#chamada_partes}.
	 * @param ctx the parse tree
	 */
	void enterChamada_partes(T1Parser.Chamada_partesContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#chamada_partes}.
	 * @param ctx the parse tree
	 */
	void exitChamada_partes(T1Parser.Chamada_partesContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(T1Parser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(T1Parser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#op_opcional}.
	 * @param ctx the parse tree
	 */
	void enterOp_opcional(T1Parser.Op_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#op_opcional}.
	 * @param ctx the parse tree
	 */
	void exitOp_opcional(T1Parser.Op_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(T1Parser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(T1Parser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(T1Parser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(T1Parser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#op_nao}.
	 * @param ctx the parse tree
	 */
	void enterOp_nao(T1Parser.Op_naoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#op_nao}.
	 * @param ctx the parse tree
	 */
	void exitOp_nao(T1Parser.Op_naoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(T1Parser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(T1Parser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#outros_termos_logicos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos_logicos(T1Parser.Outros_termos_logicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#outros_termos_logicos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos_logicos(T1Parser.Outros_termos_logicosContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#outros_fatores_logicos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_fatores_logicos(T1Parser.Outros_fatores_logicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#outros_fatores_logicos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_fatores_logicos(T1Parser.Outros_fatores_logicosContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(T1Parser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(T1Parser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T1Parser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(T1Parser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T1Parser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(T1Parser.Parcela_logicaContext ctx);
}