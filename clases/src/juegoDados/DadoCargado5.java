package juegoDados;
//NO VA ESTA CLASE ESTA MAL CLASE VS INSTANCIA POR LA CONSTANTE EN CONDIGO 5
public class DadoCargado5 extends Dado {

	public DadoCargado5() {
		super();
	}
	public DadoCargado5(int caras) {
		super(caras);
	}	
	public int tirar() {
		
		if (Math.random()<0.5) {
			return 5;
		} else {
			return super.tirar();
		}
	}
	
	
	public static void main(String[] args) {
		Dado d1 = new Dado();
		DadoCargado5 d2 = new DadoCargado5();
		for(int i =0; i<20; i++) {
			System.out.println("d1:"+d1.tirar() + 
					           "-d2:" + d2.tirar());
		}
	}
}
