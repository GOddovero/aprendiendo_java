package flujo_de_control;

public class SentenciaFor {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            System.out.println("i = " + i);
        }
        for(int i = 1, j = 5; i < j; i++, j--){
            System.out.println("i = " + i + "; j = " + j);
        }

        for(int i = 0; i <= 10; i++){
            if (!(i % 2 == 0)){
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
