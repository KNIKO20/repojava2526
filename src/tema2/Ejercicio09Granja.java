
// En una granja se compra diariamente una cantidad (comidaDiaria)
// de comida para los animales (se pide por pantalla)
// El número de animales que alimentar
// (todos de la misma especie)
// es numAnima1es (se pide por pantalla)
// - sabemos que cada animal come una media de kilosPorAnima1
// 1
// (se pide por pantalla)
// Diseña un programa que solicite al usuario los valores anterior
// y determine si disponemos de alimento suficiente para cada animal
// En caso negativo, ha de calcular cuál es la
// ración que corresponde a cada uno de los animales.
// Nota: Evitar que la aplicacion realice divisiones por cero. positivo negativo 0


//KEVIN VASQUEZ FONSECA
import java.util.Scanner;
public class Ejercicio09Granja {
   public static void main(String[] args){
      int nAnimales;
      double comidaDiaria, kgXAnimal, resto;
      Scanner sc = new Scanner(System.in);
      System.out.println("Cuanta comida hay en kg: ");
      comidaDiaria = sc.nextDouble();
      System.out.println("Cuantos animales hay: ");
      nAnimales = sc.nextInt();
      System.out.println("Cuantos kg consume de media cada animal: ");
      kgXAnimal = sc.nextDouble();
      double comidaIdeal = comidaDiaria / nAnimales;
      if (comidaDiaria <= 0 && nAnimales < 1 && kgXAnimal <= 0) {
         
         System.out.println("No se admiten valores negativos o 0");

      } else {
            if (comidaIdeal >= kgXAnimal){
            resto = comidaDiaria / (nAnimales * kgXAnimal);
            System.out.println("Si hay suficiente alimento, hay "+resto+" kg para cada animal");
       
         } else {
            resto = comidaDiaria / (nAnimales * kgXAnimal);
            System.out.println("No hay suficiente comida, cada animal tendria una racion de "+resto+" kg por cada animal");
         }
      }
      
   }
}