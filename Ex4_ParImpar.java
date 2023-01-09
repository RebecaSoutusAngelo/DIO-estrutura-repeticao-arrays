public class Ex4_ParImpar {
    /* Faça um programa que peça N números inteiros, 
     * calcule e mostre a quantidade de númores pares
     * e a quantidade de números impares.
     */

     public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de Números:");
        numero = scan.nextInt();

        int count = 0;

        do{
            System.out.println("Número:");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;


            count++;
//Contador de incremento porque se mantivermos sem este, 
//o sistema entrará em loop infinito, já que os valores nunca 
        } while(count < quantNumeros);
        System.out.println("Quantidade Par:" + quantPares);
        System.out.println("Quantidade Impar:" + quantImpares);
        
     }
}
