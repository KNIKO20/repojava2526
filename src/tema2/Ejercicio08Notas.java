package tema2;

import java.util.Scanner;

public class Ejercicio08Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1;
		System.out.print("Introduce la nota:");
		n1 = sc.nextInt();
		sc.close();
		switch (n1) {
		case 1,3,4,2 ->
			System.out.println("Suspenso");
		case 5,6 ->
			System.out.println("Aprobado");
		case 7,8 ->
			System.out.println("Bien");
		case 9,10 ->
			System.out.println("Notable");
		default ->
			System.out.println("Número no válido");
			
		}

	}
}

