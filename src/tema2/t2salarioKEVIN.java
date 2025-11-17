package tema2;
import java.util.Scanner;
public class t2salarioKEVIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double horas,tarifa,extras,normal,bruto,impuestos1,impuestos2;
		normal = 0.0;
		extras= 0.0;
		impuestos1=0.0;
		impuestos2=0.0;
		System.out.print("Introduce horas trabajadas esta semana:");
		horas = sc.nextDouble();
		System.out.print("Tarifa por hora normal:");
		tarifa = sc.nextDouble();
		sc.close();
		if (horas < 0 || tarifa < 0) {
			System.out.println("Solo se aceptan valores positivos");
		} else {
			if(horas > 35) {
				double horasExtras = horas - 35;
				extras = horasExtras * (tarifa * 1.5);
				normal = (horas-horasExtras) * tarifa;
				bruto = normal + extras;
				
			} else {
				normal = horas * tarifa;
				bruto = normal + extras;
			}
			if (bruto > 500) {
				double impBruto = bruto - 500;
				impuestos1 = impBruto * 0.25;
				if (bruto > 900) {
					double imp2Bruto = bruto - 900;
					impuestos2 = imp2Bruto * 0.45;
				}
			}
			double impTotal = impuestos1 + impuestos2;
			double neto = bruto - impTotal;
			System.out.println("Salario bruto: "+ bruto+"\n Los impuestos son: "+impTotal+"\n Neto: "+neto);
			
			
		}
	}

}
