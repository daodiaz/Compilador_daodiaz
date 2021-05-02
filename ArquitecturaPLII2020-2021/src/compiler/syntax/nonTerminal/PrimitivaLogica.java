package compiler.syntax.nonTerminal;

public class PrimitivaLogica extends Expresion {
	
	private String nombre_vector;
	private String nombre;

	public PrimitivaLogica(Expresion expresion_izq, String operando, Expresion expresion_der) {
		super(expresion_izq, operando, expresion_der);
		tipo = "boolean";
	}

	@Override
	public Object getValor() {
		// TODO Auto-generated method stub
		return valor;
	}

	@Override
	public int getResultado() {
		// TODO Auto-generated method stub
		return -1;
	}
	
	public void setValorLogico(boolean valor) {
		valor = valor;
	}
	
	public void setNombreVector(String nombre) {
		nombre_vector = nombre;
	}
	
	public String getNombreVector() {
		return nombre_vector;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
}
