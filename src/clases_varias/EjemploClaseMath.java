package clases_varias;
public class EjemploClaseMath {
    public static void main(String[] args) {
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2);    
        System.out.println("max = " + max);

        double min = Math.min(3.5, 1.2);    
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        long redondeo = Math.round(Math.PI);// Redondea dependiendo de 0.5 
        System.out.println("redondeo = " + redondeo);

        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);

        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia ) ;

        double raiz = Math.sqrt(9);
        System.out.println("Raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("grados = " + grados);

        double radianes = Math.toRadians(90);
        System.out.println("radianes = " + radianes);

        System.out.println("sin(90): " + Math.sin(radianes));
        System.out.println("cos(90): " + Math.cos(radianes));
        System.out.println("tan(90): " + Math.tan(radianes));

        radianes = Math.toRadians(180);
        System.out.println("sin(180): " + Math.sin(radianes));
        System.out.println("cos(180): " + Math.cos(radianes));
        System.out.println("tan(180): " + Math.tan(radianes));

        radianes = Math.toRadians(0);
        System.out.println("sin(0): " + Math.sin(radianes));
        System.out.println("cos(0): " + Math.cos(radianes));
        System.out.println("tan(0): " + Math.tan(radianes));

    }

}
