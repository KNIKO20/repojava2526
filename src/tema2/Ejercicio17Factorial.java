package tema2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio17Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Ingresa un número");
			int x = sc.nextInt();
			long lResult = 1L;
			for (int i = 1; i <= x ; i++) {
				lResult *= i;
			}
			System.out.println(lResult);
		} catch (InputMismatchException IME) {
			System.out.println("Solo se aceptan números naturales");
		} finally {
			sc.close();
		}
	}

}

