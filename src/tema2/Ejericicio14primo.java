package tema2;

import java.util.Scanner;

public class Ejericicio14primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean esPrimo = true;
		int i = 2;
		sc.close();
		while (esPrimo && i < Math.sqrt(num)) {
			if (num % i == 0) {
				esPrimo = false;
			}
			i++;
		}
		if (esPrimo) {
			System.out.println("El número "+num+" es primo");
		} else {
			System.out.println("El número "+num+" no es primo");
		}
		
	}

}
