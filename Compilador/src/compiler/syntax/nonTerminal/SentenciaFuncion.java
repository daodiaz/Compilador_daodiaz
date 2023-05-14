package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.symbol.SymbolIF;

public class SentenciaFuncion extends SentenciaGeneral {
	private SymbolIF funcion;
	
	public SentenciaFuncion(SymbolIF f) {
		funcion = f;
	}
	
	public SymbolIF getSymbol() {
		return funcion;
	}
}
