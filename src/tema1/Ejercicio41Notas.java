package tema1;
/**Realizar Ejercicio41Notas.java. En un instituto los alumnos tienen la nota media del expediente (que va con decimales) y la nota del boletín (raíces) que va sin decimales.
Escribe un programa que pida tres números enteros y calcule la media con decimales (expediente) y sin decimales (boletin) y las muestre por pantalla.
I
El resultado debe ser:
Nota primer trimestre: 3
Nota segundo trimestre: 6
Nota tercer trimestre: 7
Boletin de calificaciones: 5
Expediente academico: 5.333333333333333
**/

import java.util.Scanner;

public class Ejercicio41Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNota1,iNota2,iNota3,iBoletin;
		double dExp;
		Scanner scEntrada = new Scanner(System.in);
		System.out.print("Nota primer trimestre: ");
		iNota1=scEntrada.nextInt();
		System.out.print("Nota segundo trimestre: ");
		iNota2=scEntrada.nextInt();
		System.out.print("Nota tercer trimestre: ");
		iNota3=scEntrada.nextInt();
		scEntrada.close();
		
		dExp = (iNota1+iNota2+iNota3)/3.0;
		iBoletin= (int) dExp;
		System.out.println("Boletin de calificaciones: "+ iBoletin);	
		System.out.print("Expediente academico: "+ dExp);
	}

}
