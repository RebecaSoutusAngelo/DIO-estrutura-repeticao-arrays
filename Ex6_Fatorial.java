public class Ex6_Fatorial {
    /* Faça um program qua calcule o fatorial de um número inteiro fornecido pelo usuário. 
     * Ex.: 5! = 120 (5 * 4 * 3 * 2 * 1)
    */

    public static void main (String [] args) {
        Scanner scan = new Scanner(Systen.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.prinln("fatorial + "! = ");

        for( int i = fatorial; i >= 1 ; i-- ) { fatorial: 3 i:2
            multiplicacao = multiplicacao * i; multiplicacao: 6 i: 1

        }
        System.out.prinln(multiplicacao);
    }
}
