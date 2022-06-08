package consola;

import logica.Auto;

public class Principal {

	
	public static void main(String[] args) {
	    Auto a1 = new Auto("Chevrolet",150,90,10000);
	    Auto a2 = new Auto();
	    System.out.println("Los datos de a1 son : \n" + a1);
	    System.out.println("Los datos de a2 son:\n " + a2);
	    
	    a2.setmarca("BMW");
		a2.setprecio(12.000);
		a2.setpotencia(170);
		a2.setvelMaxima(110);
		System.out.println("Los datos de a2:\n " + a2);
		
	
	}
}