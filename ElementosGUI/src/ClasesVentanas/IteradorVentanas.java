
package ClasesVentanas;

import InterfacesGenerales.*;
import java.util.ArrayList;
import java.util.Iterator;

/*Iterador concreto
 */
public abstract class IteradorVentanas implements Iterador{
    private static ArrayList<Ventana>listaVentanas = new ArrayList<Ventana>();
    private int indice = 0;

    public IteradorVentanas() {
    }

    @Override
    public Ventana primero(){
        indice = 0;
        return listaVentanas.get(indice);
    }

    @Override
    public Ventana siguiente() {
        Iterator it = listaVentanas.iterator();
        if(it.hasNext()){
            return (Ventana) it.next();
        }
        else {
            return null;
        }
    }

    @Override
    public boolean haTerminado() {
        Iterator it = listaVentanas.iterator();
        if(it.hasNext()){
            return true;
        }
        else 
            return false;
    }

    @Override
    public Ventana elementoActual() {
        return listaVentanas.get(indice);
    }
}
