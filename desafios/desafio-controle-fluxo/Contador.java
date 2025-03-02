import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o primeiro parâmetro: ");
        int parametroUm = scan.nextInt();

        System.out.println("Insira o segundo parâmetro: ");
        int parametroDois = scan.nextInt();

        try {
             contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {

            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    
        } finally {

            scan.close();
        }

    
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        
        int contagem = parametroDois - parametroUm;
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número: "+ i);
        }
    }
}
