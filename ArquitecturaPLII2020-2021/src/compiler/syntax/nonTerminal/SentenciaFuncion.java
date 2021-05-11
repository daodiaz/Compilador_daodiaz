package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.symbol.SymbolBase;

public class SentenciaFuncion extends NonTerminal {
	private SymbolBase funcion;
	
	public SentenciaFuncion(SymbolBase f) {
		funcion = f;
	}
}
