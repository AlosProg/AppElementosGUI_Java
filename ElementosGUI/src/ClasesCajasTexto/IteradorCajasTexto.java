
package ClasesCajasTexto;

import InterfacesGenerales.*;
import java.util.ArrayList;
import java.util.Iterator;

/*Iterador concreto
 */
public abstract class IteradorCajasTexto implements Iterador {
    private static ArrayList<CajaTexto>listaCajasTexto = new ArrayList<CajaTexto>();
    private int indice = 0;

    public IteradorCajasTexto() {
    }

    @Override
    public CajaTexto primero(){
        indice = 0;
        return listaCajasTexto.get(indice);
    }

    @Override
    public CajaTexto siguiente() {
        Iterator it = listaCajasTexto.iterator();
        if(it.hasNext()){
            return (CajaTexto) it.next();
        }
        else {
            return null;
        }
    }

    @Override
    public boolean haTerminado() {
        Iterator it = listaCajasTexto.iterator();
        if(it.hasNext()){
            return true;
        }
        else 
            return false;
    }

    @Override
    public CajaTexto elementoActual() {
        return listaCajasTexto.get(indice);
    }
}
