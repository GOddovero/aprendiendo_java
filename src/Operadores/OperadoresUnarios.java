package operadores;

public class OperadoresUnarios {

    public static void main(String[] args) {
    
        int i = 6;
        int j = +i; // j = (1)*i => -5

        int k = -j; // k = -(1)*j => 5

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
    }

}
