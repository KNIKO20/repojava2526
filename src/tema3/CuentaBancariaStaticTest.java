package tema3;

public class CuentaBancariaStaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaBancariaStatic cuentaJuan = new CuentaBancariaStatic("ES123456789", 1000, "Juan Pérez");
		CuentaBancariaStatic cuentaJun = new CuentaBancariaStatic("ES123456789", 1000, "Juan Pérez");
		CuentaBancariaStatic cuentaPrincipal = new CuentaBancariaStatic("ES76874646", 2000, "Principal");
		CuentaBancariaStatic cuentaAhorros = new CuentaBancariaStatic("ES868856789", 1500, "Ahorros");
		System.out.println(cuentaJuan.equals(cuentaJun));
		System.out.println(cuentaJuan.getNumCuentas());
		cuentaJuan.ingresar(200);
		cuentaJuan.ingresar(200);
		cuentaPrincipal.retirar(100);
		cuentaAhorros.retirar(10);
		System.out.println("Total de cuentas creadas es: "+cuentaJuan.getNumCuentas());
		System.out.println(cuentaJuan.toString());
		System.out.println(cuentaJun.toString());
		System.out.println(cuentaJuan.equals(cuentaJun));
	}

}
