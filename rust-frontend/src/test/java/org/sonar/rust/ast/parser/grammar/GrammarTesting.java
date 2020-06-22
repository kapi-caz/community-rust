package org.sonar.rust.ast.parser.grammar;

import org.sonar.rust.ast.parser.RustLexer;
import org.sonar.sslr.parser.LexerlessGrammar;

public abstract class GrammarTesting {

    public final LexerlessGrammar g = RustLexer.createGrammarBuilder().build();
}
