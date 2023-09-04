package figuras2;

public class Figura {

	private String nombre;
	
	public Figura() {
		nombre = "Sin definir";
	}
	public Figura(String n) {
		nombre = n;
	}
	
    public double getArea() {
    	return 0;
	}
	public double getPerimetro() {
		return 0;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
