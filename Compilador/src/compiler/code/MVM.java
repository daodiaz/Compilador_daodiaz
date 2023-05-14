package compiler.code;

public class MVM extends QuadruplaFinal {

	public MVM(String operador, String referencia, String operando1, String operando2) {
		super(operador, referencia, operando1, operando2);
		// TODO Auto-generated constructor stub
	}

	public void traducir_quadrupla(String referencia, String operando1, String operando2) {
		codigo_final = "MOVE " + referencia + ", .R1\n" + "MOVE [.R1], " + operando1 + "\n";
	}
}
