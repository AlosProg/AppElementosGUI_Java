
package ClasesBotonoes;

import InterfacesGenerales.*;
import java.util.ArrayList;
import java.util.Iterator;

/*Iterador concreto
 */
public abstract class IteradorBotones implements Iterador {

    private static ArrayList<Boton>listaBotones;
    private int indice = 0;

    public IteradorBotones() {
    }

    @Override
    public Boton primero(){
        indice = 0;
        return listaBotones.get(indice);
    }

    @Override
    public Boton siguiente() {
        Iterator it = listaBotones.iterator();
        if(it.hasNext()){
            return (Boton) it.next();
        }
        else {
            return null;
        }
    }

    @Override
    public boolean haTerminado() {
        Iterator it = listaBotones.iterator();
        if(it.hasNext()){
            return true;
        }
        else 
            return false;
    }

    @Override
    public Boton elementoActual() {
        return listaBotones.get(indice);
    }
    
}
