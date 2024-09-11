package clases_varias;

public class PasarPorValor {

    public static void main(String[] args) {
    int i = 10;
    System.out.println("Iniciamos el metodo main con i = " + i);
    test(i);
    System.out.println("Terminamos el metodo main con i = " + i);
    
    }

    public static void test(int i){
        System.out.println("Iniciamos el metodo test = " + i);
        i = 20;
        System.out.println("Terminamos el metodo test = " + i);
    }
}
