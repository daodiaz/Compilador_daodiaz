package compiler.code;

public class PARAM extends QuadruplaFinal {

	public PARAM(String operador, String referencia, String operando1, String operando2) {
		super(operador, referencia, operando1, operando2);
	}

	public void traducir_quadrupla(String referencia, String operando1, String operando2) {
		codigo_final =  "PUSH "+ referencia + "\n";
	}
}
