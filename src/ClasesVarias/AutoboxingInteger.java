package ClasesVarias;

public class AutoboxingInteger {

    public static void main(String[] args) {
        Integer[] enteros = {Integer.valueOf(1),2,3,4,5,6,7,8,9,10};

        int suma = 0;

        for(Integer i: enteros){
            if(i % 2 == 0){
                suma += i.intValue(); //No hace falta convertir a primitivo
        }
    }
        System.out.println("La suma es: " + suma);
        suma = 0;
        for(Integer i: enteros){
            if(i % 2 == 0){
                suma += i;
        }
    }
        System.out.println("La suma es: " + suma );
    }
}
