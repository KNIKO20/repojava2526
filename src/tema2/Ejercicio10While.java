package tema2;

public class Ejercicio10While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		while (contador < 6) {
			System.out.println("Contador="+contador);
			contador++;
		}
		guion();
		System.out.println("Imprimir números pares");
		int n1 = 0;
		while (n1 < 11) {
			System.out.println("Contador="+n1);
			n1 += 2;
		}
//		guion();
//		System.out.println("imprimir números pares 2");
//		int n2 = 0;
//		boolean esPar = n2 % 2 == 0;
//		while (n2 > 20) {
//			if (esPar(n2)) {
//				System.out.println(" "+n2);
//			}
//			n2++;
//		}
		guion();
		System.out.println("imprimir cadenas");
		String sCad = "Hola";
		int cont = 1;
		while (cont <= 5) {
			sCad+=cont;
			cont++;
		}
		System.out.println("Cadena:"+sCad);
		
	}
	private static void guion() {
		int n1 = 10;
		while (n1 > 0 ) {
			System.out.print("-");
			n1--;
		}
		System.out.print("\n");
	}

}

 