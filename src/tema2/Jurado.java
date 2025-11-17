package Retos;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Jurado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota=0, media=0, mejorMedia=0, peorMedia=0;
		int mejorParti=0, peorParti=0;
		Scanner sc = new Scanner(System.in);
		try {
		System.out.print("Introduce el número de participantes: ");
		int participantes = sc.nextInt();
		
			for(int i = 1; i <= participantes; i++) {
				nota = 0;
				for (int j = 1; j <= 5; j++) {
					System.out.println("\nParticipante "+i);
					System.out.print("Puntuación del juez "+j+": ");
					double notaTmp=0;
					if (j == 1) {
						notaTmp = sc.nextInt();
					} else if (j==2) {
						notaTmp = sc.nextInt();
					} else if (j==3) {
						notaTmp = sc.nextInt();
					} else if (j==4) {
						notaTmp = sc.nextInt();
					} else if (j==5) {
						notaTmp = sc.nextInt();
					}
					while (notaTmp < 0 || notaTmp > 10) {
						System.out.println("ERROR - Ingrese una nota de 0 a 10");
						notaTmp = sc.nextInt();
					}
					nota += notaTmp;
					media = nota / 5;
					
					
				}
				if (i == 1 || media > mejorMedia) {
					mejorMedia = media;
					mejorParti = i;
				}
				if (i == 1 || media < peorMedia) {
					peorMedia = media;
					peorParti = i;
				}
//				mediaAnterior=media;
				System.out.println("\nMedia del participante "+i+": "+media);
			}
			System.out.println("El mejor participante es el nº "+mejorParti+" con una media de "+mejorMedia);
			System.out.println("El peor participante es el nº "+peorParti+" con una media de "+peorMedia);
		} catch (InputMismatchException IME) {
			System.out.println("Solo se puede introducir números " + IME.toString());
		} finally {
			sc.close();
		}
	}

}
