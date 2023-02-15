
package ClasesVentanas;

import InterfacesGenerales.*;
import java.util.ArrayList;
import java.util.Iterator;

/*Clase agregado de ventanas que crea el iterador de ventanas
 */

public class AgregadoVentanas implements Agregado{
    
    private ArrayList<CreadorElemGUI> listaVentanas = new ArrayList<CreadorElemGUI>();

    @Override
    public Iterador crearIterador() {
        Iterator it = listaVentanas.iterator();
        return (Iterador) it;
    }
    
}
