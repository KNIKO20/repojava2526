package tema2;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		//Programa que va pidiendo números por pantallla hasta
		//que se introduzca el cer y cuando termina dice cual ha sido el mayor de todo
		Scanner scanner = new Scanner(System.in);
		int num;
		int mayor = Integer.MIN_VALUE;
		do {
			System.out.print("Introduce un número, si quieres salir escribe 0: ");
			num = scanner.nextInt();
			if (mayor < num) mayor = num;
		} while (num != 0);
		System.out.println("El número mayor es: "+mayor);
		scanner.close();
	}

}
