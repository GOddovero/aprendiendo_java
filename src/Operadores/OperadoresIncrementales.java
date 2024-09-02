package Operadores;

public class OperadoresIncrementales {

    public static void main(String[] args) {
        // Pre Incremento
        int i = 1;
        int j = ++i; // i = i + 1 Java incrementa el valor de i antes de realizar la asignación
        System.out.println("j = " + j + "; i = " + i);
    
        //Post Incremento
        i = 2;
        System.out.println("Valor inicial de i= " + i);
        j = i++; // i = i + 1 Java incrementa el valor de i despues de realizar la asignación
        System.out.println("j = " + j + "; i = " + i);

        // Pre Decremento
        i = 3;
        j = --i; // i = i - 1 Java decrementa el valor de i antes de realizar la asignación
        System.out.println("j = " + j + "; i = " + i);

        //Post Decremento
        i = 4;
        System.out.println("Valor inicial de i= " + i);
        j = i--; // i = i - 1 Java decrementa el valor de i despues de realizar la asignación
        System.out.println("j = " + j + "; i = " + i);

        System.out.println("j =" + (++j));
        System.out.println("j =" + (j++));
    }
}
