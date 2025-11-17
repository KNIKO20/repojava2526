package tema1;

import java.util.Scanner;

public class Ejercicio33Media2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float iNum, iNum1, iMedia;
		Scanner scEntrada = new Scanner(System.in);
		System.out.println("Ingrese una nota: ");
		iNum = scEntrada.nextInt();
		System.out.println("Ingrese la segunda nota: ");
		iNum1 = scEntrada.nextInt();
		scEntrada.close();
		iMedia = (iNum + iNum1)/2;
		System.out.println("La media es " + iMedia);
	}

}
