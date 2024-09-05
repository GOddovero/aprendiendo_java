package FlujoDeControl;

import java.util.Scanner;

public class SentenciaIfElseNumeroDiasMes {
        /* 
        * Programa que indica el n mero de d as que tiene el mes que se
        * pasa como par metro. Si el mes es febrero, se considera que
        * es un a o bisiesto si el resto de la divisin entre el a o y
        * 4 es 0, excepto si el a o es divisible entre 100, en cuyo
        * caso debe ser divisible entre 400.
        */
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el mes: ");
        int mes = scanner.nextInt();
        int numeroDias = 0;
        System.out.println("Ingresa el anio: ");
        int anio = scanner.nextInt();
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            numeroDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            numeroDias = 30;
        } else if (mes == 2) {
            if (anio % 400 == 0 || (anio % 4 == 0) && !(anio % 100 == 0)) {
                numeroDias = 29;
            } else {
                numeroDias = 28;
            }
        }
        System.out.println("El mes tiene " + numeroDias + " dias");
    }
}

