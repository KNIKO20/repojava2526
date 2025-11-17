package tema2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio18Contar {
	static int iPares = 0;
	static int iPrimos = 0;
	
	public static void main(String[] args) {
		// Programa que genera 100 numeros aleatorios y detecta cuantos pares y primos hay
		// Extra sacar la probabilidad de cuantas veces sale cada uno en n repeticiones
		// de x jugadas salen n primos
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantas veces quieres ejecutar contarParesYPrimos?");
		int x=sc.nextInt();
		int veces = 0;
		for (int i = 0; i < x; i++) {
			paresPrimos();
			veces = i;
			
		}
		int	probabilidadPares = iPares /= veces;
		int probabilidadPrimos = iPrimos /= veces;
		
		System.out.println("La probabilidad de que de salgan pares es de "+probabilidadPares+" en "+veces+" veces");
		System.out.println( "La probabilidad de que de salgan primos es de "+probabilidadPrimos+" en "+veces+" veces");
		//Probabilidad
		sc.close();
		
	}
	private static void paresPrimos() {
		Random random = new Random();
		
		
		for (int i = 0; i < 100; i++) {
			int randomNum = random.nextInt(1000) +1;
			// Contar Pares
			if (randomNum % 2 == 0) {
				iPares += 1;
			}
			// Contar primos
			boolean esPrimo = true;
			int i1 = 2;
			while (esPrimo && i1 < Math.sqrt(randomNum)) {
				if (randomNum % i1 == 0) {
					esPrimo = false;
				}
				i1++;
			}
			if (esPrimo) {
				iPrimos += 1;
			}
		}
	}

}
