package tema1;
import java.util.Scanner;
public class Ejercicio35NumPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum;
		Scanner scEntrada = new Scanner(System.in);
		System.out.println("Ingresa un número: ");
		iNum = scEntrada.nextInt();
		scEntrada.close();
		boolean bResult=(iNum%2==0);
		System.out.println("Es par:"+ bResult);
	}

}
