package Operadores;

import java.util.Scanner;

public class Tarea4 {

    public static void main(String[] args) {
    //Objetivo de la tarea: El desafio es un programa que pida dos números y los muestre de mayor a menor. 
    //Podria ser utilizando el operador ternario.
    
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Ingresa el primer numero: ");
    int num1 = scanner.nextInt();
    
    System.out.println("Ingresa el segundo numero: ");
    int num2 = scanner.nextInt();

    int mayor = (num1 > num2) ? num1 : num2;
    int menor = (num1 < num2) ? num1 : num2;
    
    System.out.println("El numero mayor es: " + mayor);
    System.out.println("El numero menor es: " + menor);
    
    }
}
