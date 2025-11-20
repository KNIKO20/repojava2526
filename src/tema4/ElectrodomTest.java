package tema4;

public class ElectrodomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electrodomestico micro = new Electrodomestico(1000,5,365);
		
		System.out.println(micro.consumoAnual());
		Television miTv = new Television(49);
		System.out.println(miTv.consumoAnual());
		miTv.setResolucion(51);
		System.out.println(miTv.consumoAnual());
		
	}

}
