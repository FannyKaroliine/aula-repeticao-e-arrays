package ExerciciosRepeticaoeArrays.ExerciciosRepeticao;

import java.util.Scanner;

public class ExercicioRepeticaoTabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada do " + tabuada);
        for(int i  = 1; i <= 10; i = i + 1) {
            System.out.println((tabuada + " X " + i + " = " + tabuada * i));
        }
    }
}
