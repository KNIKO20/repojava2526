import java.util.Scanner;

public class Orden {

    public static void main(String[] args) {
        int i, t[];
        Scanner sc = new Scanner(System.in);
        t = new int[10];
        for ( i = 0; i<t.length;i++){
            System.out.println("Introduzca número: ");
            t[i] = sc.nextInt();

        }
        System.out.println("El resultado es");
        for(i=0;i<=4;i++){
            System.out.println(t[i]);
            System.out.println(t[t.length-1 - i]);
        }
        sc.close();

    }
}