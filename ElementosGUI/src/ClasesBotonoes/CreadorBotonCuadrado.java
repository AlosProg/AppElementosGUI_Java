
package ClasesBotonoes;

/*Clase Creador concreto de boton redondo que extiende de la clase abstracta CreadorBotones
e implementará el método fábrica que crea botones
 */
public class CreadorBotonCuadrado extends CreadorBotones {

    @Override
    public Boton crearBoton() { // método que crea el objeto botón cuadrado
        System.out.println("Creando el boton cuadrado ...");
        return new BotonCuadrado();
    }

    
}
