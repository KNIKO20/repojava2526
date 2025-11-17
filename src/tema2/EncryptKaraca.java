package tema2;
import java.util.Scanner;
public class EncryptKaraca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		text = text.concat(" ");
		int lastSpace = 0;
		String actualWord;
		for (int i = 0; i < text.length(); i++) {
			char x = text.charAt(i); 
			if (x == ' ') {
				actualWord = text.substring(lastSpace, i);
				System.out.print(encryptWord(actualWord)+" "); 
				lastSpace = i + 1;
			}
		}
		sc.close();
	}
	
	private static String encryptWord(String word) {
		//Invertir cadena, cambiar vocales, agregar aca
		String out = "";
		for (int i = word.length() - 1; 0 <= i ; i--) {		
			char charActual = word.charAt(i);
			if (charActual == 'a' || charActual == 'A') {
				charActual = '1';
			} else if (charActual == 'e' || charActual == 'E') {
				charActual = '2';
			} else if (charActual == 'i' || charActual == 'I') {
				charActual = '3';
			} else if (charActual == 'o' || charActual == 'O') {
				charActual = '4';
			} else if (charActual == 'u' || charActual == 'U') {
				charActual = '5';
			}
			out = out + charActual;
		}
		out = out.concat("aca");
		return out;
		
	}

}
