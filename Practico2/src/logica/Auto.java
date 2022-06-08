package logica;
import logica.*;

public class Auto {

	String marca;
	double precio;
	int potencia;
	double velMaxima;

	public Auto() {
		
	}
	
	public Auto(String a, double g, int f, double d) {
		marca = a;
		precio = g;
		potencia = f;
		velMaxima = d;
	}
	
	public String getmarca() {
		return marca;
	}
	public double getprecio() {
		return precio;
	}
	public int getpotencia() {
		return potencia;
	}
	public double getvelMaxima() {
		return velMaxima;
	}
	
	public void setmarca(String a) {
		marca=a;
	}
	public void setprecio(double a) {
		precio=a;
	}
	public void setpotencia(int a) {
		potencia=a;
	}
	public void setvelMaxima(double a) {
		velMaxima=a;
	}
	
	@Override
	public String toString() {
				return("marca: " + marca + "\nprecio: " + precio + "\npotencia: " + potencia + "\nvelocidad maxima: " + velMaxima);
		}
}
 	


