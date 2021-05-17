package compiler.semantic.symbol;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolVariable.
 */

// TODO: Student work
//       Include properties to characterize variables

public class SymbolVariable
    extends SymbolBase
{  
	private Integer address;
    private String value;
    //Falso o null por valor, true por referencia.
    private boolean valvsref;
    private boolean isInit;
    
    /**
     * Constructor for SymbolVariable.
     * @param scope The declaration scope.
     * @param name The symbol name.
     * @param type The symbol type.
     */
    public SymbolVariable (ScopeIF scope, 
                           String name,
                           TypeIF type)
    {
        super (scope, name, type);
        isInit = false;
    } 
    
    public void setValue(String value) {
    	this.value = value;
    }
    
    public String getValue() {
    	return value;
    }
    
    public void setValVSRef(boolean bandera) {
    	valvsref = bandera;
    }
    
    public boolean isInit() {
    	return isInit;
    }
    
    public void setIsInit(boolean bool) {
    	isInit = bool;
    }
    
    public void setAddress(Integer address) {
    	this.address = address;
    }
}
