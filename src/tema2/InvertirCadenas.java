package tema2;

import java.util.Scanner;

public class InvertirCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();
		String out = "";
		System.out.println(words);
		for (int i = words.length() - 1; 0 <= i ; i--) {		
			out = out + words.charAt(i);
		}
		System.out.println(out);
		sc.close();
	}

}
