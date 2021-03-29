package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.symbol.SymbolIF;

public class SentenciaAsignacion extends NonTerminal {
	private SymbolIF parte_izquierda;
	private Expresion parte_derecha;
	private String tipo;
	
	public SentenciaAsignacion(SymbolIF parte_izquierda, Expresion parte_derecha, String tipo) {
		this.parte_izquierda = parte_izquierda;
		this.parte_derecha = parte_derecha;
		this.tipo = tipo;
	}
}
