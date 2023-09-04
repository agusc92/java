package juegoDados;

public class Cubilete {
	 private Dado[] dados;
	  
	  public Cubilete(){
	   this(5);
	    
	  }
	  
	    public Cubilete(int cantDados){
	      this(cantDados,6);
	    
	  }
	  
	   public Cubilete(int cantDados, int carasDado){
	    dados = new Dado[cantDados];
	    for(int i=0;i<dados.length; i++){
	      dados[i] = new Dado(carasDado);
	    }
	    
	  }
	  
	  public Cubilete(Dado[] dadosNuevos){
	    dados = dadosNuevos;
	  }
	  
	  public int tirarDados(){
	    int suma = 0;
	    for(int i =0; i<dados.length; i++){
	      suma = suma + dados[i].tirar();
	    }
	    System.out.println(suma);
	    return suma;
	  }
	  
	  public Dado[] getDados(){
	    return dados;
	  }
	  
	  public void setDados(Dado[] nuevos){
	    dados = nuevos;
	  }
	  
	  public static void main(String[] args){
	    Cubilete cc = new Cubilete(10,30);
	    System.out.println(cc.tirarDados());
	  }

}
