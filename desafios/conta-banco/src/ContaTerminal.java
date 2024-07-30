import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por gentileza, insira sua Agência: ");
        String agencia = scan.nextLine();

        System.out.println("Insira seu número da conta: ");
        int numConta = scan.nextInt();
        scan.nextLine();

        System.out.println("Insira seu nome: ");
        String nomeCliente = scan.nextLine();

        System.out.println("Insira seu saldo: ");
        double saldo = scan.nextDouble();

        scan.close();
    
        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é: "+ agencia +", sua conta é: "+ numConta +", e seu saldo de "+ saldo +"R$ já está disponível para saque.56");
        
    }
    
}
