package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class ListaVariables extends NonTerminal {
	private static ArrayList<Parametro> lista_variables = new ArrayList<Parametro>();
	private static boolean enDeclaracion = false;
	public ListaVariables () {
		
	}
	
	public static void addVariable(Parametro variable) {
		lista_variables.add(variable);
	}
	
	public static void clearVariables() {
		if(lista_variables != null) {
			lista_variables.clear();
		}
	}
	
	public static ArrayList<Parametro> getVariables(){
		return lista_variables;
	}
	
	public static boolean getEnDeclaracion() {
		return enDeclaracion;
	}
	
	public static void setEnDeclaracion(boolean bandera) {
		enDeclaracion = bandera;
	}
}
