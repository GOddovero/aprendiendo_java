package flujo_de_control;

public class SentenciaForEach {
    public static void main(String[] args) {

        /* Es lo mismo que String[] nombres = new String[6];
    
        nombres[0] = "Gaspar";
        nombres[1] = "Daniel";
        nombres[2] = "Miguel";
        nombres[3] = "Carlos";
        nombres[4] = "Pedro";
        nombres[5] = "Juan";
        
        */

        String[] nombres = {"Gaspar", "Daniel", "Miguel", "Carlos", "Pedro", "Juan"};

        for (String nombre : nombres) {
            System.out.println("nombre = " + nombre);
        }

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int numero : numeros) {
            System.out.println("numero = " + numero);
        }
    }
}
