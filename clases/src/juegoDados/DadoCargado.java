package juegoDados;

public class DadoCargado extends Dado {

	private int ladoCargado;
	private double prob =0.5;
	public DadoCargado(int ladoCargado) {
		super();
		this.setLadoCargado(ladoCargado);
	}
	public DadoCargado(int caras, int ladoCargado) {
		super(caras);
		this.setLadoCargado(ladoCargado);
	}	
	
	
	public double getProb() {
		return prob;
	}
	public void setProb(double prob) {
		this.prob = prob;
	}
	public int tirar() {
		
		if (Math.random()<prob) {
			return ladoCargado;
		} else {
			return super.tirar();
		}
	}
	
	public static void main(String[] args) {
		Dado d1 = new Dado();
		DadoCargado d2 = new DadoCargado(6);
		for(int i =0; i<20; i++) {
			System.out.println("d1:"+d1.tirar() + 
					           "-d2:" + d2.tirar());
		}
	}
	public int getLadoCargado() {
		return ladoCargado;
	}
	public void setLadoCargado(int ladoCargado) {
		if (ladoCargado<=this.getCaras())
			this.ladoCargado = ladoCargado;
		else {
			this.ladoCargado = this.getCaras();
		}
	}
}
