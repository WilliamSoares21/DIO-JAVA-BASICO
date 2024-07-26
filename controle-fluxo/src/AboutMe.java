import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();   
        }
        catch(InputMismatchException e){
            System.err.println("O campos idade e altura precisam ser númericos");
        }
    }
    //a seguir irá uma releitura do codigo que pesquisei por curiosidade no chat gpt (pois não consegui até então fazer tudo sozinho, pois não tinha muito conhecimento sobre tratamento de exceções e sobre flags), ao inserir um dado fora dos parametros irá haver um loop para solicitar os dados corretos novamente. O programa será repitido até que a condição seja atendida corretamente.

    /*
     * import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        String nome = "";
        String sobrenome = "";
        int idade = 0;
        double altura = 0.0;
        boolean validInput = false;
        
        while (!validInput) {
            try {
                System.out.println("Digite seu nome:");
                nome = scanner.next();
                
                System.out.println("Digite seu sobrenome:");
                sobrenome = scanner.next();
                
                System.out.println("Digite sua idade:");
                idade = scanner.nextInt();
                
                System.out.println("Digite sua altura:");
                altura = scanner.nextDouble();
                
                validInput = true; // Dados válidos, sair do loop
            } catch (InputMismatchException e) {
                System.err.println("Os campos idade e altura precisam ser numéricos.");
                scanner.next(); // Consumir a entrada inválida
                scanner.nextLine(); // Limpar o buffer do scanner
            }
        }

        scanner.close();
        
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm");
    }
}

     */
}