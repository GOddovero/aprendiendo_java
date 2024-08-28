public class Variables {
    public static void main(String[] args) {

        String saludo = "Hola Mundo";
        System.out.println(saludo);

        int numero = 10;
        System.out.println(numero);
        boolean valor = true;
        int numero2;
        
        if (valor) {
            numero2 = 2;
            System.out.println(numero2);
        }
        var numero3 = 15; //Variables Dinamicas 

        String nombre; // Se puede declarar de antemano una variable.

        nombre = "Gaspar";

        if (numero3 > 10){
            nombre = "Oddovero";
        }

        System.out.println(nombre);
        
        //Se pueden declarar de las siguientes tres formas, siempre usando camelCase

        int _numero4 = 5;
        int $numero5 = 10;
        int numero6 =50;

        System.out.println(_numero4 + $numero5  + numero6);
        
    }
}
