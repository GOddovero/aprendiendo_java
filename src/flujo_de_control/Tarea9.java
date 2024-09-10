package flujo_de_control;

import java.util.Scanner;

public class Tarea9 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        /*
        Mediante el teclado pedir dos numeros enteros positivos o negativos y multiplicarlos, pero sin usar el simbolo de multiplicacion.
        Puede utilizar una sentencia for para realizar la multiplicacion y tener en cuenta los unarios, donde menos por menos es positivo.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el primer valor: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa el segundo valor: ");
        int num2 = scanner.nextInt();
        int resultado = 0;

        for (int i = 0; i < num2; i++) {
            resultado += num1;
        }
        System.out.println("El resultado es: " + resultado);
    }

}
