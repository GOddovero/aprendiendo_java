package Operadores;

import javax.swing.JOptionPane;

public class OperadoresAritmetico {

    public static void main(String[] args) {
    
        int i = 5, j = 4, suma = i + j, resta = i - j, multiplicacion = i * j, division = i / j, resto = i % j;

        System.out.println("suma: " + suma);

        System.out.println("i + j = " + i + j ); // lo concatena, ya que primero concatena el valor de i al string "i + j = "
        System.out.println("i + j = " + (i + j) ); // lo suma primero

        System.out.println("resta: " + resta);
        System.out.println("multiplicacion: " + multiplicacion);

        System.out.println("division: " + division); //Solo devuelve el entero de la division, no el decimal ya que el tipo de dato declarado es int.
        float div2 = (float) i / j;
        System.out.println("div2: " + div2);

        System.out.println("resto: " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entero"));
        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
