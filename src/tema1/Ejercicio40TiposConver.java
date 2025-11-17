package tema1;

public class Ejercicio40TiposConver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tipos básicos
		byte edad = 30;
		double altura = 1.75;
		char inicial = 'A';
		boolean esEstudiante = true;
		System.out.println("Edad ="+edad);
		System.out.println("altura="+altura);
		System.out.println("Inicial="+inicial);
		System.out.println("Estudiante="+esEstudiante);
		//32 bits double 64 bits
		// conversion casting
		int iNum=3;
		System.out.println("iNum="+iNum);
		double dNum = iNum;
		System.out.println("dNum="+dNum);
		//Paso de double a int EXAM
		double dNum2 = 5.75;
		//int iNum2 = dNum2;
		int iNum2 = (int) dNum2;
		System.out.println(iNum2);
	}

}
