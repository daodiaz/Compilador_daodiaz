package compiler.code;

public class MVP extends QuadruplaFinal {

	public MVP(String operador, String referencia, String operando1, String operando2) {
		super(operador, referencia, operando1, operando2);
		// TODO Auto-generated constructor stub
	}
	
	public void traducir_quadrupla(String referencia, String operando1, String operando2) {
		codigo_final =  "MOVE " + operando1 + ", " + ".R1\n" + "MOVE [.R1], " + referencia + "\n";
	}

}
