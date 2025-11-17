package tema3;

public class PersonaKevinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonaKevin alumnoDAW = new PersonaKevin("Kevin", (byte) 19, 1.76);
		System.out.println("Datos del alumnoDAW=" + alumnoDAW+"\n");
		//Vemos el saludo de Luis
		alumnoDAW.saludar();
		//Luis cumple Años
		alumnoDAW.cumplirAnyos();
		//Y ha crecido
		alumnoDAW.crecer(0.05);
		//Volvemos a ver los datos de Luis
		System.out.println("\nDatos del alumnoDAW=" + alumnoDAW+"\n");
		//Han pasado dos años
		alumnoDAW.setEdad( (byte)22);
		//Y ha crecido un poco más
		alumnoDAW.setEstatura(1.83);
		//Y ahora nos piden guardar también el apellido
		alumnoDAW.setNombre("Kevin Vasquez");
		//Mostramos los nuevos datos
		System.out.println("Datos con cambios");
		System.out.println("Nombre:"+alumnoDAW.getNombre());
		System.out.println("Edad:"+alumnoDAW.getEdad());
		System.out.println("Estatura:"+alumnoDAW.getEstatura());
	}

}
