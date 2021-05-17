package compiler.semantic.type;

import es.uned.lsi.compiler.semantic.ScopeIF;
import es.uned.lsi.compiler.semantic.type.TypeBase;
import es.uned.lsi.compiler.semantic.type.TypeIF;

/**
 * Class for TypeArray.
 */

// TODO: Student work
//       Include properties to characterize array type

public class TypeArray
    extends TypeBase
{   
    int rango;
    TypeIF tipo_simple;
 
	/**
     * Constructor for TypeArray.
     * @param scope The declaration scope.
     */
    public TypeArray (ScopeIF scope)
    {
        super (scope);
    }

    /**
     * Constructor for TypeArray.
     * @param scope The declaration scope.
     * @param name The name of the type.
     */
    public TypeArray (ScopeIF scope, String name)
    {
        super (scope, name);
    }
    
    /**
     * Returns the size of the type.
     * @return the size of the type.
     */
    @Override
    public int getSize ()
    {
        // TODO: Student work
        return rango;
    }
   
    
    public void setTypeSimple(TypeIF tipo_simple) {
    	this.tipo_simple = tipo_simple;
    }
    
    public TypeIF getTypeSimple() {
    	return tipo_simple;	
    }
    
    public void setRango(int rango) {
    	this.rango = rango;
    }
    
    public int getRango() {
    	return rango;
    }
}
