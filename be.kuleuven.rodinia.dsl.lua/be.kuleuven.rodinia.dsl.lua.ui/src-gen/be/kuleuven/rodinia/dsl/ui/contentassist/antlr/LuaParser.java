/*
* generated by Xtext
*/
package be.kuleuven.rodinia.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import be.kuleuven.rodinia.dsl.services.LuaGrammarAccess;

public class LuaParser extends AbstractContentAssistParser {
	
	@Inject
	private LuaGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected be.kuleuven.rodinia.dsl.ui.contentassist.antlr.internal.InternalLuaParser createParser() {
		be.kuleuven.rodinia.dsl.ui.contentassist.antlr.internal.InternalLuaParser result = new be.kuleuven.rodinia.dsl.ui.contentassist.antlr.internal.InternalLuaParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getLastStatementAccess().getAlternatives(), "rule__LastStatement__Alternatives");
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getAlternatives_1(), "rule__Statement_FunctioncallOrAssignment__Alternatives_1");
					put(grammarAccess.getExpression_CompareAccess().getAlternatives_1(), "rule__Expression_Compare__Alternatives_1");
					put(grammarAccess.getExpression_PlusMinusAccess().getAlternatives_1(), "rule__Expression_PlusMinus__Alternatives_1");
					put(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getAlternatives_1(), "rule__Expression_MultiplicationDivisionModulo__Alternatives_1");
					put(grammarAccess.getExpression_UnaryAccess().getAlternatives(), "rule__Expression_Unary__Alternatives");
					put(grammarAccess.getExpression_TerminalAccess().getAlternatives(), "rule__Expression_Terminal__Alternatives");
					put(grammarAccess.getExpression_TableConstructorAccess().getAlternatives_2_1_0(), "rule__Expression_TableConstructor__Alternatives_2_1_0");
					put(grammarAccess.getExpression_TableConstructorAccess().getAlternatives_2_2(), "rule__Expression_TableConstructor__Alternatives_2_2");
					put(grammarAccess.getExpression_FunctioncallAccess().getAlternatives_1(), "rule__Expression_Functioncall__Alternatives_1");
					put(grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getAlternatives_1(), "rule__Expression_AccessMemberOrArrayElement__Alternatives_1");
					put(grammarAccess.getExpression_VariableNameAccess().getAlternatives(), "rule__Expression_VariableName__Alternatives");
					put(grammarAccess.getFunctioncall_ArgumentsAccess().getAlternatives_1(), "rule__Functioncall_Arguments__Alternatives_1");
					put(grammarAccess.getFieldAccess().getAlternatives(), "rule__Field__Alternatives");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getBlockAccess().getGroup_1(), "rule__Block__Group_1__0");
					put(grammarAccess.getBlockAccess().getGroup_2(), "rule__Block__Group_2__0");
					put(grammarAccess.getLastStatement_ReturnAccess().getGroup(), "rule__LastStatement_Return__Group__0");
					put(grammarAccess.getLastStatement_ReturnAccess().getGroup_2(), "rule__LastStatement_Return__Group_2__0");
					put(grammarAccess.getLastStatement_ReturnAccess().getGroup_2_1(), "rule__LastStatement_Return__Group_2_1__0");
					put(grammarAccess.getLastStatement_BreakAccess().getGroup(), "rule__LastStatement_Break__Group__0");
					put(grammarAccess.getStatement_BlockAccess().getGroup(), "rule__Statement_Block__Group__0");
					put(grammarAccess.getStatement_WhileAccess().getGroup(), "rule__Statement_While__Group__0");
					put(grammarAccess.getStatement_RepeatAccess().getGroup(), "rule__Statement_Repeat__Group__0");
					put(grammarAccess.getStatement_If_Then_ElseAccess().getGroup(), "rule__Statement_If_Then_Else__Group__0");
					put(grammarAccess.getStatement_If_Then_ElseAccess().getGroup_5(), "rule__Statement_If_Then_Else__Group_5__0");
					put(grammarAccess.getStatement_If_Then_Else_ElseIfPartAccess().getGroup(), "rule__Statement_If_Then_Else_ElseIfPart__Group__0");
					put(grammarAccess.getStatement_For_NumericAccess().getGroup(), "rule__Statement_For_Numeric__Group__0");
					put(grammarAccess.getStatement_For_NumericAccess().getGroup_6(), "rule__Statement_For_Numeric__Group_6__0");
					put(grammarAccess.getStatement_For_GenericAccess().getGroup(), "rule__Statement_For_Generic__Group__0");
					put(grammarAccess.getStatement_For_GenericAccess().getGroup_2(), "rule__Statement_For_Generic__Group_2__0");
					put(grammarAccess.getStatement_For_GenericAccess().getGroup_5(), "rule__Statement_For_Generic__Group_5__0");
					put(grammarAccess.getStatement_GlobalFunction_DeclarationAccess().getGroup(), "rule__Statement_GlobalFunction_Declaration__Group__0");
					put(grammarAccess.getStatement_GlobalFunction_DeclarationAccess().getGroup_2(), "rule__Statement_GlobalFunction_Declaration__Group_2__0");
					put(grammarAccess.getStatement_GlobalFunction_DeclarationAccess().getGroup_3(), "rule__Statement_GlobalFunction_Declaration__Group_3__0");
					put(grammarAccess.getStatement_LocalFunction_DeclarationAccess().getGroup(), "rule__Statement_LocalFunction_Declaration__Group__0");
					put(grammarAccess.getStatement_Local_Variable_DeclarationAccess().getGroup(), "rule__Statement_Local_Variable_Declaration__Group__0");
					put(grammarAccess.getStatement_Local_Variable_DeclarationAccess().getGroup_2(), "rule__Statement_Local_Variable_Declaration__Group_2__0");
					put(grammarAccess.getStatement_Local_Variable_DeclarationAccess().getGroup_3(), "rule__Statement_Local_Variable_Declaration__Group_3__0");
					put(grammarAccess.getStatement_Local_Variable_DeclarationAccess().getGroup_3_2(), "rule__Statement_Local_Variable_Declaration__Group_3_2__0");
					put(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getGroup(), "rule__Statement_FunctioncallOrAssignment__Group__0");
					put(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getGroup_1_0(), "rule__Statement_FunctioncallOrAssignment__Group_1_0__0");
					put(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getGroup_1_0_1(), "rule__Statement_FunctioncallOrAssignment__Group_1_0_1__0");
					put(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getGroup_1_0_4(), "rule__Statement_FunctioncallOrAssignment__Group_1_0_4__0");
					put(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getGroup_1_1(), "rule__Statement_FunctioncallOrAssignment__Group_1_1__0");
					put(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getGroup_1_2(), "rule__Statement_FunctioncallOrAssignment__Group_1_2__0");
					put(grammarAccess.getExpression_OrAccess().getGroup(), "rule__Expression_Or__Group__0");
					put(grammarAccess.getExpression_OrAccess().getGroup_1(), "rule__Expression_Or__Group_1__0");
					put(grammarAccess.getExpression_AndAccess().getGroup(), "rule__Expression_And__Group__0");
					put(grammarAccess.getExpression_AndAccess().getGroup_1(), "rule__Expression_And__Group_1__0");
					put(grammarAccess.getExpression_CompareAccess().getGroup(), "rule__Expression_Compare__Group__0");
					put(grammarAccess.getExpression_CompareAccess().getGroup_1_0(), "rule__Expression_Compare__Group_1_0__0");
					put(grammarAccess.getExpression_CompareAccess().getGroup_1_1(), "rule__Expression_Compare__Group_1_1__0");
					put(grammarAccess.getExpression_CompareAccess().getGroup_1_2(), "rule__Expression_Compare__Group_1_2__0");
					put(grammarAccess.getExpression_CompareAccess().getGroup_1_3(), "rule__Expression_Compare__Group_1_3__0");
					put(grammarAccess.getExpression_CompareAccess().getGroup_1_4(), "rule__Expression_Compare__Group_1_4__0");
					put(grammarAccess.getExpression_CompareAccess().getGroup_1_5(), "rule__Expression_Compare__Group_1_5__0");
					put(grammarAccess.getExpression_ConcatenationAccess().getGroup(), "rule__Expression_Concatenation__Group__0");
					put(grammarAccess.getExpression_ConcatenationAccess().getGroup_1(), "rule__Expression_Concatenation__Group_1__0");
					put(grammarAccess.getExpression_PlusMinusAccess().getGroup(), "rule__Expression_PlusMinus__Group__0");
					put(grammarAccess.getExpression_PlusMinusAccess().getGroup_1_0(), "rule__Expression_PlusMinus__Group_1_0__0");
					put(grammarAccess.getExpression_PlusMinusAccess().getGroup_1_1(), "rule__Expression_PlusMinus__Group_1_1__0");
					put(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getGroup(), "rule__Expression_MultiplicationDivisionModulo__Group__0");
					put(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getGroup_1_0(), "rule__Expression_MultiplicationDivisionModulo__Group_1_0__0");
					put(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getGroup_1_1(), "rule__Expression_MultiplicationDivisionModulo__Group_1_1__0");
					put(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getGroup_1_2(), "rule__Expression_MultiplicationDivisionModulo__Group_1_2__0");
					put(grammarAccess.getExpression_UnaryAccess().getGroup_1(), "rule__Expression_Unary__Group_1__0");
					put(grammarAccess.getExpression_UnaryAccess().getGroup_2(), "rule__Expression_Unary__Group_2__0");
					put(grammarAccess.getExpression_UnaryAccess().getGroup_3(), "rule__Expression_Unary__Group_3__0");
					put(grammarAccess.getExpression_ExponentiationAccess().getGroup(), "rule__Expression_Exponentiation__Group__0");
					put(grammarAccess.getExpression_ExponentiationAccess().getGroup_1(), "rule__Expression_Exponentiation__Group_1__0");
					put(grammarAccess.getExpression_NilAccess().getGroup(), "rule__Expression_Nil__Group__0");
					put(grammarAccess.getExpression_TrueAccess().getGroup(), "rule__Expression_True__Group__0");
					put(grammarAccess.getExpression_FalseAccess().getGroup(), "rule__Expression_False__Group__0");
					put(grammarAccess.getExpression_VarArgsAccess().getGroup(), "rule__Expression_VarArgs__Group__0");
					put(grammarAccess.getExpression_FunctionAccess().getGroup(), "rule__Expression_Function__Group__0");
					put(grammarAccess.getExpression_TableConstructorAccess().getGroup(), "rule__Expression_TableConstructor__Group__0");
					put(grammarAccess.getExpression_TableConstructorAccess().getGroup_2(), "rule__Expression_TableConstructor__Group_2__0");
					put(grammarAccess.getExpression_TableConstructorAccess().getGroup_2_1(), "rule__Expression_TableConstructor__Group_2_1__0");
					put(grammarAccess.getExpression_FunctioncallAccess().getGroup(), "rule__Expression_Functioncall__Group__0");
					put(grammarAccess.getExpression_FunctioncallAccess().getGroup_1_0(), "rule__Expression_Functioncall__Group_1_0__0");
					put(grammarAccess.getExpression_FunctioncallAccess().getGroup_1_1(), "rule__Expression_Functioncall__Group_1_1__0");
					put(grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getGroup(), "rule__Expression_AccessMemberOrArrayElement__Group__0");
					put(grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getGroup_1_0(), "rule__Expression_AccessMemberOrArrayElement__Group_1_0__0");
					put(grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getGroup_1_1(), "rule__Expression_AccessMemberOrArrayElement__Group_1_1__0");
					put(grammarAccess.getExpression_VariableNameAccess().getGroup_0(), "rule__Expression_VariableName__Group_0__0");
					put(grammarAccess.getExpression_VariableNameAccess().getGroup_1(), "rule__Expression_VariableName__Group_1__0");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup_1(), "rule__Function__Group_1__0");
					put(grammarAccess.getFunctionAccess().getGroup_1_1(), "rule__Function__Group_1_1__0");
					put(grammarAccess.getFunctioncall_ArgumentsAccess().getGroup(), "rule__Functioncall_Arguments__Group__0");
					put(grammarAccess.getFunctioncall_ArgumentsAccess().getGroup_1_0(), "rule__Functioncall_Arguments__Group_1_0__0");
					put(grammarAccess.getFunctioncall_ArgumentsAccess().getGroup_1_0_1(), "rule__Functioncall_Arguments__Group_1_0_1__0");
					put(grammarAccess.getFunctioncall_ArgumentsAccess().getGroup_1_0_1_1(), "rule__Functioncall_Arguments__Group_1_0_1_1__0");
					put(grammarAccess.getField_AddEntryToTable_BracketsAccess().getGroup(), "rule__Field_AddEntryToTable_Brackets__Group__0");
					put(grammarAccess.getField_AddEntryToTableAccess().getGroup(), "rule__Field_AddEntryToTable__Group__0");
					put(grammarAccess.getBlockAccess().getStatementsAssignment_1_0(), "rule__Block__StatementsAssignment_1_0");
					put(grammarAccess.getBlockAccess().getReturnValueAssignment_2_0(), "rule__Block__ReturnValueAssignment_2_0");
					put(grammarAccess.getLastStatement_ReturnAccess().getReturnValuesAssignment_2_0(), "rule__LastStatement_Return__ReturnValuesAssignment_2_0");
					put(grammarAccess.getLastStatement_ReturnAccess().getReturnValuesAssignment_2_1_1(), "rule__LastStatement_Return__ReturnValuesAssignment_2_1_1");
					put(grammarAccess.getStatement_BlockAccess().getBlockAssignment_1(), "rule__Statement_Block__BlockAssignment_1");
					put(grammarAccess.getStatement_WhileAccess().getExpressionAssignment_1(), "rule__Statement_While__ExpressionAssignment_1");
					put(grammarAccess.getStatement_WhileAccess().getBlockAssignment_3(), "rule__Statement_While__BlockAssignment_3");
					put(grammarAccess.getStatement_RepeatAccess().getBlockAssignment_1(), "rule__Statement_Repeat__BlockAssignment_1");
					put(grammarAccess.getStatement_RepeatAccess().getExpressionAssignment_3(), "rule__Statement_Repeat__ExpressionAssignment_3");
					put(grammarAccess.getStatement_If_Then_ElseAccess().getIfExpressionAssignment_1(), "rule__Statement_If_Then_Else__IfExpressionAssignment_1");
					put(grammarAccess.getStatement_If_Then_ElseAccess().getIfBlockAssignment_3(), "rule__Statement_If_Then_Else__IfBlockAssignment_3");
					put(grammarAccess.getStatement_If_Then_ElseAccess().getElseIfAssignment_4(), "rule__Statement_If_Then_Else__ElseIfAssignment_4");
					put(grammarAccess.getStatement_If_Then_ElseAccess().getElseBlockAssignment_5_1(), "rule__Statement_If_Then_Else__ElseBlockAssignment_5_1");
					put(grammarAccess.getStatement_If_Then_Else_ElseIfPartAccess().getElseifExpressionAssignment_1(), "rule__Statement_If_Then_Else_ElseIfPart__ElseifExpressionAssignment_1");
					put(grammarAccess.getStatement_If_Then_Else_ElseIfPartAccess().getElseifBlockAssignment_3(), "rule__Statement_If_Then_Else_ElseIfPart__ElseifBlockAssignment_3");
					put(grammarAccess.getStatement_For_NumericAccess().getIteratorNameAssignment_1(), "rule__Statement_For_Numeric__IteratorNameAssignment_1");
					put(grammarAccess.getStatement_For_NumericAccess().getStartExprAssignment_3(), "rule__Statement_For_Numeric__StartExprAssignment_3");
					put(grammarAccess.getStatement_For_NumericAccess().getUntilExprAssignment_5(), "rule__Statement_For_Numeric__UntilExprAssignment_5");
					put(grammarAccess.getStatement_For_NumericAccess().getStepExprAssignment_6_1(), "rule__Statement_For_Numeric__StepExprAssignment_6_1");
					put(grammarAccess.getStatement_For_NumericAccess().getBlockAssignment_8(), "rule__Statement_For_Numeric__BlockAssignment_8");
					put(grammarAccess.getStatement_For_GenericAccess().getNamesAssignment_1(), "rule__Statement_For_Generic__NamesAssignment_1");
					put(grammarAccess.getStatement_For_GenericAccess().getNamesAssignment_2_1(), "rule__Statement_For_Generic__NamesAssignment_2_1");
					put(grammarAccess.getStatement_For_GenericAccess().getExpressionsAssignment_4(), "rule__Statement_For_Generic__ExpressionsAssignment_4");
					put(grammarAccess.getStatement_For_GenericAccess().getExpressionsAssignment_5_1(), "rule__Statement_For_Generic__ExpressionsAssignment_5_1");
					put(grammarAccess.getStatement_For_GenericAccess().getBlockAssignment_7(), "rule__Statement_For_Generic__BlockAssignment_7");
					put(grammarAccess.getStatement_GlobalFunction_DeclarationAccess().getPrefixAssignment_1(), "rule__Statement_GlobalFunction_Declaration__PrefixAssignment_1");
					put(grammarAccess.getStatement_GlobalFunction_DeclarationAccess().getPrefixAssignment_2_1(), "rule__Statement_GlobalFunction_Declaration__PrefixAssignment_2_1");
					put(grammarAccess.getStatement_GlobalFunction_DeclarationAccess().getFunctionNameAssignment_3_1(), "rule__Statement_GlobalFunction_Declaration__FunctionNameAssignment_3_1");
					put(grammarAccess.getStatement_GlobalFunction_DeclarationAccess().getFunctionAssignment_4(), "rule__Statement_GlobalFunction_Declaration__FunctionAssignment_4");
					put(grammarAccess.getStatement_LocalFunction_DeclarationAccess().getFunctionNameAssignment_2(), "rule__Statement_LocalFunction_Declaration__FunctionNameAssignment_2");
					put(grammarAccess.getStatement_LocalFunction_DeclarationAccess().getFunctionAssignment_3(), "rule__Statement_LocalFunction_Declaration__FunctionAssignment_3");
					put(grammarAccess.getStatement_Local_Variable_DeclarationAccess().getVariableNamesAssignment_1(), "rule__Statement_Local_Variable_Declaration__VariableNamesAssignment_1");
					put(grammarAccess.getStatement_Local_Variable_DeclarationAccess().getVariableNamesAssignment_2_1(), "rule__Statement_Local_Variable_Declaration__VariableNamesAssignment_2_1");
					put(grammarAccess.getStatement_Local_Variable_DeclarationAccess().getInitialValueAssignment_3_1(), "rule__Statement_Local_Variable_Declaration__InitialValueAssignment_3_1");
					put(grammarAccess.getStatement_Local_Variable_DeclarationAccess().getInitialValueAssignment_3_2_1(), "rule__Statement_Local_Variable_Declaration__InitialValueAssignment_3_2_1");
					put(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getVariableAssignment_1_0_1_1(), "rule__Statement_FunctioncallOrAssignment__VariableAssignment_1_0_1_1");
					put(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getValuesAssignment_1_0_3(), "rule__Statement_FunctioncallOrAssignment__ValuesAssignment_1_0_3");
					put(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getValuesAssignment_1_0_4_1(), "rule__Statement_FunctioncallOrAssignment__ValuesAssignment_1_0_4_1");
					put(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getMemberFunctionNameAssignment_1_1_2(), "rule__Statement_FunctioncallOrAssignment__MemberFunctionNameAssignment_1_1_2");
					put(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getArgumentsAssignment_1_1_3(), "rule__Statement_FunctioncallOrAssignment__ArgumentsAssignment_1_1_3");
					put(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getArgumentsAssignment_1_2_1(), "rule__Statement_FunctioncallOrAssignment__ArgumentsAssignment_1_2_1");
					put(grammarAccess.getExpression_OrAccess().getRightAssignment_1_2(), "rule__Expression_Or__RightAssignment_1_2");
					put(grammarAccess.getExpression_AndAccess().getRightAssignment_1_2(), "rule__Expression_And__RightAssignment_1_2");
					put(grammarAccess.getExpression_CompareAccess().getRightAssignment_1_0_2(), "rule__Expression_Compare__RightAssignment_1_0_2");
					put(grammarAccess.getExpression_CompareAccess().getRightAssignment_1_1_2(), "rule__Expression_Compare__RightAssignment_1_1_2");
					put(grammarAccess.getExpression_CompareAccess().getRightAssignment_1_2_2(), "rule__Expression_Compare__RightAssignment_1_2_2");
					put(grammarAccess.getExpression_CompareAccess().getRightAssignment_1_3_2(), "rule__Expression_Compare__RightAssignment_1_3_2");
					put(grammarAccess.getExpression_CompareAccess().getRightAssignment_1_4_2(), "rule__Expression_Compare__RightAssignment_1_4_2");
					put(grammarAccess.getExpression_CompareAccess().getRightAssignment_1_5_2(), "rule__Expression_Compare__RightAssignment_1_5_2");
					put(grammarAccess.getExpression_ConcatenationAccess().getRightAssignment_1_2(), "rule__Expression_Concatenation__RightAssignment_1_2");
					put(grammarAccess.getExpression_PlusMinusAccess().getRightAssignment_1_0_2(), "rule__Expression_PlusMinus__RightAssignment_1_0_2");
					put(grammarAccess.getExpression_PlusMinusAccess().getRightAssignment_1_1_2(), "rule__Expression_PlusMinus__RightAssignment_1_1_2");
					put(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getRightAssignment_1_0_2(), "rule__Expression_MultiplicationDivisionModulo__RightAssignment_1_0_2");
					put(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getRightAssignment_1_1_2(), "rule__Expression_MultiplicationDivisionModulo__RightAssignment_1_1_2");
					put(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getRightAssignment_1_2_2(), "rule__Expression_MultiplicationDivisionModulo__RightAssignment_1_2_2");
					put(grammarAccess.getExpression_UnaryAccess().getExpAssignment_1_2(), "rule__Expression_Unary__ExpAssignment_1_2");
					put(grammarAccess.getExpression_UnaryAccess().getExpAssignment_2_2(), "rule__Expression_Unary__ExpAssignment_2_2");
					put(grammarAccess.getExpression_UnaryAccess().getExpAssignment_3_2(), "rule__Expression_Unary__ExpAssignment_3_2");
					put(grammarAccess.getExpression_ExponentiationAccess().getRightAssignment_1_2(), "rule__Expression_Exponentiation__RightAssignment_1_2");
					put(grammarAccess.getExpression_NumberAccess().getValueAssignment(), "rule__Expression_Number__ValueAssignment");
					put(grammarAccess.getExpression_StringAccess().getValueAssignment(), "rule__Expression_String__ValueAssignment");
					put(grammarAccess.getExpression_FunctionAccess().getFunctionAssignment_1(), "rule__Expression_Function__FunctionAssignment_1");
					put(grammarAccess.getExpression_TableConstructorAccess().getFieldsAssignment_2_0(), "rule__Expression_TableConstructor__FieldsAssignment_2_0");
					put(grammarAccess.getExpression_TableConstructorAccess().getFieldsAssignment_2_1_1(), "rule__Expression_TableConstructor__FieldsAssignment_2_1_1");
					put(grammarAccess.getExpression_FunctioncallAccess().getMemberFunctionNameAssignment_1_0_2(), "rule__Expression_Functioncall__MemberFunctionNameAssignment_1_0_2");
					put(grammarAccess.getExpression_FunctioncallAccess().getArgumentsAssignment_1_0_3(), "rule__Expression_Functioncall__ArgumentsAssignment_1_0_3");
					put(grammarAccess.getExpression_FunctioncallAccess().getArgumentsAssignment_1_1_1(), "rule__Expression_Functioncall__ArgumentsAssignment_1_1_1");
					put(grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getIndexAssignment_1_0_2(), "rule__Expression_AccessMemberOrArrayElement__IndexAssignment_1_0_2");
					put(grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getMemberNameAssignment_1_1_2(), "rule__Expression_AccessMemberOrArrayElement__MemberNameAssignment_1_1_2");
					put(grammarAccess.getExpression_VariableNameAccess().getVariableAssignment_1_1(), "rule__Expression_VariableName__VariableAssignment_1_1");
					put(grammarAccess.getFunctionAccess().getParametersAssignment_1_0(), "rule__Function__ParametersAssignment_1_0");
					put(grammarAccess.getFunctionAccess().getParametersAssignment_1_1_1(), "rule__Function__ParametersAssignment_1_1_1");
					put(grammarAccess.getFunctionAccess().getVarArgsAssignment_2(), "rule__Function__VarArgsAssignment_2");
					put(grammarAccess.getFunctionAccess().getBodyAssignment_4(), "rule__Function__BodyAssignment_4");
					put(grammarAccess.getFunctioncall_ArgumentsAccess().getArgumentsAssignment_1_0_1_0(), "rule__Functioncall_Arguments__ArgumentsAssignment_1_0_1_0");
					put(grammarAccess.getFunctioncall_ArgumentsAccess().getArgumentsAssignment_1_0_1_1_1(), "rule__Functioncall_Arguments__ArgumentsAssignment_1_0_1_1_1");
					put(grammarAccess.getFunctioncall_ArgumentsAccess().getArgumentsAssignment_1_1(), "rule__Functioncall_Arguments__ArgumentsAssignment_1_1");
					put(grammarAccess.getFunctioncall_ArgumentsAccess().getArgumentsAssignment_1_2(), "rule__Functioncall_Arguments__ArgumentsAssignment_1_2");
					put(grammarAccess.getField_AddEntryToTable_BracketsAccess().getIndexExpressionAssignment_1(), "rule__Field_AddEntryToTable_Brackets__IndexExpressionAssignment_1");
					put(grammarAccess.getField_AddEntryToTable_BracketsAccess().getValueAssignment_4(), "rule__Field_AddEntryToTable_Brackets__ValueAssignment_4");
					put(grammarAccess.getField_AddEntryToTableAccess().getKeyAssignment_0(), "rule__Field_AddEntryToTable__KeyAssignment_0");
					put(grammarAccess.getField_AddEntryToTableAccess().getValueAssignment_2(), "rule__Field_AddEntryToTable__ValueAssignment_2");
					put(grammarAccess.getField_AppendEntryToTableAccess().getValueAssignment(), "rule__Field_AppendEntryToTable__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			be.kuleuven.rodinia.dsl.ui.contentassist.antlr.internal.InternalLuaParser typedParser = (be.kuleuven.rodinia.dsl.ui.contentassist.antlr.internal.InternalLuaParser) parser;
			typedParser.entryRuleChunk();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public LuaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(LuaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
