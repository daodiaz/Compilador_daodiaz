package compiler.code;

import java.util.ArrayList;

public class HALT extends QuadruplaFinal {

	public HALT(String operador, String referencia, String operando1, String operando2) {
		super(operador, referencia, operando1, operando2);
	}

	public void traducir_quadrupla(String referencia, String operando1, String operando2) {
		codigo_final =  "HALT" + "\n";
		//Obtengo las cadenas DATA añadidas.
		ArrayList<String> cadenas = ExecutionEnvironmentEns2001.getCadenas();
		//Añado las cadenas DATA de Strings.
        if(cadenas != null) {
        	for (String cadena : cadenas) {
        		codigo_final += cadena;
        	}
        }
        
        //Limpio las cadenas para siguientes programas.
        cadenas.clear();
	}
}
