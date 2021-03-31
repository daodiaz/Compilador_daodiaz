package compiler.syntax.nonTerminal;

public class Parametro {

		private String nombre;
		private boolean valvsref;
		
		public Parametro(String nombre, boolean valvsref) {
			this.nombre = nombre;
			this.valvsref = valvsref;
		}
		
		public boolean getValVSRef() {
			return valvsref;
		}
		
		public String getNombre() {
			return nombre;
		}
}
