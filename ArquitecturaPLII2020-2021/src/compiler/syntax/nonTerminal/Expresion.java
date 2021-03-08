package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class Expresion extends NonTerminal {
	private ArrayList<Expresion> expresiones;
	
	public Expresion(ArrayList<Expresion> expresiones) {
		this.expresiones = expresiones;
	}
	
	public ArrayList<Expresion> getExpresiones (){
		return expresiones;
	}
	
}
