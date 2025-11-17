package tema2;

import java.util.Random;
import java.util.Scanner;

public class Juego2048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] tableroMain = new int[4][4];
		for (int i = 0; i < 2; i++) {
			addRandomNumber(tableroMain);
		}
		printScreen(tableroMain);
		while(true) {
			String move = sc.next();
			if (move.equalsIgnoreCase("A")) {
				moveLeft(tableroMain);
			} else if (move.equalsIgnoreCase("D")) {
				moveRight(tableroMain);
			} else if (move.equalsIgnoreCase("S")) {
				moveDown(tableroMain);
			} else if (move.equalsIgnoreCase("W")) {
				
			}
			printScreen(tableroMain);
		}
				
	}
	private static void printScreen(int[][] tableroMain) {
		for (int i = 0; i < tableroMain.length; i++) {
			for (int j = 0; j < tableroMain.length; j++) {
				System.out.print(tableroMain[i][j]+"    ");
			}
			System.out.println("\n");
			
		}
	}
	
	private static void moveLeft(int[][] tableroMain) {
		Random random = new Random();
		for (int i = 0; i < tableroMain.length; i++) {
			for (int j = 3; j < tableroMain.length; j++) {
				// 0:0 - 0:3
				if (tableroMain[i][j] == 0 && j != 3) { // Mover si es 0 (vacio)
					tableroMain[i][j] = tableroMain[i][j+1];
				} else if (j == 3) { // crear un número en el borde al mover
					tableroMain[i][j] = random.nextInt(10) < 8 ? 2 : 4;
				} else if (tableroMain[i][j] == tableroMain[i][j+1]) { //Sumar si son iguales
					tableroMain[i][j] *= 2;
					tableroMain[i][j+1] = 0;
				}
			}
			
		}
	}
	private static void moveRight(int[][] tableroMain) {
		Random random = new Random();
		for (int i = 0; i < tableroMain.length; i++) {
			for (int j = 3; j < tableroMain.length; j++) {
				// 0:0 - 0:3
				if (tableroMain[i][j] == 0 && j != 3) { // Mover si es 0 (vacio)
					tableroMain[i][j] = tableroMain[i][j+1];
				} else if (j == 3) { // crear un número en el borde al mover
					tableroMain[i][j] = random.nextInt(10) < 8 ? 2 : 4;
				} else if (tableroMain[i][j] == tableroMain[i][j+1]) { //Sumar si son iguales
					tableroMain[i][j] *= 2;
					tableroMain[i][j+1] = 0;
				}
			}
			
		}
	}
	private static void moveDown(int[][] tableroMain) {
	    for (int col = 0; col < 4; col++) {
	        List<Integer> columna = new ArrayList<>();
	        // Paso 1: compactar (de abajo hacia arriba)
	        for (int row = 3; row >= 0; row--) {
	            if (tableroMain[row][col] != 0) {
	                columna.add(tableroMain[row][col]);
	            }
	        }

	        // Paso 2: combinar
	        for (int i = 0; i < columna.size() - 1; i++) {
	            if (columna.get(i).equals(columna.get(i + 1))) {
	                columna.set(i, columna.get(i) * 2);
	                columna.remove(i + 1);
	            }
	        }

	        // Paso 3: rellenar con ceros
	        while (columna.size() < 4) {
	            columna.add(0);
	        }

	        // Paso 4: actualizar el tablero (de abajo hacia arriba)
	        for (int row = 3, i = 0; row >= 0; row--, i++) {
	            tableroMain[row][col] = columna.get(i);
	        }
	    }

	    // Paso 5: agregar nuevo número aleatorio
	    addRandomNumber(tableroMain);
	}
	
	private static void addRandomNumber(int[][] tableroMain) {
		Random random = new Random();
		while (true) {	
			int numInicial = random.nextInt(10) < 8 ? 2 : 4;
			int axisY = random.nextInt(4);
			int axisX = random.nextInt(4);
			if (tableroMain[axisY][axisX] == 0) {
				tableroMain[axisY][axisX] =numInicial;
				break;
			}
			
		}
	}

}
