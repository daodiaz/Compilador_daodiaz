package compiler.syntax.nonTerminal;

public class SentenciaAsignacion extends NonTerminal {
	private Object parte_izquierda;
	private Object parte_derecha;
	private String tipo;
	
	public SentenciaAsignacion(Object parte_izquierda, Object parte_derecha, String tipo) {
		this.parte_izquierda = parte_izquierda;
		this.parte_derecha = parte_derecha;
		this.tipo = tipo;
	}
}
