package tema1;
import java.util.Scanner;
public class Ejercicio43NumReves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduzca un número entre 0 y 99999: ");
		Scanner scEntrada = new Scanner(System.in);
		int iNum;
		iNum = scEntrada.nextInt();
		//82645
		int iPos1= iNum % 10;
		int iDiv1= iNum / 10;
		
		int iPos2= iDiv1 % 10;
		int iDiv2= iDiv1 / 10;
		
		int iPos3= iDiv2 % 10;
		int iDiv3= iDiv2 / 10;
		
		int iPos4= iDiv3 % 10;
		int iDiv4= iDiv3 / 10;
		
		int iPos5= iDiv4;
		
		
		System.out.println("El número al revés es: "+iPos1+iPos2+iPos3+iPos4+iPos5);

	
	}

}
