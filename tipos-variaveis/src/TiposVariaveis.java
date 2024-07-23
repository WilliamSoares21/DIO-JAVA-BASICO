public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        //tipos primitivos
        //estudar a classe String que representa texto na aplicação

        String meuNome = "William Soares";
        double salarioMinimo = 1414;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //exemplo de uso do cast, que é a conversão de objetos ou tipos primitivos de um tipo para outro tipo. Ao se tratar casting, considera-se a necessidade de conversão explícita entre tipos – o que, potencialmente, pode causar perdas de informação.

       int numero = 5;

       numero = 10;

       System.out.println(numero);//valor foi alterado

       final double VALOR_DE_PI = 3.14; //sempre que você definir uma variável que não pode ser alterada, lembrar de colocar em caixa alta(o nome da variável) e inserir a palavra "final" antes do tipo da váriavel para informar que aquela variável é um constante 




    }
}
