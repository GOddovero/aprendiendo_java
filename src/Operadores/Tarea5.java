package Operadores;

import java.util.Scanner;

public class Tarea5 {

    public static void main(String[] args) {
    /*
    Suponiendo un estanque de gasolina con capacidad de 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente...
    La medida o capacidad actual del tanque puede ser en tipo double para una mejor precision, pero tambien puede ser te tipo int.
    Tabla para mostrar:
    Litros     Resultado
    70         Estanque Lleno
    60-70      Estanque casi lleno
    40-60      Estanque 3/4
    35-40      Medio Estanque
    20-35      Suficiente
    1-20       Insuficiente
     */

    double litros = 0.0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingresa la cantidad de litros: ");
    litros = scanner.nextDouble();
    scanner.close();
    String estadoActual = "";
    //Aca me complique al pedo, se puede usar if y es mas sencillo, decidi hacerlo con operador ternario porque casi nunca lo uso.
    estadoActual = 
    (litros >= 1 && litros <= 20) ? "Insuficiente" :
    (litros > 20 && litros <= 35) ? "Suficiente" :
    (litros > 35 && litros <= 40) ? "Medio Estanque" :
    (litros > 41 && litros <= 60) ? "Estanque 3/4" :
    (litros > 61 && litros < 70) ? "Estanque casi lleno" :
    (litros == 70) ? "Estanque Lleno" : "Cantidad fuera de rango";
    
    System.out.println(estadoActual);

    /* Otra opcion valida de hacerlo:
    if (litros >= 1 && litros <= 20) {
        System.out.println("Insuficiente");
    } else if (litros > 20 && litros <= 35) {
        System.out.println("Suficiente");
    } else if (litros > 35 && litros <= 40) {
        System.out.println("Medio Estanque");
    } else if (litros > 41 && litros <= 60) {
        System.out.println("Estanque 3/4");
    } else if (litros > 61 && litros < 70) {
        System.out.println("Estanque casi lleno");
    } else if (litros == 70) {
        System.out.println("Estanque Lleno");
    } else {
        System.out.println("Litros fuera de rango");
    }
    */
}
}
