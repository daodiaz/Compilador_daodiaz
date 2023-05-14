package compiler.code;

public class BR extends QuadruplaFinal {

	public BR(String operador, String referencia, String operando1, String operando2) {
		super(operador, referencia, operando1, operando2);
	}
	
	public void traducir_quadrupla(String referencia, String operando1, String operando2) {
		codigo_final = "BR /" + referencia + "\n";
	}

}
