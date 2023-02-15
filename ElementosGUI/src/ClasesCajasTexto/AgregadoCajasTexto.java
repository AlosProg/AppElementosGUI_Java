
package ClasesCajasTexto;

import InterfacesGenerales.*;
import java.util.ArrayList;
import java.util.Iterator;

/*Clase agregado de cajas de texto que crea el iterador de cajas de texto
 */
public class AgregadoCajasTexto implements Agregado{
    
    private ArrayList<CreadorElemGUI> listaCajasTexto = new ArrayList<CreadorElemGUI>();

    @Override
    public Iterador crearIterador() {
        Iterator it = listaCajasTexto.iterator();
        return (Iterador) it;
    }
}
