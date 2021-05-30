package compiler.code;

public class STVECTOR extends QuadruplaFinal {

	public STVECTOR(String operador, String referencia, String operando1, String operando2) {
		super(operador, referencia, operando1, operando2);
		// TODO Auto-generated constructor stub
	}

	public void traducir_quadrupla(String referencia, String operando1, String operando2) {
		codigo_final =  "MOVE #" +  operando1.replaceAll("[^0-9]", "") + ", .R0\n" +  "MOVE .R0, " + operando1 + "\n";
	}
}
