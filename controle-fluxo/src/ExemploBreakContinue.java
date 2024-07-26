public class ExemploBreakContinue {

    public static void main(String[] args) {
        for(int num = 1; num <= 5; num ++){
            if(num == 3){
                break;
                //continue; muda o fluxo, nesse exemplo ele pula o número 3
            }
        }
    }
}