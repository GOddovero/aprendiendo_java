package clases_varias;

import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        String texto = "Hola que tal";

        Class strClass = texto.getClass();

        System.out.println("strClass: " + strClass.getName());
        System.out.println("strClass: " + strClass.getSimpleName());
        System.out.println("strClass: " + strClass.getPackageName());
        System.out.println("strClass:" + strClass);

        for(Method metodo : strClass.getMethods()) {
            System.out.println("metodos de la clase String: " + metodo.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();

        System.out.println("intClass: " + intClass.getName());
        System.out.println("intClass: " + intClass.getSimpleName());
        System.out.println("intClass: " + intClass.getPackageName());
        System.out.println("intClass: " + intClass);

        System.out.println("intClass: " + intClass.getSuperclass());
        System.out.println("intClass: " + objClass);
        for(Method metodo : objClass.getMethods()) {
            System.out.println("metodos de la clase Object: " + metodo.getName());
        }
    }
}
