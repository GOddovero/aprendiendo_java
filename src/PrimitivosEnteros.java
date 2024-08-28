public class PrimitivosEnteros {
    public static void main(String[] args) {
        
        byte numeroByte = 127;

        System.out.println("numeroByte:" + numeroByte);
        System.out.println("Tipo byte corresponde en byte a: " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a: " + Byte.SIZE);
        System.out.println("el valor maximo de un byte es: " + Byte.MAX_VALUE);
        System.out.println("el valor minimo de un byte es: " + Byte.MIN_VALUE);
        
        short numeroShort = 32767;

        System.out.println("numeroShort:" + numeroShort);
        System.out.println("Tipo short corresponde en byte a: " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a: " + Short.SIZE);
        System.out.println("el valor maximo de un short es: " + Short.MAX_VALUE);
        System.out.println("el valor minimo de un short es: " + Short.MIN_VALUE);

        int numeroInt = 2147483647;

        System.out.println("numeroInt:" + numeroInt);
        System.out.println("Tipo int corresponde en byte a: " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a: " + Integer.SIZE);
        System.out.println("el valor maximo de un int es: " + Integer.MAX_VALUE);
        System.out.println("el valor minimo de un int es: " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L; // siempre lleva la L atras

        System.out.println("numeroLong:" + numeroLong);
        System.out.println("Tipo long corresponde en byte a: " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a: " + Long.SIZE);
        System.out.println("el valor maximo de un long es: " + Long.MAX_VALUE);
        System.out.println("el valor minimo de un long es: " + Long.MIN_VALUE);


        var numeroVar = 127; //Siempre es INT, excepto que se indique con una L, F o D.
        System.out.println(numeroVar);
    }
}
