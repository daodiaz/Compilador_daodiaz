package compiler.code;

public class BRF extends QuadruplaFinal {

	public BRF(String operador, String referencia, String operando1, String operando2) {
		super(operador, referencia, operando1, operando2);
	}
	
	public void traducir_quadrupla(String referencia, String operando1, String operando2) {
		codigo_final =  "CMP #0, " + referencia + "\n" + "BZ /" + operando1 + "\n";
	}
}
