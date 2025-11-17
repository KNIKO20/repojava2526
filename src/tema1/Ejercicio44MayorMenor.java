package tema1;
import java.util.Scanner;
public class Ejercicio44MayorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduzca el primer número: ");
		int iNum1 = sc.nextInt();
		System.out.print("Introduzca el segundo número: ");
		int iNum2 = sc.nextInt();
		sc.close();
		//Decir de los dos números cuál es el mayor
		int iMayor = iNum1 > iNum2 ? iNum1 : iNum2;
		int iMenor = iNum1 < iNum2 ? iNum1 : iNum2;
		System.out.println("El número mayor es: " + iMayor);
		int a = 1 < 3 ? 4 : 2;
		
		System.out.println("El número menor es: " + iMenor + " " + a);
	}

}
