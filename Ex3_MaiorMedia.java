public class Ex3_MaiorMedia {

    /* Faça um program que leia 5 números e informe o maior número e a média desses números. */
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);

        int numero;
        int maior = 0;
        int soma = 0; //Colocamos valor zero porque pode ser substituido pelos números representativos.

        int count = 0;

        do{
            System.out.println("Numero: ");
             numero = scan.nextInt();

             soma = soma + numero;

             if (numero > maior) maior = numero;

             count = count + 1;

        } while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));
        //Como o código está fora do "while" só apresentará os resultados finais.
        //Se quiser que apresente os resultados durante o processo, coloque o while
        //dentro do "do"
    }
}
