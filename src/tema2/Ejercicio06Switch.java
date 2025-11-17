package tema2;
import java.util.Scanner;
public class Ejercicio06Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1;
		System.out.print("Introduce la dia de la semana:");
		n1 = sc.nextInt();
		sc.close();
		switch (n1) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Número no válido");
			break;
			
		}

	}

}
