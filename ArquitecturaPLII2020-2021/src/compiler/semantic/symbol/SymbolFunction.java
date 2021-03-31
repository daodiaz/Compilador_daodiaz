package compiler.semantic.symbol;

import java.util.ArrayList;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolFunction.
 */

// TODO: Student work
//       Include properties to characterize function calls

public class SymbolFunction
    extends SymbolProcedure
{
    private TypeIF tipo_retorno;
    private String value;
    private static boolean devolver_declarado;
    private static ArrayList<String> tipos_devolver = new ArrayList<String>();
      
    /**
     * Constructor for SymbolFunction.
     * @param scope The declaration scope.
     * @param name The symbol name.
     * @param type The symbol type.
     */
    public SymbolFunction (ScopeIF scope, 
                           String name,
                           TypeIF type)
    {
        super (scope, name, type);
        tipo_retorno = type;
    }
    
    public void setReturn(TypeIF tipo_retorno) {
    	this.tipo_retorno = tipo_retorno;
    }
    
    public TypeIF getReturn() {
    	return tipo_retorno;
    }
    
    public void setValue(String value) {
    	this.value = value;
    }
    
    public String getValue() {
    	return value;
    }
    
    public static void setDevolverDeclarado(boolean bandera) {
    	devolver_declarado = bandera;
    	
    };
    
    public static boolean getDevolverDeclarado() {
    	return devolver_declarado;
    }
    
    public static void addTipoDevolver(String tipo) {
    	tipos_devolver.add(tipo);
    };
    
    //Función para comprobar que los devolver de la función actual corresponde con el tipo pasado por parámetro
    public static boolean comprobarTiposDevolver(String tipo) {
    	for(String tipo_aux : tipos_devolver) {
    		if(!tipo_aux.equals(tipo)) {
    			return false;
    		}
    	}
    	return true;
    }
    
    public static void clearTiposDevolver() {
    	tipos_devolver.clear();
    }
    
}
