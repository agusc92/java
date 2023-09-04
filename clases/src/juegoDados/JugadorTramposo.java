package juegoDados;

public class JugadorTramposo extends Jugador {

	  private DadoCargado[] misDados;
	
	   public JugadorTramposo(String n) {
		super(n);
		misDados = new DadoCargado[2];
		misDados[0] = new DadoCargado(5);
		misDados[1] = new DadoCargado(6);
	   }
	   
	
	   public int tirar(Cubilete cc) {
		 Dado[] viejos = cc.getDados();//SCAO LOS QUE ESTAN
		 cc.setDados(misDados);//PONGO LOS CARGADOS
		 int salida = cc.tirarDados(); //TIRO 
		 cc.setDados(viejos); //REPONGO LOS QUE ESTABAN ANTES
		 return salida;
	   }
}
