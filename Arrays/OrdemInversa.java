package Arrays;

public class OrdemInversa {
    /* Crie um vetor de 6 números inteiros e mostre-os na ordem inversa. */

    public static void main(String[] args) {

        //Dentro de um arrays só podem existir elementos de um mesmo tipo.

        int[] vetor = {-5, -6, 15, 50, 8, 4};
        //5 posições (de 0 à 5)
        //6 elementos

        System.out.println("Vetor:");

        int count = 0;
        while(count < (vetor.length)) {
            System.out.println(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i--);
        System.out.println(vetor[i] + " ");

    }
    
}
