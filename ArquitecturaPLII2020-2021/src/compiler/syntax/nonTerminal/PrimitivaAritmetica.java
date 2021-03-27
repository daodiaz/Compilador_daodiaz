package compiler.syntax.nonTerminal;

public class PrimitivaAritmetica extends Expresion {

	public PrimitivaAritmetica(Expresion expresion_izq, String operando, Expresion expresion_der) {
		super(expresion_izq, operando, expresion_der);
		tipo = "entero";
	}

	/*En el caso de las primitivas lo único que hacen es devolver su valor*/
	@Override
	public int getResultado() {
		// TODO Auto-generated method stub
		return valor;
	}
	
	/*Método para setear el valor de la primitiva aritmética, se le debe de pasar argumento en Integer*/
	public void setValor(Integer valor) {
		this.valor = valor;
	}

}
