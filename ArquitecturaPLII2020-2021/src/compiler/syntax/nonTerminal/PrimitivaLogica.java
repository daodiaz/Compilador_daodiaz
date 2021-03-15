package compiler.syntax.nonTerminal;

public class PrimitivaLogica extends Expresion {

	public PrimitivaLogica(Expresion expresion_izq, String operando, Expresion expresion_der) {
		super(expresion_izq, operando, expresion_der);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean getValorLogico() {
		// TODO Auto-generated method stub
		return valor_logico;
	}

	@Override
	public int getResultado() {
		// TODO Auto-generated method stub
		return -1;
	}
	
	public void setValorLogico(boolean valor) {
		valor_logico = valor;
	}
}
