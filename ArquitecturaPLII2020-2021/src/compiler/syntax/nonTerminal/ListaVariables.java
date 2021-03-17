package compiler.syntax.nonTerminal;

import java.util.ArrayList;

public class ListaVariables extends NonTerminal {
	private static ArrayList<String> lista_variables = new ArrayList<String>();
	
	public ListaVariables () {
		
	}
	
	public static void addVariable(String variable) {
		lista_variables.add(variable);
	}
	
	public static void clearVariables() {
		lista_variables.clear();
	}
	
	public static ArrayList<String> getVariables(){
		return lista_variables;
	}
}
