package compiler.syntax.nonTerminal;

public abstract class Expresion extends NonTerminal {
	protected Expresion expresion_izq;
	protected String operando;
	protected Expresion expresion_der;
	protected int valor;
	protected boolean valor_logico;
	
	public Expresion (Expresion expresion_izq, String operando, Expresion expresion_der) {
		this.expresion_izq = expresion_izq;
		this.operando = operando;
		this.expresion_der = expresion_der;
	}
	
	/*public Expresion (Expresion expresion_izq, String operando, Expresion expresion_der, Boolean parentesis) {
		this.expresion_izq = expresion_izq;
		this.operando = operando;
		this.expresion_der = expresion_der;
		this.parentesis = parentesis;
	}*/
	
	public abstract int getResultado();
	
	/*Método para devolver el valor de cualquier expresion*/
	public int getValor() {
		return valor;
	}
	
	/*Método para devolver el valor de cualquier expresion*/
	public boolean getValorLogico() {
		return valor_logico;
	}
	
}
	
