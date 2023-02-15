
package ClasesBotonoes;

import InterfacesGenerales.*;
import java.util.ArrayList;
import java.util.Iterator;

/*Clase agregado de botones que crea el iterador de botones
 */
public class AgregadoBotones implements Agregado {
    
    private ArrayList<CreadorElemGUI> listaBotones = new ArrayList<CreadorElemGUI>();

    @Override
    public Iterador crearIterador() {
        Iterator it = listaBotones.iterator();
        return (Iterador)it;
    }
}
