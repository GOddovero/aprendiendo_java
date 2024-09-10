package flujo_de_control;

import javax.swing.JOptionPane;

public class SentenciaForArreglo {
    public static void main(String[] args) {
        String[] nombres = new String[6]; // Es lo mismo que String[] nombres = {"Gaspar", "Daniel", "Miguel", "Carlos", "Pedro", "Juan"}

        nombres[0] = "Gaspar";
        nombres[1] = "Daniel";
        nombres[2] = "Miguel";
        nombres[3] = "Carlos";
        nombres[4] = "Pedro";
        nombres[5] = "Juan";
        int count = nombres.length;
        for(int i = 0; i < count; i++){
            if(nombres[i].equalsIgnoreCase("gaspar")){
                continue;
            }
            System.out.println("i = " + nombres[i]);
            }
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Gaspar\" o \"Pedro\"");
        System.out.println(buscar);
        boolean encontrado = false;
        for (int i = 0; i < count ; i++){
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
            }
        }
        if(encontrado){
            System.out.println(buscar + " Encontrado");
        }else{
            System.out.println(buscar + " No encontrado");
        }
    }
}
