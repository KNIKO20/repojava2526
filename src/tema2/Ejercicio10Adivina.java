package tema2;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio10Adivina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		//Generar un num aleatorio entre 1 y 100
		final int NUMERO_SECRETO = random.nextInt(100) +1;
		System.out.println("Adivina un número");
		guion();
		System.out.println("He generado un número aleatorio entre 1 y 100");
		System.out.print("Ingrese un número: ");
		int res = scanner.nextInt();
		int cont = 1;
		while (res != NUMERO_SECRETO) {
			if (res > NUMERO_SECRETO) {
				System.out.println("Tu número es mayor");
			} else {
				System.out.println("Tu número es menor");
			}
			System.out.print("Ingrese otro número: ");
			res = scanner.nextInt();
			cont++;
		}
		System.out.println("Has ganado despues de "+cont+" intentos");
		scanner.close();
	}
	private static void guion() {
		int n1 = 20;
		while (n1 > 0 ) {
			System.out.print("-");
			n1--;
		}
		System.out.print("\n");
	}

}
