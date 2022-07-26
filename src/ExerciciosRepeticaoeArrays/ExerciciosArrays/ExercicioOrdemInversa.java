package ExerciciosRepeticaoeArrays.ExerciciosArrays;

public class ExercicioOrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        //impressão em ordem crescente
        System.out.print("Vetor: ");
        int count = 0;
        while (count <= (vetor.length - 1)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        //impressão em ordem inversa
        System.out.print("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

    }
}
