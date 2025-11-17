package tema2;

import java.util.Scanner;

public class EjercicioCiclista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int kmIda = 1;
		int idaVuelta = 0;
		int distanciaActual=0;
		while (kmIda != 0) {
			System.out.println("Introduce km recorridos (0 para terminar): ");
			kmIda = sc.nextInt();
			if (kmIda != 0 && kmIda <= 15) {
				idaVuelta = kmIda * 2 + idaVuelta;
				distanciaActual += idaVuelta;
			}

		}
		System.out.println("Distancia total (Ida y vuelta): "+distanciaActual);
		sc.close();
	}

}
