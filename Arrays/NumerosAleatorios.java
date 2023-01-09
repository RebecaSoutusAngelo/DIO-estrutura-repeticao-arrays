package Arrays;

public class NumerosAleatorios {
    /*
     * Faca um program que leia 20 números inteiros (entre 0 e 100) 
     * armazeno-os num vetor.
     * Ao final mostre os números e seus sucessores.
     */
        public static void main (String[] args) {
            Random random = new Random();

            int[] numerosAleatorios = new int[20];

            for(int i = 0; i < numerosAleatorios.length; i++) {
                int numero = random.nextInt (bound: 100);
                numerosAleatorios[i] = numero;
            }

            System.out.print("Numeros Aleatorios: ")
            for (int numero : numerosAleatorios){
                System.out.println(numero + " ");
            }
            System.out.print("Sucessores dos Numeros Aleatorios: ")
            for (int numero : numerosAleatorios){
                System.out.println((numero+1) + " ");
             }
             System.out.print("Antecessores dos Numeros Aleatorios: ")
             for (int numero : numerosAleatorios){
                 System.out.println((numero-1) + " ");   

}
