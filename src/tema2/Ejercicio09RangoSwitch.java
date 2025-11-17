package tema2;

import java.util.Scanner;

public class Ejercicio09RangoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1;
		System.out.print("Introduce una edad entre 0 y 15:");
		n1 = sc.nextInt();
		sc.close();
		switch (n1 >= 1 && n1 <= 5 ? 0 : (n1 >= 6 && n1 <= 10 ? 1 : (n1 >= 11 && n1 <= 15 ? 2 : 3)) ) {
		case 0:
			System.out.println("bebe");
			break;
		case 1:
			System.out.println("infante");
			break;
		case 2:
			System.out.println("adolescente");
			break;
		default:
			System.out.println("Número no válido");
			break;
			
		}
	}

}
