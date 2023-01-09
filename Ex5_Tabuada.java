public class Ex5_Tabuada {
    /* Desenvolva um gerador de tabuada,
     * capaz e gerar a tabuada de qualquer número inteio entre 1a 10.
     * O usuário deve informar de qual numero ele deseja ver a tabuada.
     * A saída deve ser conforme o exemplo:
     * 
     * Tabuada de 5:
     * 5 * 1 = 5
     * 5 * 2 = 10 etc
     * 5 * 10 = 50
     */

     public static void main (String[] argrs) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: "); 
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for(int i = 1; i <= 10; i = i++ ) {
            System.out.println(tabuaa + "X" + i + "=" + (tabuada*1));

        }
     }
}
