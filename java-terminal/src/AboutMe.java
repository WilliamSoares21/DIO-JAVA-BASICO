import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
 public static void main(String[] args) {

    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Insira seu nome: ");
    String nome = scan.next();

    System.out.println("Insira seu sobrenome: ");
    String sobrenome = scan.next();

    System.out.println("Insira sua idade: ");
    int idade = scan.nextInt();

    System.out.println("Insira sua altura: ");
    double altura = scan.nextDouble();
            
    
    /*String nome = args[0];
    String sobrenome = args[1];
    int idade = Integer.valueOf(args[2]);
    double altura = Double.valueOf(args[3]);
    */
    
    System.out.println("Ola, me chamo "+ nome +" "+ sobrenome);
    System.out.println("Tenho "+ idade +" anos");
    System.out.println("Tenho "+ altura +" cm de altura");
    
 }   
}
