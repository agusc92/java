package figuras1;

public class Circulo {

	
	private double radio;
	
	public Circulo(double rr) {
		radio = rr;
	}
	
	public double getRadio() {
		return radio;
	}
	public void setRadio(double rr) {
		radio = rr;
	}
	
	public double getDiametro() {
		return 2 * radio;
	}
	
	public double getPerimetro() {
		return Math.PI*radio*2;
	}
	public double getArea() {
		return Math.PI* Math.pow(radio,2);
	}
	
	
}
