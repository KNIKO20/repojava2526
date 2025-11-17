package tema3;

public class CuentaBancariaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaBancariaClase cuentaJuan = new CuentaBancariaClase("ES123456789", 1000, "Juan Pérez");
		CuentaBancariaClase cuentaPrincipal = new CuentaBancariaClase("ES76874646", 2000, "Principal");
		CuentaBancariaClase cuentaAhorros = new CuentaBancariaClase("ES868856789", 1500, "Ahorros");
		cuentaJuan.ingresar(200);
		cuentaPrincipal.retirar(100);
		cuentaAhorros.retirar(10);
	}

}
