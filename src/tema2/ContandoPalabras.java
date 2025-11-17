package tema2;

import java.util.Scanner;
//IMCOMPLETO

public class ContandoPalabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		text = text.concat(" ");
		int lastSpace = 0;
		String lastWord = " ";
		String actualWord;
		String toComp;
		int numWords = 0;
		for (int i = 0; i < text.length(); i++) {
			char x = text.charAt(i); 
			if (x == ' ') {
				numWords += 1;
				
				
		}
		for (int i = 0; i < text.length(); i++) {
			char x = text.charAt(i); 
			if (x == ' ') {
//				System.out.println("Espacio en la posicion "+i);
				actualWord = text.substring(lastSpace, i);	
				lastSpace = i + 1;
				if (!lastWord.equals(" ")) {
					for (int j = 0; j < numWords - 1; j++) {
						toComp = lastWord;
						toComp.equalsIgnoreCase(actualWord);
					}
				}
				lastWord = actualWord;
			}
		}
		sc.close();
	}

}
