/*
* generated by Xtext
*/
grammar InternalRfsm;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package be.kuleuven.rodinia.dsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package be.kuleuven.rodinia.dsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import be.kuleuven.rodinia.dsl.services.RfsmGrammarAccess;

}

@parser::members {
 
 	private RfsmGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(RfsmGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleState
entryRuleState 
:
{ before(grammarAccess.getStateRule()); }
	 ruleState
{ after(grammarAccess.getStateRule()); } 
	 EOF 
;

// Rule State
ruleState
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getStateAccess().getGroup()); }
(rule__State__Group__0)
{ after(grammarAccess.getStateAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleConnector
entryRuleConnector 
:
{ before(grammarAccess.getConnectorRule()); }
	 ruleConnector
{ after(grammarAccess.getConnectorRule()); } 
	 EOF 
;

// Rule Connector
ruleConnector
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getConnectorAccess().getGroup()); }
(rule__Connector__Group__0)
{ after(grammarAccess.getConnectorAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleTransition
entryRuleTransition 
:
{ before(grammarAccess.getTransitionRule()); }
	 ruleTransition
{ after(grammarAccess.getTransitionRule()); } 
	 EOF 
;

// Rule Transition
ruleTransition
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getTransitionAccess().getGroup()); }
(rule__Transition__Group__0)
{ after(grammarAccess.getTransitionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__State__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group__0__Impl
	rule__State__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getStateKeyword_0()); }

	'state' 

{ after(grammarAccess.getStateAccess().getStateKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group__1__Impl
	rule__State__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getNameAssignment_1()); }
(rule__State__NameAssignment_1)
{ after(grammarAccess.getStateAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group__2__Impl
	rule__State__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group__3__Impl
	rule__State__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getSubnodesAssignment_3()); }
(rule__State__SubnodesAssignment_3)*
{ after(grammarAccess.getStateAccess().getSubnodesAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group__4__Impl
	rule__State__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getSubnodesAssignment_4()); }
(rule__State__SubnodesAssignment_4)*
{ after(grammarAccess.getStateAccess().getSubnodesAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group__5__Impl
	rule__State__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getTransitionsAssignment_5()); }
(rule__State__TransitionsAssignment_5)*
{ after(grammarAccess.getStateAccess().getTransitionsAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group__6__Impl
	rule__State__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getGroup_6()); }
(rule__State__Group_6__0)?
{ after(grammarAccess.getStateAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group__7__Impl
	rule__State__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getGroup_7()); }
(rule__State__Group_7__0)?
{ after(grammarAccess.getStateAccess().getGroup_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group__8__Impl
	rule__State__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getGroup_8()); }
(rule__State__Group_8__0)?
{ after(grammarAccess.getStateAccess().getGroup_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__9
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__9__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_9()); }

	'}' 

{ after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_9()); }
)

;
finally {
	restoreStackSize(stackSize);
}






















rule__State__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group_6__0__Impl
	rule__State__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getEntryKeyword_6_0()); }

	'entry: {[-' 

{ after(grammarAccess.getStateAccess().getEntryKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group_6__1__Impl
	rule__State__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getEntryAssignment_6_1()); }
(rule__State__EntryAssignment_6_1)
{ after(grammarAccess.getStateAccess().getEntryAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group_6__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getHyphenMinusRightSquareBracketRightCurlyBracketKeyword_6_2()); }

	'-]}' 

{ after(grammarAccess.getStateAccess().getHyphenMinusRightSquareBracketRightCurlyBracketKeyword_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__State__Group_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group_7__0__Impl
	rule__State__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getEntryKeyword_7_0()); }

	'entry: {[-' 

{ after(grammarAccess.getStateAccess().getEntryKeyword_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group_7__1__Impl
	rule__State__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getDooAssignment_7_1()); }
(rule__State__DooAssignment_7_1)
{ after(grammarAccess.getStateAccess().getDooAssignment_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_7__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group_7__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_7__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getHyphenMinusRightSquareBracketRightCurlyBracketKeyword_7_2()); }

	'-]}' 

{ after(grammarAccess.getStateAccess().getHyphenMinusRightSquareBracketRightCurlyBracketKeyword_7_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__State__Group_8__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group_8__0__Impl
	rule__State__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_8__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getEntryKeyword_8_0()); }

	'entry: {[-' 

{ after(grammarAccess.getStateAccess().getEntryKeyword_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_8__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group_8__1__Impl
	rule__State__Group_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_8__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getExitAssignment_8_1()); }
(rule__State__ExitAssignment_8_1)
{ after(grammarAccess.getStateAccess().getExitAssignment_8_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_8__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__State__Group_8__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_8__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getHyphenMinusRightSquareBracketRightCurlyBracketKeyword_8_2()); }

	'-]}' 

{ after(grammarAccess.getStateAccess().getHyphenMinusRightSquareBracketRightCurlyBracketKeyword_8_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Connector__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connector__Group__0__Impl
	rule__Connector__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); }

	'connector' 

{ after(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connector__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connector__Group__1__Impl
	rule__Connector__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectorAccess().getNameAssignment_1()); }
(rule__Connector__NameAssignment_1)
{ after(grammarAccess.getConnectorAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connector__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connector__Group__2__Impl
	rule__Connector__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Connector__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Connector__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_3()); }

	'}' 

{ after(grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Transition__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transition__Group__0__Impl
	rule__Transition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); }

	'transition' 

{ after(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transition__Group__1__Impl
	rule__Transition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getFromKeyword_1()); }

	'from' 

{ after(grammarAccess.getTransitionAccess().getFromKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transition__Group__2__Impl
	rule__Transition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getSourceAssignment_2()); }
(rule__Transition__SourceAssignment_2)
{ after(grammarAccess.getTransitionAccess().getSourceAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transition__Group__3__Impl
	rule__Transition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getToKeyword_3()); }

	'to' 

{ after(grammarAccess.getTransitionAccess().getToKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transition__Group__4__Impl
	rule__Transition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getTargetAssignment_4()); }
(rule__Transition__TargetAssignment_4)
{ after(grammarAccess.getTransitionAccess().getTargetAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transition__Group__5__Impl
	rule__Transition__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getEventsAssignment_5()); }
(rule__Transition__EventsAssignment_5)*
{ after(grammarAccess.getTransitionAccess().getEventsAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transition__Group__6__Impl
	rule__Transition__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getGroup_6()); }
(rule__Transition__Group_6__0)?
{ after(grammarAccess.getTransitionAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transition__Group__7__Impl
	rule__Transition__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getGroup_7()); }
(rule__Transition__Group_7__0)?
{ after(grammarAccess.getTransitionAccess().getGroup_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group__8
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transition__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__8__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getGroup_8()); }
(rule__Transition__Group_8__0)?
{ after(grammarAccess.getTransitionAccess().getGroup_8()); }
)

;
finally {
	restoreStackSize(stackSize);
}




















rule__Transition__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transition__Group_6__0__Impl
	rule__Transition__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getGuardKeyword_6_0()); }

	'guard: {[-' 

{ after(grammarAccess.getTransitionAccess().getGuardKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transition__Group_6__1__Impl
	rule__Transition__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getGuardAssignment_6_1()); }
(rule__Transition__GuardAssignment_6_1)
{ after(grammarAccess.getTransitionAccess().getGuardAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transition__Group_6__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getHyphenMinusRightSquareBracketRightCurlyBracketKeyword_6_2()); }

	'-]}' 

{ after(grammarAccess.getTransitionAccess().getHyphenMinusRightSquareBracketRightCurlyBracketKeyword_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Transition__Group_7__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transition__Group_7__0__Impl
	rule__Transition__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_7__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getEffectKeyword_7_0()); }

	'effect: {[-' 

{ after(grammarAccess.getTransitionAccess().getEffectKeyword_7_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group_7__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transition__Group_7__1__Impl
	rule__Transition__Group_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_7__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getEffectAssignment_7_1()); }
(rule__Transition__EffectAssignment_7_1)
{ after(grammarAccess.getTransitionAccess().getEffectAssignment_7_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group_7__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transition__Group_7__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_7__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getHyphenMinusRightSquareBracketRightCurlyBracketKeyword_7_2()); }

	'-]}' 

{ after(grammarAccess.getTransitionAccess().getHyphenMinusRightSquareBracketRightCurlyBracketKeyword_7_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Transition__Group_8__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transition__Group_8__0__Impl
	rule__Transition__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_8__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getPriorityKeyword_8_0()); }

	'priority' 

{ after(grammarAccess.getTransitionAccess().getPriorityKeyword_8_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group_8__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Transition__Group_8__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_8__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getPriority_numberAssignment_8_1()); }
(rule__Transition__Priority_numberAssignment_8_1)
{ after(grammarAccess.getTransitionAccess().getPriority_numberAssignment_8_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__State__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__State__SubnodesAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getSubnodesStateParserRuleCall_3_0()); }
	ruleState{ after(grammarAccess.getStateAccess().getSubnodesStateParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__State__SubnodesAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getSubnodesConnectorParserRuleCall_4_0()); }
	ruleConnector{ after(grammarAccess.getStateAccess().getSubnodesConnectorParserRuleCall_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__State__TransitionsAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_0()); }
	ruleTransition{ after(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__State__EntryAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getEntryFunctionCrossReference_6_1_0()); }
(
{ before(grammarAccess.getStateAccess().getEntryFunctionIDTerminalRuleCall_6_1_0_1()); }
	RULE_ID{ after(grammarAccess.getStateAccess().getEntryFunctionIDTerminalRuleCall_6_1_0_1()); }
)
{ after(grammarAccess.getStateAccess().getEntryFunctionCrossReference_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__State__DooAssignment_7_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getDooFunctionCrossReference_7_1_0()); }
(
{ before(grammarAccess.getStateAccess().getDooFunctionIDTerminalRuleCall_7_1_0_1()); }
	RULE_ID{ after(grammarAccess.getStateAccess().getDooFunctionIDTerminalRuleCall_7_1_0_1()); }
)
{ after(grammarAccess.getStateAccess().getDooFunctionCrossReference_7_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__State__ExitAssignment_8_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStateAccess().getExitFunctionCrossReference_8_1_0()); }
(
{ before(grammarAccess.getStateAccess().getExitFunctionIDTerminalRuleCall_8_1_0_1()); }
	RULE_ID{ after(grammarAccess.getStateAccess().getExitFunctionIDTerminalRuleCall_8_1_0_1()); }
)
{ after(grammarAccess.getStateAccess().getExitFunctionCrossReference_8_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__SourceAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getSourceNodeCrossReference_2_0()); }
(
{ before(grammarAccess.getTransitionAccess().getSourceNodeIDTerminalRuleCall_2_0_1()); }
	RULE_ID{ after(grammarAccess.getTransitionAccess().getSourceNodeIDTerminalRuleCall_2_0_1()); }
)
{ after(grammarAccess.getTransitionAccess().getSourceNodeCrossReference_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__TargetAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getTargetNodeCrossReference_4_0()); }
(
{ before(grammarAccess.getTransitionAccess().getTargetNodeIDTerminalRuleCall_4_0_1()); }
	RULE_ID{ after(grammarAccess.getTransitionAccess().getTargetNodeIDTerminalRuleCall_4_0_1()); }
)
{ after(grammarAccess.getTransitionAccess().getTargetNodeCrossReference_4_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__EventsAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getEventsEventCrossReference_5_0()); }
(
{ before(grammarAccess.getTransitionAccess().getEventsEventIDTerminalRuleCall_5_0_1()); }
	RULE_ID{ after(grammarAccess.getTransitionAccess().getEventsEventIDTerminalRuleCall_5_0_1()); }
)
{ after(grammarAccess.getTransitionAccess().getEventsEventCrossReference_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__GuardAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getGuardFunctionCrossReference_6_1_0()); }
(
{ before(grammarAccess.getTransitionAccess().getGuardFunctionIDTerminalRuleCall_6_1_0_1()); }
	RULE_ID{ after(grammarAccess.getTransitionAccess().getGuardFunctionIDTerminalRuleCall_6_1_0_1()); }
)
{ after(grammarAccess.getTransitionAccess().getGuardFunctionCrossReference_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__EffectAssignment_7_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getEffectFunctionCrossReference_7_1_0()); }
(
{ before(grammarAccess.getTransitionAccess().getEffectFunctionIDTerminalRuleCall_7_1_0_1()); }
	RULE_ID{ after(grammarAccess.getTransitionAccess().getEffectFunctionIDTerminalRuleCall_7_1_0_1()); }
)
{ after(grammarAccess.getTransitionAccess().getEffectFunctionCrossReference_7_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Priority_numberAssignment_8_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getTransitionAccess().getPriority_numberINTTerminalRuleCall_8_1_0()); }
	RULE_INT{ after(grammarAccess.getTransitionAccess().getPriority_numberINTTerminalRuleCall_8_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}




RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


