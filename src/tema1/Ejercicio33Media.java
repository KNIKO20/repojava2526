package tema1;

import java.util.Scanner;

public class Ejercicio33Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float fNum, iNum1, iMedia;
		Scanner scEntrada = new Scanner(System.in);
		System.out.println("Ingrese una nota: ");
		fNum = scEntrada.nextFloat();
		System.out.println("Ingrese la segunda nota: ");
		iNum1 = scEntrada.nextFloat();
		iMedia = (fNum + iNum1)/2;
		System.out.println("La media es " + iMedia);
	}

}
