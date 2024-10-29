package org.xtext.example.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.services.TutorialGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTutorialParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'WOOD'", "'STEEL'", "'GOLD'", "'COPPER'", "'factory'", "'{'", "'}'", "'CylinderShape'", "'l'", "':'", "'cm'", "'r'", "'BlockShape'", "'w'", "'h'", "'basicItemType'", "'('", "')'", "'shape'", "'markers'", "'complexItemType'", "'components'", "'connections'", "'color'", "'g'", "'b'", "'<->'", "'-'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTutorialParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTutorialParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTutorialParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTutorial.g"; }


    	private TutorialGrammarAccess grammarAccess;

    	public void setGrammarAccess(TutorialGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleFactory"
    // InternalTutorial.g:53:1: entryRuleFactory : ruleFactory EOF ;
    public final void entryRuleFactory() throws RecognitionException {
        try {
            // InternalTutorial.g:54:1: ( ruleFactory EOF )
            // InternalTutorial.g:55:1: ruleFactory EOF
            {
             before(grammarAccess.getFactoryRule()); 
            pushFollow(FOLLOW_1);
            ruleFactory();

            state._fsp--;

             after(grammarAccess.getFactoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFactory"


    // $ANTLR start "ruleFactory"
    // InternalTutorial.g:62:1: ruleFactory : ( ( rule__Factory__Group__0 ) ) ;
    public final void ruleFactory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:66:2: ( ( ( rule__Factory__Group__0 ) ) )
            // InternalTutorial.g:67:2: ( ( rule__Factory__Group__0 ) )
            {
            // InternalTutorial.g:67:2: ( ( rule__Factory__Group__0 ) )
            // InternalTutorial.g:68:3: ( rule__Factory__Group__0 )
            {
             before(grammarAccess.getFactoryAccess().getGroup()); 
            // InternalTutorial.g:69:3: ( rule__Factory__Group__0 )
            // InternalTutorial.g:69:4: rule__Factory__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Factory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactory"


    // $ANTLR start "entryRuleCylinderShape"
    // InternalTutorial.g:78:1: entryRuleCylinderShape : ruleCylinderShape EOF ;
    public final void entryRuleCylinderShape() throws RecognitionException {
        try {
            // InternalTutorial.g:79:1: ( ruleCylinderShape EOF )
            // InternalTutorial.g:80:1: ruleCylinderShape EOF
            {
             before(grammarAccess.getCylinderShapeRule()); 
            pushFollow(FOLLOW_1);
            ruleCylinderShape();

            state._fsp--;

             after(grammarAccess.getCylinderShapeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCylinderShape"


    // $ANTLR start "ruleCylinderShape"
    // InternalTutorial.g:87:1: ruleCylinderShape : ( ( rule__CylinderShape__Group__0 ) ) ;
    public final void ruleCylinderShape() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:91:2: ( ( ( rule__CylinderShape__Group__0 ) ) )
            // InternalTutorial.g:92:2: ( ( rule__CylinderShape__Group__0 ) )
            {
            // InternalTutorial.g:92:2: ( ( rule__CylinderShape__Group__0 ) )
            // InternalTutorial.g:93:3: ( rule__CylinderShape__Group__0 )
            {
             before(grammarAccess.getCylinderShapeAccess().getGroup()); 
            // InternalTutorial.g:94:3: ( rule__CylinderShape__Group__0 )
            // InternalTutorial.g:94:4: rule__CylinderShape__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCylinderShapeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCylinderShape"


    // $ANTLR start "entryRuleBlockShape"
    // InternalTutorial.g:103:1: entryRuleBlockShape : ruleBlockShape EOF ;
    public final void entryRuleBlockShape() throws RecognitionException {
        try {
            // InternalTutorial.g:104:1: ( ruleBlockShape EOF )
            // InternalTutorial.g:105:1: ruleBlockShape EOF
            {
             before(grammarAccess.getBlockShapeRule()); 
            pushFollow(FOLLOW_1);
            ruleBlockShape();

            state._fsp--;

             after(grammarAccess.getBlockShapeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlockShape"


    // $ANTLR start "ruleBlockShape"
    // InternalTutorial.g:112:1: ruleBlockShape : ( ( rule__BlockShape__Group__0 ) ) ;
    public final void ruleBlockShape() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:116:2: ( ( ( rule__BlockShape__Group__0 ) ) )
            // InternalTutorial.g:117:2: ( ( rule__BlockShape__Group__0 ) )
            {
            // InternalTutorial.g:117:2: ( ( rule__BlockShape__Group__0 ) )
            // InternalTutorial.g:118:3: ( rule__BlockShape__Group__0 )
            {
             before(grammarAccess.getBlockShapeAccess().getGroup()); 
            // InternalTutorial.g:119:3: ( rule__BlockShape__Group__0 )
            // InternalTutorial.g:119:4: rule__BlockShape__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockShapeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlockShape"


    // $ANTLR start "entryRuleItemType"
    // InternalTutorial.g:128:1: entryRuleItemType : ruleItemType EOF ;
    public final void entryRuleItemType() throws RecognitionException {
        try {
            // InternalTutorial.g:129:1: ( ruleItemType EOF )
            // InternalTutorial.g:130:1: ruleItemType EOF
            {
             before(grammarAccess.getItemTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleItemType();

            state._fsp--;

             after(grammarAccess.getItemTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItemType"


    // $ANTLR start "ruleItemType"
    // InternalTutorial.g:137:1: ruleItemType : ( ( rule__ItemType__Alternatives ) ) ;
    public final void ruleItemType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:141:2: ( ( ( rule__ItemType__Alternatives ) ) )
            // InternalTutorial.g:142:2: ( ( rule__ItemType__Alternatives ) )
            {
            // InternalTutorial.g:142:2: ( ( rule__ItemType__Alternatives ) )
            // InternalTutorial.g:143:3: ( rule__ItemType__Alternatives )
            {
             before(grammarAccess.getItemTypeAccess().getAlternatives()); 
            // InternalTutorial.g:144:3: ( rule__ItemType__Alternatives )
            // InternalTutorial.g:144:4: rule__ItemType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ItemType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getItemTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemType"


    // $ANTLR start "entryRuleBasicItemType"
    // InternalTutorial.g:153:1: entryRuleBasicItemType : ruleBasicItemType EOF ;
    public final void entryRuleBasicItemType() throws RecognitionException {
        try {
            // InternalTutorial.g:154:1: ( ruleBasicItemType EOF )
            // InternalTutorial.g:155:1: ruleBasicItemType EOF
            {
             before(grammarAccess.getBasicItemTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicItemType();

            state._fsp--;

             after(grammarAccess.getBasicItemTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicItemType"


    // $ANTLR start "ruleBasicItemType"
    // InternalTutorial.g:162:1: ruleBasicItemType : ( ( rule__BasicItemType__Group__0 ) ) ;
    public final void ruleBasicItemType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:166:2: ( ( ( rule__BasicItemType__Group__0 ) ) )
            // InternalTutorial.g:167:2: ( ( rule__BasicItemType__Group__0 ) )
            {
            // InternalTutorial.g:167:2: ( ( rule__BasicItemType__Group__0 ) )
            // InternalTutorial.g:168:3: ( rule__BasicItemType__Group__0 )
            {
             before(grammarAccess.getBasicItemTypeAccess().getGroup()); 
            // InternalTutorial.g:169:3: ( rule__BasicItemType__Group__0 )
            // InternalTutorial.g:169:4: rule__BasicItemType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBasicItemTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicItemType"


    // $ANTLR start "entryRuleComplexItemType"
    // InternalTutorial.g:178:1: entryRuleComplexItemType : ruleComplexItemType EOF ;
    public final void entryRuleComplexItemType() throws RecognitionException {
        try {
            // InternalTutorial.g:179:1: ( ruleComplexItemType EOF )
            // InternalTutorial.g:180:1: ruleComplexItemType EOF
            {
             before(grammarAccess.getComplexItemTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexItemType();

            state._fsp--;

             after(grammarAccess.getComplexItemTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplexItemType"


    // $ANTLR start "ruleComplexItemType"
    // InternalTutorial.g:187:1: ruleComplexItemType : ( ( rule__ComplexItemType__Group__0 ) ) ;
    public final void ruleComplexItemType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:191:2: ( ( ( rule__ComplexItemType__Group__0 ) ) )
            // InternalTutorial.g:192:2: ( ( rule__ComplexItemType__Group__0 ) )
            {
            // InternalTutorial.g:192:2: ( ( rule__ComplexItemType__Group__0 ) )
            // InternalTutorial.g:193:3: ( rule__ComplexItemType__Group__0 )
            {
             before(grammarAccess.getComplexItemTypeAccess().getGroup()); 
            // InternalTutorial.g:194:3: ( rule__ComplexItemType__Group__0 )
            // InternalTutorial.g:194:4: rule__ComplexItemType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexItemTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexItemType"


    // $ANTLR start "entryRuleColor"
    // InternalTutorial.g:203:1: entryRuleColor : ruleColor EOF ;
    public final void entryRuleColor() throws RecognitionException {
        try {
            // InternalTutorial.g:204:1: ( ruleColor EOF )
            // InternalTutorial.g:205:1: ruleColor EOF
            {
             before(grammarAccess.getColorRule()); 
            pushFollow(FOLLOW_1);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getColorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColor"


    // $ANTLR start "ruleColor"
    // InternalTutorial.g:212:1: ruleColor : ( ( rule__Color__Group__0 ) ) ;
    public final void ruleColor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:216:2: ( ( ( rule__Color__Group__0 ) ) )
            // InternalTutorial.g:217:2: ( ( rule__Color__Group__0 ) )
            {
            // InternalTutorial.g:217:2: ( ( rule__Color__Group__0 ) )
            // InternalTutorial.g:218:3: ( rule__Color__Group__0 )
            {
             before(grammarAccess.getColorAccess().getGroup()); 
            // InternalTutorial.g:219:3: ( rule__Color__Group__0 )
            // InternalTutorial.g:219:4: rule__Color__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColor"


    // $ANTLR start "entryRuleMarker"
    // InternalTutorial.g:228:1: entryRuleMarker : ruleMarker EOF ;
    public final void entryRuleMarker() throws RecognitionException {
        try {
            // InternalTutorial.g:229:1: ( ruleMarker EOF )
            // InternalTutorial.g:230:1: ruleMarker EOF
            {
             before(grammarAccess.getMarkerRule()); 
            pushFollow(FOLLOW_1);
            ruleMarker();

            state._fsp--;

             after(grammarAccess.getMarkerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMarker"


    // $ANTLR start "ruleMarker"
    // InternalTutorial.g:237:1: ruleMarker : ( ( rule__Marker__NameAssignment ) ) ;
    public final void ruleMarker() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:241:2: ( ( ( rule__Marker__NameAssignment ) ) )
            // InternalTutorial.g:242:2: ( ( rule__Marker__NameAssignment ) )
            {
            // InternalTutorial.g:242:2: ( ( rule__Marker__NameAssignment ) )
            // InternalTutorial.g:243:3: ( rule__Marker__NameAssignment )
            {
             before(grammarAccess.getMarkerAccess().getNameAssignment()); 
            // InternalTutorial.g:244:3: ( rule__Marker__NameAssignment )
            // InternalTutorial.g:244:4: rule__Marker__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Marker__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMarkerAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMarker"


    // $ANTLR start "entryRuleComponent"
    // InternalTutorial.g:253:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalTutorial.g:254:1: ( ruleComponent EOF )
            // InternalTutorial.g:255:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalTutorial.g:262:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:266:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalTutorial.g:267:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalTutorial.g:267:2: ( ( rule__Component__Group__0 ) )
            // InternalTutorial.g:268:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalTutorial.g:269:3: ( rule__Component__Group__0 )
            // InternalTutorial.g:269:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleItemConnection"
    // InternalTutorial.g:278:1: entryRuleItemConnection : ruleItemConnection EOF ;
    public final void entryRuleItemConnection() throws RecognitionException {
        try {
            // InternalTutorial.g:279:1: ( ruleItemConnection EOF )
            // InternalTutorial.g:280:1: ruleItemConnection EOF
            {
             before(grammarAccess.getItemConnectionRule()); 
            pushFollow(FOLLOW_1);
            ruleItemConnection();

            state._fsp--;

             after(grammarAccess.getItemConnectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItemConnection"


    // $ANTLR start "ruleItemConnection"
    // InternalTutorial.g:287:1: ruleItemConnection : ( ( rule__ItemConnection__Group__0 ) ) ;
    public final void ruleItemConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:291:2: ( ( ( rule__ItemConnection__Group__0 ) ) )
            // InternalTutorial.g:292:2: ( ( rule__ItemConnection__Group__0 ) )
            {
            // InternalTutorial.g:292:2: ( ( rule__ItemConnection__Group__0 ) )
            // InternalTutorial.g:293:3: ( rule__ItemConnection__Group__0 )
            {
             before(grammarAccess.getItemConnectionAccess().getGroup()); 
            // InternalTutorial.g:294:3: ( rule__ItemConnection__Group__0 )
            // InternalTutorial.g:294:4: rule__ItemConnection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ItemConnection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemConnectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemConnection"


    // $ANTLR start "entryRuleEString"
    // InternalTutorial.g:303:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTutorial.g:304:1: ( ruleEString EOF )
            // InternalTutorial.g:305:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTutorial.g:312:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:316:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalTutorial.g:317:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalTutorial.g:317:2: ( ( rule__EString__Alternatives ) )
            // InternalTutorial.g:318:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalTutorial.g:319:3: ( rule__EString__Alternatives )
            // InternalTutorial.g:319:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDouble"
    // InternalTutorial.g:328:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalTutorial.g:329:1: ( ruleEDouble EOF )
            // InternalTutorial.g:330:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalTutorial.g:337:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:341:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalTutorial.g:342:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalTutorial.g:342:2: ( ( rule__EDouble__Group__0 ) )
            // InternalTutorial.g:343:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalTutorial.g:344:3: ( rule__EDouble__Group__0 )
            // InternalTutorial.g:344:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // InternalTutorial.g:353:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalTutorial.g:354:1: ( ruleEInt EOF )
            // InternalTutorial.g:355:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalTutorial.g:362:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:366:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalTutorial.g:367:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalTutorial.g:367:2: ( ( rule__EInt__Group__0 ) )
            // InternalTutorial.g:368:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalTutorial.g:369:3: ( rule__EInt__Group__0 )
            // InternalTutorial.g:369:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleMaterial"
    // InternalTutorial.g:378:1: ruleMaterial : ( ( rule__Material__Alternatives ) ) ;
    public final void ruleMaterial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:382:1: ( ( ( rule__Material__Alternatives ) ) )
            // InternalTutorial.g:383:2: ( ( rule__Material__Alternatives ) )
            {
            // InternalTutorial.g:383:2: ( ( rule__Material__Alternatives ) )
            // InternalTutorial.g:384:3: ( rule__Material__Alternatives )
            {
             before(grammarAccess.getMaterialAccess().getAlternatives()); 
            // InternalTutorial.g:385:3: ( rule__Material__Alternatives )
            // InternalTutorial.g:385:4: rule__Material__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Material__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMaterialAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMaterial"


    // $ANTLR start "rule__ItemType__Alternatives"
    // InternalTutorial.g:393:1: rule__ItemType__Alternatives : ( ( ruleBasicItemType ) | ( ruleComplexItemType ) );
    public final void rule__ItemType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:397:1: ( ( ruleBasicItemType ) | ( ruleComplexItemType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==28) ) {
                alt1=1;
            }
            else if ( (LA1_0==33) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTutorial.g:398:2: ( ruleBasicItemType )
                    {
                    // InternalTutorial.g:398:2: ( ruleBasicItemType )
                    // InternalTutorial.g:399:3: ruleBasicItemType
                    {
                     before(grammarAccess.getItemTypeAccess().getBasicItemTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBasicItemType();

                    state._fsp--;

                     after(grammarAccess.getItemTypeAccess().getBasicItemTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTutorial.g:404:2: ( ruleComplexItemType )
                    {
                    // InternalTutorial.g:404:2: ( ruleComplexItemType )
                    // InternalTutorial.g:405:3: ruleComplexItemType
                    {
                     before(grammarAccess.getItemTypeAccess().getComplexItemTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComplexItemType();

                    state._fsp--;

                     after(grammarAccess.getItemTypeAccess().getComplexItemTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemType__Alternatives"


    // $ANTLR start "rule__BasicItemType__ShapeAlternatives_8_0"
    // InternalTutorial.g:414:1: rule__BasicItemType__ShapeAlternatives_8_0 : ( ( ruleCylinderShape ) | ( ruleBlockShape ) );
    public final void rule__BasicItemType__ShapeAlternatives_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:418:1: ( ( ruleCylinderShape ) | ( ruleBlockShape ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==25) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTutorial.g:419:2: ( ruleCylinderShape )
                    {
                    // InternalTutorial.g:419:2: ( ruleCylinderShape )
                    // InternalTutorial.g:420:3: ruleCylinderShape
                    {
                     before(grammarAccess.getBasicItemTypeAccess().getShapeCylinderShapeParserRuleCall_8_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCylinderShape();

                    state._fsp--;

                     after(grammarAccess.getBasicItemTypeAccess().getShapeCylinderShapeParserRuleCall_8_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTutorial.g:425:2: ( ruleBlockShape )
                    {
                    // InternalTutorial.g:425:2: ( ruleBlockShape )
                    // InternalTutorial.g:426:3: ruleBlockShape
                    {
                     before(grammarAccess.getBasicItemTypeAccess().getShapeBlockShapeParserRuleCall_8_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBlockShape();

                    state._fsp--;

                     after(grammarAccess.getBasicItemTypeAccess().getShapeBlockShapeParserRuleCall_8_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__ShapeAlternatives_8_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalTutorial.g:435:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:439:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTutorial.g:440:2: ( RULE_STRING )
                    {
                    // InternalTutorial.g:440:2: ( RULE_STRING )
                    // InternalTutorial.g:441:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTutorial.g:446:2: ( RULE_ID )
                    {
                    // InternalTutorial.g:446:2: ( RULE_ID )
                    // InternalTutorial.g:447:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalTutorial.g:456:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:460:1: ( ( 'E' ) | ( 'e' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTutorial.g:461:2: ( 'E' )
                    {
                    // InternalTutorial.g:461:2: ( 'E' )
                    // InternalTutorial.g:462:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTutorial.g:467:2: ( 'e' )
                    {
                    // InternalTutorial.g:467:2: ( 'e' )
                    // InternalTutorial.g:468:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__Material__Alternatives"
    // InternalTutorial.g:477:1: rule__Material__Alternatives : ( ( ( 'WOOD' ) ) | ( ( 'STEEL' ) ) | ( ( 'GOLD' ) ) | ( ( 'COPPER' ) ) );
    public final void rule__Material__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:481:1: ( ( ( 'WOOD' ) ) | ( ( 'STEEL' ) ) | ( ( 'GOLD' ) ) | ( ( 'COPPER' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTutorial.g:482:2: ( ( 'WOOD' ) )
                    {
                    // InternalTutorial.g:482:2: ( ( 'WOOD' ) )
                    // InternalTutorial.g:483:3: ( 'WOOD' )
                    {
                     before(grammarAccess.getMaterialAccess().getWOODEnumLiteralDeclaration_0()); 
                    // InternalTutorial.g:484:3: ( 'WOOD' )
                    // InternalTutorial.g:484:4: 'WOOD'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getMaterialAccess().getWOODEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTutorial.g:488:2: ( ( 'STEEL' ) )
                    {
                    // InternalTutorial.g:488:2: ( ( 'STEEL' ) )
                    // InternalTutorial.g:489:3: ( 'STEEL' )
                    {
                     before(grammarAccess.getMaterialAccess().getSTEELEnumLiteralDeclaration_1()); 
                    // InternalTutorial.g:490:3: ( 'STEEL' )
                    // InternalTutorial.g:490:4: 'STEEL'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getMaterialAccess().getSTEELEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTutorial.g:494:2: ( ( 'GOLD' ) )
                    {
                    // InternalTutorial.g:494:2: ( ( 'GOLD' ) )
                    // InternalTutorial.g:495:3: ( 'GOLD' )
                    {
                     before(grammarAccess.getMaterialAccess().getGOLDEnumLiteralDeclaration_2()); 
                    // InternalTutorial.g:496:3: ( 'GOLD' )
                    // InternalTutorial.g:496:4: 'GOLD'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getMaterialAccess().getGOLDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTutorial.g:500:2: ( ( 'COPPER' ) )
                    {
                    // InternalTutorial.g:500:2: ( ( 'COPPER' ) )
                    // InternalTutorial.g:501:3: ( 'COPPER' )
                    {
                     before(grammarAccess.getMaterialAccess().getCOPPEREnumLiteralDeclaration_3()); 
                    // InternalTutorial.g:502:3: ( 'COPPER' )
                    // InternalTutorial.g:502:4: 'COPPER'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getMaterialAccess().getCOPPEREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Material__Alternatives"


    // $ANTLR start "rule__Factory__Group__0"
    // InternalTutorial.g:510:1: rule__Factory__Group__0 : rule__Factory__Group__0__Impl rule__Factory__Group__1 ;
    public final void rule__Factory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:514:1: ( rule__Factory__Group__0__Impl rule__Factory__Group__1 )
            // InternalTutorial.g:515:2: rule__Factory__Group__0__Impl rule__Factory__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Factory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factory__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factory__Group__0"


    // $ANTLR start "rule__Factory__Group__0__Impl"
    // InternalTutorial.g:522:1: rule__Factory__Group__0__Impl : ( 'factory' ) ;
    public final void rule__Factory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:526:1: ( ( 'factory' ) )
            // InternalTutorial.g:527:1: ( 'factory' )
            {
            // InternalTutorial.g:527:1: ( 'factory' )
            // InternalTutorial.g:528:2: 'factory'
            {
             before(grammarAccess.getFactoryAccess().getFactoryKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFactoryAccess().getFactoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factory__Group__0__Impl"


    // $ANTLR start "rule__Factory__Group__1"
    // InternalTutorial.g:537:1: rule__Factory__Group__1 : rule__Factory__Group__1__Impl rule__Factory__Group__2 ;
    public final void rule__Factory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:541:1: ( rule__Factory__Group__1__Impl rule__Factory__Group__2 )
            // InternalTutorial.g:542:2: rule__Factory__Group__1__Impl rule__Factory__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Factory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factory__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factory__Group__1"


    // $ANTLR start "rule__Factory__Group__1__Impl"
    // InternalTutorial.g:549:1: rule__Factory__Group__1__Impl : ( ( rule__Factory__NameAssignment_1 ) ) ;
    public final void rule__Factory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:553:1: ( ( ( rule__Factory__NameAssignment_1 ) ) )
            // InternalTutorial.g:554:1: ( ( rule__Factory__NameAssignment_1 ) )
            {
            // InternalTutorial.g:554:1: ( ( rule__Factory__NameAssignment_1 ) )
            // InternalTutorial.g:555:2: ( rule__Factory__NameAssignment_1 )
            {
             before(grammarAccess.getFactoryAccess().getNameAssignment_1()); 
            // InternalTutorial.g:556:2: ( rule__Factory__NameAssignment_1 )
            // InternalTutorial.g:556:3: rule__Factory__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Factory__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFactoryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factory__Group__1__Impl"


    // $ANTLR start "rule__Factory__Group__2"
    // InternalTutorial.g:564:1: rule__Factory__Group__2 : rule__Factory__Group__2__Impl rule__Factory__Group__3 ;
    public final void rule__Factory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:568:1: ( rule__Factory__Group__2__Impl rule__Factory__Group__3 )
            // InternalTutorial.g:569:2: rule__Factory__Group__2__Impl rule__Factory__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Factory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factory__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factory__Group__2"


    // $ANTLR start "rule__Factory__Group__2__Impl"
    // InternalTutorial.g:576:1: rule__Factory__Group__2__Impl : ( '{' ) ;
    public final void rule__Factory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:580:1: ( ( '{' ) )
            // InternalTutorial.g:581:1: ( '{' )
            {
            // InternalTutorial.g:581:1: ( '{' )
            // InternalTutorial.g:582:2: '{'
            {
             before(grammarAccess.getFactoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFactoryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factory__Group__2__Impl"


    // $ANTLR start "rule__Factory__Group__3"
    // InternalTutorial.g:591:1: rule__Factory__Group__3 : rule__Factory__Group__3__Impl rule__Factory__Group__4 ;
    public final void rule__Factory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:595:1: ( rule__Factory__Group__3__Impl rule__Factory__Group__4 )
            // InternalTutorial.g:596:2: rule__Factory__Group__3__Impl rule__Factory__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Factory__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factory__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factory__Group__3"


    // $ANTLR start "rule__Factory__Group__3__Impl"
    // InternalTutorial.g:603:1: rule__Factory__Group__3__Impl : ( ( ( rule__Factory__ItemTypesAssignment_3 ) ) ( ( rule__Factory__ItemTypesAssignment_3 )* ) ) ;
    public final void rule__Factory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:607:1: ( ( ( ( rule__Factory__ItemTypesAssignment_3 ) ) ( ( rule__Factory__ItemTypesAssignment_3 )* ) ) )
            // InternalTutorial.g:608:1: ( ( ( rule__Factory__ItemTypesAssignment_3 ) ) ( ( rule__Factory__ItemTypesAssignment_3 )* ) )
            {
            // InternalTutorial.g:608:1: ( ( ( rule__Factory__ItemTypesAssignment_3 ) ) ( ( rule__Factory__ItemTypesAssignment_3 )* ) )
            // InternalTutorial.g:609:2: ( ( rule__Factory__ItemTypesAssignment_3 ) ) ( ( rule__Factory__ItemTypesAssignment_3 )* )
            {
            // InternalTutorial.g:609:2: ( ( rule__Factory__ItemTypesAssignment_3 ) )
            // InternalTutorial.g:610:3: ( rule__Factory__ItemTypesAssignment_3 )
            {
             before(grammarAccess.getFactoryAccess().getItemTypesAssignment_3()); 
            // InternalTutorial.g:611:3: ( rule__Factory__ItemTypesAssignment_3 )
            // InternalTutorial.g:611:4: rule__Factory__ItemTypesAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__Factory__ItemTypesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFactoryAccess().getItemTypesAssignment_3()); 

            }

            // InternalTutorial.g:614:2: ( ( rule__Factory__ItemTypesAssignment_3 )* )
            // InternalTutorial.g:615:3: ( rule__Factory__ItemTypesAssignment_3 )*
            {
             before(grammarAccess.getFactoryAccess().getItemTypesAssignment_3()); 
            // InternalTutorial.g:616:3: ( rule__Factory__ItemTypesAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==28||LA6_0==33) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalTutorial.g:616:4: rule__Factory__ItemTypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Factory__ItemTypesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFactoryAccess().getItemTypesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factory__Group__3__Impl"


    // $ANTLR start "rule__Factory__Group__4"
    // InternalTutorial.g:625:1: rule__Factory__Group__4 : rule__Factory__Group__4__Impl ;
    public final void rule__Factory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:629:1: ( rule__Factory__Group__4__Impl )
            // InternalTutorial.g:630:2: rule__Factory__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factory__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factory__Group__4"


    // $ANTLR start "rule__Factory__Group__4__Impl"
    // InternalTutorial.g:636:1: rule__Factory__Group__4__Impl : ( '}' ) ;
    public final void rule__Factory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:640:1: ( ( '}' ) )
            // InternalTutorial.g:641:1: ( '}' )
            {
            // InternalTutorial.g:641:1: ( '}' )
            // InternalTutorial.g:642:2: '}'
            {
             before(grammarAccess.getFactoryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFactoryAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factory__Group__4__Impl"


    // $ANTLR start "rule__CylinderShape__Group__0"
    // InternalTutorial.g:652:1: rule__CylinderShape__Group__0 : rule__CylinderShape__Group__0__Impl rule__CylinderShape__Group__1 ;
    public final void rule__CylinderShape__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:656:1: ( rule__CylinderShape__Group__0__Impl rule__CylinderShape__Group__1 )
            // InternalTutorial.g:657:2: rule__CylinderShape__Group__0__Impl rule__CylinderShape__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CylinderShape__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__Group__0"


    // $ANTLR start "rule__CylinderShape__Group__0__Impl"
    // InternalTutorial.g:664:1: rule__CylinderShape__Group__0__Impl : ( 'CylinderShape' ) ;
    public final void rule__CylinderShape__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:668:1: ( ( 'CylinderShape' ) )
            // InternalTutorial.g:669:1: ( 'CylinderShape' )
            {
            // InternalTutorial.g:669:1: ( 'CylinderShape' )
            // InternalTutorial.g:670:2: 'CylinderShape'
            {
             before(grammarAccess.getCylinderShapeAccess().getCylinderShapeKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCylinderShapeAccess().getCylinderShapeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__Group__0__Impl"


    // $ANTLR start "rule__CylinderShape__Group__1"
    // InternalTutorial.g:679:1: rule__CylinderShape__Group__1 : rule__CylinderShape__Group__1__Impl rule__CylinderShape__Group__2 ;
    public final void rule__CylinderShape__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:683:1: ( rule__CylinderShape__Group__1__Impl rule__CylinderShape__Group__2 )
            // InternalTutorial.g:684:2: rule__CylinderShape__Group__1__Impl rule__CylinderShape__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__CylinderShape__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__Group__1"


    // $ANTLR start "rule__CylinderShape__Group__1__Impl"
    // InternalTutorial.g:691:1: rule__CylinderShape__Group__1__Impl : ( '{' ) ;
    public final void rule__CylinderShape__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:695:1: ( ( '{' ) )
            // InternalTutorial.g:696:1: ( '{' )
            {
            // InternalTutorial.g:696:1: ( '{' )
            // InternalTutorial.g:697:2: '{'
            {
             before(grammarAccess.getCylinderShapeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCylinderShapeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__Group__1__Impl"


    // $ANTLR start "rule__CylinderShape__Group__2"
    // InternalTutorial.g:706:1: rule__CylinderShape__Group__2 : rule__CylinderShape__Group__2__Impl rule__CylinderShape__Group__3 ;
    public final void rule__CylinderShape__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:710:1: ( rule__CylinderShape__Group__2__Impl rule__CylinderShape__Group__3 )
            // InternalTutorial.g:711:2: rule__CylinderShape__Group__2__Impl rule__CylinderShape__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__CylinderShape__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__Group__2"


    // $ANTLR start "rule__CylinderShape__Group__2__Impl"
    // InternalTutorial.g:718:1: rule__CylinderShape__Group__2__Impl : ( 'l' ) ;
    public final void rule__CylinderShape__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:722:1: ( ( 'l' ) )
            // InternalTutorial.g:723:1: ( 'l' )
            {
            // InternalTutorial.g:723:1: ( 'l' )
            // InternalTutorial.g:724:2: 'l'
            {
             before(grammarAccess.getCylinderShapeAccess().getLKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCylinderShapeAccess().getLKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__Group__2__Impl"


    // $ANTLR start "rule__CylinderShape__Group__3"
    // InternalTutorial.g:733:1: rule__CylinderShape__Group__3 : rule__CylinderShape__Group__3__Impl rule__CylinderShape__Group__4 ;
    public final void rule__CylinderShape__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:737:1: ( rule__CylinderShape__Group__3__Impl rule__CylinderShape__Group__4 )
            // InternalTutorial.g:738:2: rule__CylinderShape__Group__3__Impl rule__CylinderShape__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__CylinderShape__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__Group__3"


    // $ANTLR start "rule__CylinderShape__Group__3__Impl"
    // InternalTutorial.g:745:1: rule__CylinderShape__Group__3__Impl : ( ':' ) ;
    public final void rule__CylinderShape__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:749:1: ( ( ':' ) )
            // InternalTutorial.g:750:1: ( ':' )
            {
            // InternalTutorial.g:750:1: ( ':' )
            // InternalTutorial.g:751:2: ':'
            {
             before(grammarAccess.getCylinderShapeAccess().getColonKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCylinderShapeAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__Group__3__Impl"


    // $ANTLR start "rule__CylinderShape__Group__4"
    // InternalTutorial.g:760:1: rule__CylinderShape__Group__4 : rule__CylinderShape__Group__4__Impl rule__CylinderShape__Group__5 ;
    public final void rule__CylinderShape__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:764:1: ( rule__CylinderShape__Group__4__Impl rule__CylinderShape__Group__5 )
            // InternalTutorial.g:765:2: rule__CylinderShape__Group__4__Impl rule__CylinderShape__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__CylinderShape__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__Group__4"


    // $ANTLR start "rule__CylinderShape__Group__4__Impl"
    // InternalTutorial.g:772:1: rule__CylinderShape__Group__4__Impl : ( ( rule__CylinderShape__LengthAssignment_4 ) ) ;
    public final void rule__CylinderShape__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:776:1: ( ( ( rule__CylinderShape__LengthAssignment_4 ) ) )
            // InternalTutorial.g:777:1: ( ( rule__CylinderShape__LengthAssignment_4 ) )
            {
            // InternalTutorial.g:777:1: ( ( rule__CylinderShape__LengthAssignment_4 ) )
            // InternalTutorial.g:778:2: ( rule__CylinderShape__LengthAssignment_4 )
            {
             before(grammarAccess.getCylinderShapeAccess().getLengthAssignment_4()); 
            // InternalTutorial.g:779:2: ( rule__CylinderShape__LengthAssignment_4 )
            // InternalTutorial.g:779:3: rule__CylinderShape__LengthAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CylinderShape__LengthAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCylinderShapeAccess().getLengthAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__Group__4__Impl"


    // $ANTLR start "rule__CylinderShape__Group__5"
    // InternalTutorial.g:787:1: rule__CylinderShape__Group__5 : rule__CylinderShape__Group__5__Impl rule__CylinderShape__Group__6 ;
    public final void rule__CylinderShape__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:791:1: ( rule__CylinderShape__Group__5__Impl rule__CylinderShape__Group__6 )
            // InternalTutorial.g:792:2: rule__CylinderShape__Group__5__Impl rule__CylinderShape__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__CylinderShape__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__Group__5"


    // $ANTLR start "rule__CylinderShape__Group__5__Impl"
    // InternalTutorial.g:799:1: rule__CylinderShape__Group__5__Impl : ( 'cm' ) ;
    public final void rule__CylinderShape__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:803:1: ( ( 'cm' ) )
            // InternalTutorial.g:804:1: ( 'cm' )
            {
            // InternalTutorial.g:804:1: ( 'cm' )
            // InternalTutorial.g:805:2: 'cm'
            {
             before(grammarAccess.getCylinderShapeAccess().getCmKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCylinderShapeAccess().getCmKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__Group__5__Impl"


    // $ANTLR start "rule__CylinderShape__Group__6"
    // InternalTutorial.g:814:1: rule__CylinderShape__Group__6 : rule__CylinderShape__Group__6__Impl rule__CylinderShape__Group__7 ;
    public final void rule__CylinderShape__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:818:1: ( rule__CylinderShape__Group__6__Impl rule__CylinderShape__Group__7 )
            // InternalTutorial.g:819:2: rule__CylinderShape__Group__6__Impl rule__CylinderShape__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__CylinderShape__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__Group__6"


    // $ANTLR start "rule__CylinderShape__Group__6__Impl"
    // InternalTutorial.g:826:1: rule__CylinderShape__Group__6__Impl : ( 'r' ) ;
    public final void rule__CylinderShape__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:830:1: ( ( 'r' ) )
            // InternalTutorial.g:831:1: ( 'r' )
            {
            // InternalTutorial.g:831:1: ( 'r' )
            // InternalTutorial.g:832:2: 'r'
            {
             before(grammarAccess.getCylinderShapeAccess().getRKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCylinderShapeAccess().getRKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__Group__6__Impl"


    // $ANTLR start "rule__CylinderShape__Group__7"
    // InternalTutorial.g:841:1: rule__CylinderShape__Group__7 : rule__CylinderShape__Group__7__Impl rule__CylinderShape__Group__8 ;
    public final void rule__CylinderShape__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:845:1: ( rule__CylinderShape__Group__7__Impl rule__CylinderShape__Group__8 )
            // InternalTutorial.g:846:2: rule__CylinderShape__Group__7__Impl rule__CylinderShape__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__CylinderShape__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__Group__7"


    // $ANTLR start "rule__CylinderShape__Group__7__Impl"
    // InternalTutorial.g:853:1: rule__CylinderShape__Group__7__Impl : ( ':' ) ;
    public final void rule__CylinderShape__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:857:1: ( ( ':' ) )
            // InternalTutorial.g:858:1: ( ':' )
            {
            // InternalTutorial.g:858:1: ( ':' )
            // InternalTutorial.g:859:2: ':'
            {
             before(grammarAccess.getCylinderShapeAccess().getColonKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCylinderShapeAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__Group__7__Impl"


    // $ANTLR start "rule__CylinderShape__Group__8"
    // InternalTutorial.g:868:1: rule__CylinderShape__Group__8 : rule__CylinderShape__Group__8__Impl rule__CylinderShape__Group__9 ;
    public final void rule__CylinderShape__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:872:1: ( rule__CylinderShape__Group__8__Impl rule__CylinderShape__Group__9 )
            // InternalTutorial.g:873:2: rule__CylinderShape__Group__8__Impl rule__CylinderShape__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__CylinderShape__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__Group__8"


    // $ANTLR start "rule__CylinderShape__Group__8__Impl"
    // InternalTutorial.g:880:1: rule__CylinderShape__Group__8__Impl : ( ( rule__CylinderShape__RadiusAssignment_8 ) ) ;
    public final void rule__CylinderShape__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:884:1: ( ( ( rule__CylinderShape__RadiusAssignment_8 ) ) )
            // InternalTutorial.g:885:1: ( ( rule__CylinderShape__RadiusAssignment_8 ) )
            {
            // InternalTutorial.g:885:1: ( ( rule__CylinderShape__RadiusAssignment_8 ) )
            // InternalTutorial.g:886:2: ( rule__CylinderShape__RadiusAssignment_8 )
            {
             before(grammarAccess.getCylinderShapeAccess().getRadiusAssignment_8()); 
            // InternalTutorial.g:887:2: ( rule__CylinderShape__RadiusAssignment_8 )
            // InternalTutorial.g:887:3: rule__CylinderShape__RadiusAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__CylinderShape__RadiusAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getCylinderShapeAccess().getRadiusAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__Group__8__Impl"


    // $ANTLR start "rule__CylinderShape__Group__9"
    // InternalTutorial.g:895:1: rule__CylinderShape__Group__9 : rule__CylinderShape__Group__9__Impl rule__CylinderShape__Group__10 ;
    public final void rule__CylinderShape__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:899:1: ( rule__CylinderShape__Group__9__Impl rule__CylinderShape__Group__10 )
            // InternalTutorial.g:900:2: rule__CylinderShape__Group__9__Impl rule__CylinderShape__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__CylinderShape__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__Group__9"


    // $ANTLR start "rule__CylinderShape__Group__9__Impl"
    // InternalTutorial.g:907:1: rule__CylinderShape__Group__9__Impl : ( 'cm' ) ;
    public final void rule__CylinderShape__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:911:1: ( ( 'cm' ) )
            // InternalTutorial.g:912:1: ( 'cm' )
            {
            // InternalTutorial.g:912:1: ( 'cm' )
            // InternalTutorial.g:913:2: 'cm'
            {
             before(grammarAccess.getCylinderShapeAccess().getCmKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCylinderShapeAccess().getCmKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__Group__9__Impl"


    // $ANTLR start "rule__CylinderShape__Group__10"
    // InternalTutorial.g:922:1: rule__CylinderShape__Group__10 : rule__CylinderShape__Group__10__Impl ;
    public final void rule__CylinderShape__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:926:1: ( rule__CylinderShape__Group__10__Impl )
            // InternalTutorial.g:927:2: rule__CylinderShape__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CylinderShape__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__Group__10"


    // $ANTLR start "rule__CylinderShape__Group__10__Impl"
    // InternalTutorial.g:933:1: rule__CylinderShape__Group__10__Impl : ( '}' ) ;
    public final void rule__CylinderShape__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:937:1: ( ( '}' ) )
            // InternalTutorial.g:938:1: ( '}' )
            {
            // InternalTutorial.g:938:1: ( '}' )
            // InternalTutorial.g:939:2: '}'
            {
             before(grammarAccess.getCylinderShapeAccess().getRightCurlyBracketKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCylinderShapeAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__Group__10__Impl"


    // $ANTLR start "rule__BlockShape__Group__0"
    // InternalTutorial.g:949:1: rule__BlockShape__Group__0 : rule__BlockShape__Group__0__Impl rule__BlockShape__Group__1 ;
    public final void rule__BlockShape__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:953:1: ( rule__BlockShape__Group__0__Impl rule__BlockShape__Group__1 )
            // InternalTutorial.g:954:2: rule__BlockShape__Group__0__Impl rule__BlockShape__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__BlockShape__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__0"


    // $ANTLR start "rule__BlockShape__Group__0__Impl"
    // InternalTutorial.g:961:1: rule__BlockShape__Group__0__Impl : ( 'BlockShape' ) ;
    public final void rule__BlockShape__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:965:1: ( ( 'BlockShape' ) )
            // InternalTutorial.g:966:1: ( 'BlockShape' )
            {
            // InternalTutorial.g:966:1: ( 'BlockShape' )
            // InternalTutorial.g:967:2: 'BlockShape'
            {
             before(grammarAccess.getBlockShapeAccess().getBlockShapeKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getBlockShapeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__0__Impl"


    // $ANTLR start "rule__BlockShape__Group__1"
    // InternalTutorial.g:976:1: rule__BlockShape__Group__1 : rule__BlockShape__Group__1__Impl rule__BlockShape__Group__2 ;
    public final void rule__BlockShape__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:980:1: ( rule__BlockShape__Group__1__Impl rule__BlockShape__Group__2 )
            // InternalTutorial.g:981:2: rule__BlockShape__Group__1__Impl rule__BlockShape__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__BlockShape__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__1"


    // $ANTLR start "rule__BlockShape__Group__1__Impl"
    // InternalTutorial.g:988:1: rule__BlockShape__Group__1__Impl : ( '{' ) ;
    public final void rule__BlockShape__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:992:1: ( ( '{' ) )
            // InternalTutorial.g:993:1: ( '{' )
            {
            // InternalTutorial.g:993:1: ( '{' )
            // InternalTutorial.g:994:2: '{'
            {
             before(grammarAccess.getBlockShapeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__1__Impl"


    // $ANTLR start "rule__BlockShape__Group__2"
    // InternalTutorial.g:1003:1: rule__BlockShape__Group__2 : rule__BlockShape__Group__2__Impl rule__BlockShape__Group__3 ;
    public final void rule__BlockShape__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1007:1: ( rule__BlockShape__Group__2__Impl rule__BlockShape__Group__3 )
            // InternalTutorial.g:1008:2: rule__BlockShape__Group__2__Impl rule__BlockShape__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__BlockShape__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__2"


    // $ANTLR start "rule__BlockShape__Group__2__Impl"
    // InternalTutorial.g:1015:1: rule__BlockShape__Group__2__Impl : ( 'l' ) ;
    public final void rule__BlockShape__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1019:1: ( ( 'l' ) )
            // InternalTutorial.g:1020:1: ( 'l' )
            {
            // InternalTutorial.g:1020:1: ( 'l' )
            // InternalTutorial.g:1021:2: 'l'
            {
             before(grammarAccess.getBlockShapeAccess().getLKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getLKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__2__Impl"


    // $ANTLR start "rule__BlockShape__Group__3"
    // InternalTutorial.g:1030:1: rule__BlockShape__Group__3 : rule__BlockShape__Group__3__Impl rule__BlockShape__Group__4 ;
    public final void rule__BlockShape__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1034:1: ( rule__BlockShape__Group__3__Impl rule__BlockShape__Group__4 )
            // InternalTutorial.g:1035:2: rule__BlockShape__Group__3__Impl rule__BlockShape__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__BlockShape__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__3"


    // $ANTLR start "rule__BlockShape__Group__3__Impl"
    // InternalTutorial.g:1042:1: rule__BlockShape__Group__3__Impl : ( ':' ) ;
    public final void rule__BlockShape__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1046:1: ( ( ':' ) )
            // InternalTutorial.g:1047:1: ( ':' )
            {
            // InternalTutorial.g:1047:1: ( ':' )
            // InternalTutorial.g:1048:2: ':'
            {
             before(grammarAccess.getBlockShapeAccess().getColonKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__3__Impl"


    // $ANTLR start "rule__BlockShape__Group__4"
    // InternalTutorial.g:1057:1: rule__BlockShape__Group__4 : rule__BlockShape__Group__4__Impl rule__BlockShape__Group__5 ;
    public final void rule__BlockShape__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1061:1: ( rule__BlockShape__Group__4__Impl rule__BlockShape__Group__5 )
            // InternalTutorial.g:1062:2: rule__BlockShape__Group__4__Impl rule__BlockShape__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__BlockShape__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__4"


    // $ANTLR start "rule__BlockShape__Group__4__Impl"
    // InternalTutorial.g:1069:1: rule__BlockShape__Group__4__Impl : ( ( rule__BlockShape__LengthAssignment_4 ) ) ;
    public final void rule__BlockShape__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1073:1: ( ( ( rule__BlockShape__LengthAssignment_4 ) ) )
            // InternalTutorial.g:1074:1: ( ( rule__BlockShape__LengthAssignment_4 ) )
            {
            // InternalTutorial.g:1074:1: ( ( rule__BlockShape__LengthAssignment_4 ) )
            // InternalTutorial.g:1075:2: ( rule__BlockShape__LengthAssignment_4 )
            {
             before(grammarAccess.getBlockShapeAccess().getLengthAssignment_4()); 
            // InternalTutorial.g:1076:2: ( rule__BlockShape__LengthAssignment_4 )
            // InternalTutorial.g:1076:3: rule__BlockShape__LengthAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BlockShape__LengthAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBlockShapeAccess().getLengthAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__4__Impl"


    // $ANTLR start "rule__BlockShape__Group__5"
    // InternalTutorial.g:1084:1: rule__BlockShape__Group__5 : rule__BlockShape__Group__5__Impl rule__BlockShape__Group__6 ;
    public final void rule__BlockShape__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1088:1: ( rule__BlockShape__Group__5__Impl rule__BlockShape__Group__6 )
            // InternalTutorial.g:1089:2: rule__BlockShape__Group__5__Impl rule__BlockShape__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__BlockShape__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__5"


    // $ANTLR start "rule__BlockShape__Group__5__Impl"
    // InternalTutorial.g:1096:1: rule__BlockShape__Group__5__Impl : ( 'cm' ) ;
    public final void rule__BlockShape__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1100:1: ( ( 'cm' ) )
            // InternalTutorial.g:1101:1: ( 'cm' )
            {
            // InternalTutorial.g:1101:1: ( 'cm' )
            // InternalTutorial.g:1102:2: 'cm'
            {
             before(grammarAccess.getBlockShapeAccess().getCmKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getCmKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__5__Impl"


    // $ANTLR start "rule__BlockShape__Group__6"
    // InternalTutorial.g:1111:1: rule__BlockShape__Group__6 : rule__BlockShape__Group__6__Impl rule__BlockShape__Group__7 ;
    public final void rule__BlockShape__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1115:1: ( rule__BlockShape__Group__6__Impl rule__BlockShape__Group__7 )
            // InternalTutorial.g:1116:2: rule__BlockShape__Group__6__Impl rule__BlockShape__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__BlockShape__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__6"


    // $ANTLR start "rule__BlockShape__Group__6__Impl"
    // InternalTutorial.g:1123:1: rule__BlockShape__Group__6__Impl : ( 'w' ) ;
    public final void rule__BlockShape__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1127:1: ( ( 'w' ) )
            // InternalTutorial.g:1128:1: ( 'w' )
            {
            // InternalTutorial.g:1128:1: ( 'w' )
            // InternalTutorial.g:1129:2: 'w'
            {
             before(grammarAccess.getBlockShapeAccess().getWKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getWKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__6__Impl"


    // $ANTLR start "rule__BlockShape__Group__7"
    // InternalTutorial.g:1138:1: rule__BlockShape__Group__7 : rule__BlockShape__Group__7__Impl rule__BlockShape__Group__8 ;
    public final void rule__BlockShape__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1142:1: ( rule__BlockShape__Group__7__Impl rule__BlockShape__Group__8 )
            // InternalTutorial.g:1143:2: rule__BlockShape__Group__7__Impl rule__BlockShape__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__BlockShape__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__7"


    // $ANTLR start "rule__BlockShape__Group__7__Impl"
    // InternalTutorial.g:1150:1: rule__BlockShape__Group__7__Impl : ( ':' ) ;
    public final void rule__BlockShape__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1154:1: ( ( ':' ) )
            // InternalTutorial.g:1155:1: ( ':' )
            {
            // InternalTutorial.g:1155:1: ( ':' )
            // InternalTutorial.g:1156:2: ':'
            {
             before(grammarAccess.getBlockShapeAccess().getColonKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__7__Impl"


    // $ANTLR start "rule__BlockShape__Group__8"
    // InternalTutorial.g:1165:1: rule__BlockShape__Group__8 : rule__BlockShape__Group__8__Impl rule__BlockShape__Group__9 ;
    public final void rule__BlockShape__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1169:1: ( rule__BlockShape__Group__8__Impl rule__BlockShape__Group__9 )
            // InternalTutorial.g:1170:2: rule__BlockShape__Group__8__Impl rule__BlockShape__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__BlockShape__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__8"


    // $ANTLR start "rule__BlockShape__Group__8__Impl"
    // InternalTutorial.g:1177:1: rule__BlockShape__Group__8__Impl : ( ( rule__BlockShape__WidthAssignment_8 ) ) ;
    public final void rule__BlockShape__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1181:1: ( ( ( rule__BlockShape__WidthAssignment_8 ) ) )
            // InternalTutorial.g:1182:1: ( ( rule__BlockShape__WidthAssignment_8 ) )
            {
            // InternalTutorial.g:1182:1: ( ( rule__BlockShape__WidthAssignment_8 ) )
            // InternalTutorial.g:1183:2: ( rule__BlockShape__WidthAssignment_8 )
            {
             before(grammarAccess.getBlockShapeAccess().getWidthAssignment_8()); 
            // InternalTutorial.g:1184:2: ( rule__BlockShape__WidthAssignment_8 )
            // InternalTutorial.g:1184:3: rule__BlockShape__WidthAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__BlockShape__WidthAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getBlockShapeAccess().getWidthAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__8__Impl"


    // $ANTLR start "rule__BlockShape__Group__9"
    // InternalTutorial.g:1192:1: rule__BlockShape__Group__9 : rule__BlockShape__Group__9__Impl rule__BlockShape__Group__10 ;
    public final void rule__BlockShape__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1196:1: ( rule__BlockShape__Group__9__Impl rule__BlockShape__Group__10 )
            // InternalTutorial.g:1197:2: rule__BlockShape__Group__9__Impl rule__BlockShape__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__BlockShape__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__9"


    // $ANTLR start "rule__BlockShape__Group__9__Impl"
    // InternalTutorial.g:1204:1: rule__BlockShape__Group__9__Impl : ( 'cm' ) ;
    public final void rule__BlockShape__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1208:1: ( ( 'cm' ) )
            // InternalTutorial.g:1209:1: ( 'cm' )
            {
            // InternalTutorial.g:1209:1: ( 'cm' )
            // InternalTutorial.g:1210:2: 'cm'
            {
             before(grammarAccess.getBlockShapeAccess().getCmKeyword_9()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getCmKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__9__Impl"


    // $ANTLR start "rule__BlockShape__Group__10"
    // InternalTutorial.g:1219:1: rule__BlockShape__Group__10 : rule__BlockShape__Group__10__Impl rule__BlockShape__Group__11 ;
    public final void rule__BlockShape__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1223:1: ( rule__BlockShape__Group__10__Impl rule__BlockShape__Group__11 )
            // InternalTutorial.g:1224:2: rule__BlockShape__Group__10__Impl rule__BlockShape__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__BlockShape__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__10"


    // $ANTLR start "rule__BlockShape__Group__10__Impl"
    // InternalTutorial.g:1231:1: rule__BlockShape__Group__10__Impl : ( 'h' ) ;
    public final void rule__BlockShape__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1235:1: ( ( 'h' ) )
            // InternalTutorial.g:1236:1: ( 'h' )
            {
            // InternalTutorial.g:1236:1: ( 'h' )
            // InternalTutorial.g:1237:2: 'h'
            {
             before(grammarAccess.getBlockShapeAccess().getHKeyword_10()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getHKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__10__Impl"


    // $ANTLR start "rule__BlockShape__Group__11"
    // InternalTutorial.g:1246:1: rule__BlockShape__Group__11 : rule__BlockShape__Group__11__Impl rule__BlockShape__Group__12 ;
    public final void rule__BlockShape__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1250:1: ( rule__BlockShape__Group__11__Impl rule__BlockShape__Group__12 )
            // InternalTutorial.g:1251:2: rule__BlockShape__Group__11__Impl rule__BlockShape__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__BlockShape__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__11"


    // $ANTLR start "rule__BlockShape__Group__11__Impl"
    // InternalTutorial.g:1258:1: rule__BlockShape__Group__11__Impl : ( ':' ) ;
    public final void rule__BlockShape__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1262:1: ( ( ':' ) )
            // InternalTutorial.g:1263:1: ( ':' )
            {
            // InternalTutorial.g:1263:1: ( ':' )
            // InternalTutorial.g:1264:2: ':'
            {
             before(grammarAccess.getBlockShapeAccess().getColonKeyword_11()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getColonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__11__Impl"


    // $ANTLR start "rule__BlockShape__Group__12"
    // InternalTutorial.g:1273:1: rule__BlockShape__Group__12 : rule__BlockShape__Group__12__Impl rule__BlockShape__Group__13 ;
    public final void rule__BlockShape__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1277:1: ( rule__BlockShape__Group__12__Impl rule__BlockShape__Group__13 )
            // InternalTutorial.g:1278:2: rule__BlockShape__Group__12__Impl rule__BlockShape__Group__13
            {
            pushFollow(FOLLOW_11);
            rule__BlockShape__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__12"


    // $ANTLR start "rule__BlockShape__Group__12__Impl"
    // InternalTutorial.g:1285:1: rule__BlockShape__Group__12__Impl : ( ( rule__BlockShape__HeigthAssignment_12 ) ) ;
    public final void rule__BlockShape__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1289:1: ( ( ( rule__BlockShape__HeigthAssignment_12 ) ) )
            // InternalTutorial.g:1290:1: ( ( rule__BlockShape__HeigthAssignment_12 ) )
            {
            // InternalTutorial.g:1290:1: ( ( rule__BlockShape__HeigthAssignment_12 ) )
            // InternalTutorial.g:1291:2: ( rule__BlockShape__HeigthAssignment_12 )
            {
             before(grammarAccess.getBlockShapeAccess().getHeigthAssignment_12()); 
            // InternalTutorial.g:1292:2: ( rule__BlockShape__HeigthAssignment_12 )
            // InternalTutorial.g:1292:3: rule__BlockShape__HeigthAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__BlockShape__HeigthAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getBlockShapeAccess().getHeigthAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__12__Impl"


    // $ANTLR start "rule__BlockShape__Group__13"
    // InternalTutorial.g:1300:1: rule__BlockShape__Group__13 : rule__BlockShape__Group__13__Impl rule__BlockShape__Group__14 ;
    public final void rule__BlockShape__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1304:1: ( rule__BlockShape__Group__13__Impl rule__BlockShape__Group__14 )
            // InternalTutorial.g:1305:2: rule__BlockShape__Group__13__Impl rule__BlockShape__Group__14
            {
            pushFollow(FOLLOW_6);
            rule__BlockShape__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__13"


    // $ANTLR start "rule__BlockShape__Group__13__Impl"
    // InternalTutorial.g:1312:1: rule__BlockShape__Group__13__Impl : ( 'cm' ) ;
    public final void rule__BlockShape__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1316:1: ( ( 'cm' ) )
            // InternalTutorial.g:1317:1: ( 'cm' )
            {
            // InternalTutorial.g:1317:1: ( 'cm' )
            // InternalTutorial.g:1318:2: 'cm'
            {
             before(grammarAccess.getBlockShapeAccess().getCmKeyword_13()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getCmKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__13__Impl"


    // $ANTLR start "rule__BlockShape__Group__14"
    // InternalTutorial.g:1327:1: rule__BlockShape__Group__14 : rule__BlockShape__Group__14__Impl ;
    public final void rule__BlockShape__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1331:1: ( rule__BlockShape__Group__14__Impl )
            // InternalTutorial.g:1332:2: rule__BlockShape__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlockShape__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__14"


    // $ANTLR start "rule__BlockShape__Group__14__Impl"
    // InternalTutorial.g:1338:1: rule__BlockShape__Group__14__Impl : ( '}' ) ;
    public final void rule__BlockShape__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1342:1: ( ( '}' ) )
            // InternalTutorial.g:1343:1: ( '}' )
            {
            // InternalTutorial.g:1343:1: ( '}' )
            // InternalTutorial.g:1344:2: '}'
            {
             before(grammarAccess.getBlockShapeAccess().getRightCurlyBracketKeyword_14()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBlockShapeAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__Group__14__Impl"


    // $ANTLR start "rule__BasicItemType__Group__0"
    // InternalTutorial.g:1354:1: rule__BasicItemType__Group__0 : rule__BasicItemType__Group__0__Impl rule__BasicItemType__Group__1 ;
    public final void rule__BasicItemType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1358:1: ( rule__BasicItemType__Group__0__Impl rule__BasicItemType__Group__1 )
            // InternalTutorial.g:1359:2: rule__BasicItemType__Group__0__Impl rule__BasicItemType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BasicItemType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__0"


    // $ANTLR start "rule__BasicItemType__Group__0__Impl"
    // InternalTutorial.g:1366:1: rule__BasicItemType__Group__0__Impl : ( 'basicItemType' ) ;
    public final void rule__BasicItemType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1370:1: ( ( 'basicItemType' ) )
            // InternalTutorial.g:1371:1: ( 'basicItemType' )
            {
            // InternalTutorial.g:1371:1: ( 'basicItemType' )
            // InternalTutorial.g:1372:2: 'basicItemType'
            {
             before(grammarAccess.getBasicItemTypeAccess().getBasicItemTypeKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getBasicItemTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__0__Impl"


    // $ANTLR start "rule__BasicItemType__Group__1"
    // InternalTutorial.g:1381:1: rule__BasicItemType__Group__1 : rule__BasicItemType__Group__1__Impl rule__BasicItemType__Group__2 ;
    public final void rule__BasicItemType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1385:1: ( rule__BasicItemType__Group__1__Impl rule__BasicItemType__Group__2 )
            // InternalTutorial.g:1386:2: rule__BasicItemType__Group__1__Impl rule__BasicItemType__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__BasicItemType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__1"


    // $ANTLR start "rule__BasicItemType__Group__1__Impl"
    // InternalTutorial.g:1393:1: rule__BasicItemType__Group__1__Impl : ( ( rule__BasicItemType__NameAssignment_1 ) ) ;
    public final void rule__BasicItemType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1397:1: ( ( ( rule__BasicItemType__NameAssignment_1 ) ) )
            // InternalTutorial.g:1398:1: ( ( rule__BasicItemType__NameAssignment_1 ) )
            {
            // InternalTutorial.g:1398:1: ( ( rule__BasicItemType__NameAssignment_1 ) )
            // InternalTutorial.g:1399:2: ( rule__BasicItemType__NameAssignment_1 )
            {
             before(grammarAccess.getBasicItemTypeAccess().getNameAssignment_1()); 
            // InternalTutorial.g:1400:2: ( rule__BasicItemType__NameAssignment_1 )
            // InternalTutorial.g:1400:3: rule__BasicItemType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BasicItemType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBasicItemTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__1__Impl"


    // $ANTLR start "rule__BasicItemType__Group__2"
    // InternalTutorial.g:1408:1: rule__BasicItemType__Group__2 : rule__BasicItemType__Group__2__Impl rule__BasicItemType__Group__3 ;
    public final void rule__BasicItemType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1412:1: ( rule__BasicItemType__Group__2__Impl rule__BasicItemType__Group__3 )
            // InternalTutorial.g:1413:2: rule__BasicItemType__Group__2__Impl rule__BasicItemType__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__BasicItemType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__2"


    // $ANTLR start "rule__BasicItemType__Group__2__Impl"
    // InternalTutorial.g:1420:1: rule__BasicItemType__Group__2__Impl : ( '(' ) ;
    public final void rule__BasicItemType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1424:1: ( ( '(' ) )
            // InternalTutorial.g:1425:1: ( '(' )
            {
            // InternalTutorial.g:1425:1: ( '(' )
            // InternalTutorial.g:1426:2: '('
            {
             before(grammarAccess.getBasicItemTypeAccess().getLeftParenthesisKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__2__Impl"


    // $ANTLR start "rule__BasicItemType__Group__3"
    // InternalTutorial.g:1435:1: rule__BasicItemType__Group__3 : rule__BasicItemType__Group__3__Impl rule__BasicItemType__Group__4 ;
    public final void rule__BasicItemType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1439:1: ( rule__BasicItemType__Group__3__Impl rule__BasicItemType__Group__4 )
            // InternalTutorial.g:1440:2: rule__BasicItemType__Group__3__Impl rule__BasicItemType__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__BasicItemType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__3"


    // $ANTLR start "rule__BasicItemType__Group__3__Impl"
    // InternalTutorial.g:1447:1: rule__BasicItemType__Group__3__Impl : ( ( rule__BasicItemType__MaterialAssignment_3 ) ) ;
    public final void rule__BasicItemType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1451:1: ( ( ( rule__BasicItemType__MaterialAssignment_3 ) ) )
            // InternalTutorial.g:1452:1: ( ( rule__BasicItemType__MaterialAssignment_3 ) )
            {
            // InternalTutorial.g:1452:1: ( ( rule__BasicItemType__MaterialAssignment_3 ) )
            // InternalTutorial.g:1453:2: ( rule__BasicItemType__MaterialAssignment_3 )
            {
             before(grammarAccess.getBasicItemTypeAccess().getMaterialAssignment_3()); 
            // InternalTutorial.g:1454:2: ( rule__BasicItemType__MaterialAssignment_3 )
            // InternalTutorial.g:1454:3: rule__BasicItemType__MaterialAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BasicItemType__MaterialAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBasicItemTypeAccess().getMaterialAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__3__Impl"


    // $ANTLR start "rule__BasicItemType__Group__4"
    // InternalTutorial.g:1462:1: rule__BasicItemType__Group__4 : rule__BasicItemType__Group__4__Impl rule__BasicItemType__Group__5 ;
    public final void rule__BasicItemType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1466:1: ( rule__BasicItemType__Group__4__Impl rule__BasicItemType__Group__5 )
            // InternalTutorial.g:1467:2: rule__BasicItemType__Group__4__Impl rule__BasicItemType__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__BasicItemType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__4"


    // $ANTLR start "rule__BasicItemType__Group__4__Impl"
    // InternalTutorial.g:1474:1: rule__BasicItemType__Group__4__Impl : ( ')' ) ;
    public final void rule__BasicItemType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1478:1: ( ( ')' ) )
            // InternalTutorial.g:1479:1: ( ')' )
            {
            // InternalTutorial.g:1479:1: ( ')' )
            // InternalTutorial.g:1480:2: ')'
            {
             before(grammarAccess.getBasicItemTypeAccess().getRightParenthesisKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__4__Impl"


    // $ANTLR start "rule__BasicItemType__Group__5"
    // InternalTutorial.g:1489:1: rule__BasicItemType__Group__5 : rule__BasicItemType__Group__5__Impl rule__BasicItemType__Group__6 ;
    public final void rule__BasicItemType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1493:1: ( rule__BasicItemType__Group__5__Impl rule__BasicItemType__Group__6 )
            // InternalTutorial.g:1494:2: rule__BasicItemType__Group__5__Impl rule__BasicItemType__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__BasicItemType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__5"


    // $ANTLR start "rule__BasicItemType__Group__5__Impl"
    // InternalTutorial.g:1501:1: rule__BasicItemType__Group__5__Impl : ( '{' ) ;
    public final void rule__BasicItemType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1505:1: ( ( '{' ) )
            // InternalTutorial.g:1506:1: ( '{' )
            {
            // InternalTutorial.g:1506:1: ( '{' )
            // InternalTutorial.g:1507:2: '{'
            {
             before(grammarAccess.getBasicItemTypeAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__5__Impl"


    // $ANTLR start "rule__BasicItemType__Group__6"
    // InternalTutorial.g:1516:1: rule__BasicItemType__Group__6 : rule__BasicItemType__Group__6__Impl rule__BasicItemType__Group__7 ;
    public final void rule__BasicItemType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1520:1: ( rule__BasicItemType__Group__6__Impl rule__BasicItemType__Group__7 )
            // InternalTutorial.g:1521:2: rule__BasicItemType__Group__6__Impl rule__BasicItemType__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__BasicItemType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__6"


    // $ANTLR start "rule__BasicItemType__Group__6__Impl"
    // InternalTutorial.g:1528:1: rule__BasicItemType__Group__6__Impl : ( 'shape' ) ;
    public final void rule__BasicItemType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1532:1: ( ( 'shape' ) )
            // InternalTutorial.g:1533:1: ( 'shape' )
            {
            // InternalTutorial.g:1533:1: ( 'shape' )
            // InternalTutorial.g:1534:2: 'shape'
            {
             before(grammarAccess.getBasicItemTypeAccess().getShapeKeyword_6()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getShapeKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__6__Impl"


    // $ANTLR start "rule__BasicItemType__Group__7"
    // InternalTutorial.g:1543:1: rule__BasicItemType__Group__7 : rule__BasicItemType__Group__7__Impl rule__BasicItemType__Group__8 ;
    public final void rule__BasicItemType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1547:1: ( rule__BasicItemType__Group__7__Impl rule__BasicItemType__Group__8 )
            // InternalTutorial.g:1548:2: rule__BasicItemType__Group__7__Impl rule__BasicItemType__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__BasicItemType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__7"


    // $ANTLR start "rule__BasicItemType__Group__7__Impl"
    // InternalTutorial.g:1555:1: rule__BasicItemType__Group__7__Impl : ( ':' ) ;
    public final void rule__BasicItemType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1559:1: ( ( ':' ) )
            // InternalTutorial.g:1560:1: ( ':' )
            {
            // InternalTutorial.g:1560:1: ( ':' )
            // InternalTutorial.g:1561:2: ':'
            {
             before(grammarAccess.getBasicItemTypeAccess().getColonKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__7__Impl"


    // $ANTLR start "rule__BasicItemType__Group__8"
    // InternalTutorial.g:1570:1: rule__BasicItemType__Group__8 : rule__BasicItemType__Group__8__Impl rule__BasicItemType__Group__9 ;
    public final void rule__BasicItemType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1574:1: ( rule__BasicItemType__Group__8__Impl rule__BasicItemType__Group__9 )
            // InternalTutorial.g:1575:2: rule__BasicItemType__Group__8__Impl rule__BasicItemType__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__BasicItemType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__8"


    // $ANTLR start "rule__BasicItemType__Group__8__Impl"
    // InternalTutorial.g:1582:1: rule__BasicItemType__Group__8__Impl : ( ( rule__BasicItemType__ShapeAssignment_8 ) ) ;
    public final void rule__BasicItemType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1586:1: ( ( ( rule__BasicItemType__ShapeAssignment_8 ) ) )
            // InternalTutorial.g:1587:1: ( ( rule__BasicItemType__ShapeAssignment_8 ) )
            {
            // InternalTutorial.g:1587:1: ( ( rule__BasicItemType__ShapeAssignment_8 ) )
            // InternalTutorial.g:1588:2: ( rule__BasicItemType__ShapeAssignment_8 )
            {
             before(grammarAccess.getBasicItemTypeAccess().getShapeAssignment_8()); 
            // InternalTutorial.g:1589:2: ( rule__BasicItemType__ShapeAssignment_8 )
            // InternalTutorial.g:1589:3: rule__BasicItemType__ShapeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__BasicItemType__ShapeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getBasicItemTypeAccess().getShapeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__8__Impl"


    // $ANTLR start "rule__BasicItemType__Group__9"
    // InternalTutorial.g:1597:1: rule__BasicItemType__Group__9 : rule__BasicItemType__Group__9__Impl rule__BasicItemType__Group__10 ;
    public final void rule__BasicItemType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1601:1: ( rule__BasicItemType__Group__9__Impl rule__BasicItemType__Group__10 )
            // InternalTutorial.g:1602:2: rule__BasicItemType__Group__9__Impl rule__BasicItemType__Group__10
            {
            pushFollow(FOLLOW_21);
            rule__BasicItemType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__9"


    // $ANTLR start "rule__BasicItemType__Group__9__Impl"
    // InternalTutorial.g:1609:1: rule__BasicItemType__Group__9__Impl : ( ( rule__BasicItemType__ColorAssignment_9 ) ) ;
    public final void rule__BasicItemType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1613:1: ( ( ( rule__BasicItemType__ColorAssignment_9 ) ) )
            // InternalTutorial.g:1614:1: ( ( rule__BasicItemType__ColorAssignment_9 ) )
            {
            // InternalTutorial.g:1614:1: ( ( rule__BasicItemType__ColorAssignment_9 ) )
            // InternalTutorial.g:1615:2: ( rule__BasicItemType__ColorAssignment_9 )
            {
             before(grammarAccess.getBasicItemTypeAccess().getColorAssignment_9()); 
            // InternalTutorial.g:1616:2: ( rule__BasicItemType__ColorAssignment_9 )
            // InternalTutorial.g:1616:3: rule__BasicItemType__ColorAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__BasicItemType__ColorAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getBasicItemTypeAccess().getColorAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__9__Impl"


    // $ANTLR start "rule__BasicItemType__Group__10"
    // InternalTutorial.g:1624:1: rule__BasicItemType__Group__10 : rule__BasicItemType__Group__10__Impl rule__BasicItemType__Group__11 ;
    public final void rule__BasicItemType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1628:1: ( rule__BasicItemType__Group__10__Impl rule__BasicItemType__Group__11 )
            // InternalTutorial.g:1629:2: rule__BasicItemType__Group__10__Impl rule__BasicItemType__Group__11
            {
            pushFollow(FOLLOW_21);
            rule__BasicItemType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__10"


    // $ANTLR start "rule__BasicItemType__Group__10__Impl"
    // InternalTutorial.g:1636:1: rule__BasicItemType__Group__10__Impl : ( ( rule__BasicItemType__Group_10__0 )? ) ;
    public final void rule__BasicItemType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1640:1: ( ( ( rule__BasicItemType__Group_10__0 )? ) )
            // InternalTutorial.g:1641:1: ( ( rule__BasicItemType__Group_10__0 )? )
            {
            // InternalTutorial.g:1641:1: ( ( rule__BasicItemType__Group_10__0 )? )
            // InternalTutorial.g:1642:2: ( rule__BasicItemType__Group_10__0 )?
            {
             before(grammarAccess.getBasicItemTypeAccess().getGroup_10()); 
            // InternalTutorial.g:1643:2: ( rule__BasicItemType__Group_10__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTutorial.g:1643:3: rule__BasicItemType__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicItemType__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBasicItemTypeAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__10__Impl"


    // $ANTLR start "rule__BasicItemType__Group__11"
    // InternalTutorial.g:1651:1: rule__BasicItemType__Group__11 : rule__BasicItemType__Group__11__Impl ;
    public final void rule__BasicItemType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1655:1: ( rule__BasicItemType__Group__11__Impl )
            // InternalTutorial.g:1656:2: rule__BasicItemType__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__11"


    // $ANTLR start "rule__BasicItemType__Group__11__Impl"
    // InternalTutorial.g:1662:1: rule__BasicItemType__Group__11__Impl : ( '}' ) ;
    public final void rule__BasicItemType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1666:1: ( ( '}' ) )
            // InternalTutorial.g:1667:1: ( '}' )
            {
            // InternalTutorial.g:1667:1: ( '}' )
            // InternalTutorial.g:1668:2: '}'
            {
             before(grammarAccess.getBasicItemTypeAccess().getRightCurlyBracketKeyword_11()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group__11__Impl"


    // $ANTLR start "rule__BasicItemType__Group_10__0"
    // InternalTutorial.g:1678:1: rule__BasicItemType__Group_10__0 : rule__BasicItemType__Group_10__0__Impl rule__BasicItemType__Group_10__1 ;
    public final void rule__BasicItemType__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1682:1: ( rule__BasicItemType__Group_10__0__Impl rule__BasicItemType__Group_10__1 )
            // InternalTutorial.g:1683:2: rule__BasicItemType__Group_10__0__Impl rule__BasicItemType__Group_10__1
            {
            pushFollow(FOLLOW_9);
            rule__BasicItemType__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group_10__0"


    // $ANTLR start "rule__BasicItemType__Group_10__0__Impl"
    // InternalTutorial.g:1690:1: rule__BasicItemType__Group_10__0__Impl : ( 'markers' ) ;
    public final void rule__BasicItemType__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1694:1: ( ( 'markers' ) )
            // InternalTutorial.g:1695:1: ( 'markers' )
            {
            // InternalTutorial.g:1695:1: ( 'markers' )
            // InternalTutorial.g:1696:2: 'markers'
            {
             before(grammarAccess.getBasicItemTypeAccess().getMarkersKeyword_10_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getMarkersKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group_10__0__Impl"


    // $ANTLR start "rule__BasicItemType__Group_10__1"
    // InternalTutorial.g:1705:1: rule__BasicItemType__Group_10__1 : rule__BasicItemType__Group_10__1__Impl rule__BasicItemType__Group_10__2 ;
    public final void rule__BasicItemType__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1709:1: ( rule__BasicItemType__Group_10__1__Impl rule__BasicItemType__Group_10__2 )
            // InternalTutorial.g:1710:2: rule__BasicItemType__Group_10__1__Impl rule__BasicItemType__Group_10__2
            {
            pushFollow(FOLLOW_4);
            rule__BasicItemType__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group_10__1"


    // $ANTLR start "rule__BasicItemType__Group_10__1__Impl"
    // InternalTutorial.g:1717:1: rule__BasicItemType__Group_10__1__Impl : ( ':' ) ;
    public final void rule__BasicItemType__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1721:1: ( ( ':' ) )
            // InternalTutorial.g:1722:1: ( ':' )
            {
            // InternalTutorial.g:1722:1: ( ':' )
            // InternalTutorial.g:1723:2: ':'
            {
             before(grammarAccess.getBasicItemTypeAccess().getColonKeyword_10_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getColonKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group_10__1__Impl"


    // $ANTLR start "rule__BasicItemType__Group_10__2"
    // InternalTutorial.g:1732:1: rule__BasicItemType__Group_10__2 : rule__BasicItemType__Group_10__2__Impl rule__BasicItemType__Group_10__3 ;
    public final void rule__BasicItemType__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1736:1: ( rule__BasicItemType__Group_10__2__Impl rule__BasicItemType__Group_10__3 )
            // InternalTutorial.g:1737:2: rule__BasicItemType__Group_10__2__Impl rule__BasicItemType__Group_10__3
            {
            pushFollow(FOLLOW_3);
            rule__BasicItemType__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group_10__2"


    // $ANTLR start "rule__BasicItemType__Group_10__2__Impl"
    // InternalTutorial.g:1744:1: rule__BasicItemType__Group_10__2__Impl : ( '{' ) ;
    public final void rule__BasicItemType__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1748:1: ( ( '{' ) )
            // InternalTutorial.g:1749:1: ( '{' )
            {
            // InternalTutorial.g:1749:1: ( '{' )
            // InternalTutorial.g:1750:2: '{'
            {
             before(grammarAccess.getBasicItemTypeAccess().getLeftCurlyBracketKeyword_10_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getLeftCurlyBracketKeyword_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group_10__2__Impl"


    // $ANTLR start "rule__BasicItemType__Group_10__3"
    // InternalTutorial.g:1759:1: rule__BasicItemType__Group_10__3 : rule__BasicItemType__Group_10__3__Impl rule__BasicItemType__Group_10__4 ;
    public final void rule__BasicItemType__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1763:1: ( rule__BasicItemType__Group_10__3__Impl rule__BasicItemType__Group_10__4 )
            // InternalTutorial.g:1764:2: rule__BasicItemType__Group_10__3__Impl rule__BasicItemType__Group_10__4
            {
            pushFollow(FOLLOW_6);
            rule__BasicItemType__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group_10__3"


    // $ANTLR start "rule__BasicItemType__Group_10__3__Impl"
    // InternalTutorial.g:1771:1: rule__BasicItemType__Group_10__3__Impl : ( ( ( rule__BasicItemType__MarkersAssignment_10_3 ) ) ( ( rule__BasicItemType__MarkersAssignment_10_3 )* ) ) ;
    public final void rule__BasicItemType__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1775:1: ( ( ( ( rule__BasicItemType__MarkersAssignment_10_3 ) ) ( ( rule__BasicItemType__MarkersAssignment_10_3 )* ) ) )
            // InternalTutorial.g:1776:1: ( ( ( rule__BasicItemType__MarkersAssignment_10_3 ) ) ( ( rule__BasicItemType__MarkersAssignment_10_3 )* ) )
            {
            // InternalTutorial.g:1776:1: ( ( ( rule__BasicItemType__MarkersAssignment_10_3 ) ) ( ( rule__BasicItemType__MarkersAssignment_10_3 )* ) )
            // InternalTutorial.g:1777:2: ( ( rule__BasicItemType__MarkersAssignment_10_3 ) ) ( ( rule__BasicItemType__MarkersAssignment_10_3 )* )
            {
            // InternalTutorial.g:1777:2: ( ( rule__BasicItemType__MarkersAssignment_10_3 ) )
            // InternalTutorial.g:1778:3: ( rule__BasicItemType__MarkersAssignment_10_3 )
            {
             before(grammarAccess.getBasicItemTypeAccess().getMarkersAssignment_10_3()); 
            // InternalTutorial.g:1779:3: ( rule__BasicItemType__MarkersAssignment_10_3 )
            // InternalTutorial.g:1779:4: rule__BasicItemType__MarkersAssignment_10_3
            {
            pushFollow(FOLLOW_22);
            rule__BasicItemType__MarkersAssignment_10_3();

            state._fsp--;


            }

             after(grammarAccess.getBasicItemTypeAccess().getMarkersAssignment_10_3()); 

            }

            // InternalTutorial.g:1782:2: ( ( rule__BasicItemType__MarkersAssignment_10_3 )* )
            // InternalTutorial.g:1783:3: ( rule__BasicItemType__MarkersAssignment_10_3 )*
            {
             before(grammarAccess.getBasicItemTypeAccess().getMarkersAssignment_10_3()); 
            // InternalTutorial.g:1784:3: ( rule__BasicItemType__MarkersAssignment_10_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTutorial.g:1784:4: rule__BasicItemType__MarkersAssignment_10_3
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__BasicItemType__MarkersAssignment_10_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getBasicItemTypeAccess().getMarkersAssignment_10_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group_10__3__Impl"


    // $ANTLR start "rule__BasicItemType__Group_10__4"
    // InternalTutorial.g:1793:1: rule__BasicItemType__Group_10__4 : rule__BasicItemType__Group_10__4__Impl ;
    public final void rule__BasicItemType__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1797:1: ( rule__BasicItemType__Group_10__4__Impl )
            // InternalTutorial.g:1798:2: rule__BasicItemType__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicItemType__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group_10__4"


    // $ANTLR start "rule__BasicItemType__Group_10__4__Impl"
    // InternalTutorial.g:1804:1: rule__BasicItemType__Group_10__4__Impl : ( '}' ) ;
    public final void rule__BasicItemType__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1808:1: ( ( '}' ) )
            // InternalTutorial.g:1809:1: ( '}' )
            {
            // InternalTutorial.g:1809:1: ( '}' )
            // InternalTutorial.g:1810:2: '}'
            {
             before(grammarAccess.getBasicItemTypeAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getRightCurlyBracketKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__Group_10__4__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__0"
    // InternalTutorial.g:1820:1: rule__ComplexItemType__Group__0 : rule__ComplexItemType__Group__0__Impl rule__ComplexItemType__Group__1 ;
    public final void rule__ComplexItemType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1824:1: ( rule__ComplexItemType__Group__0__Impl rule__ComplexItemType__Group__1 )
            // InternalTutorial.g:1825:2: rule__ComplexItemType__Group__0__Impl rule__ComplexItemType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ComplexItemType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__0"


    // $ANTLR start "rule__ComplexItemType__Group__0__Impl"
    // InternalTutorial.g:1832:1: rule__ComplexItemType__Group__0__Impl : ( 'complexItemType' ) ;
    public final void rule__ComplexItemType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1836:1: ( ( 'complexItemType' ) )
            // InternalTutorial.g:1837:1: ( 'complexItemType' )
            {
            // InternalTutorial.g:1837:1: ( 'complexItemType' )
            // InternalTutorial.g:1838:2: 'complexItemType'
            {
             before(grammarAccess.getComplexItemTypeAccess().getComplexItemTypeKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getComplexItemTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__0__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__1"
    // InternalTutorial.g:1847:1: rule__ComplexItemType__Group__1 : rule__ComplexItemType__Group__1__Impl rule__ComplexItemType__Group__2 ;
    public final void rule__ComplexItemType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1851:1: ( rule__ComplexItemType__Group__1__Impl rule__ComplexItemType__Group__2 )
            // InternalTutorial.g:1852:2: rule__ComplexItemType__Group__1__Impl rule__ComplexItemType__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ComplexItemType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__1"


    // $ANTLR start "rule__ComplexItemType__Group__1__Impl"
    // InternalTutorial.g:1859:1: rule__ComplexItemType__Group__1__Impl : ( ( rule__ComplexItemType__NameAssignment_1 ) ) ;
    public final void rule__ComplexItemType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1863:1: ( ( ( rule__ComplexItemType__NameAssignment_1 ) ) )
            // InternalTutorial.g:1864:1: ( ( rule__ComplexItemType__NameAssignment_1 ) )
            {
            // InternalTutorial.g:1864:1: ( ( rule__ComplexItemType__NameAssignment_1 ) )
            // InternalTutorial.g:1865:2: ( rule__ComplexItemType__NameAssignment_1 )
            {
             before(grammarAccess.getComplexItemTypeAccess().getNameAssignment_1()); 
            // InternalTutorial.g:1866:2: ( rule__ComplexItemType__NameAssignment_1 )
            // InternalTutorial.g:1866:3: rule__ComplexItemType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComplexItemType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexItemTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__1__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__2"
    // InternalTutorial.g:1874:1: rule__ComplexItemType__Group__2 : rule__ComplexItemType__Group__2__Impl rule__ComplexItemType__Group__3 ;
    public final void rule__ComplexItemType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1878:1: ( rule__ComplexItemType__Group__2__Impl rule__ComplexItemType__Group__3 )
            // InternalTutorial.g:1879:2: rule__ComplexItemType__Group__2__Impl rule__ComplexItemType__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__ComplexItemType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__2"


    // $ANTLR start "rule__ComplexItemType__Group__2__Impl"
    // InternalTutorial.g:1886:1: rule__ComplexItemType__Group__2__Impl : ( '{' ) ;
    public final void rule__ComplexItemType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1890:1: ( ( '{' ) )
            // InternalTutorial.g:1891:1: ( '{' )
            {
            // InternalTutorial.g:1891:1: ( '{' )
            // InternalTutorial.g:1892:2: '{'
            {
             before(grammarAccess.getComplexItemTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__2__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__3"
    // InternalTutorial.g:1901:1: rule__ComplexItemType__Group__3 : rule__ComplexItemType__Group__3__Impl rule__ComplexItemType__Group__4 ;
    public final void rule__ComplexItemType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1905:1: ( rule__ComplexItemType__Group__3__Impl rule__ComplexItemType__Group__4 )
            // InternalTutorial.g:1906:2: rule__ComplexItemType__Group__3__Impl rule__ComplexItemType__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ComplexItemType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__3"


    // $ANTLR start "rule__ComplexItemType__Group__3__Impl"
    // InternalTutorial.g:1913:1: rule__ComplexItemType__Group__3__Impl : ( 'components' ) ;
    public final void rule__ComplexItemType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1917:1: ( ( 'components' ) )
            // InternalTutorial.g:1918:1: ( 'components' )
            {
            // InternalTutorial.g:1918:1: ( 'components' )
            // InternalTutorial.g:1919:2: 'components'
            {
             before(grammarAccess.getComplexItemTypeAccess().getComponentsKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getComponentsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__3__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__4"
    // InternalTutorial.g:1928:1: rule__ComplexItemType__Group__4 : rule__ComplexItemType__Group__4__Impl rule__ComplexItemType__Group__5 ;
    public final void rule__ComplexItemType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1932:1: ( rule__ComplexItemType__Group__4__Impl rule__ComplexItemType__Group__5 )
            // InternalTutorial.g:1933:2: rule__ComplexItemType__Group__4__Impl rule__ComplexItemType__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__ComplexItemType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__4"


    // $ANTLR start "rule__ComplexItemType__Group__4__Impl"
    // InternalTutorial.g:1940:1: rule__ComplexItemType__Group__4__Impl : ( ':' ) ;
    public final void rule__ComplexItemType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1944:1: ( ( ':' ) )
            // InternalTutorial.g:1945:1: ( ':' )
            {
            // InternalTutorial.g:1945:1: ( ':' )
            // InternalTutorial.g:1946:2: ':'
            {
             before(grammarAccess.getComplexItemTypeAccess().getColonKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__4__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__5"
    // InternalTutorial.g:1955:1: rule__ComplexItemType__Group__5 : rule__ComplexItemType__Group__5__Impl rule__ComplexItemType__Group__6 ;
    public final void rule__ComplexItemType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1959:1: ( rule__ComplexItemType__Group__5__Impl rule__ComplexItemType__Group__6 )
            // InternalTutorial.g:1960:2: rule__ComplexItemType__Group__5__Impl rule__ComplexItemType__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__ComplexItemType__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__5"


    // $ANTLR start "rule__ComplexItemType__Group__5__Impl"
    // InternalTutorial.g:1967:1: rule__ComplexItemType__Group__5__Impl : ( '{' ) ;
    public final void rule__ComplexItemType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1971:1: ( ( '{' ) )
            // InternalTutorial.g:1972:1: ( '{' )
            {
            // InternalTutorial.g:1972:1: ( '{' )
            // InternalTutorial.g:1973:2: '{'
            {
             before(grammarAccess.getComplexItemTypeAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__5__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__6"
    // InternalTutorial.g:1982:1: rule__ComplexItemType__Group__6 : rule__ComplexItemType__Group__6__Impl rule__ComplexItemType__Group__7 ;
    public final void rule__ComplexItemType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1986:1: ( rule__ComplexItemType__Group__6__Impl rule__ComplexItemType__Group__7 )
            // InternalTutorial.g:1987:2: rule__ComplexItemType__Group__6__Impl rule__ComplexItemType__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__ComplexItemType__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__6"


    // $ANTLR start "rule__ComplexItemType__Group__6__Impl"
    // InternalTutorial.g:1994:1: rule__ComplexItemType__Group__6__Impl : ( ( rule__ComplexItemType__ComponentsAssignment_6 ) ) ;
    public final void rule__ComplexItemType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:1998:1: ( ( ( rule__ComplexItemType__ComponentsAssignment_6 ) ) )
            // InternalTutorial.g:1999:1: ( ( rule__ComplexItemType__ComponentsAssignment_6 ) )
            {
            // InternalTutorial.g:1999:1: ( ( rule__ComplexItemType__ComponentsAssignment_6 ) )
            // InternalTutorial.g:2000:2: ( rule__ComplexItemType__ComponentsAssignment_6 )
            {
             before(grammarAccess.getComplexItemTypeAccess().getComponentsAssignment_6()); 
            // InternalTutorial.g:2001:2: ( rule__ComplexItemType__ComponentsAssignment_6 )
            // InternalTutorial.g:2001:3: rule__ComplexItemType__ComponentsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ComplexItemType__ComponentsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getComplexItemTypeAccess().getComponentsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__6__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__7"
    // InternalTutorial.g:2009:1: rule__ComplexItemType__Group__7 : rule__ComplexItemType__Group__7__Impl rule__ComplexItemType__Group__8 ;
    public final void rule__ComplexItemType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2013:1: ( rule__ComplexItemType__Group__7__Impl rule__ComplexItemType__Group__8 )
            // InternalTutorial.g:2014:2: rule__ComplexItemType__Group__7__Impl rule__ComplexItemType__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__ComplexItemType__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__7"


    // $ANTLR start "rule__ComplexItemType__Group__7__Impl"
    // InternalTutorial.g:2021:1: rule__ComplexItemType__Group__7__Impl : ( ( ( rule__ComplexItemType__ComponentsAssignment_7 ) ) ( ( rule__ComplexItemType__ComponentsAssignment_7 )* ) ) ;
    public final void rule__ComplexItemType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2025:1: ( ( ( ( rule__ComplexItemType__ComponentsAssignment_7 ) ) ( ( rule__ComplexItemType__ComponentsAssignment_7 )* ) ) )
            // InternalTutorial.g:2026:1: ( ( ( rule__ComplexItemType__ComponentsAssignment_7 ) ) ( ( rule__ComplexItemType__ComponentsAssignment_7 )* ) )
            {
            // InternalTutorial.g:2026:1: ( ( ( rule__ComplexItemType__ComponentsAssignment_7 ) ) ( ( rule__ComplexItemType__ComponentsAssignment_7 )* ) )
            // InternalTutorial.g:2027:2: ( ( rule__ComplexItemType__ComponentsAssignment_7 ) ) ( ( rule__ComplexItemType__ComponentsAssignment_7 )* )
            {
            // InternalTutorial.g:2027:2: ( ( rule__ComplexItemType__ComponentsAssignment_7 ) )
            // InternalTutorial.g:2028:3: ( rule__ComplexItemType__ComponentsAssignment_7 )
            {
             before(grammarAccess.getComplexItemTypeAccess().getComponentsAssignment_7()); 
            // InternalTutorial.g:2029:3: ( rule__ComplexItemType__ComponentsAssignment_7 )
            // InternalTutorial.g:2029:4: rule__ComplexItemType__ComponentsAssignment_7
            {
            pushFollow(FOLLOW_22);
            rule__ComplexItemType__ComponentsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getComplexItemTypeAccess().getComponentsAssignment_7()); 

            }

            // InternalTutorial.g:2032:2: ( ( rule__ComplexItemType__ComponentsAssignment_7 )* )
            // InternalTutorial.g:2033:3: ( rule__ComplexItemType__ComponentsAssignment_7 )*
            {
             before(grammarAccess.getComplexItemTypeAccess().getComponentsAssignment_7()); 
            // InternalTutorial.g:2034:3: ( rule__ComplexItemType__ComponentsAssignment_7 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTutorial.g:2034:4: rule__ComplexItemType__ComponentsAssignment_7
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ComplexItemType__ComponentsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getComplexItemTypeAccess().getComponentsAssignment_7()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__7__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__8"
    // InternalTutorial.g:2043:1: rule__ComplexItemType__Group__8 : rule__ComplexItemType__Group__8__Impl rule__ComplexItemType__Group__9 ;
    public final void rule__ComplexItemType__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2047:1: ( rule__ComplexItemType__Group__8__Impl rule__ComplexItemType__Group__9 )
            // InternalTutorial.g:2048:2: rule__ComplexItemType__Group__8__Impl rule__ComplexItemType__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__ComplexItemType__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__8"


    // $ANTLR start "rule__ComplexItemType__Group__8__Impl"
    // InternalTutorial.g:2055:1: rule__ComplexItemType__Group__8__Impl : ( '}' ) ;
    public final void rule__ComplexItemType__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2059:1: ( ( '}' ) )
            // InternalTutorial.g:2060:1: ( '}' )
            {
            // InternalTutorial.g:2060:1: ( '}' )
            // InternalTutorial.g:2061:2: '}'
            {
             before(grammarAccess.getComplexItemTypeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__8__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__9"
    // InternalTutorial.g:2070:1: rule__ComplexItemType__Group__9 : rule__ComplexItemType__Group__9__Impl rule__ComplexItemType__Group__10 ;
    public final void rule__ComplexItemType__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2074:1: ( rule__ComplexItemType__Group__9__Impl rule__ComplexItemType__Group__10 )
            // InternalTutorial.g:2075:2: rule__ComplexItemType__Group__9__Impl rule__ComplexItemType__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__ComplexItemType__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__9"


    // $ANTLR start "rule__ComplexItemType__Group__9__Impl"
    // InternalTutorial.g:2082:1: rule__ComplexItemType__Group__9__Impl : ( 'connections' ) ;
    public final void rule__ComplexItemType__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2086:1: ( ( 'connections' ) )
            // InternalTutorial.g:2087:1: ( 'connections' )
            {
            // InternalTutorial.g:2087:1: ( 'connections' )
            // InternalTutorial.g:2088:2: 'connections'
            {
             before(grammarAccess.getComplexItemTypeAccess().getConnectionsKeyword_9()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getConnectionsKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__9__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__10"
    // InternalTutorial.g:2097:1: rule__ComplexItemType__Group__10 : rule__ComplexItemType__Group__10__Impl rule__ComplexItemType__Group__11 ;
    public final void rule__ComplexItemType__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2101:1: ( rule__ComplexItemType__Group__10__Impl rule__ComplexItemType__Group__11 )
            // InternalTutorial.g:2102:2: rule__ComplexItemType__Group__10__Impl rule__ComplexItemType__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__ComplexItemType__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__10"


    // $ANTLR start "rule__ComplexItemType__Group__10__Impl"
    // InternalTutorial.g:2109:1: rule__ComplexItemType__Group__10__Impl : ( ':' ) ;
    public final void rule__ComplexItemType__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2113:1: ( ( ':' ) )
            // InternalTutorial.g:2114:1: ( ':' )
            {
            // InternalTutorial.g:2114:1: ( ':' )
            // InternalTutorial.g:2115:2: ':'
            {
             before(grammarAccess.getComplexItemTypeAccess().getColonKeyword_10()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getColonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__10__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__11"
    // InternalTutorial.g:2124:1: rule__ComplexItemType__Group__11 : rule__ComplexItemType__Group__11__Impl rule__ComplexItemType__Group__12 ;
    public final void rule__ComplexItemType__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2128:1: ( rule__ComplexItemType__Group__11__Impl rule__ComplexItemType__Group__12 )
            // InternalTutorial.g:2129:2: rule__ComplexItemType__Group__11__Impl rule__ComplexItemType__Group__12
            {
            pushFollow(FOLLOW_3);
            rule__ComplexItemType__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__11"


    // $ANTLR start "rule__ComplexItemType__Group__11__Impl"
    // InternalTutorial.g:2136:1: rule__ComplexItemType__Group__11__Impl : ( '{' ) ;
    public final void rule__ComplexItemType__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2140:1: ( ( '{' ) )
            // InternalTutorial.g:2141:1: ( '{' )
            {
            // InternalTutorial.g:2141:1: ( '{' )
            // InternalTutorial.g:2142:2: '{'
            {
             before(grammarAccess.getComplexItemTypeAccess().getLeftCurlyBracketKeyword_11()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getLeftCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__11__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__12"
    // InternalTutorial.g:2151:1: rule__ComplexItemType__Group__12 : rule__ComplexItemType__Group__12__Impl rule__ComplexItemType__Group__13 ;
    public final void rule__ComplexItemType__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2155:1: ( rule__ComplexItemType__Group__12__Impl rule__ComplexItemType__Group__13 )
            // InternalTutorial.g:2156:2: rule__ComplexItemType__Group__12__Impl rule__ComplexItemType__Group__13
            {
            pushFollow(FOLLOW_6);
            rule__ComplexItemType__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__12"


    // $ANTLR start "rule__ComplexItemType__Group__12__Impl"
    // InternalTutorial.g:2163:1: rule__ComplexItemType__Group__12__Impl : ( ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 ) ) ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 )* ) ) ;
    public final void rule__ComplexItemType__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2167:1: ( ( ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 ) ) ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 )* ) ) )
            // InternalTutorial.g:2168:1: ( ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 ) ) ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 )* ) )
            {
            // InternalTutorial.g:2168:1: ( ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 ) ) ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 )* ) )
            // InternalTutorial.g:2169:2: ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 ) ) ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 )* )
            {
            // InternalTutorial.g:2169:2: ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 ) )
            // InternalTutorial.g:2170:3: ( rule__ComplexItemType__ItemConnectionsAssignment_12 )
            {
             before(grammarAccess.getComplexItemTypeAccess().getItemConnectionsAssignment_12()); 
            // InternalTutorial.g:2171:3: ( rule__ComplexItemType__ItemConnectionsAssignment_12 )
            // InternalTutorial.g:2171:4: rule__ComplexItemType__ItemConnectionsAssignment_12
            {
            pushFollow(FOLLOW_22);
            rule__ComplexItemType__ItemConnectionsAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getComplexItemTypeAccess().getItemConnectionsAssignment_12()); 

            }

            // InternalTutorial.g:2174:2: ( ( rule__ComplexItemType__ItemConnectionsAssignment_12 )* )
            // InternalTutorial.g:2175:3: ( rule__ComplexItemType__ItemConnectionsAssignment_12 )*
            {
             before(grammarAccess.getComplexItemTypeAccess().getItemConnectionsAssignment_12()); 
            // InternalTutorial.g:2176:3: ( rule__ComplexItemType__ItemConnectionsAssignment_12 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTutorial.g:2176:4: rule__ComplexItemType__ItemConnectionsAssignment_12
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__ComplexItemType__ItemConnectionsAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getComplexItemTypeAccess().getItemConnectionsAssignment_12()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__12__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__13"
    // InternalTutorial.g:2185:1: rule__ComplexItemType__Group__13 : rule__ComplexItemType__Group__13__Impl rule__ComplexItemType__Group__14 ;
    public final void rule__ComplexItemType__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2189:1: ( rule__ComplexItemType__Group__13__Impl rule__ComplexItemType__Group__14 )
            // InternalTutorial.g:2190:2: rule__ComplexItemType__Group__13__Impl rule__ComplexItemType__Group__14
            {
            pushFollow(FOLLOW_6);
            rule__ComplexItemType__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__13"


    // $ANTLR start "rule__ComplexItemType__Group__13__Impl"
    // InternalTutorial.g:2197:1: rule__ComplexItemType__Group__13__Impl : ( '}' ) ;
    public final void rule__ComplexItemType__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2201:1: ( ( '}' ) )
            // InternalTutorial.g:2202:1: ( '}' )
            {
            // InternalTutorial.g:2202:1: ( '}' )
            // InternalTutorial.g:2203:2: '}'
            {
             before(grammarAccess.getComplexItemTypeAccess().getRightCurlyBracketKeyword_13()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__13__Impl"


    // $ANTLR start "rule__ComplexItemType__Group__14"
    // InternalTutorial.g:2212:1: rule__ComplexItemType__Group__14 : rule__ComplexItemType__Group__14__Impl ;
    public final void rule__ComplexItemType__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2216:1: ( rule__ComplexItemType__Group__14__Impl )
            // InternalTutorial.g:2217:2: rule__ComplexItemType__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexItemType__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__14"


    // $ANTLR start "rule__ComplexItemType__Group__14__Impl"
    // InternalTutorial.g:2223:1: rule__ComplexItemType__Group__14__Impl : ( '}' ) ;
    public final void rule__ComplexItemType__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2227:1: ( ( '}' ) )
            // InternalTutorial.g:2228:1: ( '}' )
            {
            // InternalTutorial.g:2228:1: ( '}' )
            // InternalTutorial.g:2229:2: '}'
            {
             before(grammarAccess.getComplexItemTypeAccess().getRightCurlyBracketKeyword_14()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__Group__14__Impl"


    // $ANTLR start "rule__Color__Group__0"
    // InternalTutorial.g:2239:1: rule__Color__Group__0 : rule__Color__Group__0__Impl rule__Color__Group__1 ;
    public final void rule__Color__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2243:1: ( rule__Color__Group__0__Impl rule__Color__Group__1 )
            // InternalTutorial.g:2244:2: rule__Color__Group__0__Impl rule__Color__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Color__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0"


    // $ANTLR start "rule__Color__Group__0__Impl"
    // InternalTutorial.g:2251:1: rule__Color__Group__0__Impl : ( 'color' ) ;
    public final void rule__Color__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2255:1: ( ( 'color' ) )
            // InternalTutorial.g:2256:1: ( 'color' )
            {
            // InternalTutorial.g:2256:1: ( 'color' )
            // InternalTutorial.g:2257:2: 'color'
            {
             before(grammarAccess.getColorAccess().getColorKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__0__Impl"


    // $ANTLR start "rule__Color__Group__1"
    // InternalTutorial.g:2266:1: rule__Color__Group__1 : rule__Color__Group__1__Impl rule__Color__Group__2 ;
    public final void rule__Color__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2270:1: ( rule__Color__Group__1__Impl rule__Color__Group__2 )
            // InternalTutorial.g:2271:2: rule__Color__Group__1__Impl rule__Color__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Color__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__1"


    // $ANTLR start "rule__Color__Group__1__Impl"
    // InternalTutorial.g:2278:1: rule__Color__Group__1__Impl : ( ( rule__Color__NameAssignment_1 ) ) ;
    public final void rule__Color__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2282:1: ( ( ( rule__Color__NameAssignment_1 ) ) )
            // InternalTutorial.g:2283:1: ( ( rule__Color__NameAssignment_1 ) )
            {
            // InternalTutorial.g:2283:1: ( ( rule__Color__NameAssignment_1 ) )
            // InternalTutorial.g:2284:2: ( rule__Color__NameAssignment_1 )
            {
             before(grammarAccess.getColorAccess().getNameAssignment_1()); 
            // InternalTutorial.g:2285:2: ( rule__Color__NameAssignment_1 )
            // InternalTutorial.g:2285:3: rule__Color__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Color__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__1__Impl"


    // $ANTLR start "rule__Color__Group__2"
    // InternalTutorial.g:2293:1: rule__Color__Group__2 : rule__Color__Group__2__Impl rule__Color__Group__3 ;
    public final void rule__Color__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2297:1: ( rule__Color__Group__2__Impl rule__Color__Group__3 )
            // InternalTutorial.g:2298:2: rule__Color__Group__2__Impl rule__Color__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Color__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__2"


    // $ANTLR start "rule__Color__Group__2__Impl"
    // InternalTutorial.g:2305:1: rule__Color__Group__2__Impl : ( ':' ) ;
    public final void rule__Color__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2309:1: ( ( ':' ) )
            // InternalTutorial.g:2310:1: ( ':' )
            {
            // InternalTutorial.g:2310:1: ( ':' )
            // InternalTutorial.g:2311:2: ':'
            {
             before(grammarAccess.getColorAccess().getColonKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__2__Impl"


    // $ANTLR start "rule__Color__Group__3"
    // InternalTutorial.g:2320:1: rule__Color__Group__3 : rule__Color__Group__3__Impl rule__Color__Group__4 ;
    public final void rule__Color__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2324:1: ( rule__Color__Group__3__Impl rule__Color__Group__4 )
            // InternalTutorial.g:2325:2: rule__Color__Group__3__Impl rule__Color__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Color__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__3"


    // $ANTLR start "rule__Color__Group__3__Impl"
    // InternalTutorial.g:2332:1: rule__Color__Group__3__Impl : ( '{' ) ;
    public final void rule__Color__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2336:1: ( ( '{' ) )
            // InternalTutorial.g:2337:1: ( '{' )
            {
            // InternalTutorial.g:2337:1: ( '{' )
            // InternalTutorial.g:2338:2: '{'
            {
             before(grammarAccess.getColorAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__3__Impl"


    // $ANTLR start "rule__Color__Group__4"
    // InternalTutorial.g:2347:1: rule__Color__Group__4 : rule__Color__Group__4__Impl rule__Color__Group__5 ;
    public final void rule__Color__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2351:1: ( rule__Color__Group__4__Impl rule__Color__Group__5 )
            // InternalTutorial.g:2352:2: rule__Color__Group__4__Impl rule__Color__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Color__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__4"


    // $ANTLR start "rule__Color__Group__4__Impl"
    // InternalTutorial.g:2359:1: rule__Color__Group__4__Impl : ( 'r' ) ;
    public final void rule__Color__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2363:1: ( ( 'r' ) )
            // InternalTutorial.g:2364:1: ( 'r' )
            {
            // InternalTutorial.g:2364:1: ( 'r' )
            // InternalTutorial.g:2365:2: 'r'
            {
             before(grammarAccess.getColorAccess().getRKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getRKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__4__Impl"


    // $ANTLR start "rule__Color__Group__5"
    // InternalTutorial.g:2374:1: rule__Color__Group__5 : rule__Color__Group__5__Impl rule__Color__Group__6 ;
    public final void rule__Color__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2378:1: ( rule__Color__Group__5__Impl rule__Color__Group__6 )
            // InternalTutorial.g:2379:2: rule__Color__Group__5__Impl rule__Color__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Color__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__5"


    // $ANTLR start "rule__Color__Group__5__Impl"
    // InternalTutorial.g:2386:1: rule__Color__Group__5__Impl : ( ':' ) ;
    public final void rule__Color__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2390:1: ( ( ':' ) )
            // InternalTutorial.g:2391:1: ( ':' )
            {
            // InternalTutorial.g:2391:1: ( ':' )
            // InternalTutorial.g:2392:2: ':'
            {
             before(grammarAccess.getColorAccess().getColonKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__5__Impl"


    // $ANTLR start "rule__Color__Group__6"
    // InternalTutorial.g:2401:1: rule__Color__Group__6 : rule__Color__Group__6__Impl rule__Color__Group__7 ;
    public final void rule__Color__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2405:1: ( rule__Color__Group__6__Impl rule__Color__Group__7 )
            // InternalTutorial.g:2406:2: rule__Color__Group__6__Impl rule__Color__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__Color__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__6"


    // $ANTLR start "rule__Color__Group__6__Impl"
    // InternalTutorial.g:2413:1: rule__Color__Group__6__Impl : ( ( rule__Color__RedAssignment_6 ) ) ;
    public final void rule__Color__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2417:1: ( ( ( rule__Color__RedAssignment_6 ) ) )
            // InternalTutorial.g:2418:1: ( ( rule__Color__RedAssignment_6 ) )
            {
            // InternalTutorial.g:2418:1: ( ( rule__Color__RedAssignment_6 ) )
            // InternalTutorial.g:2419:2: ( rule__Color__RedAssignment_6 )
            {
             before(grammarAccess.getColorAccess().getRedAssignment_6()); 
            // InternalTutorial.g:2420:2: ( rule__Color__RedAssignment_6 )
            // InternalTutorial.g:2420:3: rule__Color__RedAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Color__RedAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getRedAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__6__Impl"


    // $ANTLR start "rule__Color__Group__7"
    // InternalTutorial.g:2428:1: rule__Color__Group__7 : rule__Color__Group__7__Impl rule__Color__Group__8 ;
    public final void rule__Color__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2432:1: ( rule__Color__Group__7__Impl rule__Color__Group__8 )
            // InternalTutorial.g:2433:2: rule__Color__Group__7__Impl rule__Color__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Color__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__7"


    // $ANTLR start "rule__Color__Group__7__Impl"
    // InternalTutorial.g:2440:1: rule__Color__Group__7__Impl : ( 'g' ) ;
    public final void rule__Color__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2444:1: ( ( 'g' ) )
            // InternalTutorial.g:2445:1: ( 'g' )
            {
            // InternalTutorial.g:2445:1: ( 'g' )
            // InternalTutorial.g:2446:2: 'g'
            {
             before(grammarAccess.getColorAccess().getGKeyword_7()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getGKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__7__Impl"


    // $ANTLR start "rule__Color__Group__8"
    // InternalTutorial.g:2455:1: rule__Color__Group__8 : rule__Color__Group__8__Impl rule__Color__Group__9 ;
    public final void rule__Color__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2459:1: ( rule__Color__Group__8__Impl rule__Color__Group__9 )
            // InternalTutorial.g:2460:2: rule__Color__Group__8__Impl rule__Color__Group__9
            {
            pushFollow(FOLLOW_26);
            rule__Color__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__8"


    // $ANTLR start "rule__Color__Group__8__Impl"
    // InternalTutorial.g:2467:1: rule__Color__Group__8__Impl : ( ':' ) ;
    public final void rule__Color__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2471:1: ( ( ':' ) )
            // InternalTutorial.g:2472:1: ( ':' )
            {
            // InternalTutorial.g:2472:1: ( ':' )
            // InternalTutorial.g:2473:2: ':'
            {
             before(grammarAccess.getColorAccess().getColonKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__8__Impl"


    // $ANTLR start "rule__Color__Group__9"
    // InternalTutorial.g:2482:1: rule__Color__Group__9 : rule__Color__Group__9__Impl rule__Color__Group__10 ;
    public final void rule__Color__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2486:1: ( rule__Color__Group__9__Impl rule__Color__Group__10 )
            // InternalTutorial.g:2487:2: rule__Color__Group__9__Impl rule__Color__Group__10
            {
            pushFollow(FOLLOW_28);
            rule__Color__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__9"


    // $ANTLR start "rule__Color__Group__9__Impl"
    // InternalTutorial.g:2494:1: rule__Color__Group__9__Impl : ( ( rule__Color__GreenAssignment_9 ) ) ;
    public final void rule__Color__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2498:1: ( ( ( rule__Color__GreenAssignment_9 ) ) )
            // InternalTutorial.g:2499:1: ( ( rule__Color__GreenAssignment_9 ) )
            {
            // InternalTutorial.g:2499:1: ( ( rule__Color__GreenAssignment_9 ) )
            // InternalTutorial.g:2500:2: ( rule__Color__GreenAssignment_9 )
            {
             before(grammarAccess.getColorAccess().getGreenAssignment_9()); 
            // InternalTutorial.g:2501:2: ( rule__Color__GreenAssignment_9 )
            // InternalTutorial.g:2501:3: rule__Color__GreenAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Color__GreenAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getGreenAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__9__Impl"


    // $ANTLR start "rule__Color__Group__10"
    // InternalTutorial.g:2509:1: rule__Color__Group__10 : rule__Color__Group__10__Impl rule__Color__Group__11 ;
    public final void rule__Color__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2513:1: ( rule__Color__Group__10__Impl rule__Color__Group__11 )
            // InternalTutorial.g:2514:2: rule__Color__Group__10__Impl rule__Color__Group__11
            {
            pushFollow(FOLLOW_9);
            rule__Color__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__10"


    // $ANTLR start "rule__Color__Group__10__Impl"
    // InternalTutorial.g:2521:1: rule__Color__Group__10__Impl : ( 'b' ) ;
    public final void rule__Color__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2525:1: ( ( 'b' ) )
            // InternalTutorial.g:2526:1: ( 'b' )
            {
            // InternalTutorial.g:2526:1: ( 'b' )
            // InternalTutorial.g:2527:2: 'b'
            {
             before(grammarAccess.getColorAccess().getBKeyword_10()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getBKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__10__Impl"


    // $ANTLR start "rule__Color__Group__11"
    // InternalTutorial.g:2536:1: rule__Color__Group__11 : rule__Color__Group__11__Impl rule__Color__Group__12 ;
    public final void rule__Color__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2540:1: ( rule__Color__Group__11__Impl rule__Color__Group__12 )
            // InternalTutorial.g:2541:2: rule__Color__Group__11__Impl rule__Color__Group__12
            {
            pushFollow(FOLLOW_26);
            rule__Color__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__11"


    // $ANTLR start "rule__Color__Group__11__Impl"
    // InternalTutorial.g:2548:1: rule__Color__Group__11__Impl : ( ':' ) ;
    public final void rule__Color__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2552:1: ( ( ':' ) )
            // InternalTutorial.g:2553:1: ( ':' )
            {
            // InternalTutorial.g:2553:1: ( ':' )
            // InternalTutorial.g:2554:2: ':'
            {
             before(grammarAccess.getColorAccess().getColonKeyword_11()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getColonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__11__Impl"


    // $ANTLR start "rule__Color__Group__12"
    // InternalTutorial.g:2563:1: rule__Color__Group__12 : rule__Color__Group__12__Impl rule__Color__Group__13 ;
    public final void rule__Color__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2567:1: ( rule__Color__Group__12__Impl rule__Color__Group__13 )
            // InternalTutorial.g:2568:2: rule__Color__Group__12__Impl rule__Color__Group__13
            {
            pushFollow(FOLLOW_6);
            rule__Color__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Color__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__12"


    // $ANTLR start "rule__Color__Group__12__Impl"
    // InternalTutorial.g:2575:1: rule__Color__Group__12__Impl : ( ( rule__Color__BlueAssignment_12 ) ) ;
    public final void rule__Color__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2579:1: ( ( ( rule__Color__BlueAssignment_12 ) ) )
            // InternalTutorial.g:2580:1: ( ( rule__Color__BlueAssignment_12 ) )
            {
            // InternalTutorial.g:2580:1: ( ( rule__Color__BlueAssignment_12 ) )
            // InternalTutorial.g:2581:2: ( rule__Color__BlueAssignment_12 )
            {
             before(grammarAccess.getColorAccess().getBlueAssignment_12()); 
            // InternalTutorial.g:2582:2: ( rule__Color__BlueAssignment_12 )
            // InternalTutorial.g:2582:3: rule__Color__BlueAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Color__BlueAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getColorAccess().getBlueAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__12__Impl"


    // $ANTLR start "rule__Color__Group__13"
    // InternalTutorial.g:2590:1: rule__Color__Group__13 : rule__Color__Group__13__Impl ;
    public final void rule__Color__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2594:1: ( rule__Color__Group__13__Impl )
            // InternalTutorial.g:2595:2: rule__Color__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Color__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__13"


    // $ANTLR start "rule__Color__Group__13__Impl"
    // InternalTutorial.g:2601:1: rule__Color__Group__13__Impl : ( '}' ) ;
    public final void rule__Color__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2605:1: ( ( '}' ) )
            // InternalTutorial.g:2606:1: ( '}' )
            {
            // InternalTutorial.g:2606:1: ( '}' )
            // InternalTutorial.g:2607:2: '}'
            {
             before(grammarAccess.getColorAccess().getRightCurlyBracketKeyword_13()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getColorAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__Group__13__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalTutorial.g:2617:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2621:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalTutorial.g:2622:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalTutorial.g:2629:1: rule__Component__Group__0__Impl : ( ( rule__Component__NameAssignment_0 ) ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2633:1: ( ( ( rule__Component__NameAssignment_0 ) ) )
            // InternalTutorial.g:2634:1: ( ( rule__Component__NameAssignment_0 ) )
            {
            // InternalTutorial.g:2634:1: ( ( rule__Component__NameAssignment_0 ) )
            // InternalTutorial.g:2635:2: ( rule__Component__NameAssignment_0 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_0()); 
            // InternalTutorial.g:2636:2: ( rule__Component__NameAssignment_0 )
            // InternalTutorial.g:2636:3: rule__Component__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalTutorial.g:2644:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2648:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalTutorial.g:2649:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalTutorial.g:2656:1: rule__Component__Group__1__Impl : ( '(' ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2660:1: ( ( '(' ) )
            // InternalTutorial.g:2661:1: ( '(' )
            {
            // InternalTutorial.g:2661:1: ( '(' )
            // InternalTutorial.g:2662:2: '('
            {
             before(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalTutorial.g:2671:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2675:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalTutorial.g:2676:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalTutorial.g:2683:1: rule__Component__Group__2__Impl : ( ( rule__Component__ItemTypeAssignment_2 ) ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2687:1: ( ( ( rule__Component__ItemTypeAssignment_2 ) ) )
            // InternalTutorial.g:2688:1: ( ( rule__Component__ItemTypeAssignment_2 ) )
            {
            // InternalTutorial.g:2688:1: ( ( rule__Component__ItemTypeAssignment_2 ) )
            // InternalTutorial.g:2689:2: ( rule__Component__ItemTypeAssignment_2 )
            {
             before(grammarAccess.getComponentAccess().getItemTypeAssignment_2()); 
            // InternalTutorial.g:2690:2: ( rule__Component__ItemTypeAssignment_2 )
            // InternalTutorial.g:2690:3: rule__Component__ItemTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Component__ItemTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getItemTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalTutorial.g:2698:1: rule__Component__Group__3 : rule__Component__Group__3__Impl ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2702:1: ( rule__Component__Group__3__Impl )
            // InternalTutorial.g:2703:2: rule__Component__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // InternalTutorial.g:2709:1: rule__Component__Group__3__Impl : ( ')' ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2713:1: ( ( ')' ) )
            // InternalTutorial.g:2714:1: ( ')' )
            {
            // InternalTutorial.g:2714:1: ( ')' )
            // InternalTutorial.g:2715:2: ')'
            {
             before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__ItemConnection__Group__0"
    // InternalTutorial.g:2725:1: rule__ItemConnection__Group__0 : rule__ItemConnection__Group__0__Impl rule__ItemConnection__Group__1 ;
    public final void rule__ItemConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2729:1: ( rule__ItemConnection__Group__0__Impl rule__ItemConnection__Group__1 )
            // InternalTutorial.g:2730:2: rule__ItemConnection__Group__0__Impl rule__ItemConnection__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__ItemConnection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemConnection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemConnection__Group__0"


    // $ANTLR start "rule__ItemConnection__Group__0__Impl"
    // InternalTutorial.g:2737:1: rule__ItemConnection__Group__0__Impl : ( ( rule__ItemConnection__ComponentAAssignment_0 ) ) ;
    public final void rule__ItemConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2741:1: ( ( ( rule__ItemConnection__ComponentAAssignment_0 ) ) )
            // InternalTutorial.g:2742:1: ( ( rule__ItemConnection__ComponentAAssignment_0 ) )
            {
            // InternalTutorial.g:2742:1: ( ( rule__ItemConnection__ComponentAAssignment_0 ) )
            // InternalTutorial.g:2743:2: ( rule__ItemConnection__ComponentAAssignment_0 )
            {
             before(grammarAccess.getItemConnectionAccess().getComponentAAssignment_0()); 
            // InternalTutorial.g:2744:2: ( rule__ItemConnection__ComponentAAssignment_0 )
            // InternalTutorial.g:2744:3: rule__ItemConnection__ComponentAAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ItemConnection__ComponentAAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getItemConnectionAccess().getComponentAAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemConnection__Group__0__Impl"


    // $ANTLR start "rule__ItemConnection__Group__1"
    // InternalTutorial.g:2752:1: rule__ItemConnection__Group__1 : rule__ItemConnection__Group__1__Impl rule__ItemConnection__Group__2 ;
    public final void rule__ItemConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2756:1: ( rule__ItemConnection__Group__1__Impl rule__ItemConnection__Group__2 )
            // InternalTutorial.g:2757:2: rule__ItemConnection__Group__1__Impl rule__ItemConnection__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ItemConnection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemConnection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemConnection__Group__1"


    // $ANTLR start "rule__ItemConnection__Group__1__Impl"
    // InternalTutorial.g:2764:1: rule__ItemConnection__Group__1__Impl : ( '(' ) ;
    public final void rule__ItemConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2768:1: ( ( '(' ) )
            // InternalTutorial.g:2769:1: ( '(' )
            {
            // InternalTutorial.g:2769:1: ( '(' )
            // InternalTutorial.g:2770:2: '('
            {
             before(grammarAccess.getItemConnectionAccess().getLeftParenthesisKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getItemConnectionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemConnection__Group__1__Impl"


    // $ANTLR start "rule__ItemConnection__Group__2"
    // InternalTutorial.g:2779:1: rule__ItemConnection__Group__2 : rule__ItemConnection__Group__2__Impl rule__ItemConnection__Group__3 ;
    public final void rule__ItemConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2783:1: ( rule__ItemConnection__Group__2__Impl rule__ItemConnection__Group__3 )
            // InternalTutorial.g:2784:2: rule__ItemConnection__Group__2__Impl rule__ItemConnection__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__ItemConnection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemConnection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemConnection__Group__2"


    // $ANTLR start "rule__ItemConnection__Group__2__Impl"
    // InternalTutorial.g:2791:1: rule__ItemConnection__Group__2__Impl : ( ( rule__ItemConnection__MarkerAAssignment_2 ) ) ;
    public final void rule__ItemConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2795:1: ( ( ( rule__ItemConnection__MarkerAAssignment_2 ) ) )
            // InternalTutorial.g:2796:1: ( ( rule__ItemConnection__MarkerAAssignment_2 ) )
            {
            // InternalTutorial.g:2796:1: ( ( rule__ItemConnection__MarkerAAssignment_2 ) )
            // InternalTutorial.g:2797:2: ( rule__ItemConnection__MarkerAAssignment_2 )
            {
             before(grammarAccess.getItemConnectionAccess().getMarkerAAssignment_2()); 
            // InternalTutorial.g:2798:2: ( rule__ItemConnection__MarkerAAssignment_2 )
            // InternalTutorial.g:2798:3: rule__ItemConnection__MarkerAAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ItemConnection__MarkerAAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getItemConnectionAccess().getMarkerAAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemConnection__Group__2__Impl"


    // $ANTLR start "rule__ItemConnection__Group__3"
    // InternalTutorial.g:2806:1: rule__ItemConnection__Group__3 : rule__ItemConnection__Group__3__Impl rule__ItemConnection__Group__4 ;
    public final void rule__ItemConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2810:1: ( rule__ItemConnection__Group__3__Impl rule__ItemConnection__Group__4 )
            // InternalTutorial.g:2811:2: rule__ItemConnection__Group__3__Impl rule__ItemConnection__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__ItemConnection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemConnection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemConnection__Group__3"


    // $ANTLR start "rule__ItemConnection__Group__3__Impl"
    // InternalTutorial.g:2818:1: rule__ItemConnection__Group__3__Impl : ( ')' ) ;
    public final void rule__ItemConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2822:1: ( ( ')' ) )
            // InternalTutorial.g:2823:1: ( ')' )
            {
            // InternalTutorial.g:2823:1: ( ')' )
            // InternalTutorial.g:2824:2: ')'
            {
             before(grammarAccess.getItemConnectionAccess().getRightParenthesisKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getItemConnectionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemConnection__Group__3__Impl"


    // $ANTLR start "rule__ItemConnection__Group__4"
    // InternalTutorial.g:2833:1: rule__ItemConnection__Group__4 : rule__ItemConnection__Group__4__Impl rule__ItemConnection__Group__5 ;
    public final void rule__ItemConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2837:1: ( rule__ItemConnection__Group__4__Impl rule__ItemConnection__Group__5 )
            // InternalTutorial.g:2838:2: rule__ItemConnection__Group__4__Impl rule__ItemConnection__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__ItemConnection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemConnection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemConnection__Group__4"


    // $ANTLR start "rule__ItemConnection__Group__4__Impl"
    // InternalTutorial.g:2845:1: rule__ItemConnection__Group__4__Impl : ( '<->' ) ;
    public final void rule__ItemConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2849:1: ( ( '<->' ) )
            // InternalTutorial.g:2850:1: ( '<->' )
            {
            // InternalTutorial.g:2850:1: ( '<->' )
            // InternalTutorial.g:2851:2: '<->'
            {
             before(grammarAccess.getItemConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getItemConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemConnection__Group__4__Impl"


    // $ANTLR start "rule__ItemConnection__Group__5"
    // InternalTutorial.g:2860:1: rule__ItemConnection__Group__5 : rule__ItemConnection__Group__5__Impl rule__ItemConnection__Group__6 ;
    public final void rule__ItemConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2864:1: ( rule__ItemConnection__Group__5__Impl rule__ItemConnection__Group__6 )
            // InternalTutorial.g:2865:2: rule__ItemConnection__Group__5__Impl rule__ItemConnection__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__ItemConnection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemConnection__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemConnection__Group__5"


    // $ANTLR start "rule__ItemConnection__Group__5__Impl"
    // InternalTutorial.g:2872:1: rule__ItemConnection__Group__5__Impl : ( ( rule__ItemConnection__ComponentBAssignment_5 ) ) ;
    public final void rule__ItemConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2876:1: ( ( ( rule__ItemConnection__ComponentBAssignment_5 ) ) )
            // InternalTutorial.g:2877:1: ( ( rule__ItemConnection__ComponentBAssignment_5 ) )
            {
            // InternalTutorial.g:2877:1: ( ( rule__ItemConnection__ComponentBAssignment_5 ) )
            // InternalTutorial.g:2878:2: ( rule__ItemConnection__ComponentBAssignment_5 )
            {
             before(grammarAccess.getItemConnectionAccess().getComponentBAssignment_5()); 
            // InternalTutorial.g:2879:2: ( rule__ItemConnection__ComponentBAssignment_5 )
            // InternalTutorial.g:2879:3: rule__ItemConnection__ComponentBAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ItemConnection__ComponentBAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getItemConnectionAccess().getComponentBAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemConnection__Group__5__Impl"


    // $ANTLR start "rule__ItemConnection__Group__6"
    // InternalTutorial.g:2887:1: rule__ItemConnection__Group__6 : rule__ItemConnection__Group__6__Impl rule__ItemConnection__Group__7 ;
    public final void rule__ItemConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2891:1: ( rule__ItemConnection__Group__6__Impl rule__ItemConnection__Group__7 )
            // InternalTutorial.g:2892:2: rule__ItemConnection__Group__6__Impl rule__ItemConnection__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__ItemConnection__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemConnection__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemConnection__Group__6"


    // $ANTLR start "rule__ItemConnection__Group__6__Impl"
    // InternalTutorial.g:2899:1: rule__ItemConnection__Group__6__Impl : ( '(' ) ;
    public final void rule__ItemConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2903:1: ( ( '(' ) )
            // InternalTutorial.g:2904:1: ( '(' )
            {
            // InternalTutorial.g:2904:1: ( '(' )
            // InternalTutorial.g:2905:2: '('
            {
             before(grammarAccess.getItemConnectionAccess().getLeftParenthesisKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getItemConnectionAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemConnection__Group__6__Impl"


    // $ANTLR start "rule__ItemConnection__Group__7"
    // InternalTutorial.g:2914:1: rule__ItemConnection__Group__7 : rule__ItemConnection__Group__7__Impl rule__ItemConnection__Group__8 ;
    public final void rule__ItemConnection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2918:1: ( rule__ItemConnection__Group__7__Impl rule__ItemConnection__Group__8 )
            // InternalTutorial.g:2919:2: rule__ItemConnection__Group__7__Impl rule__ItemConnection__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__ItemConnection__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ItemConnection__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemConnection__Group__7"


    // $ANTLR start "rule__ItemConnection__Group__7__Impl"
    // InternalTutorial.g:2926:1: rule__ItemConnection__Group__7__Impl : ( ( rule__ItemConnection__MarkerBAssignment_7 ) ) ;
    public final void rule__ItemConnection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2930:1: ( ( ( rule__ItemConnection__MarkerBAssignment_7 ) ) )
            // InternalTutorial.g:2931:1: ( ( rule__ItemConnection__MarkerBAssignment_7 ) )
            {
            // InternalTutorial.g:2931:1: ( ( rule__ItemConnection__MarkerBAssignment_7 ) )
            // InternalTutorial.g:2932:2: ( rule__ItemConnection__MarkerBAssignment_7 )
            {
             before(grammarAccess.getItemConnectionAccess().getMarkerBAssignment_7()); 
            // InternalTutorial.g:2933:2: ( rule__ItemConnection__MarkerBAssignment_7 )
            // InternalTutorial.g:2933:3: rule__ItemConnection__MarkerBAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__ItemConnection__MarkerBAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getItemConnectionAccess().getMarkerBAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemConnection__Group__7__Impl"


    // $ANTLR start "rule__ItemConnection__Group__8"
    // InternalTutorial.g:2941:1: rule__ItemConnection__Group__8 : rule__ItemConnection__Group__8__Impl ;
    public final void rule__ItemConnection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2945:1: ( rule__ItemConnection__Group__8__Impl )
            // InternalTutorial.g:2946:2: rule__ItemConnection__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ItemConnection__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemConnection__Group__8"


    // $ANTLR start "rule__ItemConnection__Group__8__Impl"
    // InternalTutorial.g:2952:1: rule__ItemConnection__Group__8__Impl : ( ')' ) ;
    public final void rule__ItemConnection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2956:1: ( ( ')' ) )
            // InternalTutorial.g:2957:1: ( ')' )
            {
            // InternalTutorial.g:2957:1: ( ')' )
            // InternalTutorial.g:2958:2: ')'
            {
             before(grammarAccess.getItemConnectionAccess().getRightParenthesisKeyword_8()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getItemConnectionAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemConnection__Group__8__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalTutorial.g:2968:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2972:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalTutorial.g:2973:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalTutorial.g:2980:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2984:1: ( ( ( '-' )? ) )
            // InternalTutorial.g:2985:1: ( ( '-' )? )
            {
            // InternalTutorial.g:2985:1: ( ( '-' )? )
            // InternalTutorial.g:2986:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalTutorial.g:2987:2: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==40) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTutorial.g:2987:3: '-'
                    {
                    match(input,40,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalTutorial.g:2995:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:2999:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalTutorial.g:3000:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalTutorial.g:3007:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3011:1: ( ( ( RULE_INT )? ) )
            // InternalTutorial.g:3012:1: ( ( RULE_INT )? )
            {
            // InternalTutorial.g:3012:1: ( ( RULE_INT )? )
            // InternalTutorial.g:3013:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalTutorial.g:3014:2: ( RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTutorial.g:3014:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalTutorial.g:3022:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3026:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalTutorial.g:3027:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalTutorial.g:3034:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3038:1: ( ( '.' ) )
            // InternalTutorial.g:3039:1: ( '.' )
            {
            // InternalTutorial.g:3039:1: ( '.' )
            // InternalTutorial.g:3040:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalTutorial.g:3049:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3053:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalTutorial.g:3054:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalTutorial.g:3061:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3065:1: ( ( RULE_INT ) )
            // InternalTutorial.g:3066:1: ( RULE_INT )
            {
            // InternalTutorial.g:3066:1: ( RULE_INT )
            // InternalTutorial.g:3067:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalTutorial.g:3076:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3080:1: ( rule__EDouble__Group__4__Impl )
            // InternalTutorial.g:3081:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalTutorial.g:3087:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3091:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalTutorial.g:3092:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalTutorial.g:3092:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalTutorial.g:3093:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalTutorial.g:3094:2: ( rule__EDouble__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=11 && LA13_0<=12)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTutorial.g:3094:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalTutorial.g:3103:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3107:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalTutorial.g:3108:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_26);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalTutorial.g:3115:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3119:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalTutorial.g:3120:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalTutorial.g:3120:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalTutorial.g:3121:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalTutorial.g:3122:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalTutorial.g:3122:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalTutorial.g:3130:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3134:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalTutorial.g:3135:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_26);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalTutorial.g:3142:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3146:1: ( ( ( '-' )? ) )
            // InternalTutorial.g:3147:1: ( ( '-' )? )
            {
            // InternalTutorial.g:3147:1: ( ( '-' )? )
            // InternalTutorial.g:3148:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalTutorial.g:3149:2: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==40) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTutorial.g:3149:3: '-'
                    {
                    match(input,40,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalTutorial.g:3157:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3161:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalTutorial.g:3162:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalTutorial.g:3168:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3172:1: ( ( RULE_INT ) )
            // InternalTutorial.g:3173:1: ( RULE_INT )
            {
            // InternalTutorial.g:3173:1: ( RULE_INT )
            // InternalTutorial.g:3174:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalTutorial.g:3184:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3188:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalTutorial.g:3189:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalTutorial.g:3196:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3200:1: ( ( ( '-' )? ) )
            // InternalTutorial.g:3201:1: ( ( '-' )? )
            {
            // InternalTutorial.g:3201:1: ( ( '-' )? )
            // InternalTutorial.g:3202:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalTutorial.g:3203:2: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==40) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTutorial.g:3203:3: '-'
                    {
                    match(input,40,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalTutorial.g:3211:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3215:1: ( rule__EInt__Group__1__Impl )
            // InternalTutorial.g:3216:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalTutorial.g:3222:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3226:1: ( ( RULE_INT ) )
            // InternalTutorial.g:3227:1: ( RULE_INT )
            {
            // InternalTutorial.g:3227:1: ( RULE_INT )
            // InternalTutorial.g:3228:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Factory__NameAssignment_1"
    // InternalTutorial.g:3238:1: rule__Factory__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Factory__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3242:1: ( ( RULE_ID ) )
            // InternalTutorial.g:3243:2: ( RULE_ID )
            {
            // InternalTutorial.g:3243:2: ( RULE_ID )
            // InternalTutorial.g:3244:3: RULE_ID
            {
             before(grammarAccess.getFactoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFactoryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factory__NameAssignment_1"


    // $ANTLR start "rule__Factory__ItemTypesAssignment_3"
    // InternalTutorial.g:3253:1: rule__Factory__ItemTypesAssignment_3 : ( ruleItemType ) ;
    public final void rule__Factory__ItemTypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3257:1: ( ( ruleItemType ) )
            // InternalTutorial.g:3258:2: ( ruleItemType )
            {
            // InternalTutorial.g:3258:2: ( ruleItemType )
            // InternalTutorial.g:3259:3: ruleItemType
            {
             before(grammarAccess.getFactoryAccess().getItemTypesItemTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleItemType();

            state._fsp--;

             after(grammarAccess.getFactoryAccess().getItemTypesItemTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factory__ItemTypesAssignment_3"


    // $ANTLR start "rule__CylinderShape__LengthAssignment_4"
    // InternalTutorial.g:3268:1: rule__CylinderShape__LengthAssignment_4 : ( ruleEDouble ) ;
    public final void rule__CylinderShape__LengthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3272:1: ( ( ruleEDouble ) )
            // InternalTutorial.g:3273:2: ( ruleEDouble )
            {
            // InternalTutorial.g:3273:2: ( ruleEDouble )
            // InternalTutorial.g:3274:3: ruleEDouble
            {
             before(grammarAccess.getCylinderShapeAccess().getLengthEDoubleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getCylinderShapeAccess().getLengthEDoubleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__LengthAssignment_4"


    // $ANTLR start "rule__CylinderShape__RadiusAssignment_8"
    // InternalTutorial.g:3283:1: rule__CylinderShape__RadiusAssignment_8 : ( ruleEDouble ) ;
    public final void rule__CylinderShape__RadiusAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3287:1: ( ( ruleEDouble ) )
            // InternalTutorial.g:3288:2: ( ruleEDouble )
            {
            // InternalTutorial.g:3288:2: ( ruleEDouble )
            // InternalTutorial.g:3289:3: ruleEDouble
            {
             before(grammarAccess.getCylinderShapeAccess().getRadiusEDoubleParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getCylinderShapeAccess().getRadiusEDoubleParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CylinderShape__RadiusAssignment_8"


    // $ANTLR start "rule__BlockShape__LengthAssignment_4"
    // InternalTutorial.g:3298:1: rule__BlockShape__LengthAssignment_4 : ( ruleEDouble ) ;
    public final void rule__BlockShape__LengthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3302:1: ( ( ruleEDouble ) )
            // InternalTutorial.g:3303:2: ( ruleEDouble )
            {
            // InternalTutorial.g:3303:2: ( ruleEDouble )
            // InternalTutorial.g:3304:3: ruleEDouble
            {
             before(grammarAccess.getBlockShapeAccess().getLengthEDoubleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getBlockShapeAccess().getLengthEDoubleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__LengthAssignment_4"


    // $ANTLR start "rule__BlockShape__WidthAssignment_8"
    // InternalTutorial.g:3313:1: rule__BlockShape__WidthAssignment_8 : ( ruleEDouble ) ;
    public final void rule__BlockShape__WidthAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3317:1: ( ( ruleEDouble ) )
            // InternalTutorial.g:3318:2: ( ruleEDouble )
            {
            // InternalTutorial.g:3318:2: ( ruleEDouble )
            // InternalTutorial.g:3319:3: ruleEDouble
            {
             before(grammarAccess.getBlockShapeAccess().getWidthEDoubleParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getBlockShapeAccess().getWidthEDoubleParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__WidthAssignment_8"


    // $ANTLR start "rule__BlockShape__HeigthAssignment_12"
    // InternalTutorial.g:3328:1: rule__BlockShape__HeigthAssignment_12 : ( ruleEDouble ) ;
    public final void rule__BlockShape__HeigthAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3332:1: ( ( ruleEDouble ) )
            // InternalTutorial.g:3333:2: ( ruleEDouble )
            {
            // InternalTutorial.g:3333:2: ( ruleEDouble )
            // InternalTutorial.g:3334:3: ruleEDouble
            {
             before(grammarAccess.getBlockShapeAccess().getHeigthEDoubleParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getBlockShapeAccess().getHeigthEDoubleParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockShape__HeigthAssignment_12"


    // $ANTLR start "rule__BasicItemType__NameAssignment_1"
    // InternalTutorial.g:3343:1: rule__BasicItemType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__BasicItemType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3347:1: ( ( RULE_ID ) )
            // InternalTutorial.g:3348:2: ( RULE_ID )
            {
            // InternalTutorial.g:3348:2: ( RULE_ID )
            // InternalTutorial.g:3349:3: RULE_ID
            {
             before(grammarAccess.getBasicItemTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBasicItemTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__NameAssignment_1"


    // $ANTLR start "rule__BasicItemType__MaterialAssignment_3"
    // InternalTutorial.g:3358:1: rule__BasicItemType__MaterialAssignment_3 : ( ruleMaterial ) ;
    public final void rule__BasicItemType__MaterialAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3362:1: ( ( ruleMaterial ) )
            // InternalTutorial.g:3363:2: ( ruleMaterial )
            {
            // InternalTutorial.g:3363:2: ( ruleMaterial )
            // InternalTutorial.g:3364:3: ruleMaterial
            {
             before(grammarAccess.getBasicItemTypeAccess().getMaterialMaterialEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMaterial();

            state._fsp--;

             after(grammarAccess.getBasicItemTypeAccess().getMaterialMaterialEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__MaterialAssignment_3"


    // $ANTLR start "rule__BasicItemType__ShapeAssignment_8"
    // InternalTutorial.g:3373:1: rule__BasicItemType__ShapeAssignment_8 : ( ( rule__BasicItemType__ShapeAlternatives_8_0 ) ) ;
    public final void rule__BasicItemType__ShapeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3377:1: ( ( ( rule__BasicItemType__ShapeAlternatives_8_0 ) ) )
            // InternalTutorial.g:3378:2: ( ( rule__BasicItemType__ShapeAlternatives_8_0 ) )
            {
            // InternalTutorial.g:3378:2: ( ( rule__BasicItemType__ShapeAlternatives_8_0 ) )
            // InternalTutorial.g:3379:3: ( rule__BasicItemType__ShapeAlternatives_8_0 )
            {
             before(grammarAccess.getBasicItemTypeAccess().getShapeAlternatives_8_0()); 
            // InternalTutorial.g:3380:3: ( rule__BasicItemType__ShapeAlternatives_8_0 )
            // InternalTutorial.g:3380:4: rule__BasicItemType__ShapeAlternatives_8_0
            {
            pushFollow(FOLLOW_2);
            rule__BasicItemType__ShapeAlternatives_8_0();

            state._fsp--;


            }

             after(grammarAccess.getBasicItemTypeAccess().getShapeAlternatives_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__ShapeAssignment_8"


    // $ANTLR start "rule__BasicItemType__ColorAssignment_9"
    // InternalTutorial.g:3388:1: rule__BasicItemType__ColorAssignment_9 : ( ruleColor ) ;
    public final void rule__BasicItemType__ColorAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3392:1: ( ( ruleColor ) )
            // InternalTutorial.g:3393:2: ( ruleColor )
            {
            // InternalTutorial.g:3393:2: ( ruleColor )
            // InternalTutorial.g:3394:3: ruleColor
            {
             before(grammarAccess.getBasicItemTypeAccess().getColorColorParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleColor();

            state._fsp--;

             after(grammarAccess.getBasicItemTypeAccess().getColorColorParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__ColorAssignment_9"


    // $ANTLR start "rule__BasicItemType__MarkersAssignment_10_3"
    // InternalTutorial.g:3403:1: rule__BasicItemType__MarkersAssignment_10_3 : ( ruleMarker ) ;
    public final void rule__BasicItemType__MarkersAssignment_10_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3407:1: ( ( ruleMarker ) )
            // InternalTutorial.g:3408:2: ( ruleMarker )
            {
            // InternalTutorial.g:3408:2: ( ruleMarker )
            // InternalTutorial.g:3409:3: ruleMarker
            {
             before(grammarAccess.getBasicItemTypeAccess().getMarkersMarkerParserRuleCall_10_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMarker();

            state._fsp--;

             after(grammarAccess.getBasicItemTypeAccess().getMarkersMarkerParserRuleCall_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicItemType__MarkersAssignment_10_3"


    // $ANTLR start "rule__ComplexItemType__NameAssignment_1"
    // InternalTutorial.g:3418:1: rule__ComplexItemType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ComplexItemType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3422:1: ( ( RULE_ID ) )
            // InternalTutorial.g:3423:2: ( RULE_ID )
            {
            // InternalTutorial.g:3423:2: ( RULE_ID )
            // InternalTutorial.g:3424:3: RULE_ID
            {
             before(grammarAccess.getComplexItemTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComplexItemTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__NameAssignment_1"


    // $ANTLR start "rule__ComplexItemType__ComponentsAssignment_6"
    // InternalTutorial.g:3433:1: rule__ComplexItemType__ComponentsAssignment_6 : ( ruleComponent ) ;
    public final void rule__ComplexItemType__ComponentsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3437:1: ( ( ruleComponent ) )
            // InternalTutorial.g:3438:2: ( ruleComponent )
            {
            // InternalTutorial.g:3438:2: ( ruleComponent )
            // InternalTutorial.g:3439:3: ruleComponent
            {
             before(grammarAccess.getComplexItemTypeAccess().getComponentsComponentParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComplexItemTypeAccess().getComponentsComponentParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__ComponentsAssignment_6"


    // $ANTLR start "rule__ComplexItemType__ComponentsAssignment_7"
    // InternalTutorial.g:3448:1: rule__ComplexItemType__ComponentsAssignment_7 : ( ruleComponent ) ;
    public final void rule__ComplexItemType__ComponentsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3452:1: ( ( ruleComponent ) )
            // InternalTutorial.g:3453:2: ( ruleComponent )
            {
            // InternalTutorial.g:3453:2: ( ruleComponent )
            // InternalTutorial.g:3454:3: ruleComponent
            {
             before(grammarAccess.getComplexItemTypeAccess().getComponentsComponentParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComplexItemTypeAccess().getComponentsComponentParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__ComponentsAssignment_7"


    // $ANTLR start "rule__ComplexItemType__ItemConnectionsAssignment_12"
    // InternalTutorial.g:3463:1: rule__ComplexItemType__ItemConnectionsAssignment_12 : ( ruleItemConnection ) ;
    public final void rule__ComplexItemType__ItemConnectionsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3467:1: ( ( ruleItemConnection ) )
            // InternalTutorial.g:3468:2: ( ruleItemConnection )
            {
            // InternalTutorial.g:3468:2: ( ruleItemConnection )
            // InternalTutorial.g:3469:3: ruleItemConnection
            {
             before(grammarAccess.getComplexItemTypeAccess().getItemConnectionsItemConnectionParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleItemConnection();

            state._fsp--;

             after(grammarAccess.getComplexItemTypeAccess().getItemConnectionsItemConnectionParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexItemType__ItemConnectionsAssignment_12"


    // $ANTLR start "rule__Color__NameAssignment_1"
    // InternalTutorial.g:3478:1: rule__Color__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Color__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3482:1: ( ( ruleEString ) )
            // InternalTutorial.g:3483:2: ( ruleEString )
            {
            // InternalTutorial.g:3483:2: ( ruleEString )
            // InternalTutorial.g:3484:3: ruleEString
            {
             before(grammarAccess.getColorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColorAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__NameAssignment_1"


    // $ANTLR start "rule__Color__RedAssignment_6"
    // InternalTutorial.g:3493:1: rule__Color__RedAssignment_6 : ( ruleEInt ) ;
    public final void rule__Color__RedAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3497:1: ( ( ruleEInt ) )
            // InternalTutorial.g:3498:2: ( ruleEInt )
            {
            // InternalTutorial.g:3498:2: ( ruleEInt )
            // InternalTutorial.g:3499:3: ruleEInt
            {
             before(grammarAccess.getColorAccess().getRedEIntParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getColorAccess().getRedEIntParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__RedAssignment_6"


    // $ANTLR start "rule__Color__GreenAssignment_9"
    // InternalTutorial.g:3508:1: rule__Color__GreenAssignment_9 : ( ruleEInt ) ;
    public final void rule__Color__GreenAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3512:1: ( ( ruleEInt ) )
            // InternalTutorial.g:3513:2: ( ruleEInt )
            {
            // InternalTutorial.g:3513:2: ( ruleEInt )
            // InternalTutorial.g:3514:3: ruleEInt
            {
             before(grammarAccess.getColorAccess().getGreenEIntParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getColorAccess().getGreenEIntParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__GreenAssignment_9"


    // $ANTLR start "rule__Color__BlueAssignment_12"
    // InternalTutorial.g:3523:1: rule__Color__BlueAssignment_12 : ( ruleEInt ) ;
    public final void rule__Color__BlueAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3527:1: ( ( ruleEInt ) )
            // InternalTutorial.g:3528:2: ( ruleEInt )
            {
            // InternalTutorial.g:3528:2: ( ruleEInt )
            // InternalTutorial.g:3529:3: ruleEInt
            {
             before(grammarAccess.getColorAccess().getBlueEIntParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getColorAccess().getBlueEIntParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Color__BlueAssignment_12"


    // $ANTLR start "rule__Marker__NameAssignment"
    // InternalTutorial.g:3538:1: rule__Marker__NameAssignment : ( RULE_ID ) ;
    public final void rule__Marker__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3542:1: ( ( RULE_ID ) )
            // InternalTutorial.g:3543:2: ( RULE_ID )
            {
            // InternalTutorial.g:3543:2: ( RULE_ID )
            // InternalTutorial.g:3544:3: RULE_ID
            {
             before(grammarAccess.getMarkerAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMarkerAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Marker__NameAssignment"


    // $ANTLR start "rule__Component__NameAssignment_0"
    // InternalTutorial.g:3553:1: rule__Component__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3557:1: ( ( RULE_ID ) )
            // InternalTutorial.g:3558:2: ( RULE_ID )
            {
            // InternalTutorial.g:3558:2: ( RULE_ID )
            // InternalTutorial.g:3559:3: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_0"


    // $ANTLR start "rule__Component__ItemTypeAssignment_2"
    // InternalTutorial.g:3568:1: rule__Component__ItemTypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Component__ItemTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3572:1: ( ( ( RULE_ID ) ) )
            // InternalTutorial.g:3573:2: ( ( RULE_ID ) )
            {
            // InternalTutorial.g:3573:2: ( ( RULE_ID ) )
            // InternalTutorial.g:3574:3: ( RULE_ID )
            {
             before(grammarAccess.getComponentAccess().getItemTypeBasicItemTypeCrossReference_2_0()); 
            // InternalTutorial.g:3575:3: ( RULE_ID )
            // InternalTutorial.g:3576:4: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getItemTypeBasicItemTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getItemTypeBasicItemTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getComponentAccess().getItemTypeBasicItemTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ItemTypeAssignment_2"


    // $ANTLR start "rule__ItemConnection__ComponentAAssignment_0"
    // InternalTutorial.g:3587:1: rule__ItemConnection__ComponentAAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ItemConnection__ComponentAAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3591:1: ( ( ( RULE_ID ) ) )
            // InternalTutorial.g:3592:2: ( ( RULE_ID ) )
            {
            // InternalTutorial.g:3592:2: ( ( RULE_ID ) )
            // InternalTutorial.g:3593:3: ( RULE_ID )
            {
             before(grammarAccess.getItemConnectionAccess().getComponentAComponentCrossReference_0_0()); 
            // InternalTutorial.g:3594:3: ( RULE_ID )
            // InternalTutorial.g:3595:4: RULE_ID
            {
             before(grammarAccess.getItemConnectionAccess().getComponentAComponentIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getItemConnectionAccess().getComponentAComponentIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getItemConnectionAccess().getComponentAComponentCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemConnection__ComponentAAssignment_0"


    // $ANTLR start "rule__ItemConnection__MarkerAAssignment_2"
    // InternalTutorial.g:3606:1: rule__ItemConnection__MarkerAAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ItemConnection__MarkerAAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3610:1: ( ( ( RULE_ID ) ) )
            // InternalTutorial.g:3611:2: ( ( RULE_ID ) )
            {
            // InternalTutorial.g:3611:2: ( ( RULE_ID ) )
            // InternalTutorial.g:3612:3: ( RULE_ID )
            {
             before(grammarAccess.getItemConnectionAccess().getMarkerAMarkerCrossReference_2_0()); 
            // InternalTutorial.g:3613:3: ( RULE_ID )
            // InternalTutorial.g:3614:4: RULE_ID
            {
             before(grammarAccess.getItemConnectionAccess().getMarkerAMarkerIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getItemConnectionAccess().getMarkerAMarkerIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getItemConnectionAccess().getMarkerAMarkerCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemConnection__MarkerAAssignment_2"


    // $ANTLR start "rule__ItemConnection__ComponentBAssignment_5"
    // InternalTutorial.g:3625:1: rule__ItemConnection__ComponentBAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ItemConnection__ComponentBAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3629:1: ( ( ( RULE_ID ) ) )
            // InternalTutorial.g:3630:2: ( ( RULE_ID ) )
            {
            // InternalTutorial.g:3630:2: ( ( RULE_ID ) )
            // InternalTutorial.g:3631:3: ( RULE_ID )
            {
             before(grammarAccess.getItemConnectionAccess().getComponentBComponentCrossReference_5_0()); 
            // InternalTutorial.g:3632:3: ( RULE_ID )
            // InternalTutorial.g:3633:4: RULE_ID
            {
             before(grammarAccess.getItemConnectionAccess().getComponentBComponentIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getItemConnectionAccess().getComponentBComponentIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getItemConnectionAccess().getComponentBComponentCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemConnection__ComponentBAssignment_5"


    // $ANTLR start "rule__ItemConnection__MarkerBAssignment_7"
    // InternalTutorial.g:3644:1: rule__ItemConnection__MarkerBAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__ItemConnection__MarkerBAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTutorial.g:3648:1: ( ( ( RULE_ID ) ) )
            // InternalTutorial.g:3649:2: ( ( RULE_ID ) )
            {
            // InternalTutorial.g:3649:2: ( ( RULE_ID ) )
            // InternalTutorial.g:3650:3: ( RULE_ID )
            {
             before(grammarAccess.getItemConnectionAccess().getMarkerBMarkerCrossReference_7_0()); 
            // InternalTutorial.g:3651:3: ( RULE_ID )
            // InternalTutorial.g:3652:4: RULE_ID
            {
             before(grammarAccess.getItemConnectionAccess().getMarkerBMarkerIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getItemConnectionAccess().getMarkerBMarkerIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getItemConnectionAccess().getMarkerBMarkerCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemConnection__MarkerBAssignment_7"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000210000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000210000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000030000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000001800L});

}