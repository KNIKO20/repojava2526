package tema2;
import java.util.Scanner;
public class Ejercicio15FuncionPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa un número: ");
		int num = sc.nextInt();
		sc.close();
		if (funcionEsPrimo(num)) {
			System.out.println("El número "+num+" es primo");
		} else {
			System.out.println("El número "+num+" no es primo");
		}
		
	}
	private static boolean funcionEsPrimo(int numero) {
		int num = numero;
		boolean esPrimo = true;
		int i = 2;
		while (esPrimo && i < Math.sqrt(num)) {
			if (num % i == 0) {
				esPrimo = false;
			}
			i++;
		}
		return esPrimo;
	}
	}
