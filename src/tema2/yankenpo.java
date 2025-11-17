import java.util.Random;
import java.util.Scanner;

public class yankenpo {
    static int scoreBot = 0;
    static int myScore = 0;
    public static void main(String[] args) {
        boolean seguir = true;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Piedra, papel o tijera vs CPU");
        System.out.println("-----------------------------");
        while (seguir) {
            guide();
            int option = sc.nextInt();
            int botOption = random.nextInt(3) +1;
            check(option, botOption);
            System.out.println("\n Score: "+myScore+" : "+scoreBot+" (Bot)" );
            System.out.println("¿Quieres volver a jugar?\n1) Sí\n2) No");
            option = sc.nextInt();
            seguir = option==1?true:false;
            for (int i = 0; i < 25; i++) {
                System.out.println();
            }
            
        }
        System.out.println("Byeee");
        sc.close();
    }
    private static void guide(){
        System.out.println("Elige el número de la opción: ");
        System.out.println("1) Piedra\n2) Papel\n3) Tijera");
        System.out.print("Inserte el número: ");
    }
    private static void check(int option, int botOption){
        if (option == botOption){
            System.out.println("Empate");
        } else if (option == 1 && botOption == 2) {
            System.out.println("Ganó el bot: Papel > Piedra");
            scoreBot++;
        } else if (option == 2 && botOption == 1) {
            System.out.println("Ganaste: Papel > Piedra");
            myScore++;
        } else if (option == 1 && botOption == 3) {
            System.out.println("Ganaste: Piedra > Tijera");
            myScore++;
        } else if (option == 3 && botOption == 1) {
            System.out.println("Ganó el bot: Piedra > Tijera");
            scoreBot++;
        } else if (option == 2 && botOption == 3) {
            System.out.println("Ganó el bot: Tijera > Papel");
            scoreBot++;
        } else if (option == 3 && botOption == 2) {
            System.out.println("Ganaste: Tijera > Papel");
            myScore++;
        }
    }
}
