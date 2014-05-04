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
import be.kuleuven.rodinia.dsl.services.LuaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLuaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LUA_NAME", "RULE_LUA_NUMBER", "RULE_LUA_STRING", "RULE_COMMENT", "RULE_WS", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER", "';'", "'return'", "','", "'break'", "'do'", "'end'", "'while'", "'repeat'", "'until'", "'if'", "'then'", "'else'", "'elseif'", "'for'", "'='", "'in'", "'function'", "'.'", "':'", "'local'", "'or'", "'and'", "'>'", "'>='", "'<'", "'<='", "'=='", "'~='", "'..'", "'+'", "'-'", "'*'", "'/'", "'%'", "'not'", "'#'", "'^'", "'nil'", "'true'", "'false'", "'...'", "'{'", "'}'", "'['", "']'", "'('", "')'"
    };
    public static final int RULE_ID=9;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int RULE_LUA_NUMBER=5;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int RULE_LUA_STRING=6;
    public static final int T__59=59;
    public static final int RULE_INT=10;
    public static final int RULE_LUA_NAME=4;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_COMMENT=7;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=11;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=8;

    // delegates
    // delegators


        public InternalLuaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLuaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLuaParser.tokenNames; }
    public String getGrammarFileName() { return "../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private LuaGrammarAccess grammarAccess;
     	
        public InternalLuaParser(TokenStream input, LuaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Chunk";	
       	}
       	
       	@Override
       	protected LuaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleChunk"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:73:1: entryRuleChunk returns [EObject current=null] : iv_ruleChunk= ruleChunk EOF ;
    public final EObject entryRuleChunk() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChunk = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_COMMENT");
        	
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:77:2: (iv_ruleChunk= ruleChunk EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:78:2: iv_ruleChunk= ruleChunk EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChunkRule()); 
            }
            pushFollow(FOLLOW_ruleChunk_in_entryRuleChunk87);
            iv_ruleChunk=ruleChunk();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChunk; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleChunk97); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleChunk"


    // $ANTLR start "ruleChunk"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:88:1: ruleChunk returns [EObject current=null] : this_Block_0= ruleBlock ;
    public final EObject ruleChunk() throws RecognitionException {
        EObject current = null;

        EObject this_Block_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_COMMENT");
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:92:28: (this_Block_0= ruleBlock )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:94:2: this_Block_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getChunkAccess().getBlockParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleChunk150);
            this_Block_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Block_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleChunk"


    // $ANTLR start "entryRuleBlock"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:116:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_COMMENT");
        	
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:120:2: (iv_ruleBlock= ruleBlock EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:121:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock194);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock204); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:131:1: ruleBlock returns [EObject current=null] : ( () ( ( (lv_statements_1_0= ruleStatement ) ) (otherlv_2= ';' )? )* ( ( (lv_returnValue_3_0= ruleLastStatement ) ) (otherlv_4= ';' )? )? ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statements_1_0 = null;

        EObject lv_returnValue_3_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_COMMENT");
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:135:28: ( ( () ( ( (lv_statements_1_0= ruleStatement ) ) (otherlv_2= ';' )? )* ( ( (lv_returnValue_3_0= ruleLastStatement ) ) (otherlv_4= ';' )? )? ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:136:1: ( () ( ( (lv_statements_1_0= ruleStatement ) ) (otherlv_2= ';' )? )* ( ( (lv_returnValue_3_0= ruleLastStatement ) ) (otherlv_4= ';' )? )? )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:136:1: ( () ( ( (lv_statements_1_0= ruleStatement ) ) (otherlv_2= ';' )? )* ( ( (lv_returnValue_3_0= ruleLastStatement ) ) (otherlv_4= ';' )? )? )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:136:2: () ( ( (lv_statements_1_0= ruleStatement ) ) (otherlv_2= ';' )? )* ( ( (lv_returnValue_3_0= ruleLastStatement ) ) (otherlv_4= ';' )? )?
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:136:2: ()
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:137:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBlockAccess().getBlockAction_0(),
                          current);
                  
            }

            }

            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:145:2: ( ( (lv_statements_1_0= ruleStatement ) ) (otherlv_2= ';' )? )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_LUA_NAME||LA2_0==19||(LA2_0>=21 && LA2_0<=22)||LA2_0==24||LA2_0==28||LA2_0==31||LA2_0==34||LA2_0==60) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:145:3: ( (lv_statements_1_0= ruleStatement ) ) (otherlv_2= ';' )?
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:145:3: ( (lv_statements_1_0= ruleStatement ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:146:1: (lv_statements_1_0= ruleStatement )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:146:1: (lv_statements_1_0= ruleStatement )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:147:3: lv_statements_1_0= ruleStatement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_in_ruleBlock267);
            	    lv_statements_1_0=ruleStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"statements",
            	              		lv_statements_1_0, 
            	              		"Statement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:163:2: (otherlv_2= ';' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==15) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:163:4: otherlv_2= ';'
            	            {
            	            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleBlock280); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getSemicolonKeyword_1_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:167:5: ( ( (lv_returnValue_3_0= ruleLastStatement ) ) (otherlv_4= ';' )? )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16||LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:167:6: ( (lv_returnValue_3_0= ruleLastStatement ) ) (otherlv_4= ';' )?
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:167:6: ( (lv_returnValue_3_0= ruleLastStatement ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:168:1: (lv_returnValue_3_0= ruleLastStatement )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:168:1: (lv_returnValue_3_0= ruleLastStatement )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:169:3: lv_returnValue_3_0= ruleLastStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBlockAccess().getReturnValueLastStatementParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLastStatement_in_ruleBlock306);
                    lv_returnValue_3_0=ruleLastStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBlockRule());
                      	        }
                             		set(
                             			current, 
                             			"returnValue",
                              		lv_returnValue_3_0, 
                              		"LastStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:185:2: (otherlv_4= ';' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==15) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:185:4: otherlv_4= ';'
                            {
                            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleBlock319); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getBlockAccess().getSemicolonKeyword_2_1());
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleLastStatement"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:200:1: entryRuleLastStatement returns [EObject current=null] : iv_ruleLastStatement= ruleLastStatement EOF ;
    public final EObject entryRuleLastStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLastStatement = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:201:2: (iv_ruleLastStatement= ruleLastStatement EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:202:2: iv_ruleLastStatement= ruleLastStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLastStatementRule()); 
            }
            pushFollow(FOLLOW_ruleLastStatement_in_entryRuleLastStatement363);
            iv_ruleLastStatement=ruleLastStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLastStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLastStatement373); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLastStatement"


    // $ANTLR start "ruleLastStatement"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:209:1: ruleLastStatement returns [EObject current=null] : (this_LastStatement_Return_0= ruleLastStatement_Return | this_LastStatement_Break_1= ruleLastStatement_Break ) ;
    public final EObject ruleLastStatement() throws RecognitionException {
        EObject current = null;

        EObject this_LastStatement_Return_0 = null;

        EObject this_LastStatement_Break_1 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:212:28: ( (this_LastStatement_Return_0= ruleLastStatement_Return | this_LastStatement_Break_1= ruleLastStatement_Break ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:213:1: (this_LastStatement_Return_0= ruleLastStatement_Return | this_LastStatement_Break_1= ruleLastStatement_Break )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:213:1: (this_LastStatement_Return_0= ruleLastStatement_Return | this_LastStatement_Break_1= ruleLastStatement_Break )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:214:2: this_LastStatement_Return_0= ruleLastStatement_Return
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLastStatementAccess().getLastStatement_ReturnParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLastStatement_Return_in_ruleLastStatement423);
                    this_LastStatement_Return_0=ruleLastStatement_Return();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LastStatement_Return_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:227:2: this_LastStatement_Break_1= ruleLastStatement_Break
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLastStatementAccess().getLastStatement_BreakParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLastStatement_Break_in_ruleLastStatement453);
                    this_LastStatement_Break_1=ruleLastStatement_Break();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LastStatement_Break_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLastStatement"


    // $ANTLR start "entryRuleLastStatement_Return"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:246:1: entryRuleLastStatement_Return returns [EObject current=null] : iv_ruleLastStatement_Return= ruleLastStatement_Return EOF ;
    public final EObject entryRuleLastStatement_Return() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLastStatement_Return = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:247:2: (iv_ruleLastStatement_Return= ruleLastStatement_Return EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:248:2: iv_ruleLastStatement_Return= ruleLastStatement_Return EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLastStatement_ReturnRule()); 
            }
            pushFollow(FOLLOW_ruleLastStatement_Return_in_entryRuleLastStatement_Return488);
            iv_ruleLastStatement_Return=ruleLastStatement_Return();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLastStatement_Return; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLastStatement_Return498); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLastStatement_Return"


    // $ANTLR start "ruleLastStatement_Return"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:255:1: ruleLastStatement_Return returns [EObject current=null] : (otherlv_0= 'return' () ( ( (lv_returnValues_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_returnValues_4_0= ruleExpression ) ) )* )? ) ;
    public final EObject ruleLastStatement_Return() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_returnValues_2_0 = null;

        EObject lv_returnValues_4_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:258:28: ( (otherlv_0= 'return' () ( ( (lv_returnValues_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_returnValues_4_0= ruleExpression ) ) )* )? ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:259:1: (otherlv_0= 'return' () ( ( (lv_returnValues_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_returnValues_4_0= ruleExpression ) ) )* )? )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:259:1: (otherlv_0= 'return' () ( ( (lv_returnValues_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_returnValues_4_0= ruleExpression ) ) )* )? )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:259:3: otherlv_0= 'return' () ( ( (lv_returnValues_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_returnValues_4_0= ruleExpression ) ) )* )?
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleLastStatement_Return535); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLastStatement_ReturnAccess().getReturnKeyword_0());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:263:1: ()
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:264:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLastStatement_ReturnAccess().getLastStatement_ReturnWithValueAction_1(),
                          current);
                  
            }

            }

            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:272:2: ( ( (lv_returnValues_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_returnValues_4_0= ruleExpression ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_LUA_NAME && LA7_0<=RULE_LUA_STRING)||LA7_0==31||LA7_0==45||(LA7_0>=49 && LA7_0<=50)||(LA7_0>=52 && LA7_0<=56)||LA7_0==60) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:272:3: ( (lv_returnValues_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_returnValues_4_0= ruleExpression ) ) )*
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:272:3: ( (lv_returnValues_2_0= ruleExpression ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:273:1: (lv_returnValues_2_0= ruleExpression )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:273:1: (lv_returnValues_2_0= ruleExpression )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:274:3: lv_returnValues_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLastStatement_ReturnAccess().getReturnValuesExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleLastStatement_Return569);
                    lv_returnValues_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLastStatement_ReturnRule());
                      	        }
                             		add(
                             			current, 
                             			"returnValues",
                              		lv_returnValues_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:290:2: (otherlv_3= ',' ( (lv_returnValues_4_0= ruleExpression ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==17) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:290:4: otherlv_3= ',' ( (lv_returnValues_4_0= ruleExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleLastStatement_Return582); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getLastStatement_ReturnAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:294:1: ( (lv_returnValues_4_0= ruleExpression ) )
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:295:1: (lv_returnValues_4_0= ruleExpression )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:295:1: (lv_returnValues_4_0= ruleExpression )
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:296:3: lv_returnValues_4_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLastStatement_ReturnAccess().getReturnValuesExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleLastStatement_Return603);
                    	    lv_returnValues_4_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLastStatement_ReturnRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"returnValues",
                    	              		lv_returnValues_4_0, 
                    	              		"Expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLastStatement_Return"


    // $ANTLR start "entryRuleLastStatement_Break"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:320:1: entryRuleLastStatement_Break returns [EObject current=null] : iv_ruleLastStatement_Break= ruleLastStatement_Break EOF ;
    public final EObject entryRuleLastStatement_Break() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLastStatement_Break = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:321:2: (iv_ruleLastStatement_Break= ruleLastStatement_Break EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:322:2: iv_ruleLastStatement_Break= ruleLastStatement_Break EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLastStatement_BreakRule()); 
            }
            pushFollow(FOLLOW_ruleLastStatement_Break_in_entryRuleLastStatement_Break643);
            iv_ruleLastStatement_Break=ruleLastStatement_Break();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLastStatement_Break; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLastStatement_Break653); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLastStatement_Break"


    // $ANTLR start "ruleLastStatement_Break"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:329:1: ruleLastStatement_Break returns [EObject current=null] : (otherlv_0= 'break' () ) ;
    public final EObject ruleLastStatement_Break() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:332:28: ( (otherlv_0= 'break' () ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:333:1: (otherlv_0= 'break' () )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:333:1: (otherlv_0= 'break' () )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:333:3: otherlv_0= 'break' ()
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleLastStatement_Break690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLastStatement_BreakAccess().getBreakKeyword_0());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:337:1: ()
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:338:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLastStatement_BreakAccess().getLastStatement_BreakAction_1(),
                          current);
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLastStatement_Break"


    // $ANTLR start "entryRuleStatement"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:354:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_COMMENT");
        	
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:358:2: (iv_ruleStatement= ruleStatement EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:359:2: iv_ruleStatement= ruleStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement744);
            iv_ruleStatement=ruleStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement754); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:369:1: ruleStatement returns [EObject current=null] : (this_Statement_Block_0= ruleStatement_Block | this_Statement_While_1= ruleStatement_While | this_Statement_Repeat_2= ruleStatement_Repeat | this_Statement_If_Then_Else_3= ruleStatement_If_Then_Else | this_Statement_For_Numeric_4= ruleStatement_For_Numeric | this_Statement_For_Generic_5= ruleStatement_For_Generic | this_Statement_GlobalFunction_Declaration_6= ruleStatement_GlobalFunction_Declaration | this_Statement_LocalFunction_Declaration_7= ruleStatement_LocalFunction_Declaration | this_Statement_Local_Variable_Declaration_8= ruleStatement_Local_Variable_Declaration | this_Statement_FunctioncallOrAssignment_9= ruleStatement_FunctioncallOrAssignment ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Statement_Block_0 = null;

        EObject this_Statement_While_1 = null;

        EObject this_Statement_Repeat_2 = null;

        EObject this_Statement_If_Then_Else_3 = null;

        EObject this_Statement_For_Numeric_4 = null;

        EObject this_Statement_For_Generic_5 = null;

        EObject this_Statement_GlobalFunction_Declaration_6 = null;

        EObject this_Statement_LocalFunction_Declaration_7 = null;

        EObject this_Statement_Local_Variable_Declaration_8 = null;

        EObject this_Statement_FunctioncallOrAssignment_9 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_COMMENT");
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:373:28: ( (this_Statement_Block_0= ruleStatement_Block | this_Statement_While_1= ruleStatement_While | this_Statement_Repeat_2= ruleStatement_Repeat | this_Statement_If_Then_Else_3= ruleStatement_If_Then_Else | this_Statement_For_Numeric_4= ruleStatement_For_Numeric | this_Statement_For_Generic_5= ruleStatement_For_Generic | this_Statement_GlobalFunction_Declaration_6= ruleStatement_GlobalFunction_Declaration | this_Statement_LocalFunction_Declaration_7= ruleStatement_LocalFunction_Declaration | this_Statement_Local_Variable_Declaration_8= ruleStatement_Local_Variable_Declaration | this_Statement_FunctioncallOrAssignment_9= ruleStatement_FunctioncallOrAssignment ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:374:1: (this_Statement_Block_0= ruleStatement_Block | this_Statement_While_1= ruleStatement_While | this_Statement_Repeat_2= ruleStatement_Repeat | this_Statement_If_Then_Else_3= ruleStatement_If_Then_Else | this_Statement_For_Numeric_4= ruleStatement_For_Numeric | this_Statement_For_Generic_5= ruleStatement_For_Generic | this_Statement_GlobalFunction_Declaration_6= ruleStatement_GlobalFunction_Declaration | this_Statement_LocalFunction_Declaration_7= ruleStatement_LocalFunction_Declaration | this_Statement_Local_Variable_Declaration_8= ruleStatement_Local_Variable_Declaration | this_Statement_FunctioncallOrAssignment_9= ruleStatement_FunctioncallOrAssignment )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:374:1: (this_Statement_Block_0= ruleStatement_Block | this_Statement_While_1= ruleStatement_While | this_Statement_Repeat_2= ruleStatement_Repeat | this_Statement_If_Then_Else_3= ruleStatement_If_Then_Else | this_Statement_For_Numeric_4= ruleStatement_For_Numeric | this_Statement_For_Generic_5= ruleStatement_For_Generic | this_Statement_GlobalFunction_Declaration_6= ruleStatement_GlobalFunction_Declaration | this_Statement_LocalFunction_Declaration_7= ruleStatement_LocalFunction_Declaration | this_Statement_Local_Variable_Declaration_8= ruleStatement_Local_Variable_Declaration | this_Statement_FunctioncallOrAssignment_9= ruleStatement_FunctioncallOrAssignment )
            int alt8=10;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:375:2: this_Statement_Block_0= ruleStatement_Block
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatement_BlockParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_Block_in_ruleStatement808);
                    this_Statement_Block_0=ruleStatement_Block();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_Block_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:388:2: this_Statement_While_1= ruleStatement_While
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatement_WhileParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_While_in_ruleStatement838);
                    this_Statement_While_1=ruleStatement_While();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_While_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:401:2: this_Statement_Repeat_2= ruleStatement_Repeat
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatement_RepeatParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_Repeat_in_ruleStatement868);
                    this_Statement_Repeat_2=ruleStatement_Repeat();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_Repeat_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:414:2: this_Statement_If_Then_Else_3= ruleStatement_If_Then_Else
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatement_If_Then_ElseParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_If_Then_Else_in_ruleStatement898);
                    this_Statement_If_Then_Else_3=ruleStatement_If_Then_Else();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_If_Then_Else_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:427:2: this_Statement_For_Numeric_4= ruleStatement_For_Numeric
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatement_For_NumericParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_For_Numeric_in_ruleStatement928);
                    this_Statement_For_Numeric_4=ruleStatement_For_Numeric();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_For_Numeric_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:440:2: this_Statement_For_Generic_5= ruleStatement_For_Generic
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatement_For_GenericParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_For_Generic_in_ruleStatement958);
                    this_Statement_For_Generic_5=ruleStatement_For_Generic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_For_Generic_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:453:2: this_Statement_GlobalFunction_Declaration_6= ruleStatement_GlobalFunction_Declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatement_GlobalFunction_DeclarationParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_GlobalFunction_Declaration_in_ruleStatement988);
                    this_Statement_GlobalFunction_Declaration_6=ruleStatement_GlobalFunction_Declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_GlobalFunction_Declaration_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:466:2: this_Statement_LocalFunction_Declaration_7= ruleStatement_LocalFunction_Declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatement_LocalFunction_DeclarationParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_LocalFunction_Declaration_in_ruleStatement1018);
                    this_Statement_LocalFunction_Declaration_7=ruleStatement_LocalFunction_Declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_LocalFunction_Declaration_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:479:2: this_Statement_Local_Variable_Declaration_8= ruleStatement_Local_Variable_Declaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatement_Local_Variable_DeclarationParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_Local_Variable_Declaration_in_ruleStatement1048);
                    this_Statement_Local_Variable_Declaration_8=ruleStatement_Local_Variable_Declaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_Local_Variable_Declaration_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:492:2: this_Statement_FunctioncallOrAssignment_9= ruleStatement_FunctioncallOrAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStatementAccess().getStatement_FunctioncallOrAssignmentParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStatement_FunctioncallOrAssignment_in_ruleStatement1078);
                    this_Statement_FunctioncallOrAssignment_9=ruleStatement_FunctioncallOrAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Statement_FunctioncallOrAssignment_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleStatement_Block"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:514:1: entryRuleStatement_Block returns [EObject current=null] : iv_ruleStatement_Block= ruleStatement_Block EOF ;
    public final EObject entryRuleStatement_Block() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement_Block = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:515:2: (iv_ruleStatement_Block= ruleStatement_Block EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:516:2: iv_ruleStatement_Block= ruleStatement_Block EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_BlockRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_Block_in_entryRuleStatement_Block1117);
            iv_ruleStatement_Block=ruleStatement_Block();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement_Block; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement_Block1127); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement_Block"


    // $ANTLR start "ruleStatement_Block"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:523:1: ruleStatement_Block returns [EObject current=null] : (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'end' ) ;
    public final EObject ruleStatement_Block() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_block_1_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:526:28: ( (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'end' ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:527:1: (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'end' )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:527:1: (otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'end' )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:527:3: otherlv_0= 'do' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleStatement_Block1164); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatement_BlockAccess().getDoKeyword_0());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:531:1: ( (lv_block_1_0= ruleBlock ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:532:1: (lv_block_1_0= ruleBlock )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:532:1: (lv_block_1_0= ruleBlock )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:533:3: lv_block_1_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatement_BlockAccess().getBlockBlockParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleStatement_Block1185);
            lv_block_1_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatement_BlockRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_1_0, 
                      		"Block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleStatement_Block1197); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStatement_BlockAccess().getEndKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement_Block"


    // $ANTLR start "entryRuleStatement_While"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:561:1: entryRuleStatement_While returns [EObject current=null] : iv_ruleStatement_While= ruleStatement_While EOF ;
    public final EObject entryRuleStatement_While() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement_While = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:562:2: (iv_ruleStatement_While= ruleStatement_While EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:563:2: iv_ruleStatement_While= ruleStatement_While EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_WhileRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_While_in_entryRuleStatement_While1233);
            iv_ruleStatement_While=ruleStatement_While();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement_While; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement_While1243); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement_While"


    // $ANTLR start "ruleStatement_While"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:570:1: ruleStatement_While returns [EObject current=null] : (otherlv_0= 'while' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_block_3_0= ruleBlock ) ) otherlv_4= 'end' ) ;
    public final EObject ruleStatement_While() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_1_0 = null;

        EObject lv_block_3_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:573:28: ( (otherlv_0= 'while' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_block_3_0= ruleBlock ) ) otherlv_4= 'end' ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:574:1: (otherlv_0= 'while' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_block_3_0= ruleBlock ) ) otherlv_4= 'end' )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:574:1: (otherlv_0= 'while' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_block_3_0= ruleBlock ) ) otherlv_4= 'end' )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:574:3: otherlv_0= 'while' ( (lv_expression_1_0= ruleExpression ) ) otherlv_2= 'do' ( (lv_block_3_0= ruleBlock ) ) otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleStatement_While1280); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatement_WhileAccess().getWhileKeyword_0());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:578:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:579:1: (lv_expression_1_0= ruleExpression )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:579:1: (lv_expression_1_0= ruleExpression )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:580:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatement_WhileAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleStatement_While1301);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatement_WhileRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleStatement_While1313); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStatement_WhileAccess().getDoKeyword_2());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:600:1: ( (lv_block_3_0= ruleBlock ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:601:1: (lv_block_3_0= ruleBlock )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:601:1: (lv_block_3_0= ruleBlock )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:602:3: lv_block_3_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatement_WhileAccess().getBlockBlockParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleStatement_While1334);
            lv_block_3_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatement_WhileRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_3_0, 
                      		"Block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleStatement_While1346); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getStatement_WhileAccess().getEndKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement_While"


    // $ANTLR start "entryRuleStatement_Repeat"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:630:1: entryRuleStatement_Repeat returns [EObject current=null] : iv_ruleStatement_Repeat= ruleStatement_Repeat EOF ;
    public final EObject entryRuleStatement_Repeat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement_Repeat = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:631:2: (iv_ruleStatement_Repeat= ruleStatement_Repeat EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:632:2: iv_ruleStatement_Repeat= ruleStatement_Repeat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_RepeatRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_Repeat_in_entryRuleStatement_Repeat1382);
            iv_ruleStatement_Repeat=ruleStatement_Repeat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement_Repeat; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement_Repeat1392); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement_Repeat"


    // $ANTLR start "ruleStatement_Repeat"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:639:1: ruleStatement_Repeat returns [EObject current=null] : (otherlv_0= 'repeat' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleExpression ) ) ) ;
    public final EObject ruleStatement_Repeat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_block_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:642:28: ( (otherlv_0= 'repeat' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleExpression ) ) ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:643:1: (otherlv_0= 'repeat' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleExpression ) ) )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:643:1: (otherlv_0= 'repeat' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleExpression ) ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:643:3: otherlv_0= 'repeat' ( (lv_block_1_0= ruleBlock ) ) otherlv_2= 'until' ( (lv_expression_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleStatement_Repeat1429); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatement_RepeatAccess().getRepeatKeyword_0());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:647:1: ( (lv_block_1_0= ruleBlock ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:648:1: (lv_block_1_0= ruleBlock )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:648:1: (lv_block_1_0= ruleBlock )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:649:3: lv_block_1_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatement_RepeatAccess().getBlockBlockParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleStatement_Repeat1450);
            lv_block_1_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatement_RepeatRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_1_0, 
                      		"Block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleStatement_Repeat1462); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStatement_RepeatAccess().getUntilKeyword_2());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:669:1: ( (lv_expression_3_0= ruleExpression ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:670:1: (lv_expression_3_0= ruleExpression )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:670:1: (lv_expression_3_0= ruleExpression )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:671:3: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatement_RepeatAccess().getExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleStatement_Repeat1483);
            lv_expression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatement_RepeatRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement_Repeat"


    // $ANTLR start "entryRuleStatement_If_Then_Else"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:695:1: entryRuleStatement_If_Then_Else returns [EObject current=null] : iv_ruleStatement_If_Then_Else= ruleStatement_If_Then_Else EOF ;
    public final EObject entryRuleStatement_If_Then_Else() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement_If_Then_Else = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:696:2: (iv_ruleStatement_If_Then_Else= ruleStatement_If_Then_Else EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:697:2: iv_ruleStatement_If_Then_Else= ruleStatement_If_Then_Else EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_If_Then_ElseRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_If_Then_Else_in_entryRuleStatement_If_Then_Else1519);
            iv_ruleStatement_If_Then_Else=ruleStatement_If_Then_Else();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement_If_Then_Else; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement_If_Then_Else1529); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement_If_Then_Else"


    // $ANTLR start "ruleStatement_If_Then_Else"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:704:1: ruleStatement_If_Then_Else returns [EObject current=null] : (otherlv_0= 'if' ( (lv_ifExpression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifBlock_3_0= ruleBlock ) ) ( (lv_elseIf_4_0= ruleStatement_If_Then_Else_ElseIfPart ) )* (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )? otherlv_7= 'end' ) ;
    public final EObject ruleStatement_If_Then_Else() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_ifExpression_1_0 = null;

        EObject lv_ifBlock_3_0 = null;

        EObject lv_elseIf_4_0 = null;

        EObject lv_elseBlock_6_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:707:28: ( (otherlv_0= 'if' ( (lv_ifExpression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifBlock_3_0= ruleBlock ) ) ( (lv_elseIf_4_0= ruleStatement_If_Then_Else_ElseIfPart ) )* (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )? otherlv_7= 'end' ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:708:1: (otherlv_0= 'if' ( (lv_ifExpression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifBlock_3_0= ruleBlock ) ) ( (lv_elseIf_4_0= ruleStatement_If_Then_Else_ElseIfPart ) )* (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )? otherlv_7= 'end' )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:708:1: (otherlv_0= 'if' ( (lv_ifExpression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifBlock_3_0= ruleBlock ) ) ( (lv_elseIf_4_0= ruleStatement_If_Then_Else_ElseIfPart ) )* (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )? otherlv_7= 'end' )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:708:3: otherlv_0= 'if' ( (lv_ifExpression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_ifBlock_3_0= ruleBlock ) ) ( (lv_elseIf_4_0= ruleStatement_If_Then_Else_ElseIfPart ) )* (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )? otherlv_7= 'end'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleStatement_If_Then_Else1566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatement_If_Then_ElseAccess().getIfKeyword_0());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:712:1: ( (lv_ifExpression_1_0= ruleExpression ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:713:1: (lv_ifExpression_1_0= ruleExpression )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:713:1: (lv_ifExpression_1_0= ruleExpression )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:714:3: lv_ifExpression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatement_If_Then_ElseAccess().getIfExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleStatement_If_Then_Else1587);
            lv_ifExpression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatement_If_Then_ElseRule());
              	        }
                     		set(
                     			current, 
                     			"ifExpression",
                      		lv_ifExpression_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleStatement_If_Then_Else1599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStatement_If_Then_ElseAccess().getThenKeyword_2());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:734:1: ( (lv_ifBlock_3_0= ruleBlock ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:735:1: (lv_ifBlock_3_0= ruleBlock )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:735:1: (lv_ifBlock_3_0= ruleBlock )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:736:3: lv_ifBlock_3_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatement_If_Then_ElseAccess().getIfBlockBlockParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleStatement_If_Then_Else1620);
            lv_ifBlock_3_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatement_If_Then_ElseRule());
              	        }
                     		set(
                     			current, 
                     			"ifBlock",
                      		lv_ifBlock_3_0, 
                      		"Block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:752:2: ( (lv_elseIf_4_0= ruleStatement_If_Then_Else_ElseIfPart ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:753:1: (lv_elseIf_4_0= ruleStatement_If_Then_Else_ElseIfPart )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:753:1: (lv_elseIf_4_0= ruleStatement_If_Then_Else_ElseIfPart )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:754:3: lv_elseIf_4_0= ruleStatement_If_Then_Else_ElseIfPart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatement_If_Then_ElseAccess().getElseIfStatement_If_Then_Else_ElseIfPartParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStatement_If_Then_Else_ElseIfPart_in_ruleStatement_If_Then_Else1641);
            	    lv_elseIf_4_0=ruleStatement_If_Then_Else_ElseIfPart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatement_If_Then_ElseRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elseIf",
            	              		lv_elseIf_4_0, 
            	              		"Statement_If_Then_Else_ElseIfPart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:770:3: (otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:770:5: otherlv_5= 'else' ( (lv_elseBlock_6_0= ruleBlock ) )
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleStatement_If_Then_Else1655); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getStatement_If_Then_ElseAccess().getElseKeyword_5_0());
                          
                    }
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:774:1: ( (lv_elseBlock_6_0= ruleBlock ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:775:1: (lv_elseBlock_6_0= ruleBlock )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:775:1: (lv_elseBlock_6_0= ruleBlock )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:776:3: lv_elseBlock_6_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatement_If_Then_ElseAccess().getElseBlockBlockParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleStatement_If_Then_Else1676);
                    lv_elseBlock_6_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatement_If_Then_ElseRule());
                      	        }
                             		set(
                             			current, 
                             			"elseBlock",
                              		lv_elseBlock_6_0, 
                              		"Block");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleStatement_If_Then_Else1690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getStatement_If_Then_ElseAccess().getEndKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement_If_Then_Else"


    // $ANTLR start "entryRuleStatement_If_Then_Else_ElseIfPart"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:804:1: entryRuleStatement_If_Then_Else_ElseIfPart returns [EObject current=null] : iv_ruleStatement_If_Then_Else_ElseIfPart= ruleStatement_If_Then_Else_ElseIfPart EOF ;
    public final EObject entryRuleStatement_If_Then_Else_ElseIfPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement_If_Then_Else_ElseIfPart = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:805:2: (iv_ruleStatement_If_Then_Else_ElseIfPart= ruleStatement_If_Then_Else_ElseIfPart EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:806:2: iv_ruleStatement_If_Then_Else_ElseIfPart= ruleStatement_If_Then_Else_ElseIfPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_If_Then_Else_ElseIfPartRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_If_Then_Else_ElseIfPart_in_entryRuleStatement_If_Then_Else_ElseIfPart1726);
            iv_ruleStatement_If_Then_Else_ElseIfPart=ruleStatement_If_Then_Else_ElseIfPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement_If_Then_Else_ElseIfPart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement_If_Then_Else_ElseIfPart1736); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement_If_Then_Else_ElseIfPart"


    // $ANTLR start "ruleStatement_If_Then_Else_ElseIfPart"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:813:1: ruleStatement_If_Then_Else_ElseIfPart returns [EObject current=null] : (otherlv_0= 'elseif' ( (lv_elseifExpression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_elseifBlock_3_0= ruleBlock ) ) ) ;
    public final EObject ruleStatement_If_Then_Else_ElseIfPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_elseifExpression_1_0 = null;

        EObject lv_elseifBlock_3_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:816:28: ( (otherlv_0= 'elseif' ( (lv_elseifExpression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_elseifBlock_3_0= ruleBlock ) ) ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:817:1: (otherlv_0= 'elseif' ( (lv_elseifExpression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_elseifBlock_3_0= ruleBlock ) ) )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:817:1: (otherlv_0= 'elseif' ( (lv_elseifExpression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_elseifBlock_3_0= ruleBlock ) ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:817:3: otherlv_0= 'elseif' ( (lv_elseifExpression_1_0= ruleExpression ) ) otherlv_2= 'then' ( (lv_elseifBlock_3_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleStatement_If_Then_Else_ElseIfPart1773); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatement_If_Then_Else_ElseIfPartAccess().getElseifKeyword_0());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:821:1: ( (lv_elseifExpression_1_0= ruleExpression ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:822:1: (lv_elseifExpression_1_0= ruleExpression )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:822:1: (lv_elseifExpression_1_0= ruleExpression )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:823:3: lv_elseifExpression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatement_If_Then_Else_ElseIfPartAccess().getElseifExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleStatement_If_Then_Else_ElseIfPart1794);
            lv_elseifExpression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatement_If_Then_Else_ElseIfPartRule());
              	        }
                     		set(
                     			current, 
                     			"elseifExpression",
                      		lv_elseifExpression_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleStatement_If_Then_Else_ElseIfPart1806); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStatement_If_Then_Else_ElseIfPartAccess().getThenKeyword_2());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:843:1: ( (lv_elseifBlock_3_0= ruleBlock ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:844:1: (lv_elseifBlock_3_0= ruleBlock )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:844:1: (lv_elseifBlock_3_0= ruleBlock )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:845:3: lv_elseifBlock_3_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatement_If_Then_Else_ElseIfPartAccess().getElseifBlockBlockParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleStatement_If_Then_Else_ElseIfPart1827);
            lv_elseifBlock_3_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatement_If_Then_Else_ElseIfPartRule());
              	        }
                     		set(
                     			current, 
                     			"elseifBlock",
                      		lv_elseifBlock_3_0, 
                      		"Block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement_If_Then_Else_ElseIfPart"


    // $ANTLR start "entryRuleStatement_For_Numeric"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:869:1: entryRuleStatement_For_Numeric returns [EObject current=null] : iv_ruleStatement_For_Numeric= ruleStatement_For_Numeric EOF ;
    public final EObject entryRuleStatement_For_Numeric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement_For_Numeric = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:870:2: (iv_ruleStatement_For_Numeric= ruleStatement_For_Numeric EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:871:2: iv_ruleStatement_For_Numeric= ruleStatement_For_Numeric EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_For_NumericRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_For_Numeric_in_entryRuleStatement_For_Numeric1863);
            iv_ruleStatement_For_Numeric=ruleStatement_For_Numeric();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement_For_Numeric; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement_For_Numeric1873); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement_For_Numeric"


    // $ANTLR start "ruleStatement_For_Numeric"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:878:1: ruleStatement_For_Numeric returns [EObject current=null] : (otherlv_0= 'for' ( (lv_iteratorName_1_0= RULE_LUA_NAME ) ) otherlv_2= '=' ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= ',' ( (lv_untilExpr_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_stepExpr_7_0= ruleExpression ) ) )? otherlv_8= 'do' ( (lv_block_9_0= ruleBlock ) ) otherlv_10= 'end' ) ;
    public final EObject ruleStatement_For_Numeric() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_iteratorName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_startExpr_3_0 = null;

        EObject lv_untilExpr_5_0 = null;

        EObject lv_stepExpr_7_0 = null;

        EObject lv_block_9_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:881:28: ( (otherlv_0= 'for' ( (lv_iteratorName_1_0= RULE_LUA_NAME ) ) otherlv_2= '=' ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= ',' ( (lv_untilExpr_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_stepExpr_7_0= ruleExpression ) ) )? otherlv_8= 'do' ( (lv_block_9_0= ruleBlock ) ) otherlv_10= 'end' ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:882:1: (otherlv_0= 'for' ( (lv_iteratorName_1_0= RULE_LUA_NAME ) ) otherlv_2= '=' ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= ',' ( (lv_untilExpr_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_stepExpr_7_0= ruleExpression ) ) )? otherlv_8= 'do' ( (lv_block_9_0= ruleBlock ) ) otherlv_10= 'end' )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:882:1: (otherlv_0= 'for' ( (lv_iteratorName_1_0= RULE_LUA_NAME ) ) otherlv_2= '=' ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= ',' ( (lv_untilExpr_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_stepExpr_7_0= ruleExpression ) ) )? otherlv_8= 'do' ( (lv_block_9_0= ruleBlock ) ) otherlv_10= 'end' )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:882:3: otherlv_0= 'for' ( (lv_iteratorName_1_0= RULE_LUA_NAME ) ) otherlv_2= '=' ( (lv_startExpr_3_0= ruleExpression ) ) otherlv_4= ',' ( (lv_untilExpr_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_stepExpr_7_0= ruleExpression ) ) )? otherlv_8= 'do' ( (lv_block_9_0= ruleBlock ) ) otherlv_10= 'end'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleStatement_For_Numeric1910); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatement_For_NumericAccess().getForKeyword_0());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:886:1: ( (lv_iteratorName_1_0= RULE_LUA_NAME ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:887:1: (lv_iteratorName_1_0= RULE_LUA_NAME )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:887:1: (lv_iteratorName_1_0= RULE_LUA_NAME )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:888:3: lv_iteratorName_1_0= RULE_LUA_NAME
            {
            lv_iteratorName_1_0=(Token)match(input,RULE_LUA_NAME,FOLLOW_RULE_LUA_NAME_in_ruleStatement_For_Numeric1927); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_iteratorName_1_0, grammarAccess.getStatement_For_NumericAccess().getIteratorNameLUA_NAMETerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStatement_For_NumericRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"iteratorName",
                      		lv_iteratorName_1_0, 
                      		"LUA_NAME");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleStatement_For_Numeric1944); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStatement_For_NumericAccess().getEqualsSignKeyword_2());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:908:1: ( (lv_startExpr_3_0= ruleExpression ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:909:1: (lv_startExpr_3_0= ruleExpression )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:909:1: (lv_startExpr_3_0= ruleExpression )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:910:3: lv_startExpr_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatement_For_NumericAccess().getStartExprExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleStatement_For_Numeric1965);
            lv_startExpr_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatement_For_NumericRule());
              	        }
                     		set(
                     			current, 
                     			"startExpr",
                      		lv_startExpr_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleStatement_For_Numeric1977); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getStatement_For_NumericAccess().getCommaKeyword_4());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:930:1: ( (lv_untilExpr_5_0= ruleExpression ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:931:1: (lv_untilExpr_5_0= ruleExpression )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:931:1: (lv_untilExpr_5_0= ruleExpression )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:932:3: lv_untilExpr_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatement_For_NumericAccess().getUntilExprExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleStatement_For_Numeric1998);
            lv_untilExpr_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatement_For_NumericRule());
              	        }
                     		set(
                     			current, 
                     			"untilExpr",
                      		lv_untilExpr_5_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:948:2: (otherlv_6= ',' ( (lv_stepExpr_7_0= ruleExpression ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:948:4: otherlv_6= ',' ( (lv_stepExpr_7_0= ruleExpression ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleStatement_For_Numeric2011); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getStatement_For_NumericAccess().getCommaKeyword_6_0());
                          
                    }
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:952:1: ( (lv_stepExpr_7_0= ruleExpression ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:953:1: (lv_stepExpr_7_0= ruleExpression )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:953:1: (lv_stepExpr_7_0= ruleExpression )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:954:3: lv_stepExpr_7_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatement_For_NumericAccess().getStepExprExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleStatement_For_Numeric2032);
                    lv_stepExpr_7_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatement_For_NumericRule());
                      	        }
                             		set(
                             			current, 
                             			"stepExpr",
                              		lv_stepExpr_7_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleStatement_For_Numeric2046); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getStatement_For_NumericAccess().getDoKeyword_7());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:974:1: ( (lv_block_9_0= ruleBlock ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:975:1: (lv_block_9_0= ruleBlock )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:975:1: (lv_block_9_0= ruleBlock )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:976:3: lv_block_9_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatement_For_NumericAccess().getBlockBlockParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleStatement_For_Numeric2067);
            lv_block_9_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatement_For_NumericRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_9_0, 
                      		"Block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleStatement_For_Numeric2079); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getStatement_For_NumericAccess().getEndKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement_For_Numeric"


    // $ANTLR start "entryRuleStatement_For_Generic"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1004:1: entryRuleStatement_For_Generic returns [EObject current=null] : iv_ruleStatement_For_Generic= ruleStatement_For_Generic EOF ;
    public final EObject entryRuleStatement_For_Generic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement_For_Generic = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1005:2: (iv_ruleStatement_For_Generic= ruleStatement_For_Generic EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1006:2: iv_ruleStatement_For_Generic= ruleStatement_For_Generic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_For_GenericRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_For_Generic_in_entryRuleStatement_For_Generic2115);
            iv_ruleStatement_For_Generic=ruleStatement_For_Generic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement_For_Generic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement_For_Generic2125); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement_For_Generic"


    // $ANTLR start "ruleStatement_For_Generic"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1013:1: ruleStatement_For_Generic returns [EObject current=null] : (otherlv_0= 'for' ( (lv_names_1_0= RULE_LUA_NAME ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_LUA_NAME ) ) )* otherlv_4= 'in' ( (lv_expressions_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_expressions_7_0= ruleExpression ) ) )* otherlv_8= 'do' ( (lv_block_9_0= ruleBlock ) ) otherlv_10= 'end' ) ;
    public final EObject ruleStatement_For_Generic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_names_1_0=null;
        Token otherlv_2=null;
        Token lv_names_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_expressions_5_0 = null;

        EObject lv_expressions_7_0 = null;

        EObject lv_block_9_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1016:28: ( (otherlv_0= 'for' ( (lv_names_1_0= RULE_LUA_NAME ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_LUA_NAME ) ) )* otherlv_4= 'in' ( (lv_expressions_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_expressions_7_0= ruleExpression ) ) )* otherlv_8= 'do' ( (lv_block_9_0= ruleBlock ) ) otherlv_10= 'end' ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1017:1: (otherlv_0= 'for' ( (lv_names_1_0= RULE_LUA_NAME ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_LUA_NAME ) ) )* otherlv_4= 'in' ( (lv_expressions_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_expressions_7_0= ruleExpression ) ) )* otherlv_8= 'do' ( (lv_block_9_0= ruleBlock ) ) otherlv_10= 'end' )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1017:1: (otherlv_0= 'for' ( (lv_names_1_0= RULE_LUA_NAME ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_LUA_NAME ) ) )* otherlv_4= 'in' ( (lv_expressions_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_expressions_7_0= ruleExpression ) ) )* otherlv_8= 'do' ( (lv_block_9_0= ruleBlock ) ) otherlv_10= 'end' )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1017:3: otherlv_0= 'for' ( (lv_names_1_0= RULE_LUA_NAME ) ) (otherlv_2= ',' ( (lv_names_3_0= RULE_LUA_NAME ) ) )* otherlv_4= 'in' ( (lv_expressions_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_expressions_7_0= ruleExpression ) ) )* otherlv_8= 'do' ( (lv_block_9_0= ruleBlock ) ) otherlv_10= 'end'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleStatement_For_Generic2162); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatement_For_GenericAccess().getForKeyword_0());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1021:1: ( (lv_names_1_0= RULE_LUA_NAME ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1022:1: (lv_names_1_0= RULE_LUA_NAME )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1022:1: (lv_names_1_0= RULE_LUA_NAME )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1023:3: lv_names_1_0= RULE_LUA_NAME
            {
            lv_names_1_0=(Token)match(input,RULE_LUA_NAME,FOLLOW_RULE_LUA_NAME_in_ruleStatement_For_Generic2179); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_names_1_0, grammarAccess.getStatement_For_GenericAccess().getNamesLUA_NAMETerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStatement_For_GenericRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"names",
                      		lv_names_1_0, 
                      		"LUA_NAME");
              	    
            }

            }


            }

            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1039:2: (otherlv_2= ',' ( (lv_names_3_0= RULE_LUA_NAME ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1039:4: otherlv_2= ',' ( (lv_names_3_0= RULE_LUA_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleStatement_For_Generic2197); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getStatement_For_GenericAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1043:1: ( (lv_names_3_0= RULE_LUA_NAME ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1044:1: (lv_names_3_0= RULE_LUA_NAME )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1044:1: (lv_names_3_0= RULE_LUA_NAME )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1045:3: lv_names_3_0= RULE_LUA_NAME
            	    {
            	    lv_names_3_0=(Token)match(input,RULE_LUA_NAME,FOLLOW_RULE_LUA_NAME_in_ruleStatement_For_Generic2214); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_names_3_0, grammarAccess.getStatement_For_GenericAccess().getNamesLUA_NAMETerminalRuleCall_2_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getStatement_For_GenericRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"names",
            	              		lv_names_3_0, 
            	              		"LUA_NAME");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleStatement_For_Generic2233); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getStatement_For_GenericAccess().getInKeyword_3());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1065:1: ( (lv_expressions_5_0= ruleExpression ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1066:1: (lv_expressions_5_0= ruleExpression )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1066:1: (lv_expressions_5_0= ruleExpression )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1067:3: lv_expressions_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatement_For_GenericAccess().getExpressionsExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleStatement_For_Generic2254);
            lv_expressions_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatement_For_GenericRule());
              	        }
                     		add(
                     			current, 
                     			"expressions",
                      		lv_expressions_5_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1083:2: (otherlv_6= ',' ( (lv_expressions_7_0= ruleExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1083:4: otherlv_6= ',' ( (lv_expressions_7_0= ruleExpression ) )
            	    {
            	    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleStatement_For_Generic2267); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getStatement_For_GenericAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1087:1: ( (lv_expressions_7_0= ruleExpression ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1088:1: (lv_expressions_7_0= ruleExpression )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1088:1: (lv_expressions_7_0= ruleExpression )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1089:3: lv_expressions_7_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStatement_For_GenericAccess().getExpressionsExpressionParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleStatement_For_Generic2288);
            	    lv_expressions_7_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStatement_For_GenericRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_7_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleStatement_For_Generic2302); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getStatement_For_GenericAccess().getDoKeyword_6());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1109:1: ( (lv_block_9_0= ruleBlock ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1110:1: (lv_block_9_0= ruleBlock )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1110:1: (lv_block_9_0= ruleBlock )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1111:3: lv_block_9_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatement_For_GenericAccess().getBlockBlockParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleStatement_For_Generic2323);
            lv_block_9_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatement_For_GenericRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_9_0, 
                      		"Block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleStatement_For_Generic2335); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getStatement_For_GenericAccess().getEndKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement_For_Generic"


    // $ANTLR start "entryRuleStatement_GlobalFunction_Declaration"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1139:1: entryRuleStatement_GlobalFunction_Declaration returns [EObject current=null] : iv_ruleStatement_GlobalFunction_Declaration= ruleStatement_GlobalFunction_Declaration EOF ;
    public final EObject entryRuleStatement_GlobalFunction_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement_GlobalFunction_Declaration = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1140:2: (iv_ruleStatement_GlobalFunction_Declaration= ruleStatement_GlobalFunction_Declaration EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1141:2: iv_ruleStatement_GlobalFunction_Declaration= ruleStatement_GlobalFunction_Declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_GlobalFunction_DeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_GlobalFunction_Declaration_in_entryRuleStatement_GlobalFunction_Declaration2371);
            iv_ruleStatement_GlobalFunction_Declaration=ruleStatement_GlobalFunction_Declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement_GlobalFunction_Declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement_GlobalFunction_Declaration2381); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement_GlobalFunction_Declaration"


    // $ANTLR start "ruleStatement_GlobalFunction_Declaration"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1148:1: ruleStatement_GlobalFunction_Declaration returns [EObject current=null] : (otherlv_0= 'function' ( (lv_prefix_1_0= RULE_LUA_NAME ) ) (otherlv_2= '.' ( (lv_prefix_3_0= RULE_LUA_NAME ) ) )* (otherlv_4= ':' ( (lv_functionName_5_0= RULE_LUA_NAME ) ) )? ( (lv_function_6_0= ruleFunction ) ) otherlv_7= 'end' ) ;
    public final EObject ruleStatement_GlobalFunction_Declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_prefix_1_0=null;
        Token otherlv_2=null;
        Token lv_prefix_3_0=null;
        Token otherlv_4=null;
        Token lv_functionName_5_0=null;
        Token otherlv_7=null;
        EObject lv_function_6_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1151:28: ( (otherlv_0= 'function' ( (lv_prefix_1_0= RULE_LUA_NAME ) ) (otherlv_2= '.' ( (lv_prefix_3_0= RULE_LUA_NAME ) ) )* (otherlv_4= ':' ( (lv_functionName_5_0= RULE_LUA_NAME ) ) )? ( (lv_function_6_0= ruleFunction ) ) otherlv_7= 'end' ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1152:1: (otherlv_0= 'function' ( (lv_prefix_1_0= RULE_LUA_NAME ) ) (otherlv_2= '.' ( (lv_prefix_3_0= RULE_LUA_NAME ) ) )* (otherlv_4= ':' ( (lv_functionName_5_0= RULE_LUA_NAME ) ) )? ( (lv_function_6_0= ruleFunction ) ) otherlv_7= 'end' )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1152:1: (otherlv_0= 'function' ( (lv_prefix_1_0= RULE_LUA_NAME ) ) (otherlv_2= '.' ( (lv_prefix_3_0= RULE_LUA_NAME ) ) )* (otherlv_4= ':' ( (lv_functionName_5_0= RULE_LUA_NAME ) ) )? ( (lv_function_6_0= ruleFunction ) ) otherlv_7= 'end' )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1152:3: otherlv_0= 'function' ( (lv_prefix_1_0= RULE_LUA_NAME ) ) (otherlv_2= '.' ( (lv_prefix_3_0= RULE_LUA_NAME ) ) )* (otherlv_4= ':' ( (lv_functionName_5_0= RULE_LUA_NAME ) ) )? ( (lv_function_6_0= ruleFunction ) ) otherlv_7= 'end'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleStatement_GlobalFunction_Declaration2418); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatement_GlobalFunction_DeclarationAccess().getFunctionKeyword_0());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1156:1: ( (lv_prefix_1_0= RULE_LUA_NAME ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1157:1: (lv_prefix_1_0= RULE_LUA_NAME )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1157:1: (lv_prefix_1_0= RULE_LUA_NAME )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1158:3: lv_prefix_1_0= RULE_LUA_NAME
            {
            lv_prefix_1_0=(Token)match(input,RULE_LUA_NAME,FOLLOW_RULE_LUA_NAME_in_ruleStatement_GlobalFunction_Declaration2435); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_prefix_1_0, grammarAccess.getStatement_GlobalFunction_DeclarationAccess().getPrefixLUA_NAMETerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStatement_GlobalFunction_DeclarationRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"prefix",
                      		lv_prefix_1_0, 
                      		"LUA_NAME");
              	    
            }

            }


            }

            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1174:2: (otherlv_2= '.' ( (lv_prefix_3_0= RULE_LUA_NAME ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1174:4: otherlv_2= '.' ( (lv_prefix_3_0= RULE_LUA_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleStatement_GlobalFunction_Declaration2453); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getStatement_GlobalFunction_DeclarationAccess().getFullStopKeyword_2_0());
            	          
            	    }
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1178:1: ( (lv_prefix_3_0= RULE_LUA_NAME ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1179:1: (lv_prefix_3_0= RULE_LUA_NAME )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1179:1: (lv_prefix_3_0= RULE_LUA_NAME )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1180:3: lv_prefix_3_0= RULE_LUA_NAME
            	    {
            	    lv_prefix_3_0=(Token)match(input,RULE_LUA_NAME,FOLLOW_RULE_LUA_NAME_in_ruleStatement_GlobalFunction_Declaration2470); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_prefix_3_0, grammarAccess.getStatement_GlobalFunction_DeclarationAccess().getPrefixLUA_NAMETerminalRuleCall_2_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getStatement_GlobalFunction_DeclarationRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"prefix",
            	              		lv_prefix_3_0, 
            	              		"LUA_NAME");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1196:4: (otherlv_4= ':' ( (lv_functionName_5_0= RULE_LUA_NAME ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1196:6: otherlv_4= ':' ( (lv_functionName_5_0= RULE_LUA_NAME ) )
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleStatement_GlobalFunction_Declaration2490); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getStatement_GlobalFunction_DeclarationAccess().getColonKeyword_3_0());
                          
                    }
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1200:1: ( (lv_functionName_5_0= RULE_LUA_NAME ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1201:1: (lv_functionName_5_0= RULE_LUA_NAME )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1201:1: (lv_functionName_5_0= RULE_LUA_NAME )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1202:3: lv_functionName_5_0= RULE_LUA_NAME
                    {
                    lv_functionName_5_0=(Token)match(input,RULE_LUA_NAME,FOLLOW_RULE_LUA_NAME_in_ruleStatement_GlobalFunction_Declaration2507); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_functionName_5_0, grammarAccess.getStatement_GlobalFunction_DeclarationAccess().getFunctionNameLUA_NAMETerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStatement_GlobalFunction_DeclarationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"functionName",
                              		lv_functionName_5_0, 
                              		"LUA_NAME");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1218:4: ( (lv_function_6_0= ruleFunction ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1219:1: (lv_function_6_0= ruleFunction )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1219:1: (lv_function_6_0= ruleFunction )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1220:3: lv_function_6_0= ruleFunction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatement_GlobalFunction_DeclarationAccess().getFunctionFunctionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFunction_in_ruleStatement_GlobalFunction_Declaration2535);
            lv_function_6_0=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatement_GlobalFunction_DeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"function",
                      		lv_function_6_0, 
                      		"Function");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleStatement_GlobalFunction_Declaration2547); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getStatement_GlobalFunction_DeclarationAccess().getEndKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement_GlobalFunction_Declaration"


    // $ANTLR start "entryRuleStatement_LocalFunction_Declaration"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1248:1: entryRuleStatement_LocalFunction_Declaration returns [EObject current=null] : iv_ruleStatement_LocalFunction_Declaration= ruleStatement_LocalFunction_Declaration EOF ;
    public final EObject entryRuleStatement_LocalFunction_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement_LocalFunction_Declaration = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1249:2: (iv_ruleStatement_LocalFunction_Declaration= ruleStatement_LocalFunction_Declaration EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1250:2: iv_ruleStatement_LocalFunction_Declaration= ruleStatement_LocalFunction_Declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_LocalFunction_DeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_LocalFunction_Declaration_in_entryRuleStatement_LocalFunction_Declaration2583);
            iv_ruleStatement_LocalFunction_Declaration=ruleStatement_LocalFunction_Declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement_LocalFunction_Declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement_LocalFunction_Declaration2593); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement_LocalFunction_Declaration"


    // $ANTLR start "ruleStatement_LocalFunction_Declaration"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1257:1: ruleStatement_LocalFunction_Declaration returns [EObject current=null] : (otherlv_0= 'local' otherlv_1= 'function' ( (lv_functionName_2_0= RULE_LUA_NAME ) ) ( (lv_function_3_0= ruleFunction ) ) otherlv_4= 'end' ) ;
    public final EObject ruleStatement_LocalFunction_Declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_functionName_2_0=null;
        Token otherlv_4=null;
        EObject lv_function_3_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1260:28: ( (otherlv_0= 'local' otherlv_1= 'function' ( (lv_functionName_2_0= RULE_LUA_NAME ) ) ( (lv_function_3_0= ruleFunction ) ) otherlv_4= 'end' ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1261:1: (otherlv_0= 'local' otherlv_1= 'function' ( (lv_functionName_2_0= RULE_LUA_NAME ) ) ( (lv_function_3_0= ruleFunction ) ) otherlv_4= 'end' )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1261:1: (otherlv_0= 'local' otherlv_1= 'function' ( (lv_functionName_2_0= RULE_LUA_NAME ) ) ( (lv_function_3_0= ruleFunction ) ) otherlv_4= 'end' )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1261:3: otherlv_0= 'local' otherlv_1= 'function' ( (lv_functionName_2_0= RULE_LUA_NAME ) ) ( (lv_function_3_0= ruleFunction ) ) otherlv_4= 'end'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleStatement_LocalFunction_Declaration2630); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatement_LocalFunction_DeclarationAccess().getLocalKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleStatement_LocalFunction_Declaration2642); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStatement_LocalFunction_DeclarationAccess().getFunctionKeyword_1());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1269:1: ( (lv_functionName_2_0= RULE_LUA_NAME ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1270:1: (lv_functionName_2_0= RULE_LUA_NAME )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1270:1: (lv_functionName_2_0= RULE_LUA_NAME )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1271:3: lv_functionName_2_0= RULE_LUA_NAME
            {
            lv_functionName_2_0=(Token)match(input,RULE_LUA_NAME,FOLLOW_RULE_LUA_NAME_in_ruleStatement_LocalFunction_Declaration2659); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_functionName_2_0, grammarAccess.getStatement_LocalFunction_DeclarationAccess().getFunctionNameLUA_NAMETerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStatement_LocalFunction_DeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"functionName",
                      		lv_functionName_2_0, 
                      		"LUA_NAME");
              	    
            }

            }


            }

            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1287:2: ( (lv_function_3_0= ruleFunction ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1288:1: (lv_function_3_0= ruleFunction )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1288:1: (lv_function_3_0= ruleFunction )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1289:3: lv_function_3_0= ruleFunction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStatement_LocalFunction_DeclarationAccess().getFunctionFunctionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFunction_in_ruleStatement_LocalFunction_Declaration2685);
            lv_function_3_0=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStatement_LocalFunction_DeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"function",
                      		lv_function_3_0, 
                      		"Function");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleStatement_LocalFunction_Declaration2697); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getStatement_LocalFunction_DeclarationAccess().getEndKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement_LocalFunction_Declaration"


    // $ANTLR start "entryRuleStatement_Local_Variable_Declaration"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1317:1: entryRuleStatement_Local_Variable_Declaration returns [EObject current=null] : iv_ruleStatement_Local_Variable_Declaration= ruleStatement_Local_Variable_Declaration EOF ;
    public final EObject entryRuleStatement_Local_Variable_Declaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement_Local_Variable_Declaration = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1318:2: (iv_ruleStatement_Local_Variable_Declaration= ruleStatement_Local_Variable_Declaration EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1319:2: iv_ruleStatement_Local_Variable_Declaration= ruleStatement_Local_Variable_Declaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_Local_Variable_DeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_Local_Variable_Declaration_in_entryRuleStatement_Local_Variable_Declaration2733);
            iv_ruleStatement_Local_Variable_Declaration=ruleStatement_Local_Variable_Declaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement_Local_Variable_Declaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement_Local_Variable_Declaration2743); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement_Local_Variable_Declaration"


    // $ANTLR start "ruleStatement_Local_Variable_Declaration"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1326:1: ruleStatement_Local_Variable_Declaration returns [EObject current=null] : (otherlv_0= 'local' ( (lv_variableNames_1_0= RULE_LUA_NAME ) ) (otherlv_2= ',' ( (lv_variableNames_3_0= RULE_LUA_NAME ) ) )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_initialValue_7_0= ruleExpression ) ) )* )? ) ;
    public final EObject ruleStatement_Local_Variable_Declaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_variableNames_1_0=null;
        Token otherlv_2=null;
        Token lv_variableNames_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_initialValue_5_0 = null;

        EObject lv_initialValue_7_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1329:28: ( (otherlv_0= 'local' ( (lv_variableNames_1_0= RULE_LUA_NAME ) ) (otherlv_2= ',' ( (lv_variableNames_3_0= RULE_LUA_NAME ) ) )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_initialValue_7_0= ruleExpression ) ) )* )? ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1330:1: (otherlv_0= 'local' ( (lv_variableNames_1_0= RULE_LUA_NAME ) ) (otherlv_2= ',' ( (lv_variableNames_3_0= RULE_LUA_NAME ) ) )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_initialValue_7_0= ruleExpression ) ) )* )? )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1330:1: (otherlv_0= 'local' ( (lv_variableNames_1_0= RULE_LUA_NAME ) ) (otherlv_2= ',' ( (lv_variableNames_3_0= RULE_LUA_NAME ) ) )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_initialValue_7_0= ruleExpression ) ) )* )? )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1330:3: otherlv_0= 'local' ( (lv_variableNames_1_0= RULE_LUA_NAME ) ) (otherlv_2= ',' ( (lv_variableNames_3_0= RULE_LUA_NAME ) ) )* (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_initialValue_7_0= ruleExpression ) ) )* )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleStatement_Local_Variable_Declaration2780); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStatement_Local_Variable_DeclarationAccess().getLocalKeyword_0());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1334:1: ( (lv_variableNames_1_0= RULE_LUA_NAME ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1335:1: (lv_variableNames_1_0= RULE_LUA_NAME )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1335:1: (lv_variableNames_1_0= RULE_LUA_NAME )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1336:3: lv_variableNames_1_0= RULE_LUA_NAME
            {
            lv_variableNames_1_0=(Token)match(input,RULE_LUA_NAME,FOLLOW_RULE_LUA_NAME_in_ruleStatement_Local_Variable_Declaration2797); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_variableNames_1_0, grammarAccess.getStatement_Local_Variable_DeclarationAccess().getVariableNamesLUA_NAMETerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStatement_Local_Variable_DeclarationRule());
              	        }
                     		addWithLastConsumed(
                     			current, 
                     			"variableNames",
                      		lv_variableNames_1_0, 
                      		"LUA_NAME");
              	    
            }

            }


            }

            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1352:2: (otherlv_2= ',' ( (lv_variableNames_3_0= RULE_LUA_NAME ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1352:4: otherlv_2= ',' ( (lv_variableNames_3_0= RULE_LUA_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleStatement_Local_Variable_Declaration2815); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getStatement_Local_Variable_DeclarationAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1356:1: ( (lv_variableNames_3_0= RULE_LUA_NAME ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1357:1: (lv_variableNames_3_0= RULE_LUA_NAME )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1357:1: (lv_variableNames_3_0= RULE_LUA_NAME )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1358:3: lv_variableNames_3_0= RULE_LUA_NAME
            	    {
            	    lv_variableNames_3_0=(Token)match(input,RULE_LUA_NAME,FOLLOW_RULE_LUA_NAME_in_ruleStatement_Local_Variable_Declaration2832); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_variableNames_3_0, grammarAccess.getStatement_Local_Variable_DeclarationAccess().getVariableNamesLUA_NAMETerminalRuleCall_2_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getStatement_Local_Variable_DeclarationRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"variableNames",
            	              		lv_variableNames_3_0, 
            	              		"LUA_NAME");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1374:4: (otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_initialValue_7_0= ruleExpression ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1374:6: otherlv_4= '=' ( (lv_initialValue_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_initialValue_7_0= ruleExpression ) ) )*
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleStatement_Local_Variable_Declaration2852); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getStatement_Local_Variable_DeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1378:1: ( (lv_initialValue_5_0= ruleExpression ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1379:1: (lv_initialValue_5_0= ruleExpression )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1379:1: (lv_initialValue_5_0= ruleExpression )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1380:3: lv_initialValue_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatement_Local_Variable_DeclarationAccess().getInitialValueExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleStatement_Local_Variable_Declaration2873);
                    lv_initialValue_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatement_Local_Variable_DeclarationRule());
                      	        }
                             		add(
                             			current, 
                             			"initialValue",
                              		lv_initialValue_5_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1396:2: (otherlv_6= ',' ( (lv_initialValue_7_0= ruleExpression ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==17) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1396:4: otherlv_6= ',' ( (lv_initialValue_7_0= ruleExpression ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleStatement_Local_Variable_Declaration2886); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getStatement_Local_Variable_DeclarationAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1400:1: ( (lv_initialValue_7_0= ruleExpression ) )
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1401:1: (lv_initialValue_7_0= ruleExpression )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1401:1: (lv_initialValue_7_0= ruleExpression )
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1402:3: lv_initialValue_7_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStatement_Local_Variable_DeclarationAccess().getInitialValueExpressionParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleStatement_Local_Variable_Declaration2907);
                    	    lv_initialValue_7_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getStatement_Local_Variable_DeclarationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"initialValue",
                    	              		lv_initialValue_7_0, 
                    	              		"Expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement_Local_Variable_Declaration"


    // $ANTLR start "entryRuleStatement_FunctioncallOrAssignment"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1426:1: entryRuleStatement_FunctioncallOrAssignment returns [EObject current=null] : iv_ruleStatement_FunctioncallOrAssignment= ruleStatement_FunctioncallOrAssignment EOF ;
    public final EObject entryRuleStatement_FunctioncallOrAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement_FunctioncallOrAssignment = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1427:2: (iv_ruleStatement_FunctioncallOrAssignment= ruleStatement_FunctioncallOrAssignment EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1428:2: iv_ruleStatement_FunctioncallOrAssignment= ruleStatement_FunctioncallOrAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatement_FunctioncallOrAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleStatement_FunctioncallOrAssignment_in_entryRuleStatement_FunctioncallOrAssignment2947);
            iv_ruleStatement_FunctioncallOrAssignment=ruleStatement_FunctioncallOrAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatement_FunctioncallOrAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement_FunctioncallOrAssignment2957); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStatement_FunctioncallOrAssignment"


    // $ANTLR start "ruleStatement_FunctioncallOrAssignment"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1435:1: ruleStatement_FunctioncallOrAssignment returns [EObject current=null] : (this_Expression_AccessMemberOrArrayElement_0= ruleExpression_AccessMemberOrArrayElement ( ( () (otherlv_2= ',' ( (lv_variable_3_0= ruleExpression_AccessMemberOrArrayElement ) ) )* otherlv_4= '=' ( (lv_values_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleExpression ) ) )* ) | (otherlv_8= ':' () ( (lv_memberFunctionName_10_0= RULE_LUA_NAME ) ) ( (lv_arguments_11_0= ruleFunctioncall_Arguments ) ) ) | ( () ( (lv_arguments_13_0= ruleFunctioncall_Arguments ) ) ) ) ) ;
    public final EObject ruleStatement_FunctioncallOrAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_memberFunctionName_10_0=null;
        EObject this_Expression_AccessMemberOrArrayElement_0 = null;

        EObject lv_variable_3_0 = null;

        EObject lv_values_5_0 = null;

        EObject lv_values_7_0 = null;

        EObject lv_arguments_11_0 = null;

        EObject lv_arguments_13_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1438:28: ( (this_Expression_AccessMemberOrArrayElement_0= ruleExpression_AccessMemberOrArrayElement ( ( () (otherlv_2= ',' ( (lv_variable_3_0= ruleExpression_AccessMemberOrArrayElement ) ) )* otherlv_4= '=' ( (lv_values_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleExpression ) ) )* ) | (otherlv_8= ':' () ( (lv_memberFunctionName_10_0= RULE_LUA_NAME ) ) ( (lv_arguments_11_0= ruleFunctioncall_Arguments ) ) ) | ( () ( (lv_arguments_13_0= ruleFunctioncall_Arguments ) ) ) ) ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1439:1: (this_Expression_AccessMemberOrArrayElement_0= ruleExpression_AccessMemberOrArrayElement ( ( () (otherlv_2= ',' ( (lv_variable_3_0= ruleExpression_AccessMemberOrArrayElement ) ) )* otherlv_4= '=' ( (lv_values_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleExpression ) ) )* ) | (otherlv_8= ':' () ( (lv_memberFunctionName_10_0= RULE_LUA_NAME ) ) ( (lv_arguments_11_0= ruleFunctioncall_Arguments ) ) ) | ( () ( (lv_arguments_13_0= ruleFunctioncall_Arguments ) ) ) ) )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1439:1: (this_Expression_AccessMemberOrArrayElement_0= ruleExpression_AccessMemberOrArrayElement ( ( () (otherlv_2= ',' ( (lv_variable_3_0= ruleExpression_AccessMemberOrArrayElement ) ) )* otherlv_4= '=' ( (lv_values_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleExpression ) ) )* ) | (otherlv_8= ':' () ( (lv_memberFunctionName_10_0= RULE_LUA_NAME ) ) ( (lv_arguments_11_0= ruleFunctioncall_Arguments ) ) ) | ( () ( (lv_arguments_13_0= ruleFunctioncall_Arguments ) ) ) ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1440:2: this_Expression_AccessMemberOrArrayElement_0= ruleExpression_AccessMemberOrArrayElement ( ( () (otherlv_2= ',' ( (lv_variable_3_0= ruleExpression_AccessMemberOrArrayElement ) ) )* otherlv_4= '=' ( (lv_values_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleExpression ) ) )* ) | (otherlv_8= ':' () ( (lv_memberFunctionName_10_0= RULE_LUA_NAME ) ) ( (lv_arguments_11_0= ruleFunctioncall_Arguments ) ) ) | ( () ( (lv_arguments_13_0= ruleFunctioncall_Arguments ) ) ) )
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getExpression_AccessMemberOrArrayElementParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_AccessMemberOrArrayElement_in_ruleStatement_FunctioncallOrAssignment3007);
            this_Expression_AccessMemberOrArrayElement_0=ruleExpression_AccessMemberOrArrayElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_AccessMemberOrArrayElement_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1451:1: ( ( () (otherlv_2= ',' ( (lv_variable_3_0= ruleExpression_AccessMemberOrArrayElement ) ) )* otherlv_4= '=' ( (lv_values_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleExpression ) ) )* ) | (otherlv_8= ':' () ( (lv_memberFunctionName_10_0= RULE_LUA_NAME ) ) ( (lv_arguments_11_0= ruleFunctioncall_Arguments ) ) ) | ( () ( (lv_arguments_13_0= ruleFunctioncall_Arguments ) ) ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 17:
            case 29:
                {
                alt21=1;
                }
                break;
            case 33:
                {
                alt21=2;
                }
                break;
            case RULE_LUA_STRING:
            case 56:
            case 60:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1451:2: ( () (otherlv_2= ',' ( (lv_variable_3_0= ruleExpression_AccessMemberOrArrayElement ) ) )* otherlv_4= '=' ( (lv_values_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleExpression ) ) )* )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1451:2: ( () (otherlv_2= ',' ( (lv_variable_3_0= ruleExpression_AccessMemberOrArrayElement ) ) )* otherlv_4= '=' ( (lv_values_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleExpression ) ) )* )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1451:3: () (otherlv_2= ',' ( (lv_variable_3_0= ruleExpression_AccessMemberOrArrayElement ) ) )* otherlv_4= '=' ( (lv_values_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_values_7_0= ruleExpression ) ) )*
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1451:3: ()
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1452:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_AssignmentVariableAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1460:2: (otherlv_2= ',' ( (lv_variable_3_0= ruleExpression_AccessMemberOrArrayElement ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==17) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1460:4: otherlv_2= ',' ( (lv_variable_3_0= ruleExpression_AccessMemberOrArrayElement ) )
                    	    {
                    	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleStatement_FunctioncallOrAssignment3033); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getCommaKeyword_1_0_1_0());
                    	          
                    	    }
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1464:1: ( (lv_variable_3_0= ruleExpression_AccessMemberOrArrayElement ) )
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1465:1: (lv_variable_3_0= ruleExpression_AccessMemberOrArrayElement )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1465:1: (lv_variable_3_0= ruleExpression_AccessMemberOrArrayElement )
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1466:3: lv_variable_3_0= ruleExpression_AccessMemberOrArrayElement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getVariableExpression_AccessMemberOrArrayElementParserRuleCall_1_0_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_AccessMemberOrArrayElement_in_ruleStatement_FunctioncallOrAssignment3054);
                    	    lv_variable_3_0=ruleExpression_AccessMemberOrArrayElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getStatement_FunctioncallOrAssignmentRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"variable",
                    	              		lv_variable_3_0, 
                    	              		"Expression_AccessMemberOrArrayElement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleStatement_FunctioncallOrAssignment3068); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getEqualsSignKeyword_1_0_2());
                          
                    }
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1486:1: ( (lv_values_5_0= ruleExpression ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1487:1: (lv_values_5_0= ruleExpression )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1487:1: (lv_values_5_0= ruleExpression )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1488:3: lv_values_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getValuesExpressionParserRuleCall_1_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleStatement_FunctioncallOrAssignment3089);
                    lv_values_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatement_FunctioncallOrAssignmentRule());
                      	        }
                             		add(
                             			current, 
                             			"values",
                              		lv_values_5_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1504:2: (otherlv_6= ',' ( (lv_values_7_0= ruleExpression ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==17) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1504:4: otherlv_6= ',' ( (lv_values_7_0= ruleExpression ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleStatement_FunctioncallOrAssignment3102); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getCommaKeyword_1_0_4_0());
                    	          
                    	    }
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1508:1: ( (lv_values_7_0= ruleExpression ) )
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1509:1: (lv_values_7_0= ruleExpression )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1509:1: (lv_values_7_0= ruleExpression )
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1510:3: lv_values_7_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getValuesExpressionParserRuleCall_1_0_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleStatement_FunctioncallOrAssignment3123);
                    	    lv_values_7_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getStatement_FunctioncallOrAssignmentRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"values",
                    	              		lv_values_7_0, 
                    	              		"Expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1527:6: (otherlv_8= ':' () ( (lv_memberFunctionName_10_0= RULE_LUA_NAME ) ) ( (lv_arguments_11_0= ruleFunctioncall_Arguments ) ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1527:6: (otherlv_8= ':' () ( (lv_memberFunctionName_10_0= RULE_LUA_NAME ) ) ( (lv_arguments_11_0= ruleFunctioncall_Arguments ) ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1527:8: otherlv_8= ':' () ( (lv_memberFunctionName_10_0= RULE_LUA_NAME ) ) ( (lv_arguments_11_0= ruleFunctioncall_Arguments ) )
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleStatement_FunctioncallOrAssignment3145); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getColonKeyword_1_1_0());
                          
                    }
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1531:1: ()
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1532:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallMemberFunctionObjectAction_1_1_1(),
                                  current);
                          
                    }

                    }

                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1540:2: ( (lv_memberFunctionName_10_0= RULE_LUA_NAME ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1541:1: (lv_memberFunctionName_10_0= RULE_LUA_NAME )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1541:1: (lv_memberFunctionName_10_0= RULE_LUA_NAME )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1542:3: lv_memberFunctionName_10_0= RULE_LUA_NAME
                    {
                    lv_memberFunctionName_10_0=(Token)match(input,RULE_LUA_NAME,FOLLOW_RULE_LUA_NAME_in_ruleStatement_FunctioncallOrAssignment3174); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_memberFunctionName_10_0, grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getMemberFunctionNameLUA_NAMETerminalRuleCall_1_1_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStatement_FunctioncallOrAssignmentRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"memberFunctionName",
                              		lv_memberFunctionName_10_0, 
                              		"LUA_NAME");
                      	    
                    }

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1558:2: ( (lv_arguments_11_0= ruleFunctioncall_Arguments ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1559:1: (lv_arguments_11_0= ruleFunctioncall_Arguments )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1559:1: (lv_arguments_11_0= ruleFunctioncall_Arguments )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1560:3: lv_arguments_11_0= ruleFunctioncall_Arguments
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getArgumentsFunctioncall_ArgumentsParserRuleCall_1_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFunctioncall_Arguments_in_ruleStatement_FunctioncallOrAssignment3200);
                    lv_arguments_11_0=ruleFunctioncall_Arguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatement_FunctioncallOrAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"arguments",
                              		lv_arguments_11_0, 
                              		"Functioncall_Arguments");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1577:6: ( () ( (lv_arguments_13_0= ruleFunctioncall_Arguments ) ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1577:6: ( () ( (lv_arguments_13_0= ruleFunctioncall_Arguments ) ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1577:7: () ( (lv_arguments_13_0= ruleFunctioncall_Arguments ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1577:7: ()
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1578:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getStatement_CallFunctionObjectAction_1_2_0(),
                                  current);
                          
                    }

                    }

                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1586:2: ( (lv_arguments_13_0= ruleFunctioncall_Arguments ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1587:1: (lv_arguments_13_0= ruleFunctioncall_Arguments )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1587:1: (lv_arguments_13_0= ruleFunctioncall_Arguments )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1588:3: lv_arguments_13_0= ruleFunctioncall_Arguments
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatement_FunctioncallOrAssignmentAccess().getArgumentsFunctioncall_ArgumentsParserRuleCall_1_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFunctioncall_Arguments_in_ruleStatement_FunctioncallOrAssignment3241);
                    lv_arguments_13_0=ruleFunctioncall_Arguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatement_FunctioncallOrAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"arguments",
                              		lv_arguments_13_0, 
                              		"Functioncall_Arguments");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStatement_FunctioncallOrAssignment"


    // $ANTLR start "entryRuleExpression"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1612:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


         
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_COMMENT");
        	
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1616:2: (iv_ruleExpression= ruleExpression EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1617:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression3285);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression3295); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1627:1: ruleExpression returns [EObject current=null] : this_Expression_Or_0= ruleExpression_Or ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_Or_0 = null;


         enterRule(); 
        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_COMMENT");
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1631:28: (this_Expression_Or_0= ruleExpression_Or )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1633:2: this_Expression_Or_0= ruleExpression_Or
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getExpression_OrParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_Or_in_ruleExpression3348);
            this_Expression_Or_0=ruleExpression_Or();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_Or_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleExpression_Or"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1655:1: entryRuleExpression_Or returns [EObject current=null] : iv_ruleExpression_Or= ruleExpression_Or EOF ;
    public final EObject entryRuleExpression_Or() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Or = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1656:2: (iv_ruleExpression_Or= ruleExpression_Or EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1657:2: iv_ruleExpression_Or= ruleExpression_Or EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_OrRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_Or_in_entryRuleExpression_Or3386);
            iv_ruleExpression_Or=ruleExpression_Or();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_Or; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_Or3396); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression_Or"


    // $ANTLR start "ruleExpression_Or"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1664:1: ruleExpression_Or returns [EObject current=null] : (this_Expression_And_0= ruleExpression_And (otherlv_1= 'or' () ( (lv_right_3_0= ruleExpression_And ) ) )* ) ;
    public final EObject ruleExpression_Or() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Expression_And_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1667:28: ( (this_Expression_And_0= ruleExpression_And (otherlv_1= 'or' () ( (lv_right_3_0= ruleExpression_And ) ) )* ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1668:1: (this_Expression_And_0= ruleExpression_And (otherlv_1= 'or' () ( (lv_right_3_0= ruleExpression_And ) ) )* )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1668:1: (this_Expression_And_0= ruleExpression_And (otherlv_1= 'or' () ( (lv_right_3_0= ruleExpression_And ) ) )* )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1669:2: this_Expression_And_0= ruleExpression_And (otherlv_1= 'or' () ( (lv_right_3_0= ruleExpression_And ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpression_OrAccess().getExpression_AndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_And_in_ruleExpression_Or3446);
            this_Expression_And_0=ruleExpression_And();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_And_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1680:1: (otherlv_1= 'or' () ( (lv_right_3_0= ruleExpression_And ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==35) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1680:3: otherlv_1= 'or' () ( (lv_right_3_0= ruleExpression_And ) )
            	    {
            	    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleExpression_Or3458); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getExpression_OrAccess().getOrKeyword_1_0());
            	          
            	    }
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1684:1: ()
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1685:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpression_OrAccess().getExpression_OrLeftAction_1_1(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1693:2: ( (lv_right_3_0= ruleExpression_And ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1694:1: (lv_right_3_0= ruleExpression_And )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1694:1: (lv_right_3_0= ruleExpression_And )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1695:3: lv_right_3_0= ruleExpression_And
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpression_OrAccess().getRightExpression_AndParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_And_in_ruleExpression_Or3491);
            	    lv_right_3_0=ruleExpression_And();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpression_OrRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Expression_And");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression_Or"


    // $ANTLR start "entryRuleExpression_And"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1719:1: entryRuleExpression_And returns [EObject current=null] : iv_ruleExpression_And= ruleExpression_And EOF ;
    public final EObject entryRuleExpression_And() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_And = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1720:2: (iv_ruleExpression_And= ruleExpression_And EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1721:2: iv_ruleExpression_And= ruleExpression_And EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_AndRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_And_in_entryRuleExpression_And3529);
            iv_ruleExpression_And=ruleExpression_And();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_And; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_And3539); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression_And"


    // $ANTLR start "ruleExpression_And"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1728:1: ruleExpression_And returns [EObject current=null] : (this_Expression_Compare_0= ruleExpression_Compare (otherlv_1= 'and' () ( (lv_right_3_0= ruleExpression_Compare ) ) )* ) ;
    public final EObject ruleExpression_And() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Expression_Compare_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1731:28: ( (this_Expression_Compare_0= ruleExpression_Compare (otherlv_1= 'and' () ( (lv_right_3_0= ruleExpression_Compare ) ) )* ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1732:1: (this_Expression_Compare_0= ruleExpression_Compare (otherlv_1= 'and' () ( (lv_right_3_0= ruleExpression_Compare ) ) )* )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1732:1: (this_Expression_Compare_0= ruleExpression_Compare (otherlv_1= 'and' () ( (lv_right_3_0= ruleExpression_Compare ) ) )* )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1733:2: this_Expression_Compare_0= ruleExpression_Compare (otherlv_1= 'and' () ( (lv_right_3_0= ruleExpression_Compare ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpression_AndAccess().getExpression_CompareParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_Compare_in_ruleExpression_And3589);
            this_Expression_Compare_0=ruleExpression_Compare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_Compare_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1744:1: (otherlv_1= 'and' () ( (lv_right_3_0= ruleExpression_Compare ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==36) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1744:3: otherlv_1= 'and' () ( (lv_right_3_0= ruleExpression_Compare ) )
            	    {
            	    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleExpression_And3601); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getExpression_AndAccess().getAndKeyword_1_0());
            	          
            	    }
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1748:1: ()
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1749:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpression_AndAccess().getExpression_AndLeftAction_1_1(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1757:2: ( (lv_right_3_0= ruleExpression_Compare ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1758:1: (lv_right_3_0= ruleExpression_Compare )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1758:1: (lv_right_3_0= ruleExpression_Compare )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1759:3: lv_right_3_0= ruleExpression_Compare
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpression_AndAccess().getRightExpression_CompareParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_Compare_in_ruleExpression_And3634);
            	    lv_right_3_0=ruleExpression_Compare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpression_AndRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Expression_Compare");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression_And"


    // $ANTLR start "entryRuleExpression_Compare"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1783:1: entryRuleExpression_Compare returns [EObject current=null] : iv_ruleExpression_Compare= ruleExpression_Compare EOF ;
    public final EObject entryRuleExpression_Compare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Compare = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1784:2: (iv_ruleExpression_Compare= ruleExpression_Compare EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1785:2: iv_ruleExpression_Compare= ruleExpression_Compare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_CompareRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_Compare_in_entryRuleExpression_Compare3672);
            iv_ruleExpression_Compare=ruleExpression_Compare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_Compare; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_Compare3682); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression_Compare"


    // $ANTLR start "ruleExpression_Compare"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1792:1: ruleExpression_Compare returns [EObject current=null] : (this_Expression_Concatenation_0= ruleExpression_Concatenation ( (otherlv_1= '>' () ( (lv_right_3_0= ruleExpression_Concatenation ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= ruleExpression_Concatenation ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= ruleExpression_Concatenation ) ) ) | (otherlv_10= '<=' () ( (lv_right_12_0= ruleExpression_Concatenation ) ) ) | (otherlv_13= '==' () ( (lv_right_15_0= ruleExpression_Concatenation ) ) ) | (otherlv_16= '~=' () ( (lv_right_18_0= ruleExpression_Concatenation ) ) ) )* ) ;
    public final EObject ruleExpression_Compare() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        EObject this_Expression_Concatenation_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;

        EObject lv_right_12_0 = null;

        EObject lv_right_15_0 = null;

        EObject lv_right_18_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1795:28: ( (this_Expression_Concatenation_0= ruleExpression_Concatenation ( (otherlv_1= '>' () ( (lv_right_3_0= ruleExpression_Concatenation ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= ruleExpression_Concatenation ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= ruleExpression_Concatenation ) ) ) | (otherlv_10= '<=' () ( (lv_right_12_0= ruleExpression_Concatenation ) ) ) | (otherlv_13= '==' () ( (lv_right_15_0= ruleExpression_Concatenation ) ) ) | (otherlv_16= '~=' () ( (lv_right_18_0= ruleExpression_Concatenation ) ) ) )* ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1796:1: (this_Expression_Concatenation_0= ruleExpression_Concatenation ( (otherlv_1= '>' () ( (lv_right_3_0= ruleExpression_Concatenation ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= ruleExpression_Concatenation ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= ruleExpression_Concatenation ) ) ) | (otherlv_10= '<=' () ( (lv_right_12_0= ruleExpression_Concatenation ) ) ) | (otherlv_13= '==' () ( (lv_right_15_0= ruleExpression_Concatenation ) ) ) | (otherlv_16= '~=' () ( (lv_right_18_0= ruleExpression_Concatenation ) ) ) )* )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1796:1: (this_Expression_Concatenation_0= ruleExpression_Concatenation ( (otherlv_1= '>' () ( (lv_right_3_0= ruleExpression_Concatenation ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= ruleExpression_Concatenation ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= ruleExpression_Concatenation ) ) ) | (otherlv_10= '<=' () ( (lv_right_12_0= ruleExpression_Concatenation ) ) ) | (otherlv_13= '==' () ( (lv_right_15_0= ruleExpression_Concatenation ) ) ) | (otherlv_16= '~=' () ( (lv_right_18_0= ruleExpression_Concatenation ) ) ) )* )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1797:2: this_Expression_Concatenation_0= ruleExpression_Concatenation ( (otherlv_1= '>' () ( (lv_right_3_0= ruleExpression_Concatenation ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= ruleExpression_Concatenation ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= ruleExpression_Concatenation ) ) ) | (otherlv_10= '<=' () ( (lv_right_12_0= ruleExpression_Concatenation ) ) ) | (otherlv_13= '==' () ( (lv_right_15_0= ruleExpression_Concatenation ) ) ) | (otherlv_16= '~=' () ( (lv_right_18_0= ruleExpression_Concatenation ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpression_CompareAccess().getExpression_ConcatenationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_Concatenation_in_ruleExpression_Compare3732);
            this_Expression_Concatenation_0=ruleExpression_Concatenation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_Concatenation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1808:1: ( (otherlv_1= '>' () ( (lv_right_3_0= ruleExpression_Concatenation ) ) ) | (otherlv_4= '>=' () ( (lv_right_6_0= ruleExpression_Concatenation ) ) ) | (otherlv_7= '<' () ( (lv_right_9_0= ruleExpression_Concatenation ) ) ) | (otherlv_10= '<=' () ( (lv_right_12_0= ruleExpression_Concatenation ) ) ) | (otherlv_13= '==' () ( (lv_right_15_0= ruleExpression_Concatenation ) ) ) | (otherlv_16= '~=' () ( (lv_right_18_0= ruleExpression_Concatenation ) ) ) )*
            loop24:
            do {
                int alt24=7;
                switch ( input.LA(1) ) {
                case 37:
                    {
                    alt24=1;
                    }
                    break;
                case 38:
                    {
                    alt24=2;
                    }
                    break;
                case 39:
                    {
                    alt24=3;
                    }
                    break;
                case 40:
                    {
                    alt24=4;
                    }
                    break;
                case 41:
                    {
                    alt24=5;
                    }
                    break;
                case 42:
                    {
                    alt24=6;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1808:2: (otherlv_1= '>' () ( (lv_right_3_0= ruleExpression_Concatenation ) ) )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1808:2: (otherlv_1= '>' () ( (lv_right_3_0= ruleExpression_Concatenation ) ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1808:4: otherlv_1= '>' () ( (lv_right_3_0= ruleExpression_Concatenation ) )
            	    {
            	    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleExpression_Compare3745); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getExpression_CompareAccess().getGreaterThanSignKeyword_1_0_0());
            	          
            	    }
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1812:1: ()
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1813:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpression_CompareAccess().getExpression_LargerLeftAction_1_0_1(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1821:2: ( (lv_right_3_0= ruleExpression_Concatenation ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1822:1: (lv_right_3_0= ruleExpression_Concatenation )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1822:1: (lv_right_3_0= ruleExpression_Concatenation )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1823:3: lv_right_3_0= ruleExpression_Concatenation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpression_CompareAccess().getRightExpression_ConcatenationParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_Concatenation_in_ruleExpression_Compare3778);
            	    lv_right_3_0=ruleExpression_Concatenation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpression_CompareRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Expression_Concatenation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1840:6: (otherlv_4= '>=' () ( (lv_right_6_0= ruleExpression_Concatenation ) ) )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1840:6: (otherlv_4= '>=' () ( (lv_right_6_0= ruleExpression_Concatenation ) ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1840:8: otherlv_4= '>=' () ( (lv_right_6_0= ruleExpression_Concatenation ) )
            	    {
            	    otherlv_4=(Token)match(input,38,FOLLOW_38_in_ruleExpression_Compare3798); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getExpression_CompareAccess().getGreaterThanSignEqualsSignKeyword_1_1_0());
            	          
            	    }
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1844:1: ()
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1845:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpression_CompareAccess().getExpression_Larger_EqualLeftAction_1_1_1(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1853:2: ( (lv_right_6_0= ruleExpression_Concatenation ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1854:1: (lv_right_6_0= ruleExpression_Concatenation )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1854:1: (lv_right_6_0= ruleExpression_Concatenation )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1855:3: lv_right_6_0= ruleExpression_Concatenation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpression_CompareAccess().getRightExpression_ConcatenationParserRuleCall_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_Concatenation_in_ruleExpression_Compare3831);
            	    lv_right_6_0=ruleExpression_Concatenation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpression_CompareRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_6_0, 
            	              		"Expression_Concatenation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1872:6: (otherlv_7= '<' () ( (lv_right_9_0= ruleExpression_Concatenation ) ) )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1872:6: (otherlv_7= '<' () ( (lv_right_9_0= ruleExpression_Concatenation ) ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1872:8: otherlv_7= '<' () ( (lv_right_9_0= ruleExpression_Concatenation ) )
            	    {
            	    otherlv_7=(Token)match(input,39,FOLLOW_39_in_ruleExpression_Compare3851); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getExpression_CompareAccess().getLessThanSignKeyword_1_2_0());
            	          
            	    }
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1876:1: ()
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1877:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpression_CompareAccess().getExpression_SmallerLeftAction_1_2_1(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1885:2: ( (lv_right_9_0= ruleExpression_Concatenation ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1886:1: (lv_right_9_0= ruleExpression_Concatenation )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1886:1: (lv_right_9_0= ruleExpression_Concatenation )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1887:3: lv_right_9_0= ruleExpression_Concatenation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpression_CompareAccess().getRightExpression_ConcatenationParserRuleCall_1_2_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_Concatenation_in_ruleExpression_Compare3884);
            	    lv_right_9_0=ruleExpression_Concatenation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpression_CompareRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_9_0, 
            	              		"Expression_Concatenation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1904:6: (otherlv_10= '<=' () ( (lv_right_12_0= ruleExpression_Concatenation ) ) )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1904:6: (otherlv_10= '<=' () ( (lv_right_12_0= ruleExpression_Concatenation ) ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1904:8: otherlv_10= '<=' () ( (lv_right_12_0= ruleExpression_Concatenation ) )
            	    {
            	    otherlv_10=(Token)match(input,40,FOLLOW_40_in_ruleExpression_Compare3904); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getExpression_CompareAccess().getLessThanSignEqualsSignKeyword_1_3_0());
            	          
            	    }
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1908:1: ()
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1909:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpression_CompareAccess().getExpression_Smaller_EqualLeftAction_1_3_1(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1917:2: ( (lv_right_12_0= ruleExpression_Concatenation ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1918:1: (lv_right_12_0= ruleExpression_Concatenation )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1918:1: (lv_right_12_0= ruleExpression_Concatenation )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1919:3: lv_right_12_0= ruleExpression_Concatenation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpression_CompareAccess().getRightExpression_ConcatenationParserRuleCall_1_3_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_Concatenation_in_ruleExpression_Compare3937);
            	    lv_right_12_0=ruleExpression_Concatenation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpression_CompareRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_12_0, 
            	              		"Expression_Concatenation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1936:6: (otherlv_13= '==' () ( (lv_right_15_0= ruleExpression_Concatenation ) ) )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1936:6: (otherlv_13= '==' () ( (lv_right_15_0= ruleExpression_Concatenation ) ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1936:8: otherlv_13= '==' () ( (lv_right_15_0= ruleExpression_Concatenation ) )
            	    {
            	    otherlv_13=(Token)match(input,41,FOLLOW_41_in_ruleExpression_Compare3957); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getExpression_CompareAccess().getEqualsSignEqualsSignKeyword_1_4_0());
            	          
            	    }
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1940:1: ()
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1941:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpression_CompareAccess().getExpression_EqualLeftAction_1_4_1(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1949:2: ( (lv_right_15_0= ruleExpression_Concatenation ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1950:1: (lv_right_15_0= ruleExpression_Concatenation )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1950:1: (lv_right_15_0= ruleExpression_Concatenation )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1951:3: lv_right_15_0= ruleExpression_Concatenation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpression_CompareAccess().getRightExpression_ConcatenationParserRuleCall_1_4_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_Concatenation_in_ruleExpression_Compare3990);
            	    lv_right_15_0=ruleExpression_Concatenation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpression_CompareRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_15_0, 
            	              		"Expression_Concatenation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1968:6: (otherlv_16= '~=' () ( (lv_right_18_0= ruleExpression_Concatenation ) ) )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1968:6: (otherlv_16= '~=' () ( (lv_right_18_0= ruleExpression_Concatenation ) ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1968:8: otherlv_16= '~=' () ( (lv_right_18_0= ruleExpression_Concatenation ) )
            	    {
            	    otherlv_16=(Token)match(input,42,FOLLOW_42_in_ruleExpression_Compare4010); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_16, grammarAccess.getExpression_CompareAccess().getTildeEqualsSignKeyword_1_5_0());
            	          
            	    }
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1972:1: ()
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1973:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpression_CompareAccess().getExpression_Not_EqualLeftAction_1_5_1(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1981:2: ( (lv_right_18_0= ruleExpression_Concatenation ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1982:1: (lv_right_18_0= ruleExpression_Concatenation )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1982:1: (lv_right_18_0= ruleExpression_Concatenation )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:1983:3: lv_right_18_0= ruleExpression_Concatenation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpression_CompareAccess().getRightExpression_ConcatenationParserRuleCall_1_5_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_Concatenation_in_ruleExpression_Compare4043);
            	    lv_right_18_0=ruleExpression_Concatenation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpression_CompareRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_18_0, 
            	              		"Expression_Concatenation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression_Compare"


    // $ANTLR start "entryRuleExpression_Concatenation"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2007:1: entryRuleExpression_Concatenation returns [EObject current=null] : iv_ruleExpression_Concatenation= ruleExpression_Concatenation EOF ;
    public final EObject entryRuleExpression_Concatenation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Concatenation = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2008:2: (iv_ruleExpression_Concatenation= ruleExpression_Concatenation EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2009:2: iv_ruleExpression_Concatenation= ruleExpression_Concatenation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_ConcatenationRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_Concatenation_in_entryRuleExpression_Concatenation4082);
            iv_ruleExpression_Concatenation=ruleExpression_Concatenation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_Concatenation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_Concatenation4092); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression_Concatenation"


    // $ANTLR start "ruleExpression_Concatenation"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2016:1: ruleExpression_Concatenation returns [EObject current=null] : (this_Expression_PlusMinus_0= ruleExpression_PlusMinus (otherlv_1= '..' () ( (lv_right_3_0= ruleExpression_Concatenation ) ) )? ) ;
    public final EObject ruleExpression_Concatenation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Expression_PlusMinus_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2019:28: ( (this_Expression_PlusMinus_0= ruleExpression_PlusMinus (otherlv_1= '..' () ( (lv_right_3_0= ruleExpression_Concatenation ) ) )? ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2020:1: (this_Expression_PlusMinus_0= ruleExpression_PlusMinus (otherlv_1= '..' () ( (lv_right_3_0= ruleExpression_Concatenation ) ) )? )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2020:1: (this_Expression_PlusMinus_0= ruleExpression_PlusMinus (otherlv_1= '..' () ( (lv_right_3_0= ruleExpression_Concatenation ) ) )? )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2021:2: this_Expression_PlusMinus_0= ruleExpression_PlusMinus (otherlv_1= '..' () ( (lv_right_3_0= ruleExpression_Concatenation ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpression_ConcatenationAccess().getExpression_PlusMinusParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_PlusMinus_in_ruleExpression_Concatenation4142);
            this_Expression_PlusMinus_0=ruleExpression_PlusMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_PlusMinus_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2032:1: (otherlv_1= '..' () ( (lv_right_3_0= ruleExpression_Concatenation ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2032:3: otherlv_1= '..' () ( (lv_right_3_0= ruleExpression_Concatenation ) )
                    {
                    otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleExpression_Concatenation4154); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getExpression_ConcatenationAccess().getFullStopFullStopKeyword_1_0());
                          
                    }
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2036:1: ()
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2037:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getExpression_ConcatenationAccess().getExpression_ConcatenationLeftAction_1_1(),
                                  current);
                          
                    }

                    }

                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2045:2: ( (lv_right_3_0= ruleExpression_Concatenation ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2046:1: (lv_right_3_0= ruleExpression_Concatenation )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2046:1: (lv_right_3_0= ruleExpression_Concatenation )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2047:3: lv_right_3_0= ruleExpression_Concatenation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_ConcatenationAccess().getRightExpression_ConcatenationParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_Concatenation_in_ruleExpression_Concatenation4187);
                    lv_right_3_0=ruleExpression_Concatenation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_ConcatenationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"Expression_Concatenation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression_Concatenation"


    // $ANTLR start "entryRuleExpression_PlusMinus"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2071:1: entryRuleExpression_PlusMinus returns [EObject current=null] : iv_ruleExpression_PlusMinus= ruleExpression_PlusMinus EOF ;
    public final EObject entryRuleExpression_PlusMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_PlusMinus = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2072:2: (iv_ruleExpression_PlusMinus= ruleExpression_PlusMinus EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2073:2: iv_ruleExpression_PlusMinus= ruleExpression_PlusMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_PlusMinusRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_PlusMinus_in_entryRuleExpression_PlusMinus4225);
            iv_ruleExpression_PlusMinus=ruleExpression_PlusMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_PlusMinus; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_PlusMinus4235); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression_PlusMinus"


    // $ANTLR start "ruleExpression_PlusMinus"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2080:1: ruleExpression_PlusMinus returns [EObject current=null] : (this_Expression_MultiplicationDivisionModulo_0= ruleExpression_MultiplicationDivisionModulo ( (otherlv_1= '+' () ( (lv_right_3_0= ruleExpression_MultiplicationDivisionModulo ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleExpression_MultiplicationDivisionModulo ) ) ) )* ) ;
    public final EObject ruleExpression_PlusMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject this_Expression_MultiplicationDivisionModulo_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2083:28: ( (this_Expression_MultiplicationDivisionModulo_0= ruleExpression_MultiplicationDivisionModulo ( (otherlv_1= '+' () ( (lv_right_3_0= ruleExpression_MultiplicationDivisionModulo ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleExpression_MultiplicationDivisionModulo ) ) ) )* ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2084:1: (this_Expression_MultiplicationDivisionModulo_0= ruleExpression_MultiplicationDivisionModulo ( (otherlv_1= '+' () ( (lv_right_3_0= ruleExpression_MultiplicationDivisionModulo ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleExpression_MultiplicationDivisionModulo ) ) ) )* )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2084:1: (this_Expression_MultiplicationDivisionModulo_0= ruleExpression_MultiplicationDivisionModulo ( (otherlv_1= '+' () ( (lv_right_3_0= ruleExpression_MultiplicationDivisionModulo ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleExpression_MultiplicationDivisionModulo ) ) ) )* )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2085:2: this_Expression_MultiplicationDivisionModulo_0= ruleExpression_MultiplicationDivisionModulo ( (otherlv_1= '+' () ( (lv_right_3_0= ruleExpression_MultiplicationDivisionModulo ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleExpression_MultiplicationDivisionModulo ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpression_PlusMinusAccess().getExpression_MultiplicationDivisionModuloParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_MultiplicationDivisionModulo_in_ruleExpression_PlusMinus4285);
            this_Expression_MultiplicationDivisionModulo_0=ruleExpression_MultiplicationDivisionModulo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_MultiplicationDivisionModulo_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2096:1: ( (otherlv_1= '+' () ( (lv_right_3_0= ruleExpression_MultiplicationDivisionModulo ) ) ) | (otherlv_4= '-' () ( (lv_right_6_0= ruleExpression_MultiplicationDivisionModulo ) ) ) )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==44) ) {
                    alt26=1;
                }
                else if ( (LA26_0==45) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2096:2: (otherlv_1= '+' () ( (lv_right_3_0= ruleExpression_MultiplicationDivisionModulo ) ) )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2096:2: (otherlv_1= '+' () ( (lv_right_3_0= ruleExpression_MultiplicationDivisionModulo ) ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2096:4: otherlv_1= '+' () ( (lv_right_3_0= ruleExpression_MultiplicationDivisionModulo ) )
            	    {
            	    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleExpression_PlusMinus4298); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getExpression_PlusMinusAccess().getPlusSignKeyword_1_0_0());
            	          
            	    }
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2100:1: ()
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2101:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpression_PlusMinusAccess().getExpression_PlusLeftAction_1_0_1(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2109:2: ( (lv_right_3_0= ruleExpression_MultiplicationDivisionModulo ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2110:1: (lv_right_3_0= ruleExpression_MultiplicationDivisionModulo )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2110:1: (lv_right_3_0= ruleExpression_MultiplicationDivisionModulo )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2111:3: lv_right_3_0= ruleExpression_MultiplicationDivisionModulo
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpression_PlusMinusAccess().getRightExpression_MultiplicationDivisionModuloParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_MultiplicationDivisionModulo_in_ruleExpression_PlusMinus4331);
            	    lv_right_3_0=ruleExpression_MultiplicationDivisionModulo();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpression_PlusMinusRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Expression_MultiplicationDivisionModulo");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2128:6: (otherlv_4= '-' () ( (lv_right_6_0= ruleExpression_MultiplicationDivisionModulo ) ) )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2128:6: (otherlv_4= '-' () ( (lv_right_6_0= ruleExpression_MultiplicationDivisionModulo ) ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2128:8: otherlv_4= '-' () ( (lv_right_6_0= ruleExpression_MultiplicationDivisionModulo ) )
            	    {
            	    otherlv_4=(Token)match(input,45,FOLLOW_45_in_ruleExpression_PlusMinus4351); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getExpression_PlusMinusAccess().getHyphenMinusKeyword_1_1_0());
            	          
            	    }
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2132:1: ()
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2133:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpression_PlusMinusAccess().getExpression_MinusLeftAction_1_1_1(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2141:2: ( (lv_right_6_0= ruleExpression_MultiplicationDivisionModulo ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2142:1: (lv_right_6_0= ruleExpression_MultiplicationDivisionModulo )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2142:1: (lv_right_6_0= ruleExpression_MultiplicationDivisionModulo )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2143:3: lv_right_6_0= ruleExpression_MultiplicationDivisionModulo
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpression_PlusMinusAccess().getRightExpression_MultiplicationDivisionModuloParserRuleCall_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_MultiplicationDivisionModulo_in_ruleExpression_PlusMinus4384);
            	    lv_right_6_0=ruleExpression_MultiplicationDivisionModulo();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpression_PlusMinusRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_6_0, 
            	              		"Expression_MultiplicationDivisionModulo");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression_PlusMinus"


    // $ANTLR start "entryRuleExpression_MultiplicationDivisionModulo"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2167:1: entryRuleExpression_MultiplicationDivisionModulo returns [EObject current=null] : iv_ruleExpression_MultiplicationDivisionModulo= ruleExpression_MultiplicationDivisionModulo EOF ;
    public final EObject entryRuleExpression_MultiplicationDivisionModulo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_MultiplicationDivisionModulo = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2168:2: (iv_ruleExpression_MultiplicationDivisionModulo= ruleExpression_MultiplicationDivisionModulo EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2169:2: iv_ruleExpression_MultiplicationDivisionModulo= ruleExpression_MultiplicationDivisionModulo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_MultiplicationDivisionModuloRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_MultiplicationDivisionModulo_in_entryRuleExpression_MultiplicationDivisionModulo4423);
            iv_ruleExpression_MultiplicationDivisionModulo=ruleExpression_MultiplicationDivisionModulo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_MultiplicationDivisionModulo; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_MultiplicationDivisionModulo4433); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression_MultiplicationDivisionModulo"


    // $ANTLR start "ruleExpression_MultiplicationDivisionModulo"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2176:1: ruleExpression_MultiplicationDivisionModulo returns [EObject current=null] : (this_Expression_Unary_0= ruleExpression_Unary ( (otherlv_1= '*' () ( (lv_right_3_0= ruleExpression_Unary ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleExpression_Unary ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleExpression_Unary ) ) ) )* ) ;
    public final EObject ruleExpression_MultiplicationDivisionModulo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject this_Expression_Unary_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;

        EObject lv_right_9_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2179:28: ( (this_Expression_Unary_0= ruleExpression_Unary ( (otherlv_1= '*' () ( (lv_right_3_0= ruleExpression_Unary ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleExpression_Unary ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleExpression_Unary ) ) ) )* ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2180:1: (this_Expression_Unary_0= ruleExpression_Unary ( (otherlv_1= '*' () ( (lv_right_3_0= ruleExpression_Unary ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleExpression_Unary ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleExpression_Unary ) ) ) )* )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2180:1: (this_Expression_Unary_0= ruleExpression_Unary ( (otherlv_1= '*' () ( (lv_right_3_0= ruleExpression_Unary ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleExpression_Unary ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleExpression_Unary ) ) ) )* )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2181:2: this_Expression_Unary_0= ruleExpression_Unary ( (otherlv_1= '*' () ( (lv_right_3_0= ruleExpression_Unary ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleExpression_Unary ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleExpression_Unary ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_UnaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_Unary_in_ruleExpression_MultiplicationDivisionModulo4483);
            this_Expression_Unary_0=ruleExpression_Unary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_Unary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2192:1: ( (otherlv_1= '*' () ( (lv_right_3_0= ruleExpression_Unary ) ) ) | (otherlv_4= '/' () ( (lv_right_6_0= ruleExpression_Unary ) ) ) | (otherlv_7= '%' () ( (lv_right_9_0= ruleExpression_Unary ) ) ) )*
            loop27:
            do {
                int alt27=4;
                switch ( input.LA(1) ) {
                case 46:
                    {
                    alt27=1;
                    }
                    break;
                case 47:
                    {
                    alt27=2;
                    }
                    break;
                case 48:
                    {
                    alt27=3;
                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2192:2: (otherlv_1= '*' () ( (lv_right_3_0= ruleExpression_Unary ) ) )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2192:2: (otherlv_1= '*' () ( (lv_right_3_0= ruleExpression_Unary ) ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2192:4: otherlv_1= '*' () ( (lv_right_3_0= ruleExpression_Unary ) )
            	    {
            	    otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleExpression_MultiplicationDivisionModulo4496); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getAsteriskKeyword_1_0_0());
            	          
            	    }
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2196:1: ()
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2197:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_MultiplicationLeftAction_1_0_1(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2205:2: ( (lv_right_3_0= ruleExpression_Unary ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2206:1: (lv_right_3_0= ruleExpression_Unary )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2206:1: (lv_right_3_0= ruleExpression_Unary )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2207:3: lv_right_3_0= ruleExpression_Unary
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getRightExpression_UnaryParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_Unary_in_ruleExpression_MultiplicationDivisionModulo4529);
            	    lv_right_3_0=ruleExpression_Unary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpression_MultiplicationDivisionModuloRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Expression_Unary");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2224:6: (otherlv_4= '/' () ( (lv_right_6_0= ruleExpression_Unary ) ) )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2224:6: (otherlv_4= '/' () ( (lv_right_6_0= ruleExpression_Unary ) ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2224:8: otherlv_4= '/' () ( (lv_right_6_0= ruleExpression_Unary ) )
            	    {
            	    otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleExpression_MultiplicationDivisionModulo4549); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getSolidusKeyword_1_1_0());
            	          
            	    }
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2228:1: ()
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2229:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_DivisionLeftAction_1_1_1(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2237:2: ( (lv_right_6_0= ruleExpression_Unary ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2238:1: (lv_right_6_0= ruleExpression_Unary )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2238:1: (lv_right_6_0= ruleExpression_Unary )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2239:3: lv_right_6_0= ruleExpression_Unary
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getRightExpression_UnaryParserRuleCall_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_Unary_in_ruleExpression_MultiplicationDivisionModulo4582);
            	    lv_right_6_0=ruleExpression_Unary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpression_MultiplicationDivisionModuloRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_6_0, 
            	              		"Expression_Unary");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2256:6: (otherlv_7= '%' () ( (lv_right_9_0= ruleExpression_Unary ) ) )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2256:6: (otherlv_7= '%' () ( (lv_right_9_0= ruleExpression_Unary ) ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2256:8: otherlv_7= '%' () ( (lv_right_9_0= ruleExpression_Unary ) )
            	    {
            	    otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleExpression_MultiplicationDivisionModulo4602); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getPercentSignKeyword_1_2_0());
            	          
            	    }
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2260:1: ()
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2261:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getExpression_ModuloLeftAction_1_2_1(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2269:2: ( (lv_right_9_0= ruleExpression_Unary ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2270:1: (lv_right_9_0= ruleExpression_Unary )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2270:1: (lv_right_9_0= ruleExpression_Unary )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2271:3: lv_right_9_0= ruleExpression_Unary
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpression_MultiplicationDivisionModuloAccess().getRightExpression_UnaryParserRuleCall_1_2_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_Unary_in_ruleExpression_MultiplicationDivisionModulo4635);
            	    lv_right_9_0=ruleExpression_Unary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpression_MultiplicationDivisionModuloRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_9_0, 
            	              		"Expression_Unary");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression_MultiplicationDivisionModulo"


    // $ANTLR start "entryRuleExpression_Unary"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2295:1: entryRuleExpression_Unary returns [EObject current=null] : iv_ruleExpression_Unary= ruleExpression_Unary EOF ;
    public final EObject entryRuleExpression_Unary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Unary = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2296:2: (iv_ruleExpression_Unary= ruleExpression_Unary EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2297:2: iv_ruleExpression_Unary= ruleExpression_Unary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_UnaryRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_Unary_in_entryRuleExpression_Unary4674);
            iv_ruleExpression_Unary=ruleExpression_Unary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_Unary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_Unary4684); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression_Unary"


    // $ANTLR start "ruleExpression_Unary"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2304:1: ruleExpression_Unary returns [EObject current=null] : (this_Expression_Exponentiation_0= ruleExpression_Exponentiation | (otherlv_1= 'not' () ( (lv_exp_3_0= ruleExpression_Unary ) ) ) | (otherlv_4= '#' () ( (lv_exp_6_0= ruleExpression_Unary ) ) ) | (otherlv_7= '-' () ( (lv_exp_9_0= ruleExpression_Unary ) ) ) ) ;
    public final EObject ruleExpression_Unary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject this_Expression_Exponentiation_0 = null;

        EObject lv_exp_3_0 = null;

        EObject lv_exp_6_0 = null;

        EObject lv_exp_9_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2307:28: ( (this_Expression_Exponentiation_0= ruleExpression_Exponentiation | (otherlv_1= 'not' () ( (lv_exp_3_0= ruleExpression_Unary ) ) ) | (otherlv_4= '#' () ( (lv_exp_6_0= ruleExpression_Unary ) ) ) | (otherlv_7= '-' () ( (lv_exp_9_0= ruleExpression_Unary ) ) ) ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2308:1: (this_Expression_Exponentiation_0= ruleExpression_Exponentiation | (otherlv_1= 'not' () ( (lv_exp_3_0= ruleExpression_Unary ) ) ) | (otherlv_4= '#' () ( (lv_exp_6_0= ruleExpression_Unary ) ) ) | (otherlv_7= '-' () ( (lv_exp_9_0= ruleExpression_Unary ) ) ) )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2308:1: (this_Expression_Exponentiation_0= ruleExpression_Exponentiation | (otherlv_1= 'not' () ( (lv_exp_3_0= ruleExpression_Unary ) ) ) | (otherlv_4= '#' () ( (lv_exp_6_0= ruleExpression_Unary ) ) ) | (otherlv_7= '-' () ( (lv_exp_9_0= ruleExpression_Unary ) ) ) )
            int alt28=4;
            switch ( input.LA(1) ) {
            case RULE_LUA_NAME:
            case RULE_LUA_NUMBER:
            case RULE_LUA_STRING:
            case 31:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 60:
                {
                alt28=1;
                }
                break;
            case 49:
                {
                alt28=2;
                }
                break;
            case 50:
                {
                alt28=3;
                }
                break;
            case 45:
                {
                alt28=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2309:2: this_Expression_Exponentiation_0= ruleExpression_Exponentiation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpression_UnaryAccess().getExpression_ExponentiationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_Exponentiation_in_ruleExpression_Unary4734);
                    this_Expression_Exponentiation_0=ruleExpression_Exponentiation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_Exponentiation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2321:6: (otherlv_1= 'not' () ( (lv_exp_3_0= ruleExpression_Unary ) ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2321:6: (otherlv_1= 'not' () ( (lv_exp_3_0= ruleExpression_Unary ) ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2321:8: otherlv_1= 'not' () ( (lv_exp_3_0= ruleExpression_Unary ) )
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleExpression_Unary4752); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getExpression_UnaryAccess().getNotKeyword_1_0());
                          
                    }
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2325:1: ()
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2326:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpression_UnaryAccess().getExpression_NegateAction_1_1(),
                                  current);
                          
                    }

                    }

                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2334:2: ( (lv_exp_3_0= ruleExpression_Unary ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2335:1: (lv_exp_3_0= ruleExpression_Unary )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2335:1: (lv_exp_3_0= ruleExpression_Unary )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2336:3: lv_exp_3_0= ruleExpression_Unary
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_UnaryAccess().getExpExpression_UnaryParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_Unary_in_ruleExpression_Unary4785);
                    lv_exp_3_0=ruleExpression_Unary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_UnaryRule());
                      	        }
                             		set(
                             			current, 
                             			"exp",
                              		lv_exp_3_0, 
                              		"Expression_Unary");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2353:6: (otherlv_4= '#' () ( (lv_exp_6_0= ruleExpression_Unary ) ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2353:6: (otherlv_4= '#' () ( (lv_exp_6_0= ruleExpression_Unary ) ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2353:8: otherlv_4= '#' () ( (lv_exp_6_0= ruleExpression_Unary ) )
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_50_in_ruleExpression_Unary4805); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getExpression_UnaryAccess().getNumberSignKeyword_2_0());
                          
                    }
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2357:1: ()
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2358:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpression_UnaryAccess().getExpression_LengthAction_2_1(),
                                  current);
                          
                    }

                    }

                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2366:2: ( (lv_exp_6_0= ruleExpression_Unary ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2367:1: (lv_exp_6_0= ruleExpression_Unary )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2367:1: (lv_exp_6_0= ruleExpression_Unary )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2368:3: lv_exp_6_0= ruleExpression_Unary
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_UnaryAccess().getExpExpression_UnaryParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_Unary_in_ruleExpression_Unary4838);
                    lv_exp_6_0=ruleExpression_Unary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_UnaryRule());
                      	        }
                             		set(
                             			current, 
                             			"exp",
                              		lv_exp_6_0, 
                              		"Expression_Unary");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2385:6: (otherlv_7= '-' () ( (lv_exp_9_0= ruleExpression_Unary ) ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2385:6: (otherlv_7= '-' () ( (lv_exp_9_0= ruleExpression_Unary ) ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2385:8: otherlv_7= '-' () ( (lv_exp_9_0= ruleExpression_Unary ) )
                    {
                    otherlv_7=(Token)match(input,45,FOLLOW_45_in_ruleExpression_Unary4858); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getExpression_UnaryAccess().getHyphenMinusKeyword_3_0());
                          
                    }
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2389:1: ()
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2390:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpression_UnaryAccess().getExpression_InvertAction_3_1(),
                                  current);
                          
                    }

                    }

                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2398:2: ( (lv_exp_9_0= ruleExpression_Unary ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2399:1: (lv_exp_9_0= ruleExpression_Unary )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2399:1: (lv_exp_9_0= ruleExpression_Unary )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2400:3: lv_exp_9_0= ruleExpression_Unary
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_UnaryAccess().getExpExpression_UnaryParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_Unary_in_ruleExpression_Unary4891);
                    lv_exp_9_0=ruleExpression_Unary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_UnaryRule());
                      	        }
                             		set(
                             			current, 
                             			"exp",
                              		lv_exp_9_0, 
                              		"Expression_Unary");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression_Unary"


    // $ANTLR start "entryRuleExpression_Exponentiation"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2424:1: entryRuleExpression_Exponentiation returns [EObject current=null] : iv_ruleExpression_Exponentiation= ruleExpression_Exponentiation EOF ;
    public final EObject entryRuleExpression_Exponentiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Exponentiation = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2425:2: (iv_ruleExpression_Exponentiation= ruleExpression_Exponentiation EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2426:2: iv_ruleExpression_Exponentiation= ruleExpression_Exponentiation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_ExponentiationRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_Exponentiation_in_entryRuleExpression_Exponentiation4928);
            iv_ruleExpression_Exponentiation=ruleExpression_Exponentiation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_Exponentiation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_Exponentiation4938); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression_Exponentiation"


    // $ANTLR start "ruleExpression_Exponentiation"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2433:1: ruleExpression_Exponentiation returns [EObject current=null] : (this_Expression_Terminal_0= ruleExpression_Terminal (otherlv_1= '^' () ( (lv_right_3_0= ruleExpression_Exponentiation ) ) )? ) ;
    public final EObject ruleExpression_Exponentiation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Expression_Terminal_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2436:28: ( (this_Expression_Terminal_0= ruleExpression_Terminal (otherlv_1= '^' () ( (lv_right_3_0= ruleExpression_Exponentiation ) ) )? ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2437:1: (this_Expression_Terminal_0= ruleExpression_Terminal (otherlv_1= '^' () ( (lv_right_3_0= ruleExpression_Exponentiation ) ) )? )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2437:1: (this_Expression_Terminal_0= ruleExpression_Terminal (otherlv_1= '^' () ( (lv_right_3_0= ruleExpression_Exponentiation ) ) )? )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2438:2: this_Expression_Terminal_0= ruleExpression_Terminal (otherlv_1= '^' () ( (lv_right_3_0= ruleExpression_Exponentiation ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpression_ExponentiationAccess().getExpression_TerminalParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_Terminal_in_ruleExpression_Exponentiation4988);
            this_Expression_Terminal_0=ruleExpression_Terminal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_Terminal_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2449:1: (otherlv_1= '^' () ( (lv_right_3_0= ruleExpression_Exponentiation ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==51) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2449:3: otherlv_1= '^' () ( (lv_right_3_0= ruleExpression_Exponentiation ) )
                    {
                    otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleExpression_Exponentiation5000); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getExpression_ExponentiationAccess().getCircumflexAccentKeyword_1_0());
                          
                    }
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2453:1: ()
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2454:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getExpression_ExponentiationAccess().getExpression_ExponentiationLeftAction_1_1(),
                                  current);
                          
                    }

                    }

                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2462:2: ( (lv_right_3_0= ruleExpression_Exponentiation ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2463:1: (lv_right_3_0= ruleExpression_Exponentiation )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2463:1: (lv_right_3_0= ruleExpression_Exponentiation )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2464:3: lv_right_3_0= ruleExpression_Exponentiation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_ExponentiationAccess().getRightExpression_ExponentiationParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_Exponentiation_in_ruleExpression_Exponentiation5033);
                    lv_right_3_0=ruleExpression_Exponentiation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_ExponentiationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"Expression_Exponentiation");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression_Exponentiation"


    // $ANTLR start "entryRuleExpression_Terminal"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2488:1: entryRuleExpression_Terminal returns [EObject current=null] : iv_ruleExpression_Terminal= ruleExpression_Terminal EOF ;
    public final EObject entryRuleExpression_Terminal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Terminal = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2489:2: (iv_ruleExpression_Terminal= ruleExpression_Terminal EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2490:2: iv_ruleExpression_Terminal= ruleExpression_Terminal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_TerminalRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_Terminal_in_entryRuleExpression_Terminal5071);
            iv_ruleExpression_Terminal=ruleExpression_Terminal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_Terminal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_Terminal5081); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression_Terminal"


    // $ANTLR start "ruleExpression_Terminal"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2497:1: ruleExpression_Terminal returns [EObject current=null] : (this_Expression_Nil_0= ruleExpression_Nil | this_Expression_True_1= ruleExpression_True | this_Expression_False_2= ruleExpression_False | this_Expression_Number_3= ruleExpression_Number | this_Expression_VarArgs_4= ruleExpression_VarArgs | this_Expression_String_5= ruleExpression_String | this_Expression_Function_6= ruleExpression_Function | this_Expression_TableConstructor_7= ruleExpression_TableConstructor | this_Expression_Functioncall_8= ruleExpression_Functioncall ) ;
    public final EObject ruleExpression_Terminal() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_Nil_0 = null;

        EObject this_Expression_True_1 = null;

        EObject this_Expression_False_2 = null;

        EObject this_Expression_Number_3 = null;

        EObject this_Expression_VarArgs_4 = null;

        EObject this_Expression_String_5 = null;

        EObject this_Expression_Function_6 = null;

        EObject this_Expression_TableConstructor_7 = null;

        EObject this_Expression_Functioncall_8 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2500:28: ( (this_Expression_Nil_0= ruleExpression_Nil | this_Expression_True_1= ruleExpression_True | this_Expression_False_2= ruleExpression_False | this_Expression_Number_3= ruleExpression_Number | this_Expression_VarArgs_4= ruleExpression_VarArgs | this_Expression_String_5= ruleExpression_String | this_Expression_Function_6= ruleExpression_Function | this_Expression_TableConstructor_7= ruleExpression_TableConstructor | this_Expression_Functioncall_8= ruleExpression_Functioncall ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2501:1: (this_Expression_Nil_0= ruleExpression_Nil | this_Expression_True_1= ruleExpression_True | this_Expression_False_2= ruleExpression_False | this_Expression_Number_3= ruleExpression_Number | this_Expression_VarArgs_4= ruleExpression_VarArgs | this_Expression_String_5= ruleExpression_String | this_Expression_Function_6= ruleExpression_Function | this_Expression_TableConstructor_7= ruleExpression_TableConstructor | this_Expression_Functioncall_8= ruleExpression_Functioncall )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2501:1: (this_Expression_Nil_0= ruleExpression_Nil | this_Expression_True_1= ruleExpression_True | this_Expression_False_2= ruleExpression_False | this_Expression_Number_3= ruleExpression_Number | this_Expression_VarArgs_4= ruleExpression_VarArgs | this_Expression_String_5= ruleExpression_String | this_Expression_Function_6= ruleExpression_Function | this_Expression_TableConstructor_7= ruleExpression_TableConstructor | this_Expression_Functioncall_8= ruleExpression_Functioncall )
            int alt30=9;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt30=1;
                }
                break;
            case 53:
                {
                alt30=2;
                }
                break;
            case 54:
                {
                alt30=3;
                }
                break;
            case RULE_LUA_NUMBER:
                {
                alt30=4;
                }
                break;
            case 55:
                {
                alt30=5;
                }
                break;
            case RULE_LUA_STRING:
                {
                alt30=6;
                }
                break;
            case 31:
                {
                alt30=7;
                }
                break;
            case 56:
                {
                alt30=8;
                }
                break;
            case RULE_LUA_NAME:
            case 60:
                {
                alt30=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2502:2: this_Expression_Nil_0= ruleExpression_Nil
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_NilParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_Nil_in_ruleExpression_Terminal5131);
                    this_Expression_Nil_0=ruleExpression_Nil();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_Nil_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2515:2: this_Expression_True_1= ruleExpression_True
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_TrueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_True_in_ruleExpression_Terminal5161);
                    this_Expression_True_1=ruleExpression_True();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_True_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2528:2: this_Expression_False_2= ruleExpression_False
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_FalseParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_False_in_ruleExpression_Terminal5191);
                    this_Expression_False_2=ruleExpression_False();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_False_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2541:2: this_Expression_Number_3= ruleExpression_Number
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_NumberParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_Number_in_ruleExpression_Terminal5221);
                    this_Expression_Number_3=ruleExpression_Number();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_Number_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2554:2: this_Expression_VarArgs_4= ruleExpression_VarArgs
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_VarArgsParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_VarArgs_in_ruleExpression_Terminal5251);
                    this_Expression_VarArgs_4=ruleExpression_VarArgs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_VarArgs_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2567:2: this_Expression_String_5= ruleExpression_String
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_StringParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_String_in_ruleExpression_Terminal5281);
                    this_Expression_String_5=ruleExpression_String();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_String_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2580:2: this_Expression_Function_6= ruleExpression_Function
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_FunctionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_Function_in_ruleExpression_Terminal5311);
                    this_Expression_Function_6=ruleExpression_Function();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_Function_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2593:2: this_Expression_TableConstructor_7= ruleExpression_TableConstructor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_TableConstructorParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_TableConstructor_in_ruleExpression_Terminal5341);
                    this_Expression_TableConstructor_7=ruleExpression_TableConstructor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_TableConstructor_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2606:2: this_Expression_Functioncall_8= ruleExpression_Functioncall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpression_TerminalAccess().getExpression_FunctioncallParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_Functioncall_in_ruleExpression_Terminal5371);
                    this_Expression_Functioncall_8=ruleExpression_Functioncall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_Functioncall_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression_Terminal"


    // $ANTLR start "entryRuleExpression_Nil"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2625:1: entryRuleExpression_Nil returns [EObject current=null] : iv_ruleExpression_Nil= ruleExpression_Nil EOF ;
    public final EObject entryRuleExpression_Nil() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Nil = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2626:2: (iv_ruleExpression_Nil= ruleExpression_Nil EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2627:2: iv_ruleExpression_Nil= ruleExpression_Nil EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_NilRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_Nil_in_entryRuleExpression_Nil5406);
            iv_ruleExpression_Nil=ruleExpression_Nil();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_Nil; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_Nil5416); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression_Nil"


    // $ANTLR start "ruleExpression_Nil"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2634:1: ruleExpression_Nil returns [EObject current=null] : (otherlv_0= 'nil' () ) ;
    public final EObject ruleExpression_Nil() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2637:28: ( (otherlv_0= 'nil' () ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2638:1: (otherlv_0= 'nil' () )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2638:1: (otherlv_0= 'nil' () )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2638:3: otherlv_0= 'nil' ()
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleExpression_Nil5453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExpression_NilAccess().getNilKeyword_0());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2642:1: ()
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2643:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpression_NilAccess().getExpression_NilAction_1(),
                          current);
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression_Nil"


    // $ANTLR start "entryRuleExpression_True"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2659:1: entryRuleExpression_True returns [EObject current=null] : iv_ruleExpression_True= ruleExpression_True EOF ;
    public final EObject entryRuleExpression_True() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_True = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2660:2: (iv_ruleExpression_True= ruleExpression_True EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2661:2: iv_ruleExpression_True= ruleExpression_True EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_TrueRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_True_in_entryRuleExpression_True5501);
            iv_ruleExpression_True=ruleExpression_True();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_True; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_True5511); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression_True"


    // $ANTLR start "ruleExpression_True"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2668:1: ruleExpression_True returns [EObject current=null] : (otherlv_0= 'true' () ) ;
    public final EObject ruleExpression_True() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2671:28: ( (otherlv_0= 'true' () ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2672:1: (otherlv_0= 'true' () )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2672:1: (otherlv_0= 'true' () )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2672:3: otherlv_0= 'true' ()
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleExpression_True5548); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExpression_TrueAccess().getTrueKeyword_0());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2676:1: ()
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2677:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpression_TrueAccess().getExpression_TrueAction_1(),
                          current);
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression_True"


    // $ANTLR start "entryRuleExpression_False"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2693:1: entryRuleExpression_False returns [EObject current=null] : iv_ruleExpression_False= ruleExpression_False EOF ;
    public final EObject entryRuleExpression_False() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_False = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2694:2: (iv_ruleExpression_False= ruleExpression_False EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2695:2: iv_ruleExpression_False= ruleExpression_False EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_FalseRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_False_in_entryRuleExpression_False5596);
            iv_ruleExpression_False=ruleExpression_False();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_False; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_False5606); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression_False"


    // $ANTLR start "ruleExpression_False"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2702:1: ruleExpression_False returns [EObject current=null] : (otherlv_0= 'false' () ) ;
    public final EObject ruleExpression_False() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2705:28: ( (otherlv_0= 'false' () ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2706:1: (otherlv_0= 'false' () )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2706:1: (otherlv_0= 'false' () )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2706:3: otherlv_0= 'false' ()
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleExpression_False5643); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExpression_FalseAccess().getFalseKeyword_0());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2710:1: ()
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2711:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpression_FalseAccess().getExpression_FalseAction_1(),
                          current);
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression_False"


    // $ANTLR start "entryRuleExpression_Number"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2727:1: entryRuleExpression_Number returns [EObject current=null] : iv_ruleExpression_Number= ruleExpression_Number EOF ;
    public final EObject entryRuleExpression_Number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Number = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2728:2: (iv_ruleExpression_Number= ruleExpression_Number EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2729:2: iv_ruleExpression_Number= ruleExpression_Number EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_NumberRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_Number_in_entryRuleExpression_Number5691);
            iv_ruleExpression_Number=ruleExpression_Number();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_Number; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_Number5701); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression_Number"


    // $ANTLR start "ruleExpression_Number"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2736:1: ruleExpression_Number returns [EObject current=null] : ( (lv_value_0_0= RULE_LUA_NUMBER ) ) ;
    public final EObject ruleExpression_Number() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2739:28: ( ( (lv_value_0_0= RULE_LUA_NUMBER ) ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2740:1: ( (lv_value_0_0= RULE_LUA_NUMBER ) )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2740:1: ( (lv_value_0_0= RULE_LUA_NUMBER ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2741:1: (lv_value_0_0= RULE_LUA_NUMBER )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2741:1: (lv_value_0_0= RULE_LUA_NUMBER )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2742:3: lv_value_0_0= RULE_LUA_NUMBER
            {
            lv_value_0_0=(Token)match(input,RULE_LUA_NUMBER,FOLLOW_RULE_LUA_NUMBER_in_ruleExpression_Number5742); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getExpression_NumberAccess().getValueLUA_NUMBERTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getExpression_NumberRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"LUA_NUMBER");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression_Number"


    // $ANTLR start "entryRuleExpression_VarArgs"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2766:1: entryRuleExpression_VarArgs returns [EObject current=null] : iv_ruleExpression_VarArgs= ruleExpression_VarArgs EOF ;
    public final EObject entryRuleExpression_VarArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_VarArgs = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2767:2: (iv_ruleExpression_VarArgs= ruleExpression_VarArgs EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2768:2: iv_ruleExpression_VarArgs= ruleExpression_VarArgs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_VarArgsRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_VarArgs_in_entryRuleExpression_VarArgs5782);
            iv_ruleExpression_VarArgs=ruleExpression_VarArgs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_VarArgs; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_VarArgs5792); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression_VarArgs"


    // $ANTLR start "ruleExpression_VarArgs"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2775:1: ruleExpression_VarArgs returns [EObject current=null] : (otherlv_0= '...' () ) ;
    public final EObject ruleExpression_VarArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2778:28: ( (otherlv_0= '...' () ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2779:1: (otherlv_0= '...' () )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2779:1: (otherlv_0= '...' () )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2779:3: otherlv_0= '...' ()
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleExpression_VarArgs5829); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExpression_VarArgsAccess().getFullStopFullStopFullStopKeyword_0());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2783:1: ()
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2784:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpression_VarArgsAccess().getExpression_VarArgsAction_1(),
                          current);
                  
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression_VarArgs"


    // $ANTLR start "entryRuleExpression_String"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2800:1: entryRuleExpression_String returns [EObject current=null] : iv_ruleExpression_String= ruleExpression_String EOF ;
    public final EObject entryRuleExpression_String() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_String = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2801:2: (iv_ruleExpression_String= ruleExpression_String EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2802:2: iv_ruleExpression_String= ruleExpression_String EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_StringRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_String_in_entryRuleExpression_String5877);
            iv_ruleExpression_String=ruleExpression_String();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_String; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_String5887); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression_String"


    // $ANTLR start "ruleExpression_String"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2809:1: ruleExpression_String returns [EObject current=null] : ( (lv_value_0_0= RULE_LUA_STRING ) ) ;
    public final EObject ruleExpression_String() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2812:28: ( ( (lv_value_0_0= RULE_LUA_STRING ) ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2813:1: ( (lv_value_0_0= RULE_LUA_STRING ) )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2813:1: ( (lv_value_0_0= RULE_LUA_STRING ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2814:1: (lv_value_0_0= RULE_LUA_STRING )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2814:1: (lv_value_0_0= RULE_LUA_STRING )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2815:3: lv_value_0_0= RULE_LUA_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_LUA_STRING,FOLLOW_RULE_LUA_STRING_in_ruleExpression_String5928); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getExpression_StringAccess().getValueLUA_STRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getExpression_StringRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"LUA_STRING");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression_String"


    // $ANTLR start "entryRuleExpression_Function"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2839:1: entryRuleExpression_Function returns [EObject current=null] : iv_ruleExpression_Function= ruleExpression_Function EOF ;
    public final EObject entryRuleExpression_Function() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Function = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2840:2: (iv_ruleExpression_Function= ruleExpression_Function EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2841:2: iv_ruleExpression_Function= ruleExpression_Function EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_FunctionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_Function_in_entryRuleExpression_Function5968);
            iv_ruleExpression_Function=ruleExpression_Function();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_Function; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_Function5978); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression_Function"


    // $ANTLR start "ruleExpression_Function"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2848:1: ruleExpression_Function returns [EObject current=null] : (otherlv_0= 'function' ( (lv_function_1_0= ruleFunction ) ) otherlv_2= 'end' ) ;
    public final EObject ruleExpression_Function() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_function_1_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2851:28: ( (otherlv_0= 'function' ( (lv_function_1_0= ruleFunction ) ) otherlv_2= 'end' ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2852:1: (otherlv_0= 'function' ( (lv_function_1_0= ruleFunction ) ) otherlv_2= 'end' )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2852:1: (otherlv_0= 'function' ( (lv_function_1_0= ruleFunction ) ) otherlv_2= 'end' )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2852:3: otherlv_0= 'function' ( (lv_function_1_0= ruleFunction ) ) otherlv_2= 'end'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleExpression_Function6015); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExpression_FunctionAccess().getFunctionKeyword_0());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2856:1: ( (lv_function_1_0= ruleFunction ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2857:1: (lv_function_1_0= ruleFunction )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2857:1: (lv_function_1_0= ruleFunction )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2858:3: lv_function_1_0= ruleFunction
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpression_FunctionAccess().getFunctionFunctionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFunction_in_ruleExpression_Function6036);
            lv_function_1_0=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpression_FunctionRule());
              	        }
                     		set(
                     			current, 
                     			"function",
                      		lv_function_1_0, 
                      		"Function");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleExpression_Function6048); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExpression_FunctionAccess().getEndKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression_Function"


    // $ANTLR start "entryRuleExpression_TableConstructor"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2886:1: entryRuleExpression_TableConstructor returns [EObject current=null] : iv_ruleExpression_TableConstructor= ruleExpression_TableConstructor EOF ;
    public final EObject entryRuleExpression_TableConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_TableConstructor = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2887:2: (iv_ruleExpression_TableConstructor= ruleExpression_TableConstructor EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2888:2: iv_ruleExpression_TableConstructor= ruleExpression_TableConstructor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_TableConstructorRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_TableConstructor_in_entryRuleExpression_TableConstructor6084);
            iv_ruleExpression_TableConstructor=ruleExpression_TableConstructor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_TableConstructor; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_TableConstructor6094); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression_TableConstructor"


    // $ANTLR start "ruleExpression_TableConstructor"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2895:1: ruleExpression_TableConstructor returns [EObject current=null] : (otherlv_0= '{' () ( ( (lv_fields_2_0= ruleField ) ) ( (otherlv_3= ',' | otherlv_4= ';' ) ( (lv_fields_5_0= ruleField ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )? otherlv_8= '}' ) ;
    public final EObject ruleExpression_TableConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_fields_2_0 = null;

        EObject lv_fields_5_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2898:28: ( (otherlv_0= '{' () ( ( (lv_fields_2_0= ruleField ) ) ( (otherlv_3= ',' | otherlv_4= ';' ) ( (lv_fields_5_0= ruleField ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )? otherlv_8= '}' ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2899:1: (otherlv_0= '{' () ( ( (lv_fields_2_0= ruleField ) ) ( (otherlv_3= ',' | otherlv_4= ';' ) ( (lv_fields_5_0= ruleField ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )? otherlv_8= '}' )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2899:1: (otherlv_0= '{' () ( ( (lv_fields_2_0= ruleField ) ) ( (otherlv_3= ',' | otherlv_4= ';' ) ( (lv_fields_5_0= ruleField ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )? otherlv_8= '}' )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2899:3: otherlv_0= '{' () ( ( (lv_fields_2_0= ruleField ) ) ( (otherlv_3= ',' | otherlv_4= ';' ) ( (lv_fields_5_0= ruleField ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleExpression_TableConstructor6131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExpression_TableConstructorAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2903:1: ()
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2904:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExpression_TableConstructorAccess().getExpression_TableConstructorAction_1(),
                          current);
                  
            }

            }

            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2912:2: ( ( (lv_fields_2_0= ruleField ) ) ( (otherlv_3= ',' | otherlv_4= ';' ) ( (lv_fields_5_0= ruleField ) ) )* (otherlv_6= ',' | otherlv_7= ';' )? )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_LUA_NAME && LA34_0<=RULE_LUA_STRING)||LA34_0==31||LA34_0==45||(LA34_0>=49 && LA34_0<=50)||(LA34_0>=52 && LA34_0<=56)||LA34_0==58||LA34_0==60) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2912:3: ( (lv_fields_2_0= ruleField ) ) ( (otherlv_3= ',' | otherlv_4= ';' ) ( (lv_fields_5_0= ruleField ) ) )* (otherlv_6= ',' | otherlv_7= ';' )?
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2912:3: ( (lv_fields_2_0= ruleField ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2913:1: (lv_fields_2_0= ruleField )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2913:1: (lv_fields_2_0= ruleField )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2914:3: lv_fields_2_0= ruleField
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_TableConstructorAccess().getFieldsFieldParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleField_in_ruleExpression_TableConstructor6165);
                    lv_fields_2_0=ruleField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_TableConstructorRule());
                      	        }
                             		add(
                             			current, 
                             			"fields",
                              		lv_fields_2_0, 
                              		"Field");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2930:2: ( (otherlv_3= ',' | otherlv_4= ';' ) ( (lv_fields_5_0= ruleField ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==17) ) {
                            int LA32_1 = input.LA(2);

                            if ( ((LA32_1>=RULE_LUA_NAME && LA32_1<=RULE_LUA_STRING)||LA32_1==31||LA32_1==45||(LA32_1>=49 && LA32_1<=50)||(LA32_1>=52 && LA32_1<=56)||LA32_1==58||LA32_1==60) ) {
                                alt32=1;
                            }


                        }
                        else if ( (LA32_0==15) ) {
                            int LA32_2 = input.LA(2);

                            if ( ((LA32_2>=RULE_LUA_NAME && LA32_2<=RULE_LUA_STRING)||LA32_2==31||LA32_2==45||(LA32_2>=49 && LA32_2<=50)||(LA32_2>=52 && LA32_2<=56)||LA32_2==58||LA32_2==60) ) {
                                alt32=1;
                            }


                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2930:3: (otherlv_3= ',' | otherlv_4= ';' ) ( (lv_fields_5_0= ruleField ) )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2930:3: (otherlv_3= ',' | otherlv_4= ';' )
                    	    int alt31=2;
                    	    int LA31_0 = input.LA(1);

                    	    if ( (LA31_0==17) ) {
                    	        alt31=1;
                    	    }
                    	    else if ( (LA31_0==15) ) {
                    	        alt31=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 31, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt31) {
                    	        case 1 :
                    	            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2930:5: otherlv_3= ','
                    	            {
                    	            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleExpression_TableConstructor6179); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_3, grammarAccess.getExpression_TableConstructorAccess().getCommaKeyword_2_1_0_0());
                    	                  
                    	            }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2935:7: otherlv_4= ';'
                    	            {
                    	            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleExpression_TableConstructor6197); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	                  	newLeafNode(otherlv_4, grammarAccess.getExpression_TableConstructorAccess().getSemicolonKeyword_2_1_0_1());
                    	                  
                    	            }

                    	            }
                    	            break;

                    	    }

                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2939:2: ( (lv_fields_5_0= ruleField ) )
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2940:1: (lv_fields_5_0= ruleField )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2940:1: (lv_fields_5_0= ruleField )
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2941:3: lv_fields_5_0= ruleField
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExpression_TableConstructorAccess().getFieldsFieldParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleField_in_ruleExpression_TableConstructor6219);
                    	    lv_fields_5_0=ruleField();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getExpression_TableConstructorRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"fields",
                    	              		lv_fields_5_0, 
                    	              		"Field");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2957:4: (otherlv_6= ',' | otherlv_7= ';' )?
                    int alt33=3;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==17) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==15) ) {
                        alt33=2;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2957:6: otherlv_6= ','
                            {
                            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleExpression_TableConstructor6234); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_6, grammarAccess.getExpression_TableConstructorAccess().getCommaKeyword_2_2_0());
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2962:7: otherlv_7= ';'
                            {
                            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleExpression_TableConstructor6252); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getExpression_TableConstructorAccess().getSemicolonKeyword_2_2_1());
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,57,FOLLOW_57_in_ruleExpression_TableConstructor6268); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getExpression_TableConstructorAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression_TableConstructor"


    // $ANTLR start "entryRuleExpression_Functioncall"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2978:1: entryRuleExpression_Functioncall returns [EObject current=null] : iv_ruleExpression_Functioncall= ruleExpression_Functioncall EOF ;
    public final EObject entryRuleExpression_Functioncall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_Functioncall = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2979:2: (iv_ruleExpression_Functioncall= ruleExpression_Functioncall EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2980:2: iv_ruleExpression_Functioncall= ruleExpression_Functioncall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_FunctioncallRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_Functioncall_in_entryRuleExpression_Functioncall6304);
            iv_ruleExpression_Functioncall=ruleExpression_Functioncall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_Functioncall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_Functioncall6314); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression_Functioncall"


    // $ANTLR start "ruleExpression_Functioncall"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2987:1: ruleExpression_Functioncall returns [EObject current=null] : (this_Expression_AccessMemberOrArrayElement_0= ruleExpression_AccessMemberOrArrayElement ( (otherlv_1= ':' () ( (lv_memberFunctionName_3_0= RULE_LUA_NAME ) ) ( (lv_arguments_4_0= ruleFunctioncall_Arguments ) ) ) | ( () ( (lv_arguments_6_0= ruleFunctioncall_Arguments ) ) ) )? ) ;
    public final EObject ruleExpression_Functioncall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_memberFunctionName_3_0=null;
        EObject this_Expression_AccessMemberOrArrayElement_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_6_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2990:28: ( (this_Expression_AccessMemberOrArrayElement_0= ruleExpression_AccessMemberOrArrayElement ( (otherlv_1= ':' () ( (lv_memberFunctionName_3_0= RULE_LUA_NAME ) ) ( (lv_arguments_4_0= ruleFunctioncall_Arguments ) ) ) | ( () ( (lv_arguments_6_0= ruleFunctioncall_Arguments ) ) ) )? ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2991:1: (this_Expression_AccessMemberOrArrayElement_0= ruleExpression_AccessMemberOrArrayElement ( (otherlv_1= ':' () ( (lv_memberFunctionName_3_0= RULE_LUA_NAME ) ) ( (lv_arguments_4_0= ruleFunctioncall_Arguments ) ) ) | ( () ( (lv_arguments_6_0= ruleFunctioncall_Arguments ) ) ) )? )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2991:1: (this_Expression_AccessMemberOrArrayElement_0= ruleExpression_AccessMemberOrArrayElement ( (otherlv_1= ':' () ( (lv_memberFunctionName_3_0= RULE_LUA_NAME ) ) ( (lv_arguments_4_0= ruleFunctioncall_Arguments ) ) ) | ( () ( (lv_arguments_6_0= ruleFunctioncall_Arguments ) ) ) )? )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:2992:2: this_Expression_AccessMemberOrArrayElement_0= ruleExpression_AccessMemberOrArrayElement ( (otherlv_1= ':' () ( (lv_memberFunctionName_3_0= RULE_LUA_NAME ) ) ( (lv_arguments_4_0= ruleFunctioncall_Arguments ) ) ) | ( () ( (lv_arguments_6_0= ruleFunctioncall_Arguments ) ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpression_FunctioncallAccess().getExpression_AccessMemberOrArrayElementParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_AccessMemberOrArrayElement_in_ruleExpression_Functioncall6364);
            this_Expression_AccessMemberOrArrayElement_0=ruleExpression_AccessMemberOrArrayElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_AccessMemberOrArrayElement_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3003:1: ( (otherlv_1= ':' () ( (lv_memberFunctionName_3_0= RULE_LUA_NAME ) ) ( (lv_arguments_4_0= ruleFunctioncall_Arguments ) ) ) | ( () ( (lv_arguments_6_0= ruleFunctioncall_Arguments ) ) ) )?
            int alt35=3;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3003:2: (otherlv_1= ':' () ( (lv_memberFunctionName_3_0= RULE_LUA_NAME ) ) ( (lv_arguments_4_0= ruleFunctioncall_Arguments ) ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3003:2: (otherlv_1= ':' () ( (lv_memberFunctionName_3_0= RULE_LUA_NAME ) ) ( (lv_arguments_4_0= ruleFunctioncall_Arguments ) ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3003:4: otherlv_1= ':' () ( (lv_memberFunctionName_3_0= RULE_LUA_NAME ) ) ( (lv_arguments_4_0= ruleFunctioncall_Arguments ) )
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleExpression_Functioncall6377); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getExpression_FunctioncallAccess().getColonKeyword_1_0_0());
                          
                    }
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3007:1: ()
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3008:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getExpression_FunctioncallAccess().getExpression_CallMemberFunctionObjectAction_1_0_1(),
                                  current);
                          
                    }

                    }

                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3016:2: ( (lv_memberFunctionName_3_0= RULE_LUA_NAME ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3017:1: (lv_memberFunctionName_3_0= RULE_LUA_NAME )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3017:1: (lv_memberFunctionName_3_0= RULE_LUA_NAME )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3018:3: lv_memberFunctionName_3_0= RULE_LUA_NAME
                    {
                    lv_memberFunctionName_3_0=(Token)match(input,RULE_LUA_NAME,FOLLOW_RULE_LUA_NAME_in_ruleExpression_Functioncall6406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_memberFunctionName_3_0, grammarAccess.getExpression_FunctioncallAccess().getMemberFunctionNameLUA_NAMETerminalRuleCall_1_0_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpression_FunctioncallRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"memberFunctionName",
                              		lv_memberFunctionName_3_0, 
                              		"LUA_NAME");
                      	    
                    }

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3034:2: ( (lv_arguments_4_0= ruleFunctioncall_Arguments ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3035:1: (lv_arguments_4_0= ruleFunctioncall_Arguments )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3035:1: (lv_arguments_4_0= ruleFunctioncall_Arguments )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3036:3: lv_arguments_4_0= ruleFunctioncall_Arguments
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_FunctioncallAccess().getArgumentsFunctioncall_ArgumentsParserRuleCall_1_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFunctioncall_Arguments_in_ruleExpression_Functioncall6432);
                    lv_arguments_4_0=ruleFunctioncall_Arguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_FunctioncallRule());
                      	        }
                             		set(
                             			current, 
                             			"arguments",
                              		lv_arguments_4_0, 
                              		"Functioncall_Arguments");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3053:6: ( () ( (lv_arguments_6_0= ruleFunctioncall_Arguments ) ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3053:6: ( () ( (lv_arguments_6_0= ruleFunctioncall_Arguments ) ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3053:7: () ( (lv_arguments_6_0= ruleFunctioncall_Arguments ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3053:7: ()
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3054:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getExpression_FunctioncallAccess().getExpression_CallFunctionObjectAction_1_1_0(),
                                  current);
                          
                    }

                    }

                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3062:2: ( (lv_arguments_6_0= ruleFunctioncall_Arguments ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3063:1: (lv_arguments_6_0= ruleFunctioncall_Arguments )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3063:1: (lv_arguments_6_0= ruleFunctioncall_Arguments )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3064:3: lv_arguments_6_0= ruleFunctioncall_Arguments
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpression_FunctioncallAccess().getArgumentsFunctioncall_ArgumentsParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFunctioncall_Arguments_in_ruleExpression_Functioncall6473);
                    lv_arguments_6_0=ruleFunctioncall_Arguments();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpression_FunctioncallRule());
                      	        }
                             		set(
                             			current, 
                             			"arguments",
                              		lv_arguments_6_0, 
                              		"Functioncall_Arguments");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression_Functioncall"


    // $ANTLR start "entryRuleExpression_AccessMemberOrArrayElement"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3088:1: entryRuleExpression_AccessMemberOrArrayElement returns [EObject current=null] : iv_ruleExpression_AccessMemberOrArrayElement= ruleExpression_AccessMemberOrArrayElement EOF ;
    public final EObject entryRuleExpression_AccessMemberOrArrayElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_AccessMemberOrArrayElement = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3089:2: (iv_ruleExpression_AccessMemberOrArrayElement= ruleExpression_AccessMemberOrArrayElement EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3090:2: iv_ruleExpression_AccessMemberOrArrayElement= ruleExpression_AccessMemberOrArrayElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_AccessMemberOrArrayElementRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_AccessMemberOrArrayElement_in_entryRuleExpression_AccessMemberOrArrayElement6512);
            iv_ruleExpression_AccessMemberOrArrayElement=ruleExpression_AccessMemberOrArrayElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_AccessMemberOrArrayElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_AccessMemberOrArrayElement6522); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression_AccessMemberOrArrayElement"


    // $ANTLR start "ruleExpression_AccessMemberOrArrayElement"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3097:1: ruleExpression_AccessMemberOrArrayElement returns [EObject current=null] : (this_Expression_VariableName_0= ruleExpression_VariableName ( (otherlv_1= '[' () ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' ) | (otherlv_5= '.' () ( (lv_memberName_7_0= RULE_LUA_NAME ) ) ) )* ) ;
    public final EObject ruleExpression_AccessMemberOrArrayElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_memberName_7_0=null;
        EObject this_Expression_VariableName_0 = null;

        EObject lv_index_3_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3100:28: ( (this_Expression_VariableName_0= ruleExpression_VariableName ( (otherlv_1= '[' () ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' ) | (otherlv_5= '.' () ( (lv_memberName_7_0= RULE_LUA_NAME ) ) ) )* ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3101:1: (this_Expression_VariableName_0= ruleExpression_VariableName ( (otherlv_1= '[' () ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' ) | (otherlv_5= '.' () ( (lv_memberName_7_0= RULE_LUA_NAME ) ) ) )* )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3101:1: (this_Expression_VariableName_0= ruleExpression_VariableName ( (otherlv_1= '[' () ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' ) | (otherlv_5= '.' () ( (lv_memberName_7_0= RULE_LUA_NAME ) ) ) )* )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3102:2: this_Expression_VariableName_0= ruleExpression_VariableName ( (otherlv_1= '[' () ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' ) | (otherlv_5= '.' () ( (lv_memberName_7_0= RULE_LUA_NAME ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_VariableNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpression_VariableName_in_ruleExpression_AccessMemberOrArrayElement6572);
            this_Expression_VariableName_0=ruleExpression_VariableName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Expression_VariableName_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3113:1: ( (otherlv_1= '[' () ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' ) | (otherlv_5= '.' () ( (lv_memberName_7_0= RULE_LUA_NAME ) ) ) )*
            loop36:
            do {
                int alt36=3;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==58) ) {
                    alt36=1;
                }
                else if ( (LA36_0==32) ) {
                    alt36=2;
                }


                switch (alt36) {
            	case 1 :
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3113:2: (otherlv_1= '[' () ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3113:2: (otherlv_1= '[' () ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']' )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3113:4: otherlv_1= '[' () ( (lv_index_3_0= ruleExpression ) ) otherlv_4= ']'
            	    {
            	    otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleExpression_AccessMemberOrArrayElement6585); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getLeftSquareBracketKeyword_1_0_0());
            	          
            	    }
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3117:1: ()
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3118:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessArrayArrayAction_1_0_1(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3126:2: ( (lv_index_3_0= ruleExpression ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3127:1: (lv_index_3_0= ruleExpression )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3127:1: (lv_index_3_0= ruleExpression )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3128:3: lv_index_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getIndexExpressionParserRuleCall_1_0_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_AccessMemberOrArrayElement6618);
            	    lv_index_3_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpression_AccessMemberOrArrayElementRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"index",
            	              		lv_index_3_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,59,FOLLOW_59_in_ruleExpression_AccessMemberOrArrayElement6630); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getRightSquareBracketKeyword_1_0_3());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3149:6: (otherlv_5= '.' () ( (lv_memberName_7_0= RULE_LUA_NAME ) ) )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3149:6: (otherlv_5= '.' () ( (lv_memberName_7_0= RULE_LUA_NAME ) ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3149:8: otherlv_5= '.' () ( (lv_memberName_7_0= RULE_LUA_NAME ) )
            	    {
            	    otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleExpression_AccessMemberOrArrayElement6650); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getFullStopKeyword_1_1_0());
            	          
            	    }
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3153:1: ()
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3154:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getExpression_AccessMemberObjectAction_1_1_1(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3162:2: ( (lv_memberName_7_0= RULE_LUA_NAME ) )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3163:1: (lv_memberName_7_0= RULE_LUA_NAME )
            	    {
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3163:1: (lv_memberName_7_0= RULE_LUA_NAME )
            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3164:3: lv_memberName_7_0= RULE_LUA_NAME
            	    {
            	    lv_memberName_7_0=(Token)match(input,RULE_LUA_NAME,FOLLOW_RULE_LUA_NAME_in_ruleExpression_AccessMemberOrArrayElement6679); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_memberName_7_0, grammarAccess.getExpression_AccessMemberOrArrayElementAccess().getMemberNameLUA_NAMETerminalRuleCall_1_1_2_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getExpression_AccessMemberOrArrayElementRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"memberName",
            	              		lv_memberName_7_0, 
            	              		"LUA_NAME");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression_AccessMemberOrArrayElement"


    // $ANTLR start "entryRuleExpression_VariableName"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3188:1: entryRuleExpression_VariableName returns [EObject current=null] : iv_ruleExpression_VariableName= ruleExpression_VariableName EOF ;
    public final EObject entryRuleExpression_VariableName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression_VariableName = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3189:2: (iv_ruleExpression_VariableName= ruleExpression_VariableName EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3190:2: iv_ruleExpression_VariableName= ruleExpression_VariableName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpression_VariableNameRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_VariableName_in_entryRuleExpression_VariableName6723);
            iv_ruleExpression_VariableName=ruleExpression_VariableName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression_VariableName; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression_VariableName6733); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression_VariableName"


    // $ANTLR start "ruleExpression_VariableName"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3197:1: ruleExpression_VariableName returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_variable_4_0= RULE_LUA_NAME ) ) ) ) ;
    public final EObject ruleExpression_VariableName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_variable_4_0=null;
        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3200:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_variable_4_0= RULE_LUA_NAME ) ) ) ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3201:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_variable_4_0= RULE_LUA_NAME ) ) ) )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3201:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_variable_4_0= RULE_LUA_NAME ) ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==60) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_LUA_NAME) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3201:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3201:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3201:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleExpression_VariableName6771); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getExpression_VariableNameAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpression_VariableNameAccess().getExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleExpression_VariableName6796);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleExpression_VariableName6807); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getExpression_VariableNameAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3222:6: ( () ( (lv_variable_4_0= RULE_LUA_NAME ) ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3222:6: ( () ( (lv_variable_4_0= RULE_LUA_NAME ) ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3222:7: () ( (lv_variable_4_0= RULE_LUA_NAME ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3222:7: ()
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3223:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExpression_VariableNameAccess().getExpression_VariableNameAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3231:2: ( (lv_variable_4_0= RULE_LUA_NAME ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3232:1: (lv_variable_4_0= RULE_LUA_NAME )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3232:1: (lv_variable_4_0= RULE_LUA_NAME )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3233:3: lv_variable_4_0= RULE_LUA_NAME
                    {
                    lv_variable_4_0=(Token)match(input,RULE_LUA_NAME,FOLLOW_RULE_LUA_NAME_in_ruleExpression_VariableName6844); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_variable_4_0, grammarAccess.getExpression_VariableNameAccess().getVariableLUA_NAMETerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExpression_VariableNameRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"variable",
                              		lv_variable_4_0, 
                              		"LUA_NAME");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression_VariableName"


    // $ANTLR start "entryRuleFunction"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3257:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3258:2: (iv_ruleFunction= ruleFunction EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3259:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction6886);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction6896); if (state.failed) return current;

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
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3266:1: ruleFunction returns [EObject current=null] : (otherlv_0= '(' ( ( (lv_parameters_1_0= RULE_LUA_NAME ) ) (otherlv_2= ',' ( (lv_parameters_3_0= RULE_LUA_NAME ) ) )* (otherlv_4= ',' )? )? ( (lv_varArgs_5_0= '...' ) )? otherlv_6= ')' ( (lv_body_7_0= ruleBlock ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_parameters_1_0=null;
        Token otherlv_2=null;
        Token lv_parameters_3_0=null;
        Token otherlv_4=null;
        Token lv_varArgs_5_0=null;
        Token otherlv_6=null;
        EObject lv_body_7_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3269:28: ( (otherlv_0= '(' ( ( (lv_parameters_1_0= RULE_LUA_NAME ) ) (otherlv_2= ',' ( (lv_parameters_3_0= RULE_LUA_NAME ) ) )* (otherlv_4= ',' )? )? ( (lv_varArgs_5_0= '...' ) )? otherlv_6= ')' ( (lv_body_7_0= ruleBlock ) ) ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3270:1: (otherlv_0= '(' ( ( (lv_parameters_1_0= RULE_LUA_NAME ) ) (otherlv_2= ',' ( (lv_parameters_3_0= RULE_LUA_NAME ) ) )* (otherlv_4= ',' )? )? ( (lv_varArgs_5_0= '...' ) )? otherlv_6= ')' ( (lv_body_7_0= ruleBlock ) ) )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3270:1: (otherlv_0= '(' ( ( (lv_parameters_1_0= RULE_LUA_NAME ) ) (otherlv_2= ',' ( (lv_parameters_3_0= RULE_LUA_NAME ) ) )* (otherlv_4= ',' )? )? ( (lv_varArgs_5_0= '...' ) )? otherlv_6= ')' ( (lv_body_7_0= ruleBlock ) ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3270:3: otherlv_0= '(' ( ( (lv_parameters_1_0= RULE_LUA_NAME ) ) (otherlv_2= ',' ( (lv_parameters_3_0= RULE_LUA_NAME ) ) )* (otherlv_4= ',' )? )? ( (lv_varArgs_5_0= '...' ) )? otherlv_6= ')' ( (lv_body_7_0= ruleBlock ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleFunction6933); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3274:1: ( ( (lv_parameters_1_0= RULE_LUA_NAME ) ) (otherlv_2= ',' ( (lv_parameters_3_0= RULE_LUA_NAME ) ) )* (otherlv_4= ',' )? )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_LUA_NAME) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3274:2: ( (lv_parameters_1_0= RULE_LUA_NAME ) ) (otherlv_2= ',' ( (lv_parameters_3_0= RULE_LUA_NAME ) ) )* (otherlv_4= ',' )?
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3274:2: ( (lv_parameters_1_0= RULE_LUA_NAME ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3275:1: (lv_parameters_1_0= RULE_LUA_NAME )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3275:1: (lv_parameters_1_0= RULE_LUA_NAME )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3276:3: lv_parameters_1_0= RULE_LUA_NAME
                    {
                    lv_parameters_1_0=(Token)match(input,RULE_LUA_NAME,FOLLOW_RULE_LUA_NAME_in_ruleFunction6951); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_parameters_1_0, grammarAccess.getFunctionAccess().getParametersLUA_NAMETerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionRule());
                      	        }
                             		addWithLastConsumed(
                             			current, 
                             			"parameters",
                              		lv_parameters_1_0, 
                              		"LUA_NAME");
                      	    
                    }

                    }


                    }

                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3292:2: (otherlv_2= ',' ( (lv_parameters_3_0= RULE_LUA_NAME ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==17) ) {
                            int LA38_1 = input.LA(2);

                            if ( (LA38_1==RULE_LUA_NAME) ) {
                                alt38=1;
                            }


                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3292:4: otherlv_2= ',' ( (lv_parameters_3_0= RULE_LUA_NAME ) )
                    	    {
                    	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleFunction6969); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getCommaKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3296:1: ( (lv_parameters_3_0= RULE_LUA_NAME ) )
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3297:1: (lv_parameters_3_0= RULE_LUA_NAME )
                    	    {
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3297:1: (lv_parameters_3_0= RULE_LUA_NAME )
                    	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3298:3: lv_parameters_3_0= RULE_LUA_NAME
                    	    {
                    	    lv_parameters_3_0=(Token)match(input,RULE_LUA_NAME,FOLLOW_RULE_LUA_NAME_in_ruleFunction6986); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      			newLeafNode(lv_parameters_3_0, grammarAccess.getFunctionAccess().getParametersLUA_NAMETerminalRuleCall_1_1_1_0()); 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getFunctionRule());
                    	      	        }
                    	             		addWithLastConsumed(
                    	             			current, 
                    	             			"parameters",
                    	              		lv_parameters_3_0, 
                    	              		"LUA_NAME");
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3314:4: (otherlv_4= ',' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==17) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3314:6: otherlv_4= ','
                            {
                            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleFunction7006); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_1_2());
                                  
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3318:5: ( (lv_varArgs_5_0= '...' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==55) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3319:1: (lv_varArgs_5_0= '...' )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3319:1: (lv_varArgs_5_0= '...' )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3320:3: lv_varArgs_5_0= '...'
                    {
                    lv_varArgs_5_0=(Token)match(input,55,FOLLOW_55_in_ruleFunction7028); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_varArgs_5_0, grammarAccess.getFunctionAccess().getVarArgsFullStopFullStopFullStopKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFunctionRule());
                      	        }
                             		setWithLastConsumed(current, "varArgs", true, "...");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,61,FOLLOW_61_in_ruleFunction7054); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3337:1: ( (lv_body_7_0= ruleBlock ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3338:1: (lv_body_7_0= ruleBlock )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3338:1: (lv_body_7_0= ruleBlock )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3339:3: lv_body_7_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionAccess().getBodyBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleFunction7075);
            lv_body_7_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_7_0, 
                      		"Block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleFunctioncall_Arguments"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3363:1: entryRuleFunctioncall_Arguments returns [EObject current=null] : iv_ruleFunctioncall_Arguments= ruleFunctioncall_Arguments EOF ;
    public final EObject entryRuleFunctioncall_Arguments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctioncall_Arguments = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3364:2: (iv_ruleFunctioncall_Arguments= ruleFunctioncall_Arguments EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3365:2: iv_ruleFunctioncall_Arguments= ruleFunctioncall_Arguments EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctioncall_ArgumentsRule()); 
            }
            pushFollow(FOLLOW_ruleFunctioncall_Arguments_in_entryRuleFunctioncall_Arguments7111);
            iv_ruleFunctioncall_Arguments=ruleFunctioncall_Arguments();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctioncall_Arguments; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctioncall_Arguments7121); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctioncall_Arguments"


    // $ANTLR start "ruleFunctioncall_Arguments"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3372:1: ruleFunctioncall_Arguments returns [EObject current=null] : ( () ( (otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) | ( (lv_arguments_6_0= ruleExpression_TableConstructor ) ) | ( (lv_arguments_7_0= ruleExpression_String ) ) ) ) ;
    public final EObject ruleFunctioncall_Arguments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_6_0 = null;

        EObject lv_arguments_7_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3375:28: ( ( () ( (otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) | ( (lv_arguments_6_0= ruleExpression_TableConstructor ) ) | ( (lv_arguments_7_0= ruleExpression_String ) ) ) ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3376:1: ( () ( (otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) | ( (lv_arguments_6_0= ruleExpression_TableConstructor ) ) | ( (lv_arguments_7_0= ruleExpression_String ) ) ) )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3376:1: ( () ( (otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) | ( (lv_arguments_6_0= ruleExpression_TableConstructor ) ) | ( (lv_arguments_7_0= ruleExpression_String ) ) ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3376:2: () ( (otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) | ( (lv_arguments_6_0= ruleExpression_TableConstructor ) ) | ( (lv_arguments_7_0= ruleExpression_String ) ) )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3376:2: ()
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3377:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFunctioncall_ArgumentsAccess().getFunctioncall_ArgumentsAction_0(),
                          current);
                  
            }

            }

            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3385:2: ( (otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' ) | ( (lv_arguments_6_0= ruleExpression_TableConstructor ) ) | ( (lv_arguments_7_0= ruleExpression_String ) ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt44=1;
                }
                break;
            case 56:
                {
                alt44=2;
                }
                break;
            case RULE_LUA_STRING:
                {
                alt44=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3385:3: (otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3385:3: (otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')' )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3385:5: otherlv_1= '(' ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleFunctioncall_Arguments7172); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getFunctioncall_ArgumentsAccess().getLeftParenthesisKeyword_1_0_0());
                          
                    }
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3389:1: ( ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )* )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( ((LA43_0>=RULE_LUA_NAME && LA43_0<=RULE_LUA_STRING)||LA43_0==31||LA43_0==45||(LA43_0>=49 && LA43_0<=50)||(LA43_0>=52 && LA43_0<=56)||LA43_0==60) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3389:2: ( (lv_arguments_2_0= ruleExpression ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                            {
                            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3389:2: ( (lv_arguments_2_0= ruleExpression ) )
                            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3390:1: (lv_arguments_2_0= ruleExpression )
                            {
                            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3390:1: (lv_arguments_2_0= ruleExpression )
                            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3391:3: lv_arguments_2_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFunctioncall_ArgumentsAccess().getArgumentsExpressionParserRuleCall_1_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleFunctioncall_Arguments7194);
                            lv_arguments_2_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFunctioncall_ArgumentsRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"arguments",
                                      		lv_arguments_2_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3407:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) ) )*
                            loop42:
                            do {
                                int alt42=2;
                                int LA42_0 = input.LA(1);

                                if ( (LA42_0==17) ) {
                                    alt42=1;
                                }


                                switch (alt42) {
                            	case 1 :
                            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3407:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleExpression ) )
                            	    {
                            	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleFunctioncall_Arguments7207); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_3, grammarAccess.getFunctioncall_ArgumentsAccess().getCommaKeyword_1_0_1_1_0());
                            	          
                            	    }
                            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3411:1: ( (lv_arguments_4_0= ruleExpression ) )
                            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3412:1: (lv_arguments_4_0= ruleExpression )
                            	    {
                            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3412:1: (lv_arguments_4_0= ruleExpression )
                            	    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3413:3: lv_arguments_4_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getFunctioncall_ArgumentsAccess().getArgumentsExpressionParserRuleCall_1_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleFunctioncall_Arguments7228);
                            	    lv_arguments_4_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getFunctioncall_ArgumentsRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"arguments",
                            	              		lv_arguments_4_0, 
                            	              		"Expression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop42;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,61,FOLLOW_61_in_ruleFunctioncall_Arguments7244); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getFunctioncall_ArgumentsAccess().getRightParenthesisKeyword_1_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3434:6: ( (lv_arguments_6_0= ruleExpression_TableConstructor ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3434:6: ( (lv_arguments_6_0= ruleExpression_TableConstructor ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3435:1: (lv_arguments_6_0= ruleExpression_TableConstructor )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3435:1: (lv_arguments_6_0= ruleExpression_TableConstructor )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3436:3: lv_arguments_6_0= ruleExpression_TableConstructor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctioncall_ArgumentsAccess().getArgumentsExpression_TableConstructorParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_TableConstructor_in_ruleFunctioncall_Arguments7272);
                    lv_arguments_6_0=ruleExpression_TableConstructor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctioncall_ArgumentsRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_6_0, 
                              		"Expression_TableConstructor");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3453:6: ( (lv_arguments_7_0= ruleExpression_String ) )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3453:6: ( (lv_arguments_7_0= ruleExpression_String ) )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3454:1: (lv_arguments_7_0= ruleExpression_String )
                    {
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3454:1: (lv_arguments_7_0= ruleExpression_String )
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3455:3: lv_arguments_7_0= ruleExpression_String
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctioncall_ArgumentsAccess().getArgumentsExpression_StringParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_String_in_ruleFunctioncall_Arguments7299);
                    lv_arguments_7_0=ruleExpression_String();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctioncall_ArgumentsRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_7_0, 
                              		"Expression_String");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFunctioncall_Arguments"


    // $ANTLR start "entryRuleField"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3479:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3480:2: (iv_ruleField= ruleField EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3481:2: iv_ruleField= ruleField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldRule()); 
            }
            pushFollow(FOLLOW_ruleField_in_entryRuleField7336);
            iv_ruleField=ruleField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField7346); if (state.failed) return current;

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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3488:1: ruleField returns [EObject current=null] : (this_Field_AddEntryToTable_Brackets_0= ruleField_AddEntryToTable_Brackets | this_Field_AddEntryToTable_1= ruleField_AddEntryToTable | this_Field_AppendEntryToTable_2= ruleField_AppendEntryToTable ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        EObject this_Field_AddEntryToTable_Brackets_0 = null;

        EObject this_Field_AddEntryToTable_1 = null;

        EObject this_Field_AppendEntryToTable_2 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3491:28: ( (this_Field_AddEntryToTable_Brackets_0= ruleField_AddEntryToTable_Brackets | this_Field_AddEntryToTable_1= ruleField_AddEntryToTable | this_Field_AppendEntryToTable_2= ruleField_AppendEntryToTable ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3492:1: (this_Field_AddEntryToTable_Brackets_0= ruleField_AddEntryToTable_Brackets | this_Field_AddEntryToTable_1= ruleField_AddEntryToTable | this_Field_AppendEntryToTable_2= ruleField_AppendEntryToTable )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3492:1: (this_Field_AddEntryToTable_Brackets_0= ruleField_AddEntryToTable_Brackets | this_Field_AddEntryToTable_1= ruleField_AddEntryToTable | this_Field_AppendEntryToTable_2= ruleField_AppendEntryToTable )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt45=1;
                }
                break;
            case RULE_LUA_NAME:
                {
                int LA45_2 = input.LA(2);

                if ( (LA45_2==29) ) {
                    alt45=2;
                }
                else if ( (LA45_2==EOF||LA45_2==RULE_LUA_STRING||LA45_2==15||LA45_2==17||(LA45_2>=32 && LA45_2<=33)||(LA45_2>=35 && LA45_2<=48)||LA45_2==51||(LA45_2>=56 && LA45_2<=58)||LA45_2==60) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_LUA_NUMBER:
            case RULE_LUA_STRING:
            case 31:
            case 45:
            case 49:
            case 50:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 60:
                {
                alt45=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3493:2: this_Field_AddEntryToTable_Brackets_0= ruleField_AddEntryToTable_Brackets
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldAccess().getField_AddEntryToTable_BracketsParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleField_AddEntryToTable_Brackets_in_ruleField7396);
                    this_Field_AddEntryToTable_Brackets_0=ruleField_AddEntryToTable_Brackets();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Field_AddEntryToTable_Brackets_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3506:2: this_Field_AddEntryToTable_1= ruleField_AddEntryToTable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldAccess().getField_AddEntryToTableParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleField_AddEntryToTable_in_ruleField7426);
                    this_Field_AddEntryToTable_1=ruleField_AddEntryToTable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Field_AddEntryToTable_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3519:2: this_Field_AppendEntryToTable_2= ruleField_AppendEntryToTable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFieldAccess().getField_AppendEntryToTableParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleField_AppendEntryToTable_in_ruleField7456);
                    this_Field_AppendEntryToTable_2=ruleField_AppendEntryToTable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Field_AppendEntryToTable_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleField_AddEntryToTable_Brackets"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3538:1: entryRuleField_AddEntryToTable_Brackets returns [EObject current=null] : iv_ruleField_AddEntryToTable_Brackets= ruleField_AddEntryToTable_Brackets EOF ;
    public final EObject entryRuleField_AddEntryToTable_Brackets() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField_AddEntryToTable_Brackets = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3539:2: (iv_ruleField_AddEntryToTable_Brackets= ruleField_AddEntryToTable_Brackets EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3540:2: iv_ruleField_AddEntryToTable_Brackets= ruleField_AddEntryToTable_Brackets EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getField_AddEntryToTable_BracketsRule()); 
            }
            pushFollow(FOLLOW_ruleField_AddEntryToTable_Brackets_in_entryRuleField_AddEntryToTable_Brackets7491);
            iv_ruleField_AddEntryToTable_Brackets=ruleField_AddEntryToTable_Brackets();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField_AddEntryToTable_Brackets; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField_AddEntryToTable_Brackets7501); if (state.failed) return current;

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
    // $ANTLR end "entryRuleField_AddEntryToTable_Brackets"


    // $ANTLR start "ruleField_AddEntryToTable_Brackets"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3547:1: ruleField_AddEntryToTable_Brackets returns [EObject current=null] : (otherlv_0= '[' ( (lv_indexExpression_1_0= ruleExpression ) ) otherlv_2= ']' otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) ;
    public final EObject ruleField_AddEntryToTable_Brackets() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_indexExpression_1_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3550:28: ( (otherlv_0= '[' ( (lv_indexExpression_1_0= ruleExpression ) ) otherlv_2= ']' otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3551:1: (otherlv_0= '[' ( (lv_indexExpression_1_0= ruleExpression ) ) otherlv_2= ']' otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3551:1: (otherlv_0= '[' ( (lv_indexExpression_1_0= ruleExpression ) ) otherlv_2= ']' otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3551:3: otherlv_0= '[' ( (lv_indexExpression_1_0= ruleExpression ) ) otherlv_2= ']' otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleField_AddEntryToTable_Brackets7538); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getField_AddEntryToTable_BracketsAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3555:1: ( (lv_indexExpression_1_0= ruleExpression ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3556:1: (lv_indexExpression_1_0= ruleExpression )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3556:1: (lv_indexExpression_1_0= ruleExpression )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3557:3: lv_indexExpression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getField_AddEntryToTable_BracketsAccess().getIndexExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleField_AddEntryToTable_Brackets7559);
            lv_indexExpression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getField_AddEntryToTable_BracketsRule());
              	        }
                     		set(
                     			current, 
                     			"indexExpression",
                      		lv_indexExpression_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleField_AddEntryToTable_Brackets7571); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getField_AddEntryToTable_BracketsAccess().getRightSquareBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleField_AddEntryToTable_Brackets7583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getField_AddEntryToTable_BracketsAccess().getEqualsSignKeyword_3());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3581:1: ( (lv_value_4_0= ruleExpression ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3582:1: (lv_value_4_0= ruleExpression )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3582:1: (lv_value_4_0= ruleExpression )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3583:3: lv_value_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getField_AddEntryToTable_BracketsAccess().getValueExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleField_AddEntryToTable_Brackets7604);
            lv_value_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getField_AddEntryToTable_BracketsRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_4_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleField_AddEntryToTable_Brackets"


    // $ANTLR start "entryRuleField_AddEntryToTable"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3607:1: entryRuleField_AddEntryToTable returns [EObject current=null] : iv_ruleField_AddEntryToTable= ruleField_AddEntryToTable EOF ;
    public final EObject entryRuleField_AddEntryToTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField_AddEntryToTable = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3608:2: (iv_ruleField_AddEntryToTable= ruleField_AddEntryToTable EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3609:2: iv_ruleField_AddEntryToTable= ruleField_AddEntryToTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getField_AddEntryToTableRule()); 
            }
            pushFollow(FOLLOW_ruleField_AddEntryToTable_in_entryRuleField_AddEntryToTable7640);
            iv_ruleField_AddEntryToTable=ruleField_AddEntryToTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField_AddEntryToTable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField_AddEntryToTable7650); if (state.failed) return current;

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
    // $ANTLR end "entryRuleField_AddEntryToTable"


    // $ANTLR start "ruleField_AddEntryToTable"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3616:1: ruleField_AddEntryToTable returns [EObject current=null] : ( ( (lv_key_0_0= RULE_LUA_NAME ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleField_AddEntryToTable() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3619:28: ( ( ( (lv_key_0_0= RULE_LUA_NAME ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3620:1: ( ( (lv_key_0_0= RULE_LUA_NAME ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3620:1: ( ( (lv_key_0_0= RULE_LUA_NAME ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3620:2: ( (lv_key_0_0= RULE_LUA_NAME ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3620:2: ( (lv_key_0_0= RULE_LUA_NAME ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3621:1: (lv_key_0_0= RULE_LUA_NAME )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3621:1: (lv_key_0_0= RULE_LUA_NAME )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3622:3: lv_key_0_0= RULE_LUA_NAME
            {
            lv_key_0_0=(Token)match(input,RULE_LUA_NAME,FOLLOW_RULE_LUA_NAME_in_ruleField_AddEntryToTable7692); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_key_0_0, grammarAccess.getField_AddEntryToTableAccess().getKeyLUA_NAMETerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getField_AddEntryToTableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"key",
                      		lv_key_0_0, 
                      		"LUA_NAME");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleField_AddEntryToTable7709); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getField_AddEntryToTableAccess().getEqualsSignKeyword_1());
                  
            }
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3642:1: ( (lv_value_2_0= ruleExpression ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3643:1: (lv_value_2_0= ruleExpression )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3643:1: (lv_value_2_0= ruleExpression )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3644:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getField_AddEntryToTableAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleField_AddEntryToTable7730);
            lv_value_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getField_AddEntryToTableRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleField_AddEntryToTable"


    // $ANTLR start "entryRuleField_AppendEntryToTable"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3668:1: entryRuleField_AppendEntryToTable returns [EObject current=null] : iv_ruleField_AppendEntryToTable= ruleField_AppendEntryToTable EOF ;
    public final EObject entryRuleField_AppendEntryToTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField_AppendEntryToTable = null;


        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3669:2: (iv_ruleField_AppendEntryToTable= ruleField_AppendEntryToTable EOF )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3670:2: iv_ruleField_AppendEntryToTable= ruleField_AppendEntryToTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getField_AppendEntryToTableRule()); 
            }
            pushFollow(FOLLOW_ruleField_AppendEntryToTable_in_entryRuleField_AppendEntryToTable7766);
            iv_ruleField_AppendEntryToTable=ruleField_AppendEntryToTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleField_AppendEntryToTable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleField_AppendEntryToTable7776); if (state.failed) return current;

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
    // $ANTLR end "entryRuleField_AppendEntryToTable"


    // $ANTLR start "ruleField_AppendEntryToTable"
    // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3677:1: ruleField_AppendEntryToTable returns [EObject current=null] : ( (lv_value_0_0= ruleExpression ) ) ;
    public final EObject ruleField_AppendEntryToTable() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3680:28: ( ( (lv_value_0_0= ruleExpression ) ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3681:1: ( (lv_value_0_0= ruleExpression ) )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3681:1: ( (lv_value_0_0= ruleExpression ) )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3682:1: (lv_value_0_0= ruleExpression )
            {
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3682:1: (lv_value_0_0= ruleExpression )
            // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3683:3: lv_value_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getField_AppendEntryToTableAccess().getValueExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleField_AppendEntryToTable7821);
            lv_value_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getField_AppendEntryToTableRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleField_AppendEntryToTable"

    // $ANTLR start synpred63_InternalLua
    public final void synpred63_InternalLua_fragment() throws RecognitionException {   
        EObject lv_arguments_6_0 = null;


        // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3053:6: ( ( () ( (lv_arguments_6_0= ruleFunctioncall_Arguments ) ) ) )
        // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3053:6: ( () ( (lv_arguments_6_0= ruleFunctioncall_Arguments ) ) )
        {
        // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3053:6: ( () ( (lv_arguments_6_0= ruleFunctioncall_Arguments ) ) )
        // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3053:7: () ( (lv_arguments_6_0= ruleFunctioncall_Arguments ) )
        {
        // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3053:7: ()
        // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3054:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3062:2: ( (lv_arguments_6_0= ruleFunctioncall_Arguments ) )
        // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3063:1: (lv_arguments_6_0= ruleFunctioncall_Arguments )
        {
        // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3063:1: (lv_arguments_6_0= ruleFunctioncall_Arguments )
        // ../be.kuleuven.rodinia.dsl.lua/src-gen/be/kuleuven/rodinia/dsl/parser/antlr/internal/InternalLua.g:3064:3: lv_arguments_6_0= ruleFunctioncall_Arguments
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExpression_FunctioncallAccess().getArgumentsFunctioncall_ArgumentsParserRuleCall_1_1_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleFunctioncall_Arguments_in_synpred63_InternalLua6473);
        lv_arguments_6_0=ruleFunctioncall_Arguments();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred63_InternalLua

    // Delegated rules

    public final boolean synpred63_InternalLua() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalLua_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String DFA8_eotS =
        "\16\uffff";
    static final String DFA8_eofS =
        "\16\uffff";
    static final String DFA8_minS =
        "\1\4\4\uffff\1\4\1\uffff\1\4\1\uffff\1\21\4\uffff";
    static final String DFA8_maxS =
        "\1\74\4\uffff\1\4\1\uffff\1\37\1\uffff\1\36\4\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\uffff\1\12\1\uffff\1\11\1"+
        "\10\1\5\1\6";
    static final String DFA8_specialS =
        "\16\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\10\16\uffff\1\1\1\uffff\1\2\1\3\1\uffff\1\4\3\uffff\1\5\2"+
            "\uffff\1\6\2\uffff\1\7\31\uffff\1\10",
            "",
            "",
            "",
            "",
            "\1\11",
            "",
            "\1\12\32\uffff\1\13",
            "",
            "\1\15\13\uffff\1\14\1\15",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "374:1: (this_Statement_Block_0= ruleStatement_Block | this_Statement_While_1= ruleStatement_While | this_Statement_Repeat_2= ruleStatement_Repeat | this_Statement_If_Then_Else_3= ruleStatement_If_Then_Else | this_Statement_For_Numeric_4= ruleStatement_For_Numeric | this_Statement_For_Generic_5= ruleStatement_For_Generic | this_Statement_GlobalFunction_Declaration_6= ruleStatement_GlobalFunction_Declaration | this_Statement_LocalFunction_Declaration_7= ruleStatement_LocalFunction_Declaration | this_Statement_Local_Variable_Declaration_8= ruleStatement_Local_Variable_Declaration | this_Statement_FunctioncallOrAssignment_9= ruleStatement_FunctioncallOrAssignment )";
        }
    }
    static final String DFA35_eotS =
        "\51\uffff";
    static final String DFA35_eofS =
        "\1\5\50\uffff";
    static final String DFA35_minS =
        "\1\4\1\uffff\1\0\46\uffff";
    static final String DFA35_maxS =
        "\1\75\1\uffff\1\0\46\uffff";
    static final String DFA35_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\uffff\1\3\43\uffff";
    static final String DFA35_specialS =
        "\2\uffff\1\0\46\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\5\1\uffff\1\3\10\uffff\16\5\2\uffff\1\5\1\uffff\1\1\17\5"+
            "\2\uffff\1\5\4\uffff\1\3\1\5\1\uffff\1\5\1\2\1\5",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "3003:1: ( (otherlv_1= ':' () ( (lv_memberFunctionName_3_0= RULE_LUA_NAME ) ) ( (lv_arguments_4_0= ruleFunctioncall_Arguments ) ) ) | ( () ( (lv_arguments_6_0= ruleFunctioncall_Arguments ) ) ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_2 = input.LA(1);

                         
                        int index35_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalLua()) ) {s = 3;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index35_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleChunk_in_entryRuleChunk87 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChunk97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleChunk150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleBlock267 = new BitSet(new long[]{0x10000004916D8012L});
    public static final BitSet FOLLOW_15_in_ruleBlock280 = new BitSet(new long[]{0x10000004916D8012L});
    public static final BitSet FOLLOW_ruleLastStatement_in_ruleBlock306 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleBlock319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLastStatement_in_entryRuleLastStatement363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLastStatement373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLastStatement_Return_in_ruleLastStatement423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLastStatement_Break_in_ruleLastStatement453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLastStatement_Return_in_entryRuleLastStatement_Return488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLastStatement_Return498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleLastStatement_Return535 = new BitSet(new long[]{0x11F62006916D8072L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLastStatement_Return569 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleLastStatement_Return582 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLastStatement_Return603 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleLastStatement_Break_in_entryRuleLastStatement_Break643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLastStatement_Break653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleLastStatement_Break690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_Block_in_ruleStatement808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_While_in_ruleStatement838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_Repeat_in_ruleStatement868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_If_Then_Else_in_ruleStatement898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_For_Numeric_in_ruleStatement928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_For_Generic_in_ruleStatement958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_GlobalFunction_Declaration_in_ruleStatement988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_LocalFunction_Declaration_in_ruleStatement1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_Local_Variable_Declaration_in_ruleStatement1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_FunctioncallOrAssignment_in_ruleStatement1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_Block_in_entryRuleStatement_Block1117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement_Block1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleStatement_Block1164 = new BitSet(new long[]{0x10000004916D8010L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleStatement_Block1185 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStatement_Block1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_While_in_entryRuleStatement_While1233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement_While1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleStatement_While1280 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement_While1301 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStatement_While1313 = new BitSet(new long[]{0x10000004916D8010L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleStatement_While1334 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStatement_While1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_Repeat_in_entryRuleStatement_Repeat1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement_Repeat1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleStatement_Repeat1429 = new BitSet(new long[]{0x10000004916D8010L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleStatement_Repeat1450 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleStatement_Repeat1462 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement_Repeat1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_If_Then_Else_in_entryRuleStatement_If_Then_Else1519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement_If_Then_Else1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleStatement_If_Then_Else1566 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement_If_Then_Else1587 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleStatement_If_Then_Else1599 = new BitSet(new long[]{0x10000004916D8010L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleStatement_If_Then_Else1620 = new BitSet(new long[]{0x000000000C100000L});
    public static final BitSet FOLLOW_ruleStatement_If_Then_Else_ElseIfPart_in_ruleStatement_If_Then_Else1641 = new BitSet(new long[]{0x000000000C100000L});
    public static final BitSet FOLLOW_26_in_ruleStatement_If_Then_Else1655 = new BitSet(new long[]{0x10000004916D8010L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleStatement_If_Then_Else1676 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStatement_If_Then_Else1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_If_Then_Else_ElseIfPart_in_entryRuleStatement_If_Then_Else_ElseIfPart1726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement_If_Then_Else_ElseIfPart1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleStatement_If_Then_Else_ElseIfPart1773 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement_If_Then_Else_ElseIfPart1794 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleStatement_If_Then_Else_ElseIfPart1806 = new BitSet(new long[]{0x10000004916D8010L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleStatement_If_Then_Else_ElseIfPart1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_For_Numeric_in_entryRuleStatement_For_Numeric1863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement_For_Numeric1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleStatement_For_Numeric1910 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LUA_NAME_in_ruleStatement_For_Numeric1927 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleStatement_For_Numeric1944 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement_For_Numeric1965 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStatement_For_Numeric1977 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement_For_Numeric1998 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_17_in_ruleStatement_For_Numeric2011 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement_For_Numeric2032 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleStatement_For_Numeric2046 = new BitSet(new long[]{0x10000004916D8010L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleStatement_For_Numeric2067 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStatement_For_Numeric2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_For_Generic_in_entryRuleStatement_For_Generic2115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement_For_Generic2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleStatement_For_Generic2162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LUA_NAME_in_ruleStatement_For_Generic2179 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_17_in_ruleStatement_For_Generic2197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LUA_NAME_in_ruleStatement_For_Generic2214 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_30_in_ruleStatement_For_Generic2233 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement_For_Generic2254 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_17_in_ruleStatement_For_Generic2267 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement_For_Generic2288 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_19_in_ruleStatement_For_Generic2302 = new BitSet(new long[]{0x10000004916D8010L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleStatement_For_Generic2323 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStatement_For_Generic2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_GlobalFunction_Declaration_in_entryRuleStatement_GlobalFunction_Declaration2371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement_GlobalFunction_Declaration2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleStatement_GlobalFunction_Declaration2418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LUA_NAME_in_ruleStatement_GlobalFunction_Declaration2435 = new BitSet(new long[]{0x1000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleStatement_GlobalFunction_Declaration2453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LUA_NAME_in_ruleStatement_GlobalFunction_Declaration2470 = new BitSet(new long[]{0x1000000300000000L});
    public static final BitSet FOLLOW_33_in_ruleStatement_GlobalFunction_Declaration2490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LUA_NAME_in_ruleStatement_GlobalFunction_Declaration2507 = new BitSet(new long[]{0x1000000300000000L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleStatement_GlobalFunction_Declaration2535 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStatement_GlobalFunction_Declaration2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_LocalFunction_Declaration_in_entryRuleStatement_LocalFunction_Declaration2583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement_LocalFunction_Declaration2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleStatement_LocalFunction_Declaration2630 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleStatement_LocalFunction_Declaration2642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LUA_NAME_in_ruleStatement_LocalFunction_Declaration2659 = new BitSet(new long[]{0x1000000300000000L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleStatement_LocalFunction_Declaration2685 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleStatement_LocalFunction_Declaration2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_Local_Variable_Declaration_in_entryRuleStatement_Local_Variable_Declaration2733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement_Local_Variable_Declaration2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleStatement_Local_Variable_Declaration2780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LUA_NAME_in_ruleStatement_Local_Variable_Declaration2797 = new BitSet(new long[]{0x0000000020020002L});
    public static final BitSet FOLLOW_17_in_ruleStatement_Local_Variable_Declaration2815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LUA_NAME_in_ruleStatement_Local_Variable_Declaration2832 = new BitSet(new long[]{0x0000000020020002L});
    public static final BitSet FOLLOW_29_in_ruleStatement_Local_Variable_Declaration2852 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement_Local_Variable_Declaration2873 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleStatement_Local_Variable_Declaration2886 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement_Local_Variable_Declaration2907 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleStatement_FunctioncallOrAssignment_in_entryRuleStatement_FunctioncallOrAssignment2947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement_FunctioncallOrAssignment2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_AccessMemberOrArrayElement_in_ruleStatement_FunctioncallOrAssignment3007 = new BitSet(new long[]{0x1100000220020040L});
    public static final BitSet FOLLOW_17_in_ruleStatement_FunctioncallOrAssignment3033 = new BitSet(new long[]{0x10000004B16F8010L});
    public static final BitSet FOLLOW_ruleExpression_AccessMemberOrArrayElement_in_ruleStatement_FunctioncallOrAssignment3054 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_29_in_ruleStatement_FunctioncallOrAssignment3068 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement_FunctioncallOrAssignment3089 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleStatement_FunctioncallOrAssignment3102 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleStatement_FunctioncallOrAssignment3123 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_33_in_ruleStatement_FunctioncallOrAssignment3145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LUA_NAME_in_ruleStatement_FunctioncallOrAssignment3174 = new BitSet(new long[]{0x1100000000000040L});
    public static final BitSet FOLLOW_ruleFunctioncall_Arguments_in_ruleStatement_FunctioncallOrAssignment3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctioncall_Arguments_in_ruleStatement_FunctioncallOrAssignment3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression3285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_Or_in_ruleExpression3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_Or_in_entryRuleExpression_Or3386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_Or3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_And_in_ruleExpression_Or3446 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_ruleExpression_Or3458 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_And_in_ruleExpression_Or3491 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleExpression_And_in_entryRuleExpression_And3529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_And3539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_Compare_in_ruleExpression_And3589 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleExpression_And3601 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_Compare_in_ruleExpression_And3634 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleExpression_Compare_in_entryRuleExpression_Compare3672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_Compare3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_Concatenation_in_ruleExpression_Compare3732 = new BitSet(new long[]{0x000007E000000002L});
    public static final BitSet FOLLOW_37_in_ruleExpression_Compare3745 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_Concatenation_in_ruleExpression_Compare3778 = new BitSet(new long[]{0x000007E000000002L});
    public static final BitSet FOLLOW_38_in_ruleExpression_Compare3798 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_Concatenation_in_ruleExpression_Compare3831 = new BitSet(new long[]{0x000007E000000002L});
    public static final BitSet FOLLOW_39_in_ruleExpression_Compare3851 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_Concatenation_in_ruleExpression_Compare3884 = new BitSet(new long[]{0x000007E000000002L});
    public static final BitSet FOLLOW_40_in_ruleExpression_Compare3904 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_Concatenation_in_ruleExpression_Compare3937 = new BitSet(new long[]{0x000007E000000002L});
    public static final BitSet FOLLOW_41_in_ruleExpression_Compare3957 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_Concatenation_in_ruleExpression_Compare3990 = new BitSet(new long[]{0x000007E000000002L});
    public static final BitSet FOLLOW_42_in_ruleExpression_Compare4010 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_Concatenation_in_ruleExpression_Compare4043 = new BitSet(new long[]{0x000007E000000002L});
    public static final BitSet FOLLOW_ruleExpression_Concatenation_in_entryRuleExpression_Concatenation4082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_Concatenation4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_PlusMinus_in_ruleExpression_Concatenation4142 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_ruleExpression_Concatenation4154 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_Concatenation_in_ruleExpression_Concatenation4187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_PlusMinus_in_entryRuleExpression_PlusMinus4225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_PlusMinus4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_MultiplicationDivisionModulo_in_ruleExpression_PlusMinus4285 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_44_in_ruleExpression_PlusMinus4298 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_MultiplicationDivisionModulo_in_ruleExpression_PlusMinus4331 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_45_in_ruleExpression_PlusMinus4351 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_MultiplicationDivisionModulo_in_ruleExpression_PlusMinus4384 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_ruleExpression_MultiplicationDivisionModulo_in_entryRuleExpression_MultiplicationDivisionModulo4423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_MultiplicationDivisionModulo4433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_Unary_in_ruleExpression_MultiplicationDivisionModulo4483 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_46_in_ruleExpression_MultiplicationDivisionModulo4496 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_Unary_in_ruleExpression_MultiplicationDivisionModulo4529 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_47_in_ruleExpression_MultiplicationDivisionModulo4549 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_Unary_in_ruleExpression_MultiplicationDivisionModulo4582 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_48_in_ruleExpression_MultiplicationDivisionModulo4602 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_Unary_in_ruleExpression_MultiplicationDivisionModulo4635 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_ruleExpression_Unary_in_entryRuleExpression_Unary4674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_Unary4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_Exponentiation_in_ruleExpression_Unary4734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleExpression_Unary4752 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_Unary_in_ruleExpression_Unary4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleExpression_Unary4805 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_Unary_in_ruleExpression_Unary4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleExpression_Unary4858 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_Unary_in_ruleExpression_Unary4891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_Exponentiation_in_entryRuleExpression_Exponentiation4928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_Exponentiation4938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_Terminal_in_ruleExpression_Exponentiation4988 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_ruleExpression_Exponentiation5000 = new BitSet(new long[]{0x11F00006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_Exponentiation_in_ruleExpression_Exponentiation5033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_Terminal_in_entryRuleExpression_Terminal5071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_Terminal5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_Nil_in_ruleExpression_Terminal5131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_True_in_ruleExpression_Terminal5161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_False_in_ruleExpression_Terminal5191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_Number_in_ruleExpression_Terminal5221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_VarArgs_in_ruleExpression_Terminal5251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_String_in_ruleExpression_Terminal5281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_Function_in_ruleExpression_Terminal5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_TableConstructor_in_ruleExpression_Terminal5341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_Functioncall_in_ruleExpression_Terminal5371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_Nil_in_entryRuleExpression_Nil5406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_Nil5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleExpression_Nil5453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_True_in_entryRuleExpression_True5501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_True5511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleExpression_True5548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_False_in_entryRuleExpression_False5596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_False5606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleExpression_False5643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_Number_in_entryRuleExpression_Number5691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_Number5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LUA_NUMBER_in_ruleExpression_Number5742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_VarArgs_in_entryRuleExpression_VarArgs5782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_VarArgs5792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleExpression_VarArgs5829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_String_in_entryRuleExpression_String5877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_String5887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LUA_STRING_in_ruleExpression_String5928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_Function_in_entryRuleExpression_Function5968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_Function5978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleExpression_Function6015 = new BitSet(new long[]{0x1000000300000000L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleExpression_Function6036 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExpression_Function6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_TableConstructor_in_entryRuleExpression_TableConstructor6084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_TableConstructor6094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleExpression_TableConstructor6131 = new BitSet(new long[]{0x17F62006916D8070L});
    public static final BitSet FOLLOW_ruleField_in_ruleExpression_TableConstructor6165 = new BitSet(new long[]{0x0200000000028000L});
    public static final BitSet FOLLOW_17_in_ruleExpression_TableConstructor6179 = new BitSet(new long[]{0x15F62006916D8070L});
    public static final BitSet FOLLOW_15_in_ruleExpression_TableConstructor6197 = new BitSet(new long[]{0x15F62006916D8070L});
    public static final BitSet FOLLOW_ruleField_in_ruleExpression_TableConstructor6219 = new BitSet(new long[]{0x0200000000028000L});
    public static final BitSet FOLLOW_17_in_ruleExpression_TableConstructor6234 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_15_in_ruleExpression_TableConstructor6252 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleExpression_TableConstructor6268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_Functioncall_in_entryRuleExpression_Functioncall6304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_Functioncall6314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_AccessMemberOrArrayElement_in_ruleExpression_Functioncall6364 = new BitSet(new long[]{0x1100000200000042L});
    public static final BitSet FOLLOW_33_in_ruleExpression_Functioncall6377 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LUA_NAME_in_ruleExpression_Functioncall6406 = new BitSet(new long[]{0x1100000000000040L});
    public static final BitSet FOLLOW_ruleFunctioncall_Arguments_in_ruleExpression_Functioncall6432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctioncall_Arguments_in_ruleExpression_Functioncall6473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_AccessMemberOrArrayElement_in_entryRuleExpression_AccessMemberOrArrayElement6512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_AccessMemberOrArrayElement6522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_VariableName_in_ruleExpression_AccessMemberOrArrayElement6572 = new BitSet(new long[]{0x0400000100000002L});
    public static final BitSet FOLLOW_58_in_ruleExpression_AccessMemberOrArrayElement6585 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_AccessMemberOrArrayElement6618 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleExpression_AccessMemberOrArrayElement6630 = new BitSet(new long[]{0x0400000100000002L});
    public static final BitSet FOLLOW_32_in_ruleExpression_AccessMemberOrArrayElement6650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LUA_NAME_in_ruleExpression_AccessMemberOrArrayElement6679 = new BitSet(new long[]{0x0400000100000002L});
    public static final BitSet FOLLOW_ruleExpression_VariableName_in_entryRuleExpression_VariableName6723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression_VariableName6733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleExpression_VariableName6771 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleExpression_VariableName6796 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleExpression_VariableName6807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LUA_NAME_in_ruleExpression_VariableName6844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction6886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction6896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleFunction6933 = new BitSet(new long[]{0x2080000000000010L});
    public static final BitSet FOLLOW_RULE_LUA_NAME_in_ruleFunction6951 = new BitSet(new long[]{0x2080000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunction6969 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LUA_NAME_in_ruleFunction6986 = new BitSet(new long[]{0x2080000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunction7006 = new BitSet(new long[]{0x2080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleFunction7028 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_ruleFunction7054 = new BitSet(new long[]{0x10000004916D8010L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleFunction7075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctioncall_Arguments_in_entryRuleFunctioncall_Arguments7111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctioncall_Arguments7121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleFunctioncall_Arguments7172 = new BitSet(new long[]{0x31F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctioncall_Arguments7194 = new BitSet(new long[]{0x2000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctioncall_Arguments7207 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctioncall_Arguments7228 = new BitSet(new long[]{0x2000000000020000L});
    public static final BitSet FOLLOW_61_in_ruleFunctioncall_Arguments7244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_TableConstructor_in_ruleFunctioncall_Arguments7272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_String_in_ruleFunctioncall_Arguments7299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_in_entryRuleField7336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField7346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_AddEntryToTable_Brackets_in_ruleField7396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_AddEntryToTable_in_ruleField7426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_AppendEntryToTable_in_ruleField7456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_AddEntryToTable_Brackets_in_entryRuleField_AddEntryToTable_Brackets7491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField_AddEntryToTable_Brackets7501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleField_AddEntryToTable_Brackets7538 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleField_AddEntryToTable_Brackets7559 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleField_AddEntryToTable_Brackets7571 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleField_AddEntryToTable_Brackets7583 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleField_AddEntryToTable_Brackets7604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_AddEntryToTable_in_entryRuleField_AddEntryToTable7640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField_AddEntryToTable7650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LUA_NAME_in_ruleField_AddEntryToTable7692 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleField_AddEntryToTable7709 = new BitSet(new long[]{0x11F62006916D8070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleField_AddEntryToTable7730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleField_AppendEntryToTable_in_entryRuleField_AppendEntryToTable7766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleField_AppendEntryToTable7776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleField_AppendEntryToTable7821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctioncall_Arguments_in_synpred63_InternalLua6473 = new BitSet(new long[]{0x0000000000000002L});

}