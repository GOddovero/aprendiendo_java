package flujo_de_control;

import java.util.Scanner;

public class Tarea8 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        /*
        Pedir 20 notas finales de alumnos en una escala del 1 al 7, manejar decimales en las notas(double).
        Mostrar el promedio de las notas mayores a 5, promedio de las notas inferiores a 4 y la cantidad de notas 1, ademas del promedio total.
        Ayuda: El bucle for que itere hasta 20 notas y dentro del ciclo pedir las notas una a una para realizar los calculos.

        Opcional: si una de las notas ingresada es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.

         */
        Scanner scanner = new Scanner(System.in);
        double notasGeneral = 0.0;
        double notasAltas = 0.0;
        double notasBajas = 0.0;
        int cantidadNotasUno = 0;
        int cantidadNotasAltas = 0;
        int cantidadNotasBajas = 0;
        int cantidadNotas = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Ingresa la nota: ");
            double nota = scanner.nextDouble();
            cantidadNotas++;
            if(nota == 0){
                System.out.println("Error");
                break;
            }else if(nota == 1){
                cantidadNotasUno++;
                notasGeneral += nota;

            }else if (nota < 5){
                notasBajas += nota;
                notasGeneral += nota;
                cantidadNotasBajas++;
            }else if (nota > 5){
                notasAltas += nota;
                notasGeneral += nota;
                cantidadNotasAltas++;
            }
        }
        System.out.println("El promedio General es: " + (notasGeneral / cantidadNotas));
        System.out.println("El promedio de las notas altas es: " + (notasAltas / cantidadNotasAltas));
        System.out.println("El promedio de las notas bajas es: " + (notasBajas / cantidadNotasBajas));
        System.out.println("La cantidad de notas 1 es: " + (cantidadNotasUno));
    }
}
