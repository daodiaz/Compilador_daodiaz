package compiler.code;

import es.uned.lsi.compiler.intermediate.LabelFactory;
import es.uned.lsi.compiler.intermediate.LabelFactoryIF;
import es.uned.lsi.compiler.intermediate.LabelIF;

public class EQ extends QuadruplaFinal {

	public EQ(String operador, String referencia, String operando1, String operando2) {
		super(operador, referencia, operando1, operando2);
		// TODO Auto-generated constructor stub
	}

	public void traducir_quadrupla(String referencia, String operando1, String operando2) {
		LabelFactoryIF lf = new LabelFactory();
		LabelIF et1 = lf.create();
		LabelIF et2 = lf.create();
		codigo_final =  "SUB " + operando1 + ", " + operando2 + "\n" + "BZ /" + et1 + "\n" + "MOVE #0, " + referencia + "\n" + "BR /" + et2 + "\n" + et1 + " : \n" + "MOVE #1, " + referencia + "\n" +  et2 + " : \n";
	}
}
