package compiler.code;

public class MVP extends QuadruplaFinal {

	public MVP(String operador, String referencia, String operando1, String operando2) {
		super(operador, referencia, operando1, operando2);
		// TODO Auto-generated constructor stub
	}
	
	public void traducir_quadrupla(String referencia, String operando1, String operando2) {
		if(operando2 == null)
			codigo_final =  "MOVE #" + operando1.replaceAll("[^0-9]", "") + ", " + ".R1\n" + "MOVE .R1, " + referencia + "\n";
		else
			codigo_final =  "MOVE #" + operando1.replaceAll("[^0-9]", "") + ", " + ".R1\n" + "ADD .R1, " + operando2 + "\n" +  "MOVE .A, .R1\n" + "MOVE .R1, " + referencia + "\n";
	}

}
