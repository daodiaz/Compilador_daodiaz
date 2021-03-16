package compiler.semantic.symbol;

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
    private String tipo_retorno;
    private String value;
      
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
    }
    
    public void setReturn(String tipo_retorno) {
    	this.tipo_retorno = tipo_retorno;
    }
    
    public String getReturn() {
    	return tipo_retorno;
    }
    
    public void setValue(String value) {
    	this.value = value;
    }
    
    public String getValue() {
    	return value;
    }
}
