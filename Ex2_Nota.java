public class Ex2_Nota {
    /*
     * Faça um program que peça uma nota entre 0 e 10.
     * Mostre uma mensagem caso o valor seja inválido e continue pedindo
     * até que o usuário infomr um valor válido.
     */
    public static void main (String[] args) {
        Scannerscan = new Scanner (System.in);

        int nota;

        System.out.println("Nota...");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10) {
            System.out.println("Nota Inválida! Digite novamente: ")
            nota = scan.nextInt();
        }
    }
}
