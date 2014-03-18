package be.kuleuven.rodinia.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import be.kuleuven.rodinia.dsl.services.RfsmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRfsmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'state'", "'{'", "'entry: {[-'", "'-]}'", "'}'", "'connector'", "'transition'", "'from'", "'to'", "'guard: {[-'", "'effect: {[-'", "'priority'"
    };
    public static final int RULE_ID=4;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalRfsmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRfsmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRfsmParser.tokenNames; }
    public String getGrammarFileName() { return "../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g"; }



     	private RfsmGrammarAccess grammarAccess;
     	
        public InternalRfsmParser(TokenStream input, RfsmGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "State";	
       	}
       	
       	@Override
       	protected RfsmGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleState"
    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:67:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:68:2: (iv_ruleState= ruleState EOF )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:69:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState75);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:76:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subnodes_3_0= ruleState ) )* ( (lv_subnodes_4_0= ruleConnector ) )* ( (lv_transitions_5_0= ruleTransition ) )* (otherlv_6= 'entry: {[-' ( (otherlv_7= RULE_ID ) ) otherlv_8= '-]}' )? (otherlv_9= 'entry: {[-' ( (otherlv_10= RULE_ID ) ) otherlv_11= '-]}' )? (otherlv_12= 'entry: {[-' ( (otherlv_13= RULE_ID ) ) otherlv_14= '-]}' )? otherlv_15= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_subnodes_3_0 = null;

        EObject lv_subnodes_4_0 = null;

        EObject lv_transitions_5_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:79:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subnodes_3_0= ruleState ) )* ( (lv_subnodes_4_0= ruleConnector ) )* ( (lv_transitions_5_0= ruleTransition ) )* (otherlv_6= 'entry: {[-' ( (otherlv_7= RULE_ID ) ) otherlv_8= '-]}' )? (otherlv_9= 'entry: {[-' ( (otherlv_10= RULE_ID ) ) otherlv_11= '-]}' )? (otherlv_12= 'entry: {[-' ( (otherlv_13= RULE_ID ) ) otherlv_14= '-]}' )? otherlv_15= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:80:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subnodes_3_0= ruleState ) )* ( (lv_subnodes_4_0= ruleConnector ) )* ( (lv_transitions_5_0= ruleTransition ) )* (otherlv_6= 'entry: {[-' ( (otherlv_7= RULE_ID ) ) otherlv_8= '-]}' )? (otherlv_9= 'entry: {[-' ( (otherlv_10= RULE_ID ) ) otherlv_11= '-]}' )? (otherlv_12= 'entry: {[-' ( (otherlv_13= RULE_ID ) ) otherlv_14= '-]}' )? otherlv_15= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:80:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subnodes_3_0= ruleState ) )* ( (lv_subnodes_4_0= ruleConnector ) )* ( (lv_transitions_5_0= ruleTransition ) )* (otherlv_6= 'entry: {[-' ( (otherlv_7= RULE_ID ) ) otherlv_8= '-]}' )? (otherlv_9= 'entry: {[-' ( (otherlv_10= RULE_ID ) ) otherlv_11= '-]}' )? (otherlv_12= 'entry: {[-' ( (otherlv_13= RULE_ID ) ) otherlv_14= '-]}' )? otherlv_15= '}' )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:80:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subnodes_3_0= ruleState ) )* ( (lv_subnodes_4_0= ruleConnector ) )* ( (lv_transitions_5_0= ruleTransition ) )* (otherlv_6= 'entry: {[-' ( (otherlv_7= RULE_ID ) ) otherlv_8= '-]}' )? (otherlv_9= 'entry: {[-' ( (otherlv_10= RULE_ID ) ) otherlv_11= '-]}' )? (otherlv_12= 'entry: {[-' ( (otherlv_13= RULE_ID ) ) otherlv_14= '-]}' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleState122); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:85:1: (lv_name_1_0= RULE_ID )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleState156); 

                	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
                
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:106:1: ( (lv_subnodes_3_0= ruleState ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:107:1: (lv_subnodes_3_0= ruleState )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:107:1: (lv_subnodes_3_0= ruleState )
            	    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:108:3: lv_subnodes_3_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getSubnodesStateParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleState177);
            	    lv_subnodes_3_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subnodes",
            	            		lv_subnodes_3_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:124:3: ( (lv_subnodes_4_0= ruleConnector ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:125:1: (lv_subnodes_4_0= ruleConnector )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:125:1: (lv_subnodes_4_0= ruleConnector )
            	    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:126:3: lv_subnodes_4_0= ruleConnector
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getSubnodesConnectorParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConnector_in_ruleState199);
            	    lv_subnodes_4_0=ruleConnector();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subnodes",
            	            		lv_subnodes_4_0, 
            	            		"Connector");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:142:3: ( (lv_transitions_5_0= ruleTransition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:143:1: (lv_transitions_5_0= ruleTransition )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:143:1: (lv_transitions_5_0= ruleTransition )
            	    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:144:3: lv_transitions_5_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransition_in_ruleState221);
            	    lv_transitions_5_0=ruleTransition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"transitions",
            	            		lv_transitions_5_0, 
            	            		"Transition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:160:3: (otherlv_6= 'entry: {[-' ( (otherlv_7= RULE_ID ) ) otherlv_8= '-]}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3==14) ) {
                        alt4=1;
                    }
                }
            }
            switch (alt4) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:160:5: otherlv_6= 'entry: {[-' ( (otherlv_7= RULE_ID ) ) otherlv_8= '-]}'
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleState235); 

                        	newLeafNode(otherlv_6, grammarAccess.getStateAccess().getEntryKeyword_6_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:164:1: ( (otherlv_7= RULE_ID ) )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:165:1: (otherlv_7= RULE_ID )
                    {
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:165:1: (otherlv_7= RULE_ID )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:166:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState255); 

                    		newLeafNode(otherlv_7, grammarAccess.getStateAccess().getEntryFunctionCrossReference_6_1_0()); 
                    	

                    }


                    }

                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleState267); 

                        	newLeafNode(otherlv_8, grammarAccess.getStateAccess().getHyphenMinusRightSquareBracketRightCurlyBracketKeyword_6_2());
                        

                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:181:3: (otherlv_9= 'entry: {[-' ( (otherlv_10= RULE_ID ) ) otherlv_11= '-]}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_3 = input.LA(3);

                    if ( (LA5_3==14) ) {
                        alt5=1;
                    }
                }
            }
            switch (alt5) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:181:5: otherlv_9= 'entry: {[-' ( (otherlv_10= RULE_ID ) ) otherlv_11= '-]}'
                    {
                    otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleState282); 

                        	newLeafNode(otherlv_9, grammarAccess.getStateAccess().getEntryKeyword_7_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:185:1: ( (otherlv_10= RULE_ID ) )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:186:1: (otherlv_10= RULE_ID )
                    {
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:186:1: (otherlv_10= RULE_ID )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:187:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState302); 

                    		newLeafNode(otherlv_10, grammarAccess.getStateAccess().getDooFunctionCrossReference_7_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleState314); 

                        	newLeafNode(otherlv_11, grammarAccess.getStateAccess().getHyphenMinusRightSquareBracketRightCurlyBracketKeyword_7_2());
                        

                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:202:3: (otherlv_12= 'entry: {[-' ( (otherlv_13= RULE_ID ) ) otherlv_14= '-]}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:202:5: otherlv_12= 'entry: {[-' ( (otherlv_13= RULE_ID ) ) otherlv_14= '-]}'
                    {
                    otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleState329); 

                        	newLeafNode(otherlv_12, grammarAccess.getStateAccess().getEntryKeyword_8_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:206:1: ( (otherlv_13= RULE_ID ) )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:207:1: (otherlv_13= RULE_ID )
                    {
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:207:1: (otherlv_13= RULE_ID )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:208:3: otherlv_13= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                            
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState349); 

                    		newLeafNode(otherlv_13, grammarAccess.getStateAccess().getExitFunctionCrossReference_8_1_0()); 
                    	

                    }


                    }

                    otherlv_14=(Token)match(input,14,FOLLOW_14_in_ruleState361); 

                        	newLeafNode(otherlv_14, grammarAccess.getStateAccess().getHyphenMinusRightSquareBracketRightCurlyBracketKeyword_8_2());
                        

                    }
                    break;

            }

            otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleState375); 

                	newLeafNode(otherlv_15, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleConnector"
    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:235:1: entryRuleConnector returns [EObject current=null] : iv_ruleConnector= ruleConnector EOF ;
    public final EObject entryRuleConnector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnector = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:236:2: (iv_ruleConnector= ruleConnector EOF )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:237:2: iv_ruleConnector= ruleConnector EOF
            {
             newCompositeNode(grammarAccess.getConnectorRule()); 
            pushFollow(FOLLOW_ruleConnector_in_entryRuleConnector411);
            iv_ruleConnector=ruleConnector();

            state._fsp--;

             current =iv_ruleConnector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnector421); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnector"


    // $ANTLR start "ruleConnector"
    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:244:1: ruleConnector returns [EObject current=null] : (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleConnector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:247:28: ( (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:248:1: (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:248:1: (otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:248:3: otherlv_0= 'connector' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleConnector458); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
                
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:252:1: ( (lv_name_1_0= RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:253:1: (lv_name_1_0= RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:253:1: (lv_name_1_0= RULE_ID )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:254:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnector475); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleConnector492); 

                	newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleConnector504); 

                	newLeafNode(otherlv_3, grammarAccess.getConnectorAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnector"


    // $ANTLR start "entryRuleTransition"
    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:286:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:287:2: (iv_ruleTransition= ruleTransition EOF )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:288:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition540);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition550); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:295:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'transition' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) )* (otherlv_6= 'guard: {[-' ( (otherlv_7= RULE_ID ) ) otherlv_8= '-]}' )? (otherlv_9= 'effect: {[-' ( (otherlv_10= RULE_ID ) ) otherlv_11= '-]}' )? (otherlv_12= 'priority' ( (lv_priority_number_13_0= RULE_INT ) ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_priority_number_13_0=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:298:28: ( (otherlv_0= 'transition' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) )* (otherlv_6= 'guard: {[-' ( (otherlv_7= RULE_ID ) ) otherlv_8= '-]}' )? (otherlv_9= 'effect: {[-' ( (otherlv_10= RULE_ID ) ) otherlv_11= '-]}' )? (otherlv_12= 'priority' ( (lv_priority_number_13_0= RULE_INT ) ) )? ) )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:299:1: (otherlv_0= 'transition' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) )* (otherlv_6= 'guard: {[-' ( (otherlv_7= RULE_ID ) ) otherlv_8= '-]}' )? (otherlv_9= 'effect: {[-' ( (otherlv_10= RULE_ID ) ) otherlv_11= '-]}' )? (otherlv_12= 'priority' ( (lv_priority_number_13_0= RULE_INT ) ) )? )
            {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:299:1: (otherlv_0= 'transition' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) )* (otherlv_6= 'guard: {[-' ( (otherlv_7= RULE_ID ) ) otherlv_8= '-]}' )? (otherlv_9= 'effect: {[-' ( (otherlv_10= RULE_ID ) ) otherlv_11= '-]}' )? (otherlv_12= 'priority' ( (lv_priority_number_13_0= RULE_INT ) ) )? )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:299:3: otherlv_0= 'transition' otherlv_1= 'from' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'to' ( (otherlv_4= RULE_ID ) ) ( (otherlv_5= RULE_ID ) )* (otherlv_6= 'guard: {[-' ( (otherlv_7= RULE_ID ) ) otherlv_8= '-]}' )? (otherlv_9= 'effect: {[-' ( (otherlv_10= RULE_ID ) ) otherlv_11= '-]}' )? (otherlv_12= 'priority' ( (lv_priority_number_13_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleTransition587); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleTransition599); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getFromKeyword_1());
                
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:307:1: ( (otherlv_2= RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:308:1: (otherlv_2= RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:308:1: (otherlv_2= RULE_ID )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:309:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition619); 

            		newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getSourceNodeCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleTransition631); 

                	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getToKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:324:1: ( (otherlv_4= RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:325:1: (otherlv_4= RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:325:1: (otherlv_4= RULE_ID )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:326:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition651); 

            		newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getTargetNodeCrossReference_4_0()); 
            	

            }


            }

            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:337:2: ( (otherlv_5= RULE_ID ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:338:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:338:1: (otherlv_5= RULE_ID )
            	    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:339:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTransitionRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition671); 

            	    		newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getEventsEventCrossReference_5_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:350:3: (otherlv_6= 'guard: {[-' ( (otherlv_7= RULE_ID ) ) otherlv_8= '-]}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:350:5: otherlv_6= 'guard: {[-' ( (otherlv_7= RULE_ID ) ) otherlv_8= '-]}'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleTransition685); 

                        	newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getGuardKeyword_6_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:354:1: ( (otherlv_7= RULE_ID ) )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:355:1: (otherlv_7= RULE_ID )
                    {
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:355:1: (otherlv_7= RULE_ID )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:356:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition705); 

                    		newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getGuardFunctionCrossReference_6_1_0()); 
                    	

                    }


                    }

                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleTransition717); 

                        	newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getHyphenMinusRightSquareBracketRightCurlyBracketKeyword_6_2());
                        

                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:371:3: (otherlv_9= 'effect: {[-' ( (otherlv_10= RULE_ID ) ) otherlv_11= '-]}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:371:5: otherlv_9= 'effect: {[-' ( (otherlv_10= RULE_ID ) ) otherlv_11= '-]}'
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleTransition732); 

                        	newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getEffectKeyword_7_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:375:1: ( (otherlv_10= RULE_ID ) )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:376:1: (otherlv_10= RULE_ID )
                    {
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:376:1: (otherlv_10= RULE_ID )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:377:3: otherlv_10= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition752); 

                    		newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getEffectFunctionCrossReference_7_1_0()); 
                    	

                    }


                    }

                    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleTransition764); 

                        	newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getHyphenMinusRightSquareBracketRightCurlyBracketKeyword_7_2());
                        

                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:392:3: (otherlv_12= 'priority' ( (lv_priority_number_13_0= RULE_INT ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:392:5: otherlv_12= 'priority' ( (lv_priority_number_13_0= RULE_INT ) )
                    {
                    otherlv_12=(Token)match(input,22,FOLLOW_22_in_ruleTransition779); 

                        	newLeafNode(otherlv_12, grammarAccess.getTransitionAccess().getPriorityKeyword_8_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:396:1: ( (lv_priority_number_13_0= RULE_INT ) )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:397:1: (lv_priority_number_13_0= RULE_INT )
                    {
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:397:1: (lv_priority_number_13_0= RULE_INT )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:398:3: lv_priority_number_13_0= RULE_INT
                    {
                    lv_priority_number_13_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTransition796); 

                    			newLeafNode(lv_priority_number_13_0, grammarAccess.getTransitionAccess().getPriority_numberINTTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"priority_number",
                            		lv_priority_number_13_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleState_in_entryRuleState75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleState122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState156 = new BitSet(new long[]{0x000000000003A800L});
    public static final BitSet FOLLOW_ruleState_in_ruleState177 = new BitSet(new long[]{0x000000000003A800L});
    public static final BitSet FOLLOW_ruleConnector_in_ruleState199 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleState221 = new BitSet(new long[]{0x000000000002A000L});
    public static final BitSet FOLLOW_13_in_ruleState235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState255 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState267 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleState282 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState302 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState314 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_13_in_ruleState329 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState349 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleState361 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleState375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnector_in_entryRuleConnector411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnector421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleConnector458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnector475 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConnector492 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConnector504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTransition587 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTransition599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition619 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTransition631 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition651 = new BitSet(new long[]{0x0000000000700012L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition671 = new BitSet(new long[]{0x0000000000700012L});
    public static final BitSet FOLLOW_20_in_ruleTransition685 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition705 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTransition717 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21_in_ruleTransition732 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition752 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTransition764 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleTransition779 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTransition796 = new BitSet(new long[]{0x0000000000000002L});

}