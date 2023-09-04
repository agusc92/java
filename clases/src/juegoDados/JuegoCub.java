package juegoDados;

public class JuegoCub {
	private int minimo = 7;
	private int rondas = 10;
	private Jugador j1;
	private Jugador j2;
	
	private Cubilete vasito;
	
	public JuegoCub() {
		this(6);
	}


	public JuegoCub(int caras1) {
		this(new Jugador("Jugador1"),new Jugador("Jugador2"),
              new Cubilete(2,caras1));
	}	
	
	public JuegoCub(Jugador jj1, Jugador jj2,Cubilete cc) {
		j1= jj1;
		j2=jj2;
		vasito = cc;
	}		
  
  
  
	public Jugador Jugar() {
		int jugada1,jugada2;
		for(int i =0; i<rondas; i++) {
			jugada1 = j1.tirar(vasito);
			jugada2 = j2.tirar(vasito);
			
			if (jugada1>jugada2 && jugada1>minimo) {
				j1.incrementarPuntos();
			} else {
				if (jugada2>jugada1 && jugada2>minimo) {
					j2.incrementarPuntos();
				}	
			}
		}
		
		return this.getGanador();
		
	}
	
	
	public Jugador getGanador() {
		if (j1.getPuntos()>j2.getPuntos())
			return j1;
		else if (j2.getPuntos()>j1.getPuntos()){
	        return j2;
		} else  {
			return null;
		}
	}
	
	public Cubilete getVasito() {
		return vasito;
	}
	public void setVasito(Cubilete cc) {
		this.vasito = cc;
	}
	
	
	public int getMinimo() {
		return minimo;
	}
	public void setMinimo(int minimo) {
		this.minimo = minimo;
	}
	public int getRondas() {
		return rondas;
	}
	public void setRondas(int rondas) {
		this.rondas = rondas;
	}
	public static void main(String[] args) {
		//System.out.println(args[0]);
		//System.out.println(args[1]);
	 JuegoCub j1 = new JuegoCub(new Jugador("Juan"),
				             new JugadorTramposo("Carla"),
				             new Cubilete(2,6));
     Jugador ganador = j1.Jugar();
		if (ganador!=null) {
			System.out.println("Gano: " + ganador.getNombre());
			System.out.println("Con: " + ganador.getPuntos());
			
		} else {
			System.out.println("EMPATE");
		}
		//System.out.println("ju1:" + );
		//System.out.println("ju2:" + );
	}
}
