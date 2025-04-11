import java.util.Scanner;

public class atv4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O antecessor do " + numero + " é : " + antecessor);
        System.out.println("O sucessor do " + numero + " é : " + sucessor);
        if (numero % 2 == 0) {
            System.out.println("O número e par");
        } else {
            System.out.println("O número e impar");
        }

    }
}
