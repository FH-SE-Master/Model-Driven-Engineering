/*
 * generated by Xtext 2.9.2
 */
package at.ooe.fh.mdm.herzog.dsl.proj.web;

import at.ooe.fh.mdm.herzog.dsl.proj.ide.contentassist.antlr.ProjectGeneratorParser;
import at.ooe.fh.mdm.herzog.dsl.proj.ide.contentassist.antlr.internal.InternalProjectGeneratorLexer;
import com.google.inject.Binder;
import com.google.inject.Provider;
import com.google.inject.name.Names;
import java.util.concurrent.ExecutorService;
import org.eclipse.xtext.ide.LexerIdeBindings;
import org.eclipse.xtext.ide.editor.contentassist.antlr.IContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
import org.eclipse.xtext.web.server.DefaultWebModule;

/**
 * Manual modifications go to {@link ProjectGeneratorWebModule}.
 */
@SuppressWarnings("all")
public abstract class AbstractProjectGeneratorWebModule extends DefaultWebModule {

	public AbstractProjectGeneratorWebModule(Provider<ExecutorService> executorServiceProvider) {
		super(executorServiceProvider);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.web.WebIntegrationFragment
	public void configureContentAssistLexer(Binder binder) {
		binder.bind(Lexer.class).annotatedWith(Names.named(LexerIdeBindings.CONTENT_ASSIST)).to(InternalProjectGeneratorLexer.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.web.WebIntegrationFragment
	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		return ProjectGeneratorParser.class;
	}
	
}
