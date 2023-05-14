package compiler.syntax.nonTerminal;

public class ExpresionLogica extends Expresion {

	public ExpresionLogica(Expresion expresion_izq, String operando, Expresion expresion_der) {
		super(expresion_izq, operando, expresion_der);
		tipo = "boolean";
	}

	@Override
	public int getResultado() {
		// TODO Auto-generated method stub
		return -1;
	}

}
