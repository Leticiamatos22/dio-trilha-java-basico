import java.util.Scanner;
import java.util.Locale;

public class DesafioBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite sua conta");
        int conta = scanner.nextInt();

        System.out.println("Digite sua agência");
        int agencia = scanner.nextInt();
        
        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        //Mensagem a ser retornada
        System.out.println("");
        System.out.println("Olá, "+nome+", Obrigado por criar uma conta em nosso banco, suas informações são:");
        System.out.println("Agência: "+agencia);
        System.out.println("Conta: "+conta);
        System.out.printf("Saldo disponível para saque: R$%.2f", saldo);
    }
}
