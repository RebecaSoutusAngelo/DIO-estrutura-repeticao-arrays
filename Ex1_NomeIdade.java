import java.util.Scanner;
/* Faça um progrma que leia conjuntos de dois valores,
 * o primeiro representando o nome do aluno e o segundo a sua idade.
 * (pare o program inserindo o valor "0" no campo nome)
 */
public class Ex1_NomeIdade {
        public static void main(String [] args) {
                Scanner scan = new Scanner(System.in);

                String nome;
                int idade;

                while(true){
                System.out.println("Nome: ");
                nome = scan.next();
                if (nome.equals("0"))break;

                System.out.println("Idade: ");
                idade = scan.next.Int();
             }
             System.out.println("Vamos parar por aqui... ");

        }
}