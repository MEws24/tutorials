/*
 * generated by Xtext 2.35.0
 */
package org.xtext.example.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.parser.antlr.internal.InternalTutorialParser;
import org.xtext.example.services.TutorialGrammarAccess;

public class TutorialParser extends AbstractAntlrParser {

	@Inject
	private TutorialGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalTutorialParser createParser(XtextTokenStream stream) {
		return new InternalTutorialParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Factory";
	}

	public TutorialGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(TutorialGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}