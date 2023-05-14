package compiler.code;

public class ADD extends QuadruplaFinal {
	
	public ADD(String operando, String referencia, String operando1, String operando2) {
		super(operando, referencia, operando1, operando2);
	}
	

	public void traducir_quadrupla(String referencia, String operando1, String operando2) {
		codigo_final = "ADD " + operando1 + ", " + operando2 + "\n" + "MOVE .A, " + referencia + "\n";
	}
}
