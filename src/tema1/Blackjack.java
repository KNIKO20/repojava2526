package tema1;
import java.security.SecureRandom;
import java.util.Scanner;
public class Blackjack {
	public static final SecureRandom SECURE_RANDOM = new SecureRandom();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum = 0;
		int iOption;
		int iMoney = 50;
		int iBet;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("---BLACKJACK--");
		System.out.println("Choose an option:");
		System.out.println("1) Play");
		System.out.println("2) Help");
		System.out.println("3) Exit");
		iOption = sc.nextInt();
		if (iOption == 1) {
			System.out.print("\033[H\033[2J");
			System.out.flush();
			
			System.out.println("You have "+iMoney+" coins");
			System.out.println("How many coins do you want to bet?");
			iBet = sc.nextInt();
			while(iBet == 0 || iBet < 0 || iBet > iMoney) {
				System.out.println("ERROR - How many coins do you want to bet?");
				iBet = sc.nextInt();
			}	
			iNum = randomNumberBetween(1, 14);
			int iCard1 = iNum;
			System.out.println("Your first card is: "+iNum);
			System.out.print("Options: ");
			System.out.println("1) Hit");
			System.out.println("2) Stand");
			System.out.println("3) Double down");
			iOption = sc.nextInt();
			if (iOption == 1) {
				iNum = randomNumberBetween(1, 14);
				int iCard2 = iNum;
				System.out.println("Your second card is: "+iCard2);
				int iTotal = iCard1 + iCard2;
				if (iTotal == 21) {
					iBet *= 2;
					System.out.println("You won, now you have "+iBet+" coins");
				} else if (iTotal < 21) {
					System.out.println("Your cards: "+iCard1+" "+iCard2);
					System.out.print("Options: ");
					System.out.println("1) Hit");
					System.out.println("2) Stand");
					System.out.println("3) Double down");
				}
			}
		} else if (iOption == 2) {
			
		} else {
			System.out.println("Byee!");
		} 
		sc.close();
		
	}
	private static int randomNumberBetween(int minimum, int maximum) {
		return SECURE_RANDOM.nextInt(maximum - minimum) + minimum;
	}

}
