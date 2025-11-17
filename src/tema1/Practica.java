package tema1;
import java.util.Scanner;
public class Practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Me han regalado un reloj inglés que tiene las horas al revés
		//del tradicional.
		//Escribe un programa que pida las horas (formato 2 dígitos enteros) //los minutos (formato 2 dígitos enteros) y muestre la hora real.
		//Si en el reloj veo las 08:05 me debe decir las 03:55
		//Si en el reloj veo las 10:09 me debe decir las 01:51
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduzca las horas: ");
		int iNum1 = sc.nextInt();
		System.out.print("Introduzca los minutos: ");
		int iNum2 = sc.nextInt();
		sc.close();
		int iHora = 11 - iNum1 ;
		int iMinuto = 60 - iNum2  ;
		System.out.print("La real hora es "+iHora+":"+iMinuto);
	}

}
