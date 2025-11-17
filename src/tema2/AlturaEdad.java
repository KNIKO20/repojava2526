import java.util.Scanner;

public class AlturaEdad {
    //Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de
    //alumnos mayores de 18 años, y la cantidad de alumnos que miden más de 1.75.

    public static void main(String[] args) {
        int edadX=0,alturaX=0,count18=0,count175=0;
        int temp1=0,temp2=0;
        Scanner sc = new Scanner(System.in);
        for (int i=1;i <= 5; i++){
            System.out.println("Ingresa la edad del alumno "+i+": ");
            edadX = sc.nextInt();
            if (edadX > 18) {
                count18++;
            }
            temp1 += edadX;
        }
        for (int i=1;i <= 5; i++){
            System.out.println("Ingresa la altura en cm del alumno "+i+": ");
            alturaX = sc.nextInt();
            if (alturaX > 175) {
                count175++;
            }
            temp2 += alturaX;
        }
        edadX = temp1/5;
        alturaX = temp2/5;
        System.out.println("La estatura media es: "+alturaX);
        System.out.println("La edad media es de: "+edadX);
        System.out.println("Hay "+count18+" con más de 18 años");
        System.out.println("Hay "+count175+" que miden más de 1.75m");
        sc.close();
    }

}
