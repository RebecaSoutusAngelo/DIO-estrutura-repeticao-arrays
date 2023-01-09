package Arrays;

public class Consoantes {
    /* Faça um programa que leia um vetor de 6 caracteres,
     * e diga quantas consoantes foram lidas.
     * Imprima as consoantes.
     */

     public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do{
            System.out.prinln("Letra: ");
            String letra = scan.next();

            if( !(letra.equalsIgnoreCase(anotherString:"a") |
                letra.equalsIgnoreCase(anotherString:"e") |
                letra.equalsIgnoreCase(anotherString:"i") |
                letra.equalsIgnoreCase(anotherString:"o") |
                letra.equalsIgnoreCase(anotherString:"u") )) {
                    consoantes[count] = letra;
                    quantidadeConsoantes++;
                }


        } while(count < consoantes.length);

        System.out.prinln("Consoantes: ");
        for ( String consoante : consoantes ) {
            if( consoante != null)
            System.out.prinln(consoante + " ");
      }

      System.out.prinln("Quantidade de Consoantes:" + quantidadeConsoantes);
      System.out.prinln(consoantes.length);

     }
    

    
}
