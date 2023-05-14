package compiler.syntax.nonTerminal;

import es.uned.lsi.compiler.semantic.symbol.SymbolIF;

public class Array extends NonTerminal{
	   SymbolIF array;
	   	
	   public Array(SymbolIF array) {
		   this.array = array;
	   }
	   
	   public SymbolIF getSymbol() {
		   return array;
	   }
}
