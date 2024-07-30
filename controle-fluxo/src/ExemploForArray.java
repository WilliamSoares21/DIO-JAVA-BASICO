public class ExemploForArray {
    public static void main(String[] args) {
        String alunos [] = { "Paul", "Jhon", "Ringo", "George"};
        
        for(int i = 0; i < alunos.length; i++){
            System.out.println("O aluno no indice i = "+ i +" é "+ alunos[i]);
        }

        //Imprimindo de maneira mais abreviada
        for(String aluno : alunos){
            System.out.println("Nome do aluno é: "+ aluno);
        }

    }
}