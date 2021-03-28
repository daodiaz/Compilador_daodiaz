package compiler.syntax.nonTerminal;

public class PrimitivaLogica extends Expresion {
	
	private String nombre_vector;

	public PrimitivaLogica(Expresion expresion_izq, String operando, Expresion expresion_der) {
		super(expresion_izq, operando, expresion_der);
		tipo = "boolean";
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
	
	public void setNombreVector(String nombre) {
		nombre_vector = nombre;
	}
	
	public String getNombreVector() {
		return nombre_vector;
	}
}
