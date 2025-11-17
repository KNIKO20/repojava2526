package tema3;

public class LibroKevinTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibroKevin CienAños = new LibroKevin("Cien años de soledad", "Gabriel Garcia Marquez", 417);
		LibroKevin DonQuijote = new LibroKevin("Don Quijote de la Mancha​", "Miguel de Cervantes", 225);
		CienAños.mostrarInformacion();
		CienAños.leer(200);
		CienAños.leer(100);
		System.out.println(CienAños.getPaginasLeidas());
		CienAños.leer(117);
		DonQuijote.leer(117);
		if (CienAños.estaTerminado()) {
			System.out.println("¡Has terminado el libro!");
		} else {
			System.out.println("Aun te quedan páginas");
		}
		CienAños.mostrarInformacion();
		System.out.println(CienAños.mostrarInfo());
		
		System.out.println(DonQuijote.getPaginasLeidas());
	}

}
