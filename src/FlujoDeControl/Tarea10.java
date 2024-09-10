package FlujoDeControl;

import javax.swing.JOptionPane;

public class Tarea10 {
    public static void main(String[] args) {
        /*
        Para la tarea se requiere un menú para administrar a los productos con las opciones: actualizar, eliminar, crear, listar y salir.
        Para la clase con el método main vamos a contar con un menú para poder seleccionar el tipo de operación, puede ser con la clase Scanner indicando una lista con las opciones, cada opción asociada a un numero.
        O bien! otra forma mucho mejor seria usando la clase JOptionPane para un menú con interfaces
         */
        int opcionIndice = 0;

        while (opcionIndice != 5) {
            String opcionIndiceStr = JOptionPane.showInputDialog(null, "1. Actualizar\n2. Eliminar\n3. Crear\n4. Cargar lista\n5. Salir");
            opcionIndice = Integer.parseInt(opcionIndiceStr);

            switch (opcionIndice){
                case 1:
                    JOptionPane.showMessageDialog(null, "Producto actualizado correctamente");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Producto eliminado correctamente");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Producto creado correctamente");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Cargando la lista de productos");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no disponible");
            }
        }
    }
}
