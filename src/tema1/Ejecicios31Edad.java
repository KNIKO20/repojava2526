package tema1;
/* Programa que pide la edad al usuario y muestra la edad que tendrá el año que viene
 * 
 */
import java.util.Scanner;

public class Ejecicios31Edad {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iEdad;
		System.out.println("Introduce tu edad: ");
		Scanner scEntrada = new Scanner(System.in);
		iEdad = scEntrada.nextInt();
		scEntrada.close();
		iEdad += 1;
		System.out.println("Tu edad el próximo año será "+ iEdad);
		
		
	}

}
