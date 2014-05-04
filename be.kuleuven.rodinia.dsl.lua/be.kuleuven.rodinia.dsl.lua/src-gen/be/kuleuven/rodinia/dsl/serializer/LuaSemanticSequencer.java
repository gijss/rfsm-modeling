package be.kuleuven.rodinia.dsl.serializer;

import be.kuleuven.rodinia.dsl.lua.Block;
import be.kuleuven.rodinia.dsl.lua.Expression_AccessArray;
import be.kuleuven.rodinia.dsl.lua.Expression_AccessMember;
import be.kuleuven.rodinia.dsl.lua.Expression_And;
import be.kuleuven.rodinia.dsl.lua.Expression_CallFunction;
import be.kuleuven.rodinia.dsl.lua.Expression_CallMemberFunction;
import be.kuleuven.rodinia.dsl.lua.Expression_Concatenation;
import be.kuleuven.rodinia.dsl.lua.Expression_Division;
import be.kuleuven.rodinia.dsl.lua.Expression_Equal;
import be.kuleuven.rodinia.dsl.lua.Expression_Exponentiation;
import be.kuleuven.rodinia.dsl.lua.Expression_False;
import be.kuleuven.rodinia.dsl.lua.Expression_Function;
import be.kuleuven.rodinia.dsl.lua.Expression_Invert;
import be.kuleuven.rodinia.dsl.lua.Expression_Larger;
import be.kuleuven.rodinia.dsl.lua.Expression_Larger_Equal;
import be.kuleuven.rodinia.dsl.lua.Expression_Length;
import be.kuleuven.rodinia.dsl.lua.Expression_Minus;
import be.kuleuven.rodinia.dsl.lua.Expression_Modulo;
import be.kuleuven.rodinia.dsl.lua.Expression_Multiplication;
import be.kuleuven.rodinia.dsl.lua.Expression_Negate;
import be.kuleuven.rodinia.dsl.lua.Expression_Nil;
import be.kuleuven.rodinia.dsl.lua.Expression_Not_Equal;
import be.kuleuven.rodinia.dsl.lua.Expression_Number;
import be.kuleuven.rodinia.dsl.lua.Expression_Or;
import be.kuleuven.rodinia.dsl.lua.Expression_Plus;
import be.kuleuven.rodinia.dsl.lua.Expression_Smaller;
import be.kuleuven.rodinia.dsl.lua.Expression_Smaller_Equal;
import be.kuleuven.rodinia.dsl.lua.Expression_String;
import be.kuleuven.rodinia.dsl.lua.Expression_TableConstructor;
import be.kuleuven.rodinia.dsl.lua.Expression_True;
import be.kuleuven.rodinia.dsl.lua.Expression_VarArgs;
import be.kuleuven.rodinia.dsl.lua.Expression_VariableName;
import be.kuleuven.rodinia.dsl.lua.Field_AddEntryToTable;
import be.kuleuven.rodinia.dsl.lua.Field_AddEntryToTable_Brackets;
import be.kuleuven.rodinia.dsl.lua.Field_AppendEntryToTable;
import be.kuleuven.rodinia.dsl.lua.Function;
import be.kuleuven.rodinia.dsl.lua.Functioncall_Arguments;
import be.kuleuven.rodinia.dsl.lua.LastStatement_Break;
import be.kuleuven.rodinia.dsl.lua.LastStatement_ReturnWithValue;
import be.kuleuven.rodinia.dsl.lua.LuaPackage;
import be.kuleuven.rodinia.dsl.lua.Statement_Assignment;
import be.kuleuven.rodinia.dsl.lua.Statement_Block;
import be.kuleuven.rodinia.dsl.lua.Statement_CallFunction;
import be.kuleuven.rodinia.dsl.lua.Statement_CallMemberFunction;
import be.kuleuven.rodinia.dsl.lua.Statement_For_Generic;
import be.kuleuven.rodinia.dsl.lua.Statement_For_Numeric;
import be.kuleuven.rodinia.dsl.lua.Statement_GlobalFunction_Declaration;
import be.kuleuven.rodinia.dsl.lua.Statement_If_Then_Else;
import be.kuleuven.rodinia.dsl.lua.Statement_If_Then_Else_ElseIfPart;
import be.kuleuven.rodinia.dsl.lua.Statement_LocalFunction_Declaration;
import be.kuleuven.rodinia.dsl.lua.Statement_Local_Variable_Declaration;
import be.kuleuven.rodinia.dsl.lua.Statement_Repeat;
import be.kuleuven.rodinia.dsl.lua.Statement_While;
import be.kuleuven.rodinia.dsl.services.LuaGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class LuaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LuaGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == LuaPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LuaPackage.BLOCK:
				if(context == grammarAccess.getBlockRule() ||
				   context == grammarAccess.getChunkRule()) {
					sequence_Block(context, (Block) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_ACCESS_ARRAY:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_AccessMemberOrArrayElement(context, (Expression_AccessArray) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_ACCESS_MEMBER:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_AccessMemberOrArrayElement(context, (Expression_AccessMember) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_AND:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_And(context, (Expression_And) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_CALL_FUNCTION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Functioncall(context, (Expression_CallFunction) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_CALL_MEMBER_FUNCTION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Functioncall(context, (Expression_CallMemberFunction) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_CONCATENATION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Concatenation(context, (Expression_Concatenation) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_DIVISION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_MultiplicationDivisionModulo(context, (Expression_Division) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_EQUAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Compare(context, (Expression_Equal) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_EXPONENTIATION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Exponentiation(context, (Expression_Exponentiation) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_FALSE:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FalseRule() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Statement_FunctioncallOrAssignment_Statement_Assignment_1_0_0_Statement_CallFunction_1_2_0_Statement_CallMemberFunction_1_1_1(context, (Expression_False) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_FUNCTION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctionRule() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Function(context, (Expression_Function) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_INVERT:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Unary(context, (Expression_Invert) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_LARGER:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Compare(context, (Expression_Larger) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_LARGER_EQUAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Compare(context, (Expression_Larger_Equal) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_LENGTH:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Unary(context, (Expression_Length) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_MINUS:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_PlusMinus(context, (Expression_Minus) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_MODULO:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_MultiplicationDivisionModulo(context, (Expression_Modulo) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_MULTIPLICATION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_MultiplicationDivisionModulo(context, (Expression_Multiplication) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_NEGATE:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Unary(context, (Expression_Negate) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_NIL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_NilRule() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Statement_FunctioncallOrAssignment_Statement_Assignment_1_0_0_Statement_CallFunction_1_2_0_Statement_CallMemberFunction_1_1_1(context, (Expression_Nil) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_NOT_EQUAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Compare(context, (Expression_Not_Equal) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_NUMBER:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_NumberRule() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Number(context, (Expression_Number) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_OR:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Or(context, (Expression_Or) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_PLUS:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_PlusMinus(context, (Expression_Plus) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_SMALLER:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Compare(context, (Expression_Smaller) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_SMALLER_EQUAL:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_Compare(context, (Expression_Smaller_Equal) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_STRING:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_StringRule() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_String(context, (Expression_String) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_TABLE_CONSTRUCTOR:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TableConstructorRule() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_TableConstructor(context, (Expression_TableConstructor) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_TRUE:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_TrueRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Statement_FunctioncallOrAssignment_Statement_Assignment_1_0_0_Statement_CallFunction_1_2_0_Statement_CallMemberFunction_1_1_1(context, (Expression_True) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_VAR_ARGS:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VarArgsRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Statement_FunctioncallOrAssignment_Statement_Assignment_1_0_0_Statement_CallFunction_1_2_0_Statement_CallMemberFunction_1_1_1(context, (Expression_VarArgs) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.EXPRESSION_VARIABLE_NAME:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementRule() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1() ||
				   context == grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1() ||
				   context == grammarAccess.getExpression_AndRule() ||
				   context == grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1() ||
				   context == grammarAccess.getExpression_CompareRule() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1() ||
				   context == grammarAccess.getExpression_ConcatenationRule() ||
				   context == grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_ExponentiationRule() ||
				   context == grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1() ||
				   context == grammarAccess.getExpression_FunctioncallRule() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0() ||
				   context == grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloRule() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1() ||
				   context == grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_OrRule() ||
				   context == grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusRule() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1() ||
				   context == grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1() ||
				   context == grammarAccess.getExpression_TerminalRule() ||
				   context == grammarAccess.getExpression_UnaryRule() ||
				   context == grammarAccess.getExpression_VariableNameRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1()) {
					sequence_Expression_VariableName(context, (Expression_VariableName) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.FIELD_ADD_ENTRY_TO_TABLE:
				if(context == grammarAccess.getFieldRule() ||
				   context == grammarAccess.getField_AddEntryToTableRule()) {
					sequence_Field_AddEntryToTable(context, (Field_AddEntryToTable) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.FIELD_ADD_ENTRY_TO_TABLE_BRACKETS:
				if(context == grammarAccess.getFieldRule() ||
				   context == grammarAccess.getField_AddEntryToTable_BracketsRule()) {
					sequence_Field_AddEntryToTable_Brackets(context, (Field_AddEntryToTable_Brackets) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.FIELD_APPEND_ENTRY_TO_TABLE:
				if(context == grammarAccess.getFieldRule() ||
				   context == grammarAccess.getField_AppendEntryToTableRule()) {
					sequence_Field_AppendEntryToTable(context, (Field_AppendEntryToTable) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.FUNCTION:
				if(context == grammarAccess.getFunctionRule()) {
					sequence_Function(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.FUNCTIONCALL_ARGUMENTS:
				if(context == grammarAccess.getFunctioncall_ArgumentsRule()) {
					sequence_Functioncall_Arguments(context, (Functioncall_Arguments) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.LAST_STATEMENT_BREAK:
				if(context == grammarAccess.getLastStatementRule() ||
				   context == grammarAccess.getLastStatement_BreakRule()) {
					sequence_LastStatement_Break(context, (LastStatement_Break) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.LAST_STATEMENT_RETURN_WITH_VALUE:
				if(context == grammarAccess.getLastStatementRule() ||
				   context == grammarAccess.getLastStatement_ReturnRule()) {
					sequence_LastStatement_Return(context, (LastStatement_ReturnWithValue) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.STATEMENT_ASSIGNMENT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentRule()) {
					sequence_Statement_FunctioncallOrAssignment(context, (Statement_Assignment) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.STATEMENT_BLOCK:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_BlockRule()) {
					sequence_Statement_Block(context, (Statement_Block) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.STATEMENT_CALL_FUNCTION:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentRule()) {
					sequence_Statement_FunctioncallOrAssignment(context, (Statement_CallFunction) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.STATEMENT_CALL_MEMBER_FUNCTION:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_FunctioncallOrAssignmentRule()) {
					sequence_Statement_FunctioncallOrAssignment(context, (Statement_CallMemberFunction) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.STATEMENT_FOR_GENERIC:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_For_GenericRule()) {
					sequence_Statement_For_Generic(context, (Statement_For_Generic) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.STATEMENT_FOR_NUMERIC:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_For_NumericRule()) {
					sequence_Statement_For_Numeric(context, (Statement_For_Numeric) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.STATEMENT_GLOBAL_FUNCTION_DECLARATION:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_GlobalFunction_DeclarationRule()) {
					sequence_Statement_GlobalFunction_Declaration(context, (Statement_GlobalFunction_Declaration) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.STATEMENT_IF_THEN_ELSE:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_If_Then_ElseRule()) {
					sequence_Statement_If_Then_Else(context, (Statement_If_Then_Else) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART:
				if(context == grammarAccess.getStatement_If_Then_Else_ElseIfPartRule()) {
					sequence_Statement_If_Then_Else_ElseIfPart(context, (Statement_If_Then_Else_ElseIfPart) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.STATEMENT_LOCAL_FUNCTION_DECLARATION:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_LocalFunction_DeclarationRule()) {
					sequence_Statement_LocalFunction_Declaration(context, (Statement_LocalFunction_Declaration) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.STATEMENT_LOCAL_VARIABLE_DECLARATION:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_Local_Variable_DeclarationRule()) {
					sequence_Statement_Local_Variable_Declaration(context, (Statement_Local_Variable_Declaration) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.STATEMENT_REPEAT:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_RepeatRule()) {
					sequence_Statement_Repeat(context, (Statement_Repeat) semanticObject); 
					return; 
				}
				else break;
			case LuaPackage.STATEMENT_WHILE:
				if(context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatement_WhileRule()) {
					sequence_Statement_While(context, (Statement_While) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (statements+=Statement* returnValue=LastStatement?)
	 */
	protected void sequence_Block(EObject context, Block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (array=Expression_AccessMemberOrArrayElement_Expression_AccessArray_1_0_1 index=Expression)
	 */
	protected void sequence_Expression_AccessMemberOrArrayElement(EObject context, Expression_AccessArray semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_ACCESS_ARRAY__ARRAY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_ACCESS_ARRAY__ARRAY));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_ACCESS_ARRAY__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_ACCESS_ARRAY__INDEX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1(), semanticObject.getArray());
		feeder.accept(grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getIndexExpressionParserRuleCall_1_0_2_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (object=Expression_AccessMemberOrArrayElement_Expression_AccessMember_1_1_1 memberName=LUA_NAME)
	 */
	protected void sequence_Expression_AccessMemberOrArrayElement(EObject context, Expression_AccessMember semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_ACCESS_MEMBER__OBJECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_ACCESS_MEMBER__OBJECT));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_ACCESS_MEMBER__MEMBER_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_ACCESS_MEMBER__MEMBER_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1(), semanticObject.getObject());
		feeder.accept(grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getMemberNameLUA_NAMETerminalRuleCall_1_1_2_0(), semanticObject.getMemberName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_And_Expression_And_1_1 right=Expression_Compare)
	 */
	protected void sequence_Expression_And(EObject context, Expression_And semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_AndAccess().getRightExpression_CompareParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_Compare_Expression_Equal_1_4_1 right=Expression_Concatenation)
	 */
	protected void sequence_Expression_Compare(EObject context, Expression_Equal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_EQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_EQUAL__LEFT));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_EQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_EQUAL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_CompareAccess().getRightExpression_ConcatenationParserRuleCall_1_4_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_Compare_Expression_Larger_1_0_1 right=Expression_Concatenation)
	 */
	protected void sequence_Expression_Compare(EObject context, Expression_Larger semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_LARGER__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_LARGER__LEFT));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_LARGER__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_LARGER__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_CompareAccess().getRightExpression_ConcatenationParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_Compare_Expression_Larger_Equal_1_1_1 right=Expression_Concatenation)
	 */
	protected void sequence_Expression_Compare(EObject context, Expression_Larger_Equal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_LARGER_EQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_LARGER_EQUAL__LEFT));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_LARGER_EQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_LARGER_EQUAL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_CompareAccess().getRightExpression_ConcatenationParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_Compare_Expression_Not_Equal_1_5_1 right=Expression_Concatenation)
	 */
	protected void sequence_Expression_Compare(EObject context, Expression_Not_Equal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_NOT_EQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_NOT_EQUAL__LEFT));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_NOT_EQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_NOT_EQUAL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_CompareAccess().getRightExpression_ConcatenationParserRuleCall_1_5_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_Compare_Expression_Smaller_1_2_1 right=Expression_Concatenation)
	 */
	protected void sequence_Expression_Compare(EObject context, Expression_Smaller semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_SMALLER__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_SMALLER__LEFT));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_SMALLER__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_SMALLER__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_CompareAccess().getRightExpression_ConcatenationParserRuleCall_1_2_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_Compare_Expression_Smaller_Equal_1_3_1 right=Expression_Concatenation)
	 */
	protected void sequence_Expression_Compare(EObject context, Expression_Smaller_Equal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_SMALLER_EQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_SMALLER_EQUAL__LEFT));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_SMALLER_EQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_SMALLER_EQUAL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_CompareAccess().getRightExpression_ConcatenationParserRuleCall_1_3_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_Concatenation_Expression_Concatenation_1_1 right=Expression_Concatenation)
	 */
	protected void sequence_Expression_Concatenation(EObject context, Expression_Concatenation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_CONCATENATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_CONCATENATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_CONCATENATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_CONCATENATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_ConcatenationAccess().getRightExpression_ConcatenationParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_Exponentiation_Expression_Exponentiation_1_1 right=Expression_Exponentiation)
	 */
	protected void sequence_Expression_Exponentiation(EObject context, Expression_Exponentiation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_EXPONENTIATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_EXPONENTIATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_EXPONENTIATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_EXPONENTIATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_ExponentiationAccess().getRightExpression_ExponentiationParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     function=Function
	 */
	protected void sequence_Expression_Function(EObject context, Expression_Function semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_FUNCTION__FUNCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_FUNCTION__FUNCTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_FunctionAccess().getFunctionFunctionParserRuleCall_1_0(), semanticObject.getFunction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (object=Expression_Functioncall_Expression_CallFunction_1_1_0 arguments=Functioncall_Arguments)
	 */
	protected void sequence_Expression_Functioncall(EObject context, Expression_CallFunction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_CALL_FUNCTION__OBJECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_CALL_FUNCTION__OBJECT));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_CALL_FUNCTION__ARGUMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_CALL_FUNCTION__ARGUMENTS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0(), semanticObject.getObject());
		feeder.accept(grammarAccess.getExpression_FunctioncallAccess().getArgumentsFunctioncall_ArgumentsParserRuleCall_1_1_1_0(), semanticObject.getArguments());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (object=Expression_Functioncall_Expression_CallMemberFunction_1_0_1 memberFunctionName=LUA_NAME arguments=Functioncall_Arguments)
	 */
	protected void sequence_Expression_Functioncall(EObject context, Expression_CallMemberFunction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_CALL_MEMBER_FUNCTION__OBJECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_CALL_MEMBER_FUNCTION__OBJECT));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_CALL_MEMBER_FUNCTION__ARGUMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_CALL_MEMBER_FUNCTION__ARGUMENTS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1(), semanticObject.getObject());
		feeder.accept(grammarAccess.getExpression_FunctioncallAccess().getMemberFunctionNameLUA_NAMETerminalRuleCall_1_0_2_0(), semanticObject.getMemberFunctionName());
		feeder.accept(grammarAccess.getExpression_FunctioncallAccess().getArgumentsFunctioncall_ArgumentsParserRuleCall_1_0_3_0(), semanticObject.getArguments());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_MultiplicationDivisionModulo_Expression_Division_1_1_1 right=Expression_Unary)
	 */
	protected void sequence_Expression_MultiplicationDivisionModulo(EObject context, Expression_Division semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_DIVISION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_DIVISION__LEFT));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_DIVISION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_DIVISION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getRightExpression_UnaryParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_MultiplicationDivisionModulo_Expression_Modulo_1_2_1 right=Expression_Unary)
	 */
	protected void sequence_Expression_MultiplicationDivisionModulo(EObject context, Expression_Modulo semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_MODULO__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_MODULO__LEFT));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_MODULO__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_MODULO__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getRightExpression_UnaryParserRuleCall_1_2_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_MultiplicationDivisionModulo_Expression_Multiplication_1_0_1 right=Expression_Unary)
	 */
	protected void sequence_Expression_MultiplicationDivisionModulo(EObject context, Expression_Multiplication semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_MULTIPLICATION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_MULTIPLICATION__LEFT));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_MULTIPLICATION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_MULTIPLICATION__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getRightExpression_UnaryParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=LUA_NUMBER
	 */
	protected void sequence_Expression_Number(EObject context, Expression_Number semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_NUMBER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_NumberAccess().getValueLUA_NUMBERTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_Or_Expression_Or_1_1 right=Expression_And)
	 */
	protected void sequence_Expression_Or(EObject context, Expression_Or semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_OrAccess().getRightExpression_AndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_PlusMinus_Expression_Minus_1_1_1 right=Expression_MultiplicationDivisionModulo)
	 */
	protected void sequence_Expression_PlusMinus(EObject context, Expression_Minus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_MINUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_MINUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_PlusMinusAccess().getRightExpression_MultiplicationDivisionModuloParserRuleCall_1_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_PlusMinus_Expression_Plus_1_0_1 right=Expression_MultiplicationDivisionModulo)
	 */
	protected void sequence_Expression_PlusMinus(EObject context, Expression_Plus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_PLUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_PLUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExpression_PlusMinusAccess().getRightExpression_MultiplicationDivisionModuloParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=LUA_STRING
	 */
	protected void sequence_Expression_String(EObject context, Expression_String semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_STRING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_STRING__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_StringAccess().getValueLUA_STRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((fields+=Field fields+=Field*)?)
	 */
	protected void sequence_Expression_TableConstructor(EObject context, Expression_TableConstructor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     exp=Expression_Unary
	 */
	protected void sequence_Expression_Unary(EObject context, Expression_Invert semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_INVERT__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_INVERT__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_UnaryAccess().getExpExpression_UnaryParserRuleCall_3_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     exp=Expression_Unary
	 */
	protected void sequence_Expression_Unary(EObject context, Expression_Length semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_LENGTH__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_LENGTH__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_UnaryAccess().getExpExpression_UnaryParserRuleCall_2_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     exp=Expression_Unary
	 */
	protected void sequence_Expression_Unary(EObject context, Expression_Negate semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_NEGATE__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_NEGATE__EXP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_UnaryAccess().getExpExpression_UnaryParserRuleCall_1_2_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     variable=LUA_NAME
	 */
	protected void sequence_Expression_VariableName(EObject context, Expression_VariableName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.EXPRESSION_VARIABLE_NAME__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.EXPRESSION_VARIABLE_NAME__VARIABLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpression_VariableNameAccess().getVariableLUA_NAMETerminalRuleCall_1_1_0(), semanticObject.getVariable());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (indexExpression=Expression value=Expression)
	 */
	protected void sequence_Field_AddEntryToTable_Brackets(EObject context, Field_AddEntryToTable_Brackets semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.FIELD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.FIELD__VALUE));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__INDEX_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.FIELD_ADD_ENTRY_TO_TABLE_BRACKETS__INDEX_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getField_AddEntryToTable_BracketsAccess().getIndexExpressionExpressionParserRuleCall_1_0(), semanticObject.getIndexExpression());
		feeder.accept(grammarAccess.getField_AddEntryToTable_BracketsAccess().getValueExpressionParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (key=LUA_NAME value=Expression)
	 */
	protected void sequence_Field_AddEntryToTable(EObject context, Field_AddEntryToTable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.FIELD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.FIELD__VALUE));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.FIELD_ADD_ENTRY_TO_TABLE__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.FIELD_ADD_ENTRY_TO_TABLE__KEY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getField_AddEntryToTableAccess().getKeyLUA_NAMETerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getField_AddEntryToTableAccess().getValueExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Expression
	 */
	protected void sequence_Field_AppendEntryToTable(EObject context, Field_AppendEntryToTable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.FIELD__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.FIELD__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getField_AppendEntryToTableAccess().getValueExpressionParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((parameters+=LUA_NAME parameters+=LUA_NAME*)? varArgs?='...'? body=Block)
	 */
	protected void sequence_Function(EObject context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((arguments+=Expression arguments+=Expression*)? | arguments+=Expression_TableConstructor | arguments+=Expression_String)
	 */
	protected void sequence_Functioncall_Arguments(EObject context, Functioncall_Arguments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {LastStatement_Break}
	 */
	protected void sequence_LastStatement_Break(EObject context, LastStatement_Break semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((returnValues+=Expression returnValues+=Expression*)?)
	 */
	protected void sequence_LastStatement_Return(EObject context, LastStatement_ReturnWithValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     block=Block
	 */
	protected void sequence_Statement_Block(EObject context, Statement_Block semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.STATEMENT_BLOCK__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.STATEMENT_BLOCK__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatement_BlockAccess().getBlockBlockParserRuleCall_1_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (names+=LUA_NAME names+=LUA_NAME* expressions+=Expression expressions+=Expression* block=Block)
	 */
	protected void sequence_Statement_For_Generic(EObject context, Statement_For_Generic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (iteratorName=LUA_NAME startExpr=Expression untilExpr=Expression stepExpr=Expression? block=Block)
	 */
	protected void sequence_Statement_For_Numeric(EObject context, Statement_For_Numeric semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             (variable+=Statement_FunctioncallOrAssignment_Statement_Assignment_1_0_0 variable+=Expression_AccessMemberOrArrayElement* values+=Expression) | 
	 *             (variable+=Statement_FunctioncallOrAssignment_Statement_Assignment_1_0_0 values+=Expression)
	 *         ) 
	 *         values+=Expression*
	 *     )
	 */
	protected void sequence_Statement_FunctioncallOrAssignment(EObject context, Statement_Assignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Expression_False}
	 */
	protected void sequence_Statement_FunctioncallOrAssignment_Statement_Assignment_1_0_0_Statement_CallFunction_1_2_0_Statement_CallMemberFunction_1_1_1(EObject context, Expression_False semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Expression_Nil}
	 */
	protected void sequence_Statement_FunctioncallOrAssignment_Statement_Assignment_1_0_0_Statement_CallFunction_1_2_0_Statement_CallMemberFunction_1_1_1(EObject context, Expression_Nil semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Expression_True}
	 */
	protected void sequence_Statement_FunctioncallOrAssignment_Statement_Assignment_1_0_0_Statement_CallFunction_1_2_0_Statement_CallMemberFunction_1_1_1(EObject context, Expression_True semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Expression_VarArgs}
	 */
	protected void sequence_Statement_FunctioncallOrAssignment_Statement_Assignment_1_0_0_Statement_CallFunction_1_2_0_Statement_CallMemberFunction_1_1_1(EObject context, Expression_VarArgs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (object=Statement_FunctioncallOrAssignment_Statement_CallFunction_1_2_0 arguments=Functioncall_Arguments)
	 */
	protected void sequence_Statement_FunctioncallOrAssignment(EObject context, Statement_CallFunction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.STATEMENT_CALL_FUNCTION__OBJECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.STATEMENT_CALL_FUNCTION__OBJECT));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.STATEMENT_CALL_FUNCTION__ARGUMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.STATEMENT_CALL_FUNCTION__ARGUMENTS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0(), semanticObject.getObject());
		feeder.accept(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getArgumentsFunctioncall_ArgumentsParserRuleCall_1_2_1_0(), semanticObject.getArguments());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (object=Statement_FunctioncallOrAssignment_Statement_CallMemberFunction_1_1_1 memberFunctionName=LUA_NAME arguments=Functioncall_Arguments)
	 */
	protected void sequence_Statement_FunctioncallOrAssignment(EObject context, Statement_CallMemberFunction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.STATEMENT_CALL_MEMBER_FUNCTION__OBJECT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.STATEMENT_CALL_MEMBER_FUNCTION__OBJECT));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.STATEMENT_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.STATEMENT_CALL_MEMBER_FUNCTION__MEMBER_FUNCTION_NAME));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.STATEMENT_CALL_MEMBER_FUNCTION__ARGUMENTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.STATEMENT_CALL_MEMBER_FUNCTION__ARGUMENTS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1(), semanticObject.getObject());
		feeder.accept(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getMemberFunctionNameLUA_NAMETerminalRuleCall_1_1_2_0(), semanticObject.getMemberFunctionName());
		feeder.accept(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getArgumentsFunctioncall_ArgumentsParserRuleCall_1_1_3_0(), semanticObject.getArguments());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (prefix+=LUA_NAME prefix+=LUA_NAME* functionName=LUA_NAME? function=Function)
	 */
	protected void sequence_Statement_GlobalFunction_Declaration(EObject context, Statement_GlobalFunction_Declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elseifExpression=Expression elseifBlock=Block)
	 */
	protected void sequence_Statement_If_Then_Else_ElseIfPart(EObject context, Statement_If_Then_Else_ElseIfPart semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.STATEMENT_IF_THEN_ELSE_ELSE_IF_PART__ELSEIF_BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatement_If_Then_Else_ElseIfPartAccess().getElseifExpressionExpressionParserRuleCall_1_0(), semanticObject.getElseifExpression());
		feeder.accept(grammarAccess.getStatement_If_Then_Else_ElseIfPartAccess().getElseifBlockBlockParserRuleCall_3_0(), semanticObject.getElseifBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ifExpression=Expression ifBlock=Block elseIf+=Statement_If_Then_Else_ElseIfPart* elseBlock=Block?)
	 */
	protected void sequence_Statement_If_Then_Else(EObject context, Statement_If_Then_Else semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (functionName=LUA_NAME function=Function)
	 */
	protected void sequence_Statement_LocalFunction_Declaration(EObject context, Statement_LocalFunction_Declaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION_NAME));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.STATEMENT_LOCAL_FUNCTION_DECLARATION__FUNCTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatement_LocalFunction_DeclarationAccess().getFunctionNameLUA_NAMETerminalRuleCall_2_0(), semanticObject.getFunctionName());
		feeder.accept(grammarAccess.getStatement_LocalFunction_DeclarationAccess().getFunctionFunctionParserRuleCall_3_0(), semanticObject.getFunction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variableNames+=LUA_NAME variableNames+=LUA_NAME* (initialValue+=Expression initialValue+=Expression*)?)
	 */
	protected void sequence_Statement_Local_Variable_Declaration(EObject context, Statement_Local_Variable_Declaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (block=Block expression=Expression)
	 */
	protected void sequence_Statement_Repeat(EObject context, Statement_Repeat semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.STATEMENT_REPEAT__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.STATEMENT_REPEAT__BLOCK));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.STATEMENT_REPEAT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.STATEMENT_REPEAT__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatement_RepeatAccess().getBlockBlockParserRuleCall_1_0(), semanticObject.getBlock());
		feeder.accept(grammarAccess.getStatement_RepeatAccess().getExpressionExpressionParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Expression block=Block)
	 */
	protected void sequence_Statement_While(EObject context, Statement_While semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.STATEMENT_WHILE__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.STATEMENT_WHILE__EXPRESSION));
			if(transientValues.isValueTransient(semanticObject, LuaPackage.Literals.STATEMENT_WHILE__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LuaPackage.Literals.STATEMENT_WHILE__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatement_WhileAccess().getExpressionExpressionParserRuleCall_1_0(), semanticObject.getExpression());
		feeder.accept(grammarAccess.getStatement_WhileAccess().getBlockBlockParserRuleCall_3_0(), semanticObject.getBlock());
		feeder.finish();
	}
}
