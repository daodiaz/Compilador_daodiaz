package compiler.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import compiler.intermediate.Label;
import compiler.intermediate.Temporal;
import compiler.intermediate.Value;
import compiler.intermediate.Variable;
import compiler.semantic.symbol.SymbolFunction;
import compiler.semantic.symbol.SymbolProcedure;
import compiler.semantic.type.TypeSimple;

import es.uned.lsi.compiler.code.ExecutionEnvironmentIF;
import es.uned.lsi.compiler.code.MemoryDescriptorIF;
import es.uned.lsi.compiler.code.RegisterDescriptorIF;
import es.uned.lsi.compiler.intermediate.OperandIF;
import es.uned.lsi.compiler.intermediate.QuadrupleIF;

/**
 * Class for the ENS2001 Execution environment.
 */

public class ExecutionEnvironmentEns2001 
    implements ExecutionEnvironmentIF
{    
    private final static int      MAX_ADDRESS = 65535; 
    private final static String[] REGISTERS   = {
       ".PC", ".SP", ".SR", ".IX", ".IY", ".A", 
       ".R0", ".R1", ".R2", ".R3", ".R4", 
       ".R5", ".R6", ".R7", ".R8", ".R9"
    };
    
    private static ArrayList<String> cadenas;
    private RegisterDescriptorIF registerDescriptor;
    private MemoryDescriptorIF   memoryDescriptor;
    
    /**
     * Constructor for ENS2001Environment.
     */
    public ExecutionEnvironmentEns2001 ()
    {       
        super ();
        cadenas = new ArrayList<String>();
    }
    
    /**
     * Returns the size of the type within the architecture.
     * @return the size of the type within the architecture.
     */
    @Override
    public final int getTypeSize (TypeSimple type)
    {      
        return 1;  
    }
    
    /**
     * Returns the registers.
     * @return the registers.
     */
    @Override
    public final List<String> getRegisters ()
    {
        return Arrays.asList (REGISTERS);
    }
    
    /**
     * Returns the memory size.
     * @return the memory size.
     */
    @Override
    public final int getMemorySize ()
    {
        return MAX_ADDRESS;
    }
           
    /**
     * Returns the registerDescriptor.
     * @return Returns the registerDescriptor.
     */
    @Override
    public final RegisterDescriptorIF getRegisterDescriptor ()
    {
        return registerDescriptor;
    }

    /**
     * Returns the memoryDescriptor.
     * @return Returns the memoryDescriptor.
     */
    @Override
    public final MemoryDescriptorIF getMemoryDescriptor ()
    {
        return memoryDescriptor;
    }

    /**
     * Translate a quadruple into a set of final code instructions. 
     * @param cuadruple The quadruple to be translated.
     * @return a quadruple into a set of final code instructions. 
     */
    @Override
    public final String translate (QuadrupleIF quadruple)
    {      
        String operator = quadruple.getOperation();
        String operando1 = traducir_operando(quadruple.getFirstOperand());
        String operando2 = traducir_operando(quadruple.getSecondOperand());
        String referencia = traducir_operando(quadruple.getResult());
        String resultado = "; Quadrupla: " + quadruple.toString() + "\n";
        
        QuadruplaFinal quadrupla_final = new QuadruplaFinal(operator, referencia, operando1, operando2);
        
        resultado += quadrupla_final.getCodigoFinal();
        
        return resultado; 
    }
    
    private String traducir_operando(OperandIF operando) {
    	String resultado;
    	if (operando == null) {
    		return null;
    	}
    	switch(operando.getClass().getSimpleName()) {
    		case "Value":
    			switch(((Value) operando).getValue().toString()) {
    				case "true":
    					resultado = "#1";
    					break;
    				case "false":
    					resultado = "#0";
    					break;
    				default:
    					if(((Value) operando).getValue() instanceof String) {
    						//Comprobar que la cadena de cracteres se representa así.
    						resultado = ((Value) operando).getValue().toString();
    					} else {
    						resultado = "#" + ((Value) operando).getValue();
    					}
    			}
    			break;
    		case "Temporal":
    			resultado = "#" + ((Temporal) operando).getAddress() + "[.IX]";
    			break;
    		case "Variable":
    			Variable v = (Variable) operando;
    				if(v.isGlobal()) {
    					System.out.println("El nombre de la variable es: " + v.getName() + " con direccion " + v.getAddress());
    					resultado = "/" + v.getAddress(); 
    				} else {
    					//FALTA RELLENAR CUANDO IMPLEMENTE LAS FUNCIONES. 
    					resultado = null;
    				}
    			break;
    		case "Label":
    			resultado = ((Label) operando).getName();
    			break;
    		default:
    			resultado = null;
    			throw new RuntimeException("Se ha pasado un operando cuya clase no es compatible con el ensamblador: " + operando.getClass().getSimpleName());
    	}
    	return resultado;
    }
    
    //Método para acceder a la lista de cadenas desde fuera.
    public static void addCadena(String cadena){
    	cadenas.add(cadena);
    }
    
    public static ArrayList<String> getCadenas(){
    	return cadenas;
    }
}
