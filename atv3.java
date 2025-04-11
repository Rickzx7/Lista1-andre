import java.util.Scanner;

public class atv3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Seja bem vindo ao calculador de salarios mínimos");
        System.out.println("Digite o valor do seu salário: ");
        double salarioUser = leitor.nextDouble();
        System.out.println("Digite o valor do salario mínimo atual: ");
        double salarioMinimo = leitor.nextDouble();

        double quantidadeSalarios = salarioUser / salarioMinimo;

        System.out.printf("Você recebe atualmente %.0f salarios mínimos. Parabéns", quantidadeSalarios);
        leitor.close();
    }
}
