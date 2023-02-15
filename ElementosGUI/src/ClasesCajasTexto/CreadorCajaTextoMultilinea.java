
package ClasesCajasTexto;

/*Clase Creador concreto de caja de texto multilinea que extiende de la clase abstracta CreadorCajasTexto
e implementará el método fábrica que crea cajas de texto multilinea
 */
public class CreadorCajaTextoMultilinea extends CreadorCajasTexto {

    @Override
    public CajaTexto crearCajaTexto() {// método que crea el objeto caja de texto multilinea
        System.out.println("Creando la caja de texto multilinea ...");
        return new CajaTextoMultilinea();
    }
    
}
