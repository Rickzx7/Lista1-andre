import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class atv1 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    LocalDate.now();
    LocalDate DataAtual = 
    LocalDate.now();
    System.out.println("Digite o ano de seu nascimento?");
    int AnoNascimento = scanner.nextInt();
    System.out.println("Digite o mês do seu nascimento?");
    int MesNascimento = scanner.nextInt();
    System.out.println("Digite o dia de seu nascimento?");
    int DiaNascimento = scanner.nextInt();

    LocalDate DataNascimento =
    LocalDate.of(AnoNascimento, MesNascimento, DiaNascimento);
    
    Period idade = 
    Period.between(DataNascimento, DataAtual);

    System.err.println("Você tem " +  idade.getYears() + " anos." );
 

    scanner.close();
}

}
