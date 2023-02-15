
package ClasesCajasTexto;

import InterfacesGenerales.*;
import java.util.ArrayList;

/*Clase abstracta que representa al Creador. Tiene el método de fábrica abstracto de creación que será implementado por
las clases creadoras concretas. Además contine el patron COMPOSITE ya que estara formada por un conjunto de cajas de texto
 */
public abstract class CreadorCajasTexto implements CreadorElemGUI{
    private static ArrayList<CreadorElemGUI> listaCajasTexto = new ArrayList<>(); // lista de botones para hacer patron Composite
    
    public static void getCantidadCajasTexto(){ // metodo que almacena las cajas de texto creadas y muestra la cantidad
        // es estatico porque al ser esta clase abstracta no se pueden instanciar objetos de esta y
        // asi se puede poner el metodo de forma directa en la clase Cliente
        int contador = 0;
        for (CreadorElemGUI cajatexto : listaCajasTexto) {
            contador+=1;
        }
        System.out.println("La cantidad de cajas de texto creadas son " + contador);
    }
    public abstract CajaTexto crearCajaTexto(); // metodo sin implementar para crear cajas de texto de cualquier tipo
    
    @Override
    public void mostrarElemGUI() { // metodo que mostrará la caja de texto creada, es el metodo fabrica
        CajaTexto cajatexto = crearCajaTexto();
        cajatexto.mostrarCajaTexto();
    }
    
    @Override
    public void addElemGUI(CreadorElemGUI elem){// metodo que añade la caja de texto creada a la lista
        listaCajasTexto.add(elem);
    }
    
    @Override
    public void borrarElemGUI(CreadorElemGUI elem){// metodo que borrar una caja de texto creada de la lista
        listaCajasTexto.remove(elem);
    }
}
