package tema2;

public class Ejercicio12For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
			
		}
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			
		}
		for (int i = 0; i < 11; i+=2) {
			
			System.out.println(i);
			
		}
		int suma = 0;
		for (int i = 0; i <= 100; i++) {
			suma += i ;
		}
		System.out.println(suma);
		
		// Bucles anidados
		for (int i=1; i<=3; i++) {
			for (int j=1; j<=3; j++ ) {
			System.out.println("("+i+","+j+")") ;
			}//fin for j
		}// fin for i
		pintarTriangulo();
		pintarPiramide();
	}
	
	private static void pintarTriangulo() {
		int alto = 5;
		int space = alto - 1;
		for (int i=1; i<=alto; i++) {
			for (int j=alto; j>i; j-- ) {
				System.out.print(" ");
			}//fin for j
			for (int k=1; k<i ; ++k) {
				System.out.print("*");
			}
			System.out.print("\n");
		}// fin for i
		System.out.print("\n");
	}
	private static void pintarPiramide() {
		int alto = 5;
		for (int i=1; i<=alto; i++) {
			for (int j=alto; j>i; j-- ) {
				System.out.print(" ");
			}//fin for j
			for (int k=1; k<i ; ++k) {
				System.out.print("*");
			}
			
			System.out.print("*");
			
			for (int k=1; k<i ; ++k) {
				System.out.print("*");
			}
			for (int j=alto; j>i; j-- ) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}// fin for i
		
	}

}
