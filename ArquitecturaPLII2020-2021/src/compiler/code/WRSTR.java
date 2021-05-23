package compiler.code;

import es.uned.lsi.compiler.intermediate.LabelFactory;
import es.uned.lsi.compiler.intermediate.LabelFactoryIF;
import es.uned.lsi.compiler.intermediate.LabelIF;

public class WRSTR extends QuadruplaFinal {

	public WRSTR(String operador, String referencia, String operando1, String operando2) {
		super(operador, referencia, operando1, operando2);
	}

	public void traducir_quadrupla(String referencia, String operando1, String operando2) {
		LabelFactoryIF lf = new LabelFactory();
		LabelIF et1 = lf.create();
		codigo_final =  "WRSTR /" + et1 + "\n" + et1 + ": DATA " + referencia + "\n";
	}
}
