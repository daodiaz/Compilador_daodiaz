package compiler.code;

public class WRSTR extends QuadruplaFinal {

	public WRSTR(String operador, String referencia, String operando1, String operando2) {
		super(operador, referencia, operando1, operando2);
		// TODO Auto-generated constructor stub
	}

	public void traducir_quadrupla(String referencia, String operando1, String operando2) {
		codigo_final =  "RES  " + referencia + "\n";
	}
}
