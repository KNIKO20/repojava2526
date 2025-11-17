package tema1;
/* Pide el año de nacimiento -> año actual -> devuelve edad
 * 
 */
import java.util.Scanner;

public class Ejercicio32Anyos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNacimiento,iActualYear,iEdad;
		System.out.println("¿En qué año estamos?");
		Scanner scEntrada = new Scanner(System.in);
		iActualYear = scEntrada.nextInt();
		System.out.println("¿En qué año naciste?");
		iNacimiento = scEntrada.nextInt();
		scEntrada.close();
		iEdad = iActualYear - iNacimiento;
		System.out.println("Tu edad es: " + iEdad);
		
		
	}

}
