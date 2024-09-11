package clases_varias;

public class PasarPorReferencia {

    public static void main(String[] args) {
    int[] edad = {10,20,30};
    System.out.println("Iniciamos el metodo main");
    for(int i = 0 ; i < edad.length; i++){
        System.out.println("edad[" + i + "] = " + edad[i]);
    }
    System.out.println("Antes de invocar el metodo test");
    test(edad);
    System.out.println("Despues de invocar el metodo test");
    for(int i = 0 ; i < edad.length; i++){
        System.out.println("edad[" + i + "] = " + edad[i]);
        }
        System.out.println("Finaliza el metodo main");
    }
    public static void test(int[] edadArr){
        System.out.println("Iniciamos el metodo test");
        for (int i = 0; i < edadArr.length; i++) {
            edadArr[i] = edadArr[i] + 20;
        }
        System.out.println("Terminamos el metodo test");
    }
}
