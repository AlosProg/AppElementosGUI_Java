
package InterfacesGenerales;

//import java.util.ArrayList;

/*Interfaz con tres métodos vacios a implementar para añadir un elemento GUI y/o borrarlo
 */
public interface CreadorElemGUI {
    public void addElemGUI(CreadorElemGUI elem);
    public void borrarElemGUI(CreadorElemGUI elem);
    public void mostrarElemGUI();
}
