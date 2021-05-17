package compiler.code;

public class BRT extends QuadruplaFinal {

	public BRT(String operador, String referencia, String operando1, String operando2) {
		super(operador, referencia, operando1, operando2);
	}

	public void traducir_quadrupla(String referencia, String operando1, String operando2) {
		codigo_final =  "CMP #1, " + operando1 + "\n" + "BZ /" + referencia + "\n";
	}
}
