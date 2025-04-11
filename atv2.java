import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Digite a porcentagem  do IPI a ser adicionado ao valor das peças: ");
       double porcentagem = scanner.nextInt();

       System.out.println("Digite o codigo da peça 1: ");
       int idPeca1 = scanner.nextInt();
       System.err.println("Digite o valor unitário da peça 1: ");
       double valorPeca1 = scanner.nextDouble();
       System.out.println("Digite a quantidades de peças" + idPeca1 + " : ");
       int quantidadePeca1 = scanner.nextInt();

       System.out.println("Digite o codigo da peça 2: ");
       int idPeca2 = scanner.nextInt();
       System.err.println("Digite o valor unitário da peça 2: ");
       double valorPeca2 = scanner.nextDouble();
       System.out.println("Digite a quantidades de peças " + idPeca2 + " : ");
       int quantidadePeca2 = scanner.nextInt();


       double TotalSemIPI = 
       (valorPeca1 * quantidadePeca1) + (valorPeca2 * quantidadePeca2);

       double TotalFinal = 
       TotalSemIPI * (1 + porcentagem / 100);

       System.out.printf("O valor total para ser pago é : %.2f%n", TotalFinal);

       scanner.close();
    }
}
