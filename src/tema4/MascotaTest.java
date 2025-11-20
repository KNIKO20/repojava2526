package tema4;

public class MascotaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Nos llega un perro, dime si tiene pulgas, calcula vacuna, el perro nos saluda *Perro ha dicho x*, muestra info del perro
		Perro miPerro = new Perro("Alaska", 2014, "Labrador", true);
		miPerro.tienePulgas();
		miPerro.calcularVacuna(2025);
		miPerro.habla("wof wof");
		miPerro.toString();
		//Nos llega un loro, el loro nos saluda *Loro ha dicho*, muestr ainfo del loro // this instanceof Perro
		Loro miLoro = new Loro("Blue", 2023, true, true, "Brasil");
		miLoro.habla("garrir garrir");
		miLoro.toString();
	}

}
