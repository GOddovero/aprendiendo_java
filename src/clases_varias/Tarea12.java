package clases_varias;

import java.util.Scanner;
public class Tarea12 {
    public static void main(String[] args) {
        /*
        Calcular el area de un circulo.
        Pedir el radio de un circulo y calcualr su area utilizando la siguiente formula:
        area = PI * radio^2
         */

        Scanner newScanner = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo: ");
        double radio = newScanner.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El area del circulo es: " + area);
    }
}
