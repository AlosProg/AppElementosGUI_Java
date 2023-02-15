
package ClasesCajasTexto;

/*Clase Creador concreto de caja de texto de una linea que extiende de la clase abstracta CreadorCajasTexto
e implementará el método fábrica que crea cajas de texto
 */
public class CreadorCajaTextoUnaLinea extends CreadorCajasTexto {

    @Override
    public CajaTexto crearCajaTexto() {// método que crea el objeto caja de texto de una linea
        System.out.println("Creando la caja de texto de una linea ...");
        return new CajaTextoUnaLinea();
    }
    
}
