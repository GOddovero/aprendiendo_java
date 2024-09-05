package Operadores;

import javax.swing.JOptionPane;

public class Tarea6 {   
    public static void main(String[] args) {
        /*Obtener el nombre mas largo de tres personas. Segun los siguientes requerimientos:
        Mediante el teclado pedir el nombre completo (nombre y apellido) de tres personas usando la clase JOptionPane y el metodo showInputDialog.
        Calcular e imprimir el nombre de la persona que tenga el nombre más largo(en cantidad de caracteres)(Imprimir solo uno de los tres).
        Podría usar .split(" ") del objeto String para separar nombre y apellido en un arreglo y con el indice cero accedemos al nombre de la persona.
        Restricciones: No usar loops en el desarrollo.
        Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo"
        */

        String nombre1 = JOptionPane.showInputDialog("Ingresa el nombre de la primera persona");
        String nombre2 = JOptionPane.showInputDialog("Ingresa el nombre de la segunda persona");
        String nombre3 = JOptionPane.showInputDialog("Ingresa el nombre de la tercera persona");

        String [] primerNombre = nombre1.split(" ");
        String [] segundoNombre = nombre2.split(" ");
        String [] tercerNombre = nombre3.split(" ");

        if(primerNombre[0].length() > segundoNombre[0].length() && primerNombre[0].length() > tercerNombre[0].length()){
            System.out.println(primerNombre[0] + " tiene el nombre más largo");
        }else if(segundoNombre[0].length() > primerNombre[0].length() && segundoNombre[0].length() > tercerNombre[0].length()){
            System.out.println(segundoNombre[0] + " tiene el nombre más largo");
        }else{
            System.out.println(tercerNombre[0] + " tiene el nombre más largo");
        }
}
}
