package tema3;

public class LibroKevinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibroKevin CienAños = new LibroKevin("Cien años de soledad", "Gabriel Garcia Marquez", 417);
		CienAños.mostrarInformacion();
		CienAños.leer(200);
		CienAños.leer(100);
		CienAños.leer(117);
		if (CienAños.estaTerminado()) {
			System.out.println("¡Has terminado el libro!");
		} else {
			System.out.println("Aun te quedan páginas");
		}
		System.out.println();
		CienAños.mostrarInformacion();
		
	}

}
