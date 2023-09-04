package juegoDados;
//NO VA ESTA CLASE ESTA MAL CLASE VS INSTANCIA POR LA CONSTANTE EN CONDIGO 6
public class DadoCargado6 extends Dado {
	public DadoCargado6() {
		super();
	}
	public DadoCargado6(int caras) {
		super(caras);
	}	
	public int tirar() {
		
		if (Math.random()<0.5) {
			return 6;
		} else {
			return super.tirar();
		}
	}
	
	
	public static void main(String[] args) {
		Dado d1 = new Dado();
		DadoCargado6 d2 = new DadoCargado6();
		for(int i =0; i<20; i++) {
			System.out.println("d1:"+d1.tirar() + 
					           "-d2:" + d2.tirar());
		}
	}
	
}
