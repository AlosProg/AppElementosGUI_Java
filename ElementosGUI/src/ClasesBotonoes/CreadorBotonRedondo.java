
package ClasesBotonoes;

/*Clase Creador que concreto de boton redondo que extiende de la clase abstracta CreadorBotones
e implementará el método fábrica que crea botones
 */
public class CreadorBotonRedondo extends CreadorBotones {

    @Override
    public Boton crearBoton() { // método para crear el botón redondo
        System.out.println("Creando el boton redondo ...");
        return new BotonRedondo();
    }
}
