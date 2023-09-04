package figuras1;

public class AdministradorFiguras {

	public void imprimirPantalla(Circulo cc) {
		System.out.println("La figura tiene un area de:"+
	                        cc.getArea() + " y un perimetro de: "+
				            cc.getPerimetro());
	}
	public void imprimirPantalla(Rectangulo rr) {
		System.out.println("La figura tiene un area de:"+
	                        rr.getArea() + " y un perimetro de: "+
				            rr.getPerimetro());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdministradorFiguras admin = new AdministradorFiguras();
		Circulo cc1 = new Circulo(10);
		admin.imprimirPantalla(cc1);
		Rectangulo rr1 = new Rectangulo(10,20);
		admin.imprimirPantalla(rr1);
		
		
	}

}
