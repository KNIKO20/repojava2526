package tema3.rfef;

import java.time.LocalDate;

public class EquiposKevinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Entrenador
        EntrenadorKevin scolari = new EntrenadorKevin("Luiz Felipe Scolari", 54, 30, 1);

        // Portero titular
        PorteroKevin marcos = new PorteroKevin("Marcos", 29, 4);

        // Defensas
        DefensaKevin lucio = new DefensaKevin("Lúcio", 24, 1);
        DefensaKevin roqueJunior = new DefensaKevin("Roque Júnior", 26, 2);
        DefensaKevin cafu = new DefensaKevin("Cafú", 32, 0);
        DefensaKevin robertoCarlos = new DefensaKevin("Roberto Carlos", 29, 1);

        // Centrocampistas
        CentrocampistaKevin gilbertoSilva = new CentrocampistaKevin("Gilberto Silva", 26, 3);
        CentrocampistaKevin kleberson = new CentrocampistaKevin("Kléberson", 23, 2);
        CentrocampistaKevin juninho = new CentrocampistaKevin("Juninho Paulista", 29, 4);

        // Delanteros
        DelanteroKevin ronaldo = new DelanteroKevin("Ronaldo", 25, 8);
        DelanteroKevin rivaldo = new DelanteroKevin("Rivaldo", 30, 5);
        DelanteroKevin ronaldinho = new DelanteroKevin("Ronaldinho", 22, 2);

        // Crear equipo
        EquipoFutbolKevin brasil2002 = new EquipoFutbolKevin(
            "Brasil",
            "Rio de Janeiro",
            "Estadio Maracaná",
            LocalDate.of(1914, 8, 20),
            scolari,
            marcos,
            lucio,
            roqueJunior,
            cafu,
            robertoCarlos,
            gilbertoSilva,
            kleberson,
            juninho,
            rivaldo,
            ronaldinho,
            ronaldo,
            21 // puntos ficticios
        );

        System.out.println("Equipo creado: " + brasil2002.getNombreEquipo());
	}

}
