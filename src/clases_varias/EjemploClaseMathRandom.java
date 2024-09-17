package clases_varias;

import java.util.Random;

public class EjemploClaseMathRandom {

    public static void main(String[] args) {
    
        String [] colores = {"rojo", "verde", "azul", "amarillo", "morado", "negro"};


        double aleatorio = Math.random(); // va de 0.0 a 0.99999999
        System.out.println("aleatorio = " + aleatorio);

        aleatorio *= colores.length;
        System.out.println("aleatorio = " + aleatorio);

        aleatorio = Math.floor(aleatorio);
        System.out.println("aleatorio = " + aleatorio);

        System.out.println(colores[(int)aleatorio]);


        Random randomObj = new Random();

        int randomInt = 15 + randomObj.nextInt(25-15); // va de 15 a 24
        System.out.println(randomInt);
        
        long randomLong = randomObj.nextLong();
        System.out.println(randomLong);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println(randomInt);
        System.out.println(colores[randomInt]);
    }
}
