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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Graph'", "'{'", "'}'", "'state'", "'entry:'", "'doo:'", "'exit:'", "'transition'", "'from'", "'to'", "'guard:'", "'effect:'", "'priority'", "'onevent'", "'.'"
    };
    public static final int RULE_ID=4;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
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
        	return "HyperGraph";	
       	}
       	
       	@Override
       	protected RfsmGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleHyperGraph"
    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:67:1: entryRuleHyperGraph returns [EObject current=null] : iv_ruleHyperGraph= ruleHyperGraph EOF ;
    public final EObject entryRuleHyperGraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHyperGraph = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:68:2: (iv_ruleHyperGraph= ruleHyperGraph EOF )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:69:2: iv_ruleHyperGraph= ruleHyperGraph EOF
            {
             newCompositeNode(grammarAccess.getHyperGraphRule()); 
            pushFollow(FOLLOW_ruleHyperGraph_in_entryRuleHyperGraph75);
            iv_ruleHyperGraph=ruleHyperGraph();

            state._fsp--;

             current =iv_ruleHyperGraph; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHyperGraph85); 

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
    // $ANTLR end "entryRuleHyperGraph"


    // $ANTLR start "ruleHyperGraph"
    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:76:1: ruleHyperGraph returns [EObject current=null] : (otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hyperVertices_3_0= ruleState ) ) ( (lv_hyperEdges_4_0= ruleTransition ) )* otherlv_5= '}' ) ;
    public final EObject ruleHyperGraph() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_hyperVertices_3_0 = null;

        EObject lv_hyperEdges_4_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:79:28: ( (otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hyperVertices_3_0= ruleState ) ) ( (lv_hyperEdges_4_0= ruleTransition ) )* otherlv_5= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:80:1: (otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hyperVertices_3_0= ruleState ) ) ( (lv_hyperEdges_4_0= ruleTransition ) )* otherlv_5= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:80:1: (otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hyperVertices_3_0= ruleState ) ) ( (lv_hyperEdges_4_0= ruleTransition ) )* otherlv_5= '}' )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:80:3: otherlv_0= 'Graph' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_hyperVertices_3_0= ruleState ) ) ( (lv_hyperEdges_4_0= ruleTransition ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleHyperGraph122); 

                	newLeafNode(otherlv_0, grammarAccess.getHyperGraphAccess().getGraphKeyword_0());
                
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:85:1: (lv_name_1_0= RULE_ID )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHyperGraph139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getHyperGraphAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getHyperGraphRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleHyperGraph156); 

                	newLeafNode(otherlv_2, grammarAccess.getHyperGraphAccess().getLeftCurlyBracketKeyword_2());
                
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:106:1: ( (lv_hyperVertices_3_0= ruleState ) )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:107:1: (lv_hyperVertices_3_0= ruleState )
            {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:107:1: (lv_hyperVertices_3_0= ruleState )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:108:3: lv_hyperVertices_3_0= ruleState
            {
             
            	        newCompositeNode(grammarAccess.getHyperGraphAccess().getHyperVerticesStateParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleState_in_ruleHyperGraph177);
            lv_hyperVertices_3_0=ruleState();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHyperGraphRule());
            	        }
                   		add(
                   			current, 
                   			"hyperVertices",
                    		lv_hyperVertices_3_0, 
                    		"State");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:124:2: ( (lv_hyperEdges_4_0= ruleTransition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:125:1: (lv_hyperEdges_4_0= ruleTransition )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:125:1: (lv_hyperEdges_4_0= ruleTransition )
            	    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:126:3: lv_hyperEdges_4_0= ruleTransition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getHyperGraphAccess().getHyperEdgesTransitionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTransition_in_ruleHyperGraph198);
            	    lv_hyperEdges_4_0=ruleTransition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getHyperGraphRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"hyperEdges",
            	            		lv_hyperEdges_4_0, 
            	            		"Transition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleHyperGraph211); 

                	newLeafNode(otherlv_5, grammarAccess.getHyperGraphAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleHyperGraph"


    // $ANTLR start "entryRuleState"
    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:154:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:155:2: (iv_ruleState= ruleState EOF )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:156:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState247);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState257); 

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
    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:163:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subHyperVertices_3_0= ruleState ) )* (otherlv_4= 'entry:' ( (lv_entry_5_0= ruleFunction ) ) )? (otherlv_6= 'doo:' ( (lv_doo_7_0= ruleFunction ) ) )? (otherlv_8= 'exit:' ( (lv_exit_9_0= ruleFunction ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_subHyperVertices_3_0 = null;

        EObject lv_entry_5_0 = null;

        EObject lv_doo_7_0 = null;

        EObject lv_exit_9_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:166:28: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subHyperVertices_3_0= ruleState ) )* (otherlv_4= 'entry:' ( (lv_entry_5_0= ruleFunction ) ) )? (otherlv_6= 'doo:' ( (lv_doo_7_0= ruleFunction ) ) )? (otherlv_8= 'exit:' ( (lv_exit_9_0= ruleFunction ) ) )? otherlv_10= '}' ) )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:167:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subHyperVertices_3_0= ruleState ) )* (otherlv_4= 'entry:' ( (lv_entry_5_0= ruleFunction ) ) )? (otherlv_6= 'doo:' ( (lv_doo_7_0= ruleFunction ) ) )? (otherlv_8= 'exit:' ( (lv_exit_9_0= ruleFunction ) ) )? otherlv_10= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:167:1: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subHyperVertices_3_0= ruleState ) )* (otherlv_4= 'entry:' ( (lv_entry_5_0= ruleFunction ) ) )? (otherlv_6= 'doo:' ( (lv_doo_7_0= ruleFunction ) ) )? (otherlv_8= 'exit:' ( (lv_exit_9_0= ruleFunction ) ) )? otherlv_10= '}' )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:167:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_subHyperVertices_3_0= ruleState ) )* (otherlv_4= 'entry:' ( (lv_entry_5_0= ruleFunction ) ) )? (otherlv_6= 'doo:' ( (lv_doo_7_0= ruleFunction ) ) )? (otherlv_8= 'exit:' ( (lv_exit_9_0= ruleFunction ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleState294); 

                	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
                
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:171:1: ( (lv_name_1_0= RULE_ID ) )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:172:1: (lv_name_1_0= RULE_ID )
            {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:172:1: (lv_name_1_0= RULE_ID )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:173:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState311); 

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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleState328); 

                	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
                
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:193:1: ( (lv_subHyperVertices_3_0= ruleState ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:194:1: (lv_subHyperVertices_3_0= ruleState )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:194:1: (lv_subHyperVertices_3_0= ruleState )
            	    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:195:3: lv_subHyperVertices_3_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateAccess().getSubHyperVerticesStateParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleState_in_ruleState349);
            	    lv_subHyperVertices_3_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subHyperVertices",
            	            		lv_subHyperVertices_3_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:211:3: (otherlv_4= 'entry:' ( (lv_entry_5_0= ruleFunction ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:211:5: otherlv_4= 'entry:' ( (lv_entry_5_0= ruleFunction ) )
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleState363); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getEntryKeyword_4_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:215:1: ( (lv_entry_5_0= ruleFunction ) )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:216:1: (lv_entry_5_0= ruleFunction )
                    {
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:216:1: (lv_entry_5_0= ruleFunction )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:217:3: lv_entry_5_0= ruleFunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getEntryFunctionParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunction_in_ruleState384);
                    lv_entry_5_0=ruleFunction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	        }
                           		set(
                           			current, 
                           			"entry",
                            		lv_entry_5_0, 
                            		"Function");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:233:4: (otherlv_6= 'doo:' ( (lv_doo_7_0= ruleFunction ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:233:6: otherlv_6= 'doo:' ( (lv_doo_7_0= ruleFunction ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleState399); 

                        	newLeafNode(otherlv_6, grammarAccess.getStateAccess().getDooKeyword_5_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:237:1: ( (lv_doo_7_0= ruleFunction ) )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:238:1: (lv_doo_7_0= ruleFunction )
                    {
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:238:1: (lv_doo_7_0= ruleFunction )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:239:3: lv_doo_7_0= ruleFunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getDooFunctionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunction_in_ruleState420);
                    lv_doo_7_0=ruleFunction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	        }
                           		set(
                           			current, 
                           			"doo",
                            		lv_doo_7_0, 
                            		"Function");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:255:4: (otherlv_8= 'exit:' ( (lv_exit_9_0= ruleFunction ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:255:6: otherlv_8= 'exit:' ( (lv_exit_9_0= ruleFunction ) )
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleState435); 

                        	newLeafNode(otherlv_8, grammarAccess.getStateAccess().getExitKeyword_6_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:259:1: ( (lv_exit_9_0= ruleFunction ) )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:260:1: (lv_exit_9_0= ruleFunction )
                    {
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:260:1: (lv_exit_9_0= ruleFunction )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:261:3: lv_exit_9_0= ruleFunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getExitFunctionParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunction_in_ruleState456);
                    lv_exit_9_0=ruleFunction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	        }
                           		set(
                           			current, 
                           			"exit",
                            		lv_exit_9_0, 
                            		"Function");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleState470); 

                	newLeafNode(otherlv_10, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleTransition"
    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:291:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:292:2: (iv_ruleTransition= ruleTransition EOF )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:293:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition508);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition518); 

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
    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:300:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'transition' otherlv_1= 'from' ( ( ruleQualifiedName ) ) otherlv_3= 'to' ( ( ruleQualifiedName ) ) ( (lv_events_5_0= ruleEvent ) )* (otherlv_6= 'guard:' ( (lv_guard_7_0= ruleFunction ) ) )? (otherlv_8= 'effect:' ( (lv_effect_9_0= ruleFunction ) ) )? (otherlv_10= 'priority' ( (lv_priority_number_11_0= RULE_INT ) ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_priority_number_11_0=null;
        EObject lv_events_5_0 = null;

        EObject lv_guard_7_0 = null;

        EObject lv_effect_9_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:303:28: ( (otherlv_0= 'transition' otherlv_1= 'from' ( ( ruleQualifiedName ) ) otherlv_3= 'to' ( ( ruleQualifiedName ) ) ( (lv_events_5_0= ruleEvent ) )* (otherlv_6= 'guard:' ( (lv_guard_7_0= ruleFunction ) ) )? (otherlv_8= 'effect:' ( (lv_effect_9_0= ruleFunction ) ) )? (otherlv_10= 'priority' ( (lv_priority_number_11_0= RULE_INT ) ) )? ) )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:304:1: (otherlv_0= 'transition' otherlv_1= 'from' ( ( ruleQualifiedName ) ) otherlv_3= 'to' ( ( ruleQualifiedName ) ) ( (lv_events_5_0= ruleEvent ) )* (otherlv_6= 'guard:' ( (lv_guard_7_0= ruleFunction ) ) )? (otherlv_8= 'effect:' ( (lv_effect_9_0= ruleFunction ) ) )? (otherlv_10= 'priority' ( (lv_priority_number_11_0= RULE_INT ) ) )? )
            {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:304:1: (otherlv_0= 'transition' otherlv_1= 'from' ( ( ruleQualifiedName ) ) otherlv_3= 'to' ( ( ruleQualifiedName ) ) ( (lv_events_5_0= ruleEvent ) )* (otherlv_6= 'guard:' ( (lv_guard_7_0= ruleFunction ) ) )? (otherlv_8= 'effect:' ( (lv_effect_9_0= ruleFunction ) ) )? (otherlv_10= 'priority' ( (lv_priority_number_11_0= RULE_INT ) ) )? )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:304:3: otherlv_0= 'transition' otherlv_1= 'from' ( ( ruleQualifiedName ) ) otherlv_3= 'to' ( ( ruleQualifiedName ) ) ( (lv_events_5_0= ruleEvent ) )* (otherlv_6= 'guard:' ( (lv_guard_7_0= ruleFunction ) ) )? (otherlv_8= 'effect:' ( (lv_effect_9_0= ruleFunction ) ) )? (otherlv_10= 'priority' ( (lv_priority_number_11_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleTransition555); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleTransition567); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getFromKeyword_1());
                
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:312:1: ( ( ruleQualifiedName ) )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:313:1: ( ruleQualifiedName )
            {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:313:1: ( ruleQualifiedName )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:314:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTransition590);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleTransition602); 

                	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getToKeyword_3());
                
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:331:1: ( ( ruleQualifiedName ) )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:332:1: ( ruleQualifiedName )
            {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:332:1: ( ruleQualifiedName )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:333:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTransition625);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:346:2: ( (lv_events_5_0= ruleEvent ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:347:1: (lv_events_5_0= ruleEvent )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:347:1: (lv_events_5_0= ruleEvent )
            	    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:348:3: lv_events_5_0= ruleEvent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTransitionAccess().getEventsEventParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvent_in_ruleTransition646);
            	    lv_events_5_0=ruleEvent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"events",
            	            		lv_events_5_0, 
            	            		"Event");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:364:3: (otherlv_6= 'guard:' ( (lv_guard_7_0= ruleFunction ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:364:5: otherlv_6= 'guard:' ( (lv_guard_7_0= ruleFunction ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleTransition660); 

                        	newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getGuardKeyword_6_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:368:1: ( (lv_guard_7_0= ruleFunction ) )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:369:1: (lv_guard_7_0= ruleFunction )
                    {
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:369:1: (lv_guard_7_0= ruleFunction )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:370:3: lv_guard_7_0= ruleFunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardFunctionParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunction_in_ruleTransition681);
                    lv_guard_7_0=ruleFunction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	        }
                           		set(
                           			current, 
                           			"guard",
                            		lv_guard_7_0, 
                            		"Function");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:386:4: (otherlv_8= 'effect:' ( (lv_effect_9_0= ruleFunction ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:386:6: otherlv_8= 'effect:' ( (lv_effect_9_0= ruleFunction ) )
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleTransition696); 

                        	newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getEffectKeyword_7_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:390:1: ( (lv_effect_9_0= ruleFunction ) )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:391:1: (lv_effect_9_0= ruleFunction )
                    {
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:391:1: (lv_effect_9_0= ruleFunction )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:392:3: lv_effect_9_0= ruleFunction
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getEffectFunctionParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunction_in_ruleTransition717);
                    lv_effect_9_0=ruleFunction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	        }
                           		set(
                           			current, 
                           			"effect",
                            		lv_effect_9_0, 
                            		"Function");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:408:4: (otherlv_10= 'priority' ( (lv_priority_number_11_0= RULE_INT ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:408:6: otherlv_10= 'priority' ( (lv_priority_number_11_0= RULE_INT ) )
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleTransition732); 

                        	newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getPriorityKeyword_8_0());
                        
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:412:1: ( (lv_priority_number_11_0= RULE_INT ) )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:413:1: (lv_priority_number_11_0= RULE_INT )
                    {
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:413:1: (lv_priority_number_11_0= RULE_INT )
                    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:414:3: lv_priority_number_11_0= RULE_INT
                    {
                    lv_priority_number_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTransition749); 

                    			newLeafNode(lv_priority_number_11_0, grammarAccess.getTransitionAccess().getPriority_numberINTTerminalRuleCall_8_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"priority_number",
                            		lv_priority_number_11_0, 
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


    // $ANTLR start "entryRuleEvent"
    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:438:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:439:2: (iv_ruleEvent= ruleEvent EOF )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:440:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent792);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent802); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:447:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'onevent' ( (lv_eventliteral_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_eventliteral_1_0=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:450:28: ( (otherlv_0= 'onevent' ( (lv_eventliteral_1_0= RULE_STRING ) ) ) )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:451:1: (otherlv_0= 'onevent' ( (lv_eventliteral_1_0= RULE_STRING ) ) )
            {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:451:1: (otherlv_0= 'onevent' ( (lv_eventliteral_1_0= RULE_STRING ) ) )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:451:3: otherlv_0= 'onevent' ( (lv_eventliteral_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleEvent839); 

                	newLeafNode(otherlv_0, grammarAccess.getEventAccess().getOneventKeyword_0());
                
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:455:1: ( (lv_eventliteral_1_0= RULE_STRING ) )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:456:1: (lv_eventliteral_1_0= RULE_STRING )
            {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:456:1: (lv_eventliteral_1_0= RULE_STRING )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:457:3: lv_eventliteral_1_0= RULE_STRING
            {
            lv_eventliteral_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvent856); 

            			newLeafNode(lv_eventliteral_1_0, grammarAccess.getEventAccess().getEventliteralSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEventRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"eventliteral",
                    		lv_eventliteral_1_0, 
                    		"STRING");
            	    

            }


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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleFunction"
    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:481:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:482:2: (iv_ruleFunction= ruleFunction EOF )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:483:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction897);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction907); 

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:490:1: ruleFunction returns [EObject current=null] : ( (lv_sourcecode_0_0= RULE_STRING ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_sourcecode_0_0=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:493:28: ( ( (lv_sourcecode_0_0= RULE_STRING ) ) )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:494:1: ( (lv_sourcecode_0_0= RULE_STRING ) )
            {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:494:1: ( (lv_sourcecode_0_0= RULE_STRING ) )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:495:1: (lv_sourcecode_0_0= RULE_STRING )
            {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:495:1: (lv_sourcecode_0_0= RULE_STRING )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:496:3: lv_sourcecode_0_0= RULE_STRING
            {
            lv_sourcecode_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunction948); 

            			newLeafNode(lv_sourcecode_0_0, grammarAccess.getFunctionAccess().getSourcecodeSTRINGTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFunctionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sourcecode",
                    		lv_sourcecode_0_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleQualifiedName"
    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:520:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:521:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:522:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName989);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1000); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:529:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:532:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:533:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:533:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:533:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1040); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:540:1: (kw= '.' this_ID_2= RULE_ID )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.rfsm/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalRfsm.g:541:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,25,FOLLOW_25_in_ruleQualifiedName1059); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName1074); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


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
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleHyperGraph_in_entryRuleHyperGraph75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHyperGraph85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleHyperGraph122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHyperGraph139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleHyperGraph156 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleState_in_ruleHyperGraph177 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleHyperGraph198 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_ruleHyperGraph211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleState294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState311 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleState328 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_ruleState_in_ruleState349 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_15_in_ruleState363 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleState384 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_16_in_ruleState399 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleState420 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_17_in_ruleState435 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleState456 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleState470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTransition555 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTransition567 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTransition590 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTransition602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTransition625 = new BitSet(new long[]{0x0000000001E00002L});
    public static final BitSet FOLLOW_ruleEvent_in_ruleTransition646 = new BitSet(new long[]{0x0000000001E00002L});
    public static final BitSet FOLLOW_21_in_ruleTransition660 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleTransition681 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_22_in_ruleTransition696 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleTransition717 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleTransition732 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTransition749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleEvent839 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvent856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunction948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1040 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleQualifiedName1059 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1074 = new BitSet(new long[]{0x0000000002000002L});

}