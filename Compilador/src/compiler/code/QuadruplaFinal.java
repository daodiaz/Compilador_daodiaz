package compiler.code;

public class QuadruplaFinal {
	protected String codigo_final;
	private String operador;
	private String referencia;
	private String operando1;
	private String operando2;
	
	public QuadruplaFinal(String operador, String referencia, String operando1, String operando2) {
		this.operador = operador;
		this.operando1 = operando1;
		this.operando2 = operando2;
		this.referencia = referencia;
		traducir_quadrupla(referencia, operando1, operando2);
	}
	
	public void traducir_quadrupla(String referencia, String operando1, String operando2) {
		switch(operador){
		case "ADD":
			codigo_final = (new ADD(operador, referencia, operando1, operando2)).getCodigoFinal(); 
			break;
		case "MUL":
			codigo_final = (new MULT(operador, referencia, operando1, operando2)).getCodigoFinal(); 
			break;
		case "BR":
			codigo_final = (new BR(operador, referencia, operando1, operando2)).getCodigoFinal(); 
			break;
		case "INL":
			codigo_final = (new INL(operador, referencia, operando1, operando2)).getCodigoFinal(); 
			break;
		case "MV":
			codigo_final = (new MV(operador, referencia, operando1, operando2)).getCodigoFinal(); 
			break;
		case "NOT":
			codigo_final = (new NOT(operador, referencia, operando1, operando2)).getCodigoFinal(); 
			break;
		case "BRF":
			codigo_final = (new BRF(operador, referencia, operando1, operando2)).getCodigoFinal(); 
			break;
		case "BRT":
			codigo_final = (new BRT(operador, referencia, operando1, operando2)).getCodigoFinal();
			break;
		case "GR":
			codigo_final = (new GR(operador, referencia, operando1, operando2)).getCodigoFinal();
			break;
		case "LS":
			codigo_final = (new LS(operador, referencia, operando1, operando2)).getCodigoFinal();
			break;
		case "EQ":
			codigo_final = (new EQ(operador, referencia, operando1, operando2)).getCodigoFinal();
			break;
		case "MVA":
			codigo_final = (new MVA(operador, referencia, operando1, operando2)).getCodigoFinal();
			break;
		case "DATA":
			codigo_final = (new DATA(operador, referencia, operando1, operando2)).getCodigoFinal();
			break;
		case "MVP":
			codigo_final = (new MVP(operador, referencia, operando1, operando2)).getCodigoFinal();
			break;
		case "STA":
			codigo_final = (new STA(operador, referencia, operando1, operando2)).getCodigoFinal();
			break;
		case "STP":
			codigo_final = (new STP(operador, referencia, operando1, operando2)).getCodigoFinal();
			break;
		case "OUT_STRING":
			codigo_final = (new WRSTR(operador, referencia, operando1, operando2)).getCodigoFinal();;
			break;
		case "OUT_INT":
			codigo_final = (new WRINT(operador, referencia, operando1, operando2)).getCodigoFinal();
			break;
		case "INC":
			codigo_final = (new INC(operador, referencia, operando1, operando2)).getCodigoFinal();
			break;
		case "HALT":
			codigo_final = (new HALT(operador, referencia, operando1, operando2)).getCodigoFinal();
			break;
		case "MVM":
			codigo_final = (new MVM(operador, referencia, operando1, operando2)).getCodigoFinal();
			break;
		case "SUB":
			codigo_final = (new SUB(operador, referencia, operando1, operando2)).getCodigoFinal();
			break;
		case "PARAM":
			codigo_final = "";
			break;
		case "CALL":
			codigo_final = "";
			break;
		default:
			throw new RuntimeException("NO se ha definido una acción de traducción a codigo final para la siguiente operacion de codigo intermedio: " + operador);
		}
	}
	
	public String getCodigoFinal() {
		return codigo_final;
	}
}
