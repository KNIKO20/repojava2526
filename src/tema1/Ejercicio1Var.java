package tema1;

public class Ejercicio1Var {
	/* En el código es muy importante poner comentarios.
	 * 
	 */

	public static void main(String[] args) {
		// Vamos a escribir unos números
		System.out.println(10);
		System.out.println(1);
		/* Las variables sirbem para almacenar información variable <- lado*lado
		 * int num1 = 3;
		 * PERO además hya que indicar el tipo. En java hay diferentes tipos:
		 * String - almaena como "hola" con comillas dobles
		 * int - Números enteros, sin decimales como 123 o -123
		 * float - Números coma flotante con decimales, como 19,03 o -10,56
		 * char - Almacena caracteres individuales como 'A', 'x', con comillas simples
		 * boolean - dos valores posibles: true o false
		 */
		String nombre = "Kevin";
		System.out.println("Mi nombre es " + nombre);
		int iNum = 19;
		System.out.println("Mi nombre es " + nombre + iNum);
		//tambien puedo declarar la variable y asignarle un valor despues
		int iOtroNum;
		iOtroNum=22;
		System.out.println("Otro número  " + iOtroNum);
		iOtroNum = 14;
		System.out.println("Otro número  " + iOtroNum);
		int x = 5, y = 6, z = 7;
		System.out.println(""+x+y+z);
		System.out.println(x+y+z);
		x=y=z=50;
		System.out.println(x+y+z);
		/* Todas las variables deben identificarse con nombres únicos
		 * llamados identificadores.
		 * 
		 * Existen las constantes, que son variable inalterables 
		 * de solo lectura, no se pueden modificar, utilizan final y
		 * van en MAYÚSCULAS
		 */
		final float GRAVEDAD = 9.8f;
		final byte MAYORIA_EDAD = 18;
		final double PI = 3.1415;
		
	}

}
