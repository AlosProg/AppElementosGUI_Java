
package ClasesVentanas;

/*Clase Creador concreto de  ventana normal que extiende de la clase abstracta CreadorVentanas
e implementará el método fábrica que crea ventanas
 */
public class CreadorVentanaNormal extends CreadorVentanas {

    @Override
    public Ventana crearVentana() {// método que crea el objeto ventana normal
        System.out.println("Creando la ventana normal...");
        return new VentanaNormal();
    }
    
}
