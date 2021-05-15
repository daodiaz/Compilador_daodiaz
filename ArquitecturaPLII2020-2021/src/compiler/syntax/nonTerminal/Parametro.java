package compiler.syntax.nonTerminal;

public class Parametro {

		private String nombre;
		private boolean valvsref;
		private String tipo;
		private boolean primitiva;
		
		public Parametro(String nombre, boolean valvsref) {
			this.nombre = nombre;
			this.valvsref = valvsref;
		}
		
		public Parametro(String tipo) {
			this.tipo = tipo;
			primitiva = true;
		}
		
		public boolean getValVSRef() {
			return valvsref;
		}
		
		public String getNombre() {
			return nombre;
		}
		
		public String getTipo() {
			return tipo;
		}
		
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		public boolean esPrimitiva() {
			return primitiva;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
}
