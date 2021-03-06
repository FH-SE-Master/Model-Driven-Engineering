/*
 * generated by Xtext 2.10.0
 */
grammar InternalSwml;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package at.fh.hagenberg.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package at.fh.hagenberg.ide.contentassist.antlr.internal;

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
import at.fh.hagenberg.services.SwmlGrammarAccess;

}
@parser::members {
	private SwmlGrammarAccess grammarAccess;

	public void setGrammarAccess(SwmlGrammarAccess grammarAccess) {
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

// Entry rule entryRuleWebApplication
entryRuleWebApplication
:
{ before(grammarAccess.getWebApplicationRule()); }
	 ruleWebApplication
{ after(grammarAccess.getWebApplicationRule()); } 
	 EOF 
;

// Rule WebApplication
ruleWebApplication 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWebApplicationAccess().getGroup()); }
		(rule__WebApplication__Group__0)
		{ after(grammarAccess.getWebApplicationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntity
entryRuleEntity
:
{ before(grammarAccess.getEntityRule()); }
	 ruleEntity
{ after(grammarAccess.getEntityRule()); } 
	 EOF 
;

// Rule Entity
ruleEntity 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityAccess().getGroup()); }
		(rule__Entity__Group__0)
		{ after(grammarAccess.getEntityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WebApplication__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WebApplication__Group__0__Impl
	rule__WebApplication__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__WebApplication__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWebApplicationAccess().getWebappKeyword_0()); }
	'webapp'
	{ after(grammarAccess.getWebApplicationAccess().getWebappKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WebApplication__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WebApplication__Group__1__Impl
	rule__WebApplication__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__WebApplication__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWebApplicationAccess().getNameAssignment_1()); }
	(rule__WebApplication__NameAssignment_1)
	{ after(grammarAccess.getWebApplicationAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WebApplication__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WebApplication__Group__2__Impl
	rule__WebApplication__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__WebApplication__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWebApplicationAccess().getLeftParenthesisKeyword_2()); }
	'('
	{ after(grammarAccess.getWebApplicationAccess().getLeftParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WebApplication__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WebApplication__Group__3__Impl
	rule__WebApplication__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__WebApplication__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWebApplicationAccess().getEntitiesAssignment_3()); }
	(rule__WebApplication__EntitiesAssignment_3)*
	{ after(grammarAccess.getWebApplicationAccess().getEntitiesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__WebApplication__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__WebApplication__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__WebApplication__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWebApplicationAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getWebApplicationAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__0__Impl
	rule__Entity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
	'entity'
	{ after(grammarAccess.getEntityAccess().getEntityKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__1__Impl
	rule__Entity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getNameAssignment_1()); }
	(rule__Entity__NameAssignment_1)
	{ after(grammarAccess.getEntityAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__2__Impl
	rule__Entity__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_2()); }
	'('
	{ after(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getEntityAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__WebApplication__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWebApplicationAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getWebApplicationAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__WebApplication__EntitiesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWebApplicationAccess().getEntitiesEntityParserRuleCall_3_0()); }
		ruleEntity
		{ after(grammarAccess.getWebApplicationAccess().getEntitiesEntityParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
