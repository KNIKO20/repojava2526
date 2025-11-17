package tema2;
import java.util.Scanner;
public class Ejercicio06Dias {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int n1;
				System.out.print("Introduce la dia de la semana:");
				n1 = sc.nextInt();
				sc.close();
				if (n1 <= 7 && n1 >= 1) {
					if (n1 == 1) {
						System.out.println("Lunes");
					} 
					else if (n1 == 2) {
						System.out.println("Martes");
					}
					else if (n1 == 3) {
						System.out.println("Miercoles");
					}
					else if (n1 == 4) {
						System.out.println("Jueves");
					}
					else if (n1 == 5) {
						System.out.println("Viernes");
					}
					else if (n1 == 6) {
						System.out.println("Sabado");
					}
					else {
						System.out.println("Domingo");
					}
				} else {
					System.out.println("Error, solo se admiten notas del 1 al 7");
				}
	}

}
