
package ClasesVentanas;

/*Clase Creador concreto de ventana dialogo que extiende de la clase abstracta CreadorVentanas
e implementará el método fábrica que crea ventanas
 */
public class CreadorVentanaDialogo extends CreadorVentanas{

    @Override
    public Ventana crearVentana() {
        System.out.println("Creando la ventana diálogo...");
        return new VentanaDialogo();
    }
    
}
