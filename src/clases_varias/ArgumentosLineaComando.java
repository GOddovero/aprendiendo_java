package clases_varias;

public class ArgumentosLineaComando {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No hay argumentos");
            System.exit(-1);
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumento " + i + ": " + args[i]);
        }
    }
}
