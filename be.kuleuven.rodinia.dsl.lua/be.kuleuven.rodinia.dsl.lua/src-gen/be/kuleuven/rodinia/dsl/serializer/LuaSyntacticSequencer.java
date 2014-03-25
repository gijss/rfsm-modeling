package be.kuleuven.rodinia.dsl.serializer;

import be.kuleuven.rodinia.dsl.services.LuaGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class LuaSyntacticSequencer extends AbstractSyntacticSequencer {

	protected LuaGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Block_SemicolonKeyword_1_1_q;
	protected AbstractElementAlias match_Block_SemicolonKeyword_2_1_q;
	protected AbstractElementAlias match_Expression_TableConstructor_CommaKeyword_2_1_0_0_or_SemicolonKeyword_2_1_0_1;
	protected AbstractElementAlias match_Expression_TableConstructor___CommaKeyword_2_2_0_or_SemicolonKeyword_2_2_1__q;
	protected AbstractElementAlias match_Expression_VariableName_LeftParenthesisKeyword_0_0_a;
	protected AbstractElementAlias match_Expression_VariableName_LeftParenthesisKeyword_0_0_p;
	protected AbstractElementAlias match_Function_CommaKeyword_1_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LuaGrammarAccess) access;
		match_Block_SemicolonKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getBlockAccess().getSemicolonKeyword_1_1());
		match_Block_SemicolonKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getBlockAccess().getSemicolonKeyword_2_1());
		match_Expression_TableConstructor_CommaKeyword_2_1_0_0_or_SemicolonKeyword_2_1_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getExpression_TableConstructorAccess().getCommaKeyword_2_1_0_0()), new TokenAlias(false, false, grammarAccess.getExpression_TableConstructorAccess().getSemicolonKeyword_2_1_0_1()));
		match_Expression_TableConstructor___CommaKeyword_2_2_0_or_SemicolonKeyword_2_2_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getExpression_TableConstructorAccess().getCommaKeyword_2_2_0()), new TokenAlias(false, false, grammarAccess.getExpression_TableConstructorAccess().getSemicolonKeyword_2_2_1()));
		match_Expression_VariableName_LeftParenthesisKeyword_0_0_a = new TokenAlias(true, true, grammarAccess.getExpression_VariableNameAccess().getLeftParenthesisKeyword_0_0());
		match_Expression_VariableName_LeftParenthesisKeyword_0_0_p = new TokenAlias(true, false, grammarAccess.getExpression_VariableNameAccess().getLeftParenthesisKeyword_0_0());
		match_Function_CommaKeyword_1_2_q = new TokenAlias(false, true, grammarAccess.getFunctionAccess().getCommaKeyword_1_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Block_SemicolonKeyword_1_1_q.equals(syntax))
				emit_Block_SemicolonKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Block_SemicolonKeyword_2_1_q.equals(syntax))
				emit_Block_SemicolonKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression_TableConstructor_CommaKeyword_2_1_0_0_or_SemicolonKeyword_2_1_0_1.equals(syntax))
				emit_Expression_TableConstructor_CommaKeyword_2_1_0_0_or_SemicolonKeyword_2_1_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression_TableConstructor___CommaKeyword_2_2_0_or_SemicolonKeyword_2_2_1__q.equals(syntax))
				emit_Expression_TableConstructor___CommaKeyword_2_2_0_or_SemicolonKeyword_2_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression_VariableName_LeftParenthesisKeyword_0_0_a.equals(syntax))
				emit_Expression_VariableName_LeftParenthesisKeyword_0_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Expression_VariableName_LeftParenthesisKeyword_0_0_p.equals(syntax))
				emit_Expression_VariableName_LeftParenthesisKeyword_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Function_CommaKeyword_1_2_q.equals(syntax))
				emit_Function_CommaKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_Block_SemicolonKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_Block_SemicolonKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';' | ','
	 */
	protected void emit_Expression_TableConstructor_CommaKeyword_2_1_0_0_or_SemicolonKeyword_2_1_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (';' | ',')?
	 */
	protected void emit_Expression_TableConstructor___CommaKeyword_2_2_0_or_SemicolonKeyword_2_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_Expression_VariableName_LeftParenthesisKeyword_0_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_Expression_VariableName_LeftParenthesisKeyword_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_Function_CommaKeyword_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
