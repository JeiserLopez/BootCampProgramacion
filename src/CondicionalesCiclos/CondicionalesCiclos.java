package CondicionalesCiclos;

public class CondicionalesCiclos {
	
	public static void main(String[] args) {
		
		int numero = 0;
		
		//Condicional if/else
		System.out.println("Condicional if/else");
		if (numero < 0) {	
			System.out.println("El numero es negativo");	
		}else if (numero > 0) {
			System.out.println("El numero es positivo");	
		}else{
			System.out.println("El numero es 0");	
		}
		System.out.println("----------------------------");
		
		//Bucle While
		int numeroWhile = 0;
		System.out.println("Bucle While");
		while(numeroWhile < 3){
			System.out.println("El numero es: " + numeroWhile++);
		}
		System.out.println("----------------------------");
		
		//Do While
		System.out.println("Bucle Do While");
		int numeroDoWhile = 3;
		do {
			System.out.println("El numero es: " + numeroDoWhile);
		}while(numeroDoWhile < 3);
		System.out.println("----------------------------");
		
		//For
		System.out.println("Bucle For");
		for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
			System.out.println("El numero es:" + numeroFor);
		}
		System.out.println("----------------------------");
		
		//Switch
		System.out.println("Switch");
		String estacion = "Verano";
		switch (estacion) {
			case "Verano": {
				System.out.println("La estacion es:  " + estacion);
				break;
			}
			case "Invierno": {
				System.out.println("La estacion es:  " + estacion);
				break;
			}
			case "Otoño": {
				System.out.println("La estacion es:  " + estacion);
				break;
			}
			case "Primavera": {
				System.out.println("La estacion es:  " + estacion);
				break;
			}
			default:
				System.out.println("La estacion es: " + estacion);
				break;
			}
	}

}
