package tema1;

import java.util.Scanner;

public class PoligonosAreas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iArea;
		Scanner sc = new Scanner(System.in);
		System.out.println("Medida");
		iArea = sc.nextInt();
		int iTriangulo = (iArea * iArea)/2;
		int iCuadrado = iArea * iArea;
		int iRectangulo = iArea * iArea;
		System.out.println("Area de un \n Triangulo: "+iTriangulo+"\n Cuadrado: "+iCuadrado+"\n Rectangulo: "+iRectangulo);
		
		sc.close();
	}

}
