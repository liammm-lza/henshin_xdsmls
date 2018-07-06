package uk.ac.kcl.inf.modelling.xdsml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.modelling.xdsml.services.HenshinXDsmlSpecificationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHenshinXDsmlSpecificationParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'metamodel'", "'step'", "'.'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalHenshinXDsmlSpecificationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHenshinXDsmlSpecificationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHenshinXDsmlSpecificationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHenshinXDsmlSpecification.g"; }



     	private HenshinXDsmlSpecificationGrammarAccess grammarAccess;

        public InternalHenshinXDsmlSpecificationParser(TokenStream input, HenshinXDsmlSpecificationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "HenshinXDsmlSpecification";
       	}

       	@Override
       	protected HenshinXDsmlSpecificationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleHenshinXDsmlSpecification"
    // InternalHenshinXDsmlSpecification.g:64:1: entryRuleHenshinXDsmlSpecification returns [EObject current=null] : iv_ruleHenshinXDsmlSpecification= ruleHenshinXDsmlSpecification EOF ;
    public final EObject entryRuleHenshinXDsmlSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHenshinXDsmlSpecification = null;


        try {
            // InternalHenshinXDsmlSpecification.g:64:66: (iv_ruleHenshinXDsmlSpecification= ruleHenshinXDsmlSpecification EOF )
            // InternalHenshinXDsmlSpecification.g:65:2: iv_ruleHenshinXDsmlSpecification= ruleHenshinXDsmlSpecification EOF
            {
             newCompositeNode(grammarAccess.getHenshinXDsmlSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHenshinXDsmlSpecification=ruleHenshinXDsmlSpecification();

            state._fsp--;

             current =iv_ruleHenshinXDsmlSpecification; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHenshinXDsmlSpecification"


    // $ANTLR start "ruleHenshinXDsmlSpecification"
    // InternalHenshinXDsmlSpecification.g:71:1: ruleHenshinXDsmlSpecification returns [EObject current=null] : (otherlv_0= 'metamodel' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'step' ( ( ruleQualifiedName ) ) )+ ) ;
    public final EObject ruleHenshinXDsmlSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalHenshinXDsmlSpecification.g:77:2: ( (otherlv_0= 'metamodel' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'step' ( ( ruleQualifiedName ) ) )+ ) )
            // InternalHenshinXDsmlSpecification.g:78:2: (otherlv_0= 'metamodel' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'step' ( ( ruleQualifiedName ) ) )+ )
            {
            // InternalHenshinXDsmlSpecification.g:78:2: (otherlv_0= 'metamodel' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'step' ( ( ruleQualifiedName ) ) )+ )
            // InternalHenshinXDsmlSpecification.g:79:3: otherlv_0= 'metamodel' ( (otherlv_1= RULE_STRING ) ) (otherlv_2= 'step' ( ( ruleQualifiedName ) ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHenshinXDsmlSpecificationAccess().getMetamodelKeyword_0());
            		
            // InternalHenshinXDsmlSpecification.g:83:3: ( (otherlv_1= RULE_STRING ) )
            // InternalHenshinXDsmlSpecification.g:84:4: (otherlv_1= RULE_STRING )
            {
            // InternalHenshinXDsmlSpecification.g:84:4: (otherlv_1= RULE_STRING )
            // InternalHenshinXDsmlSpecification.g:85:5: otherlv_1= RULE_STRING
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHenshinXDsmlSpecificationRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(otherlv_1, grammarAccess.getHenshinXDsmlSpecificationAccess().getMetamodelEPackageCrossReference_1_0());
            				

            }


            }

            // InternalHenshinXDsmlSpecification.g:96:3: (otherlv_2= 'step' ( ( ruleQualifiedName ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHenshinXDsmlSpecification.g:97:4: otherlv_2= 'step' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getHenshinXDsmlSpecificationAccess().getStepKeyword_2_0());
            	    			
            	    // InternalHenshinXDsmlSpecification.g:101:4: ( ( ruleQualifiedName ) )
            	    // InternalHenshinXDsmlSpecification.g:102:5: ( ruleQualifiedName )
            	    {
            	    // InternalHenshinXDsmlSpecification.g:102:5: ( ruleQualifiedName )
            	    // InternalHenshinXDsmlSpecification.g:103:6: ruleQualifiedName
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getHenshinXDsmlSpecificationRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getHenshinXDsmlSpecificationAccess().getUnitsUnitCrossReference_2_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // $ANTLR end "ruleHenshinXDsmlSpecification"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalHenshinXDsmlSpecification.g:122:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalHenshinXDsmlSpecification.g:122:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalHenshinXDsmlSpecification.g:123:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalHenshinXDsmlSpecification.g:129:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalHenshinXDsmlSpecification.g:135:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ ) )
            // InternalHenshinXDsmlSpecification.g:136:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            {
            // InternalHenshinXDsmlSpecification.g:136:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+ )
            // InternalHenshinXDsmlSpecification.g:137:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )+
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalHenshinXDsmlSpecification.g:144:3: (kw= '.' this_ID_2= RULE_ID )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalHenshinXDsmlSpecification.g:145:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002002L});

}