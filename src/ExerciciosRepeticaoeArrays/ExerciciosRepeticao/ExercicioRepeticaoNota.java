package ExerciciosRepeticaoeArrays.ExerciciosRepeticao;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ExercicioRepeticaoNota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;
        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scan.nextInt();
        }
    }
}
