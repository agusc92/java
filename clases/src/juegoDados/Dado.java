package juegoDados;

public class Dado {

	private int caras;
	private int ultimoValor;
	
	public Dado() {
		caras = 6;
		ultimoValor = this.tirar();
	}
	public Dado(int caras) {
		this.caras = caras;
		ultimoValor = this.tirar();
	}
	public int getCaras() {
		return caras;
	}
	public void setCaras(int caras) {
		this.caras = caras;
	}
	public int getUltimoValor() {
		return ultimoValor;
	}
	
	public int tirar() {
		ultimoValor= (int)(Math.random()*caras+1);
		return ultimoValor;
	}
	
	
	public static void main(String[] args) {
		Dado d1 = new Dado();
		Dado d2 = new Dado(10);
		
		for (int i = 0; i<50; i++) {
			System.out.println("d1:" + d1.tirar() +
		                       " d2:" +d2.tirar()       );
		}
	}
	
	
}
