package tema2;
import java.util.Scanner;
public class Ejercicio05Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1;
		System.out.print("Introduce la nota:");
		n1 = sc.nextInt();
		sc.close();
		if (n1 <= 10 && n1 >= 0) {
			if (n1 == 10) {
				System.out.println("Sobresaliente");
			} 
			else if (n1 >= 8 && n1 < 10) {
				System.out.println("Notable");
			}
			else if (n1 < 8 && n1 >= 5) {
				System.out.println("Bien");
			}
			else {
				System.out.println("Suspenso");
			}
		} else {
			System.out.println("Error, solo se admiten notas del 0 al 10");
		}
	}

}
