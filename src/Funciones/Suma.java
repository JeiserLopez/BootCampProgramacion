package Funciones;

public class Suma {
	
	public static void main(String[] args) {
		
		System.out.println(suma(2, 3, 7));
		
		Coche miCoche = new Coche();
		miCoche.agregarPuerta();
		System.out.println("El numero de puertas es: "+ miCoche.numeroPuertas);
		
	}
	
	public static int suma (int valor1, int valor2, int valor3) {
		return valor1 + valor2 + valor3;
	}

}

class Coche{
	int numeroPuertas = 0;
	
	public void agregarPuerta() {
		this.numeroPuertas++;
	}
}

