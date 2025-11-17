package tema2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio151Excep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("Ingresa un número: ");
			int num = sc.nextInt();
			System.out.println("Ingresa otro número: ");
			int num1 = sc.nextInt();
			sc.close();
			int iResultado = num / num1;
		} catch (ArithmeticException ae1) {
			System.out.println("No se puede dividir por cero :"+ ae1.getMessage());
		} catch (InputMismatchException ime) {
			System.out.println("Debe ser entero :");
			ime.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Error general "+ex.getMessage());
		} finally {
			System.out.println("Siempre se ejecuta");
			sc.close();
		}
	}

}
