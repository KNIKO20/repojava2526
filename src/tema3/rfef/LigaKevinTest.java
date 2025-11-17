package tema3.rfef;

import java.time.LocalDate;

public class LigaKevinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // BRASIL 2002
        EquipoFutbolKevin brasil = new EquipoFutbolKevin(
            "Brasil",
            "Rio de Janeiro",
            "Maracaná",
            LocalDate.of(1914, 8, 20),
            new EntrenadorKevin("Scolari", 54, 30, 0),
            new PorteroKevin("Marcos", 29, 0),
            new DefensaKevin("Lucio", 24, 0),
            new DefensaKevin("Roque Júnior", 26, 0),
            new DefensaKevin("Cafú", 32, 0),
            new DefensaKevin("Roberto Carlos", 29, 0),
            new CentrocampistaKevin("Gilberto Silva", 26, 0),
            new CentrocampistaKevin("Kléberson", 23, 0),
            new CentrocampistaKevin("Juninho", 29, 0),
            new DelanteroKevin("Rivaldo", 30, 0),
            new DelanteroKevin("Ronaldinho", 22, 0),
            new DelanteroKevin("Ronaldo", 25, 0),
            0
        );

        // ESPAÑA 2010
        EquipoFutbolKevin espana = new EquipoFutbolKevin(
            "España",
            "Madrid",
            "Santiago Bernabéu",
            LocalDate.of(1920, 3, 1),
            new EntrenadorKevin("Vicente del Bosque", 59, 35, 0),
            new PorteroKevin("Casillas", 29, 0),
            new DefensaKevin("Piqué", 23, 0),
            new DefensaKevin("Puyol", 32, 0),
            new DefensaKevin("Capdevila", 32, 0),
            new DefensaKevin("Sergio Ramos", 24, 0),
            new CentrocampistaKevin("Xavi", 30, 0),
            new CentrocampistaKevin("Iniesta", 26, 0),
            new CentrocampistaKevin("Busquets", 21, 0),
            new DelanteroKevin("Pedro", 22, 0),
            new DelanteroKevin("Villa", 28, 0),
            new DelanteroKevin("Torres", 26, 0),
            0
        );

        // ALEMANIA 2014
        EquipoFutbolKevin alemania = new EquipoFutbolKevin(
            "Alemania",
            "Berlín",
            "Olympiastadion",
            LocalDate.of(1908, 1, 1),
            new EntrenadorKevin("Joachim Löw", 54, 20, 0),
            new PorteroKevin("Neuer", 28, 0),
            new DefensaKevin("Hummels", 25, 0),
            new DefensaKevin("Boateng", 25, 0),
            new DefensaKevin("Lahm", 30, 0),
            new DefensaKevin("Höwedes", 26, 0),
            new CentrocampistaKevin("Kroos", 24, 0),
            new CentrocampistaKevin("Schweinsteiger", 29, 0),
            new CentrocampistaKevin("Khedira", 27, 0),
            new DelanteroKevin("Müller", 24, 0),
            new DelanteroKevin("Özil", 25, 0),
            new DelanteroKevin("Klose", 36, 0),
            0
        );

        // ARGENTINA 2024 
        EquipoFutbolKevin argentina = new EquipoFutbolKevin(
            "Argentina",
            "Buenos Aires",
            "Monumental",
            LocalDate.of(1901, 5, 15),
            new EntrenadorKevin("Lionel Scaloni", 46, 10, 0),
            new PorteroKevin("Emiliano Martínez", 32, 0),
            new DefensaKevin("Cristian Romero", 26, 0),
            new DefensaKevin("Lisandro Martínez", 26, 0),
            new DefensaKevin("Nahuel Molina", 26, 0),
            new DefensaKevin("Nicolás Tagliafico", 31, 0),
            new CentrocampistaKevin("Enzo Fernández", 23, 0),
            new CentrocampistaKevin("Alexis Mac Allister", 25, 0),
            new CentrocampistaKevin("Rodrigo De Paul", 30, 0),
            new DelanteroKevin("Lionel Messi", 37, 0),
            new DelanteroKevin("Julián Álvarez", 24, 0),
            new DelanteroKevin("Lautaro Martínez", 27, 0),
            0
        );

        // Crear liga
        LigaKevin liga = new LigaKevin(brasil, espana, alemania, argentina);
        //fecha 1
        liga.simularPartido(brasil, espana);
        liga.simularPartido(alemania, argentina);
        liga.listarPuntos();
        //fecha 2
        liga.simularPartido(alemania, espana);
        liga.simularPartido(brasil, argentina);
        liga.listarPuntos();
        //fecha 3
        liga.simularPartido(argentina, espana);
        liga.simularPartido(brasil, alemania);
        liga.listarPuntos();
        //fecha 4
        liga.simularPartido(espana,argentina);
        liga.simularPartido(alemania,brasil);
        liga.listarPuntos();
        //fecha 5
        liga.simularPartido(espana, alemania );
        liga.simularPartido(argentina,brasil );
        liga.listarPuntos();
        //fecha 6
        liga.simularPartido(espana, brasil);
        liga.simularPartido(argentina, alemania);
        // Mostrar puntos iniciales
        liga.clasificacionFinal();
        System.out.println();
        liga.pichichi();
        System.out.println();
        liga.samora();
    
	}

}
