package juegoDados;

public class Jugador {
	private String nombre;
	   private int puntos;

	   public Jugador(String n) {
		   nombre = n;
		   puntos = 0;
	   }
	   public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntos() {
		return puntos;
	}
	public void incrementarPuntos() {
		this.puntos++;
	}
	   

	public int tirar(Dado d1, Dado d2) {
		return d1.tirar() + d2.tirar();
	}
	  
	  public int tirar(Cubilete cc) {
		return cc.tirarDados();
	}
	   
}
