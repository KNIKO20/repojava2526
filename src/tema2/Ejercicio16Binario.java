package tema2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio16Binario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa que convierte decimal a binario
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Ingresa un número:");
			int iNum = sc.nextInt();
			int iResto;
			String sResultado = "";
			boolean finished = false;
			while (finished == false) {
				iResto = iNum % 2;
				iNum /= 2;
				sResultado = iResto + sResultado;
				if (iNum == 0) finished = true; 
			}
			System.out.println(sResultado);
		} catch (InputMismatchException IME) {
			System.out.println("No has ingresado un entero: "+IME.toString());
		} finally {
			sc.close();
		}
		
		
	}

}
