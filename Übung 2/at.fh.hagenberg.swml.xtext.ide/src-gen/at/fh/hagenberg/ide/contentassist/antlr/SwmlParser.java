/*
 * generated by Xtext 2.10.0
 */
package at.fh.hagenberg.ide.contentassist.antlr;

import at.fh.hagenberg.ide.contentassist.antlr.internal.InternalSwmlParser;
import at.fh.hagenberg.services.SwmlGrammarAccess;
import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class SwmlParser extends AbstractContentAssistParser {

	@Inject
	private SwmlGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSwmlParser createParser() {
		InternalSwmlParser result = new InternalSwmlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getWebApplicationAccess().getGroup(), "rule__WebApplication__Group__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getWebApplicationAccess().getNameAssignment_1(), "rule__WebApplication__NameAssignment_1");
					put(grammarAccess.getWebApplicationAccess().getEntitiesAssignment_3(), "rule__WebApplication__EntitiesAssignment_3");
					put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalSwmlParser typedParser = (InternalSwmlParser) parser;
			typedParser.entryRuleWebApplication();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SwmlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SwmlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
