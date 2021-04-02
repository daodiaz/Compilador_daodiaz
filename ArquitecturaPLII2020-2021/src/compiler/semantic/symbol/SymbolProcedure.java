package compiler.semantic.symbol;

import java.util.ArrayList;
import java.util.Queue;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.symbol.SymbolBase;
import es.uned.lsi.compiler.semantic.symbol.SymbolIF;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for SymbolProcedure.
 */

// TODO: Student work
//       Include properties to characterize procedure calls

public class SymbolProcedure
    extends SymbolBase
{
    private ArrayList<SymbolIF> parametros;

    /**
     * Constructor for SymbolProcedure.
     * @param scope The declaration scope.
     * @param name The symbol name.
     * @param type The symbol type.
     */
    public SymbolProcedure (ScopeIF scope, 
                            String name,
                            TypeIF type)
    {
        super (scope, name, type);
    } 
    
    public void setParametros(ArrayList<SymbolIF> parametros) {
    	this.parametros = parametros;
    }
    
    public ArrayList<SymbolIF> getParametros(){
    	return parametros;
    }
}
