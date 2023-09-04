package figuras2;

public class AdminFiguras {

	public void imprimirFigura(Figura ff) {
		System.out.println("La figura " + ff.getNombre() + 
				          " tiene una area de: "+ ff.getArea() + 
				          " y un perimetro de: " + ff.getPerimetro());
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Figura ff = new Figura();
        ff.setNombre("generica");
        AdminFiguras admin = new AdminFiguras();
        admin.imprimirFigura(ff);
        Circulo cc1 = new Circulo(10);
        admin.imprimirFigura(cc1);
		
        
        Figura f1 = null;
        Circulo c1 = new Circulo(10);
        f1=c1;
        //c1 = f1;
        c1.getArea();
        f1.getArea();
        f1.getNombre();
        
        Rectangulo rr1 = new Rectangulo(10,20);
        
        admin.imprimirFigura(rr1);
        
        //JAVA ES TIPADO
        //SOLO PUEDO ENVIAR MENSAJES A UN OBJETO QUE 
        //ESTEN EN EL TIPO DE LA  VARIABLE (LA CLASE)
        Figura ffnueva;
        
        //a ffnueva solo se le pueden envair mensajes que esten 
        //en su tipo de variable es decir que esten definidos
        //en la clase Figura
        
        //El binding dinamico es que el metodo que se ejecuta en 
        //respuesta a un mensaje se determina en tiempo de ejecucion
        //HASTA QUE NO SE EJECUTE NO SE QUE METODO SE EJECUTA
        
        if (Math.random()>0.5) {
        	
        	ffnueva = new Circulo(10);
        	
        	
        } else {
        	ffnueva = new Rectangulo(10,20);
        }
       
        
        System.out.println("TARAN " + ffnueva.getArea());
     //   ((Circulo) ffnueva).getRadio();
        
        MedioCirculo mc = new MedioCirculo(10);
        mc.getArea();
        
        admin.imprimirFigura(mc);
	}

}
