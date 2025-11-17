package tema1;

/* Los lenguajes de programación proporcionan herramientas
 * para facilitar la vida al programador.
 * Para importar una libreria 
 */
import java.util.Scanner;


public class Ejercicio2Entrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum;
		System.out.print("Escribe un número del 0 al 10: ");
		//Para leer del flujo (canal) de entrada hay que declarar que vamos a usar un nuevo scanner de entrada
		Scanner scEntrada = new Scanner(System.in);
		iNum = scEntrada.nextInt();
		//IMPORTANTE cerrar la entrada
		scEntrada.close();
		System.out.println("El número leído es "+iNum);
	}

}
