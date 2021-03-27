package compiler.syntax.nonTerminal;
/*
 * Clase para definir las expresiones aritméticas
 * */
public class ExpresionAritmetica extends Expresion {
	
	public ExpresionAritmetica(Expresion expresion_izq, String operando, Expresion expresion_der) {
		super(expresion_izq, operando, expresion_der);
		tipo = "entero";
		
	}
	
	/*Obtiene el resultado de la Expresión actual y lo guarda en el campo valor*/
	public int getResultado() {
		//Compruebo que las expresiones de la izquierda y la derecha son Expresiones aritméticas.
		if(((expresion_izq instanceof ExpresionAritmetica) || (expresion_izq instanceof PrimitivaAritmetica)) 
			&& ((expresion_der instanceof ExpresionAritmetica) || (expresion_der instanceof PrimitivaAritmetica))) {
			switch(operando) {
				case "*":
					valor =  expresion_izq.getResultado() * expresion_der.getResultado();
					break;
				case "+":
					valor =  expresion_izq.getResultado() + expresion_der.getResultado();
					break; 
				default:
					throw new RuntimeException("Operación no permitida en expresiones artiméticas: " + operando.toString());
			}
			return valor;
		}
		else {
			throw new RuntimeException("No se puede realizar una operación entre una expresión de tipo " + 
					expresion_izq.getClass().getSimpleName() + " con otra expresión de tipo " + expresion_der.getClass().getSimpleName());
		}
	}
	
	
	
/*	
	public ExpresionAritmetica(Expresion expresion_izq, String operando, Expresion expresion_der, Boolean parentesis) {
		super(expresion_izq, operando, expresion_der, parentesis);
	
	}
*/

/*	public void calcularPrioridad() {
		int prioridad_auxiliar = 0;
		switch(operando) {
			case "*":
				prioridad_auxiliar = 2;
				break;
			case "+":
				prioridad_auxiliar = 1;
				break;
			default:
				throw new RuntimeException("Operación no permitida en expresiones artiméticas: " + operando.toString());
		}
		
		this.prioridad = Math.max(prioridad_auxiliar, Math.max(prioridad_der, prioridad_izq));
	}

	@Override
	public Object calcularExpresion() {
		if(prioridad_izq < prioridad_der) {
			
		} else {
			if(this.expresion_izq.prioridad == 0) {
				return 
			}
		}
		
		
		// TODO Auto-generated method stub
		return null;
	}
	*/
}
