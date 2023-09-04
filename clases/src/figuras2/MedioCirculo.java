package figuras2;

public class MedioCirculo extends Circulo {

	public MedioCirculo(double rr) {
		super(rr);
		this.setNombre("MedioCirculo");
	}
	
	public double getArea() {
		return super.getArea()/2;
	}

	public double getPerimetro() {
		return super.getPerimetro()+this.getRadio()*2;
	}
	
}
