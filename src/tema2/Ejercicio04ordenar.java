package tema2;
import java.util.Scanner;
public class Ejercicio04ordenar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedimos teres numero y ordenamos de mayor a menor
		//Pista: hay que usar el and (&&)
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, mayor, menor, medio;
		System.out.print("Introduce un número:");
		n1 = sc.nextInt();
		System.out.print("Introduce un número:");
		n2 = sc.nextInt();
		System.out.print("Introduce un número:");
		n3 = sc.nextInt();
		if (n1 > n2 && n2 > n3) {
			mayor = n1;
			medio = n2;
			menor = n3;
		}
		else if (n1 < n2 && n2 < n3) {
			mayor = n3;
			medio = n2;
			menor = n1;
		}
		else if (n1 < n2 && n1 > n3){
			mayor = n2;
			medio = n1;
			menor = n3;
		}
		else if (n3 > n1 && n2 < n1) {
			mayor = n3;
			medio = n1;
			menor = n2;
		}
		else if (n1 > n2 && n2 < n3) {
			mayor = n1;
			medio = n3;
			menor = n2;
		}
		else {
			mayor = n2;
			medio = n3;
			menor = n1;
		}
		System.out.println("El mayor"+mayor+"\n El medio"+medio+"\n El menor"+menor);
		
	}

}
