package tema1;

import java.util.Scanner;

public class EnteroABinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iDecimal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Decimal:");
		iDecimal = sc.nextInt();
		sc.close();
		int iReminder = iDecimal % 2;
		iDecimal /= 2;
		String sBinario = "";
		sBinario = iReminder + sBinario;
		iReminder = iDecimal % 2;
		iDecimal /= 2;
		sBinario = iReminder + sBinario;
		iReminder = iDecimal % 2;
		iDecimal /= 2;
		sBinario = iReminder + sBinario;
		iReminder = iDecimal % 2;
		iDecimal /= 2;
		sBinario = iReminder + sBinario;
		System.out.println(sBinario);
		sc.close();
	}

}
