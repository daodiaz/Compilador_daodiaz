package compiler.code;

public class DATA extends QuadruplaFinal {

	public DATA(String operador, String referencia, String operando1, String operando2) {
		super(operador, referencia, operando1, operando2);
	}

	public void traducir_quadrupla(String referencia, String operando1, String operando2) {
		codigo_final =  "RES  " + operando1.replaceAll("[^0-9]", "") + "\n";
	}
}
