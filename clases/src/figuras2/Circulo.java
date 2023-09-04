package figuras2;
//EL CIRCULO HEREDA DE FIGURA 
public class Circulo extends Figura{
//EL CIRCULO ES UNA FIGURA
	private double radio;
	
	public Circulo(double rr) {
		super();
		radio =rr;
		this.setNombre("Circulo");
		
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getArea() {
		return Math.PI*radio*radio;
	}
	public double getPerimetro() {
		return Math.PI*radio*2;
	}
}
