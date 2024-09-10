package operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        /*
        los arreglos se pueden declarar de dos formas, declarando los elementos y creando el arreglo 
        o bien creando el arreglo y declarando los elementos

        String[] userNames = new String[3];
        String[] passwords = new String[3];

        userNames[0] = "admin";
        userNames[1] = "gaspar";
        userNames[2] = "test";

        passwords[0] = "admin";
        passwords[1] = "12345";
        passwords[2] = "test";
        
        
        String[] userNames = {"admin", "gaspar", "test"};
        String[] passwords = {"admin", "12345", "test"};
        */

        String[] userNames = {"admin", "gaspar", "test"};
        String[] passwords = {"admin", "12345", "test"};


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el usuario: ");
        String user = scanner.next();

        System.out.println("Ingresa la contrasena: ");
        String pass = scanner.next();

        boolean esAutenticado = false;
        for (int i = 0; i < userNames.length; i++) {
            if (user.equals(userNames[i]) && pass.equals(passwords[i])) {
                esAutenticado = true;
                System.out.println("Autenticado correctamente");
                break;
            }
        }

        if (!esAutenticado) {
            System.out.println("Usuario o contrasena incorrectos");
        }
    }
}
