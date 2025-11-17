package tema1;
import java.util.Scanner;

public class Ejercicio34Circunferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dRadio,dCircunferencia,dArea,dPi;
		dPi = 3.1314;
		Scanner scEntrada = new Scanner(System.in);
		System.out.println("Introduce el radio del circulo: ");
		dRadio = scEntrada.nextFloat();
		scEntrada.close();
		dArea=(dRadio*dRadio)*dPi;
		dCircunferencia=(dRadio*2)*dPi;
		dArea=Math.PI*Math.pow(dArea, 2);
		dCircunferencia=(dRadio*2)*Math.PI;
		scEntrada.close();
		System.out.println("El área es: " + dArea + " y la circunferencia es: " + dCircunferencia);
	}

}
