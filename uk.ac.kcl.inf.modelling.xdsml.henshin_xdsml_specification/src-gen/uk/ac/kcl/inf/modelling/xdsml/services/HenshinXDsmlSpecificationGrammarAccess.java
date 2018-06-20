/*
 * generated by Xtext 2.12.0
 */
package uk.ac.kcl.inf.modelling.xdsml.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class HenshinXDsmlSpecificationGrammarAccess extends AbstractGrammarElementFinder {
	
	public class HenshinXDsmlSpecificationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "uk.ac.kcl.inf.modelling.xdsml.HenshinXDsmlSpecification.HenshinXDsmlSpecification");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMetamodelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cQuotationMarkKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMetamodelAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cMetamodelEPackageCrossReference_2_0 = (CrossReference)cMetamodelAssignment_2.eContents().get(0);
		private final RuleCall cMetamodelEPackageIDTerminalRuleCall_2_0_1 = (RuleCall)cMetamodelEPackageCrossReference_2_0.eContents().get(1);
		private final Keyword cQuotationMarkKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cStepKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cUnitsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cUnitsUnitCrossReference_4_1_0 = (CrossReference)cUnitsAssignment_4_1.eContents().get(0);
		private final RuleCall cUnitsUnitIDTerminalRuleCall_4_1_0_1 = (RuleCall)cUnitsUnitCrossReference_4_1_0.eContents().get(1);
		
		//HenshinXDsmlSpecification:
		//	'metamodel' '"' metamodel=[ecore::EPackage] '"' ('step' units+=[henshin::Unit])+;
		@Override public ParserRule getRule() { return rule; }
		
		//'metamodel' '"' metamodel=[ecore::EPackage] '"' ('step' units+=[henshin::Unit])+
		public Group getGroup() { return cGroup; }
		
		//'metamodel'
		public Keyword getMetamodelKeyword_0() { return cMetamodelKeyword_0; }
		
		//'"'
		public Keyword getQuotationMarkKeyword_1() { return cQuotationMarkKeyword_1; }
		
		//metamodel=[ecore::EPackage]
		public Assignment getMetamodelAssignment_2() { return cMetamodelAssignment_2; }
		
		//[ecore::EPackage]
		public CrossReference getMetamodelEPackageCrossReference_2_0() { return cMetamodelEPackageCrossReference_2_0; }
		
		//ID
		public RuleCall getMetamodelEPackageIDTerminalRuleCall_2_0_1() { return cMetamodelEPackageIDTerminalRuleCall_2_0_1; }
		
		//'"'
		public Keyword getQuotationMarkKeyword_3() { return cQuotationMarkKeyword_3; }
		
		//('step' units+=[henshin::Unit])+
		public Group getGroup_4() { return cGroup_4; }
		
		//'step'
		public Keyword getStepKeyword_4_0() { return cStepKeyword_4_0; }
		
		//units+=[henshin::Unit]
		public Assignment getUnitsAssignment_4_1() { return cUnitsAssignment_4_1; }
		
		//[henshin::Unit]
		public CrossReference getUnitsUnitCrossReference_4_1_0() { return cUnitsUnitCrossReference_4_1_0; }
		
		//ID
		public RuleCall getUnitsUnitIDTerminalRuleCall_4_1_0_1() { return cUnitsUnitIDTerminalRuleCall_4_1_0_1; }
	}
	
	
	private final HenshinXDsmlSpecificationElements pHenshinXDsmlSpecification;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public HenshinXDsmlSpecificationGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pHenshinXDsmlSpecification = new HenshinXDsmlSpecificationElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("uk.ac.kcl.inf.modelling.xdsml.HenshinXDsmlSpecification".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//HenshinXDsmlSpecification:
	//	'metamodel' '"' metamodel=[ecore::EPackage] '"' ('step' units+=[henshin::Unit])+;
	public HenshinXDsmlSpecificationElements getHenshinXDsmlSpecificationAccess() {
		return pHenshinXDsmlSpecification;
	}
	
	public ParserRule getHenshinXDsmlSpecificationRule() {
		return getHenshinXDsmlSpecificationAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}