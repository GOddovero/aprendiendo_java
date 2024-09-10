package flujo_de_control;

import java.util.Scanner;

public class Tarea7 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        /*
        Crea una clase con el metodo main donde el desafio es buscar el numero menor de minimo 10 valores enteros, usando la clase scanner ingresa la cantidad de numeros a comparar, luego utilizando una sentencia for iterar el numero de veces(ingresado) para pedir el numero entero, se requiere:
        Calcular el menor numero e imprimir el valor.
        Si el menor numero es menor que 10, imprimir "El número menor es menor que 10!", sino imprimir "El número menor es mayor o igual a 10!"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de valores a comparar: ");
        int cantidad = scanner.nextInt();
        int menor = 0;
        for(int i = 0; i < cantidad; i++) {
            System.out.println("Ingresa el valor: ");
            int valor = scanner.nextInt();
            menor = (valor < menor) ? valor : menor;
        }
        System.out.println("El numero menor es: " + (menor < 10 ? "menor que 10!" : "mayor o igual a 10!"));
    }
}
