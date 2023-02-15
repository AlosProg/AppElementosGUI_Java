
package ClasesBotonoes;

import InterfacesGenerales.*;
import java.util.ArrayList;
import java.util.Iterator;

/*Clase abstracta que representa al Creador. Tiene el método de fábrica abstracto de creación que será implementado por
las clases creadoras concretas. Además contine el patron COMPOSITE ya que estara formada por un conjunto de botones
 */
public abstract class CreadorBotones implements CreadorElemGUI{
    private static ArrayList<CreadorElemGUI> listaBotones = new ArrayList<>(); // lista de botones para hacer patron Composite
    
    public static void getCantidadBotones(){ // metodo que almacena los botones creados y muestra la cantidad
        // es estatico porque al ser la clase CreadorBotones abstracta no se pueden instanciar objetos de esta y
        // asi se puede poner el metodo de forma directa en la clase Cliente
        int contador = 0;
        for (CreadorElemGUI boton : listaBotones) {
            contador+=1;
        }
        System.out.println("La cantidad de botones creados son " + contador);
    }
    public abstract Boton crearBoton(); // metodo sin implementar para crear botones de cualquier tipo
    
    @Override
    public void mostrarElemGUI() { // metodo que mostrará el botón creado, es el metodo fabrica
        Boton boton = crearBoton();
        boton.mostrarBoton();
    }
    
    @Override
    public void addElemGUI(CreadorElemGUI elem){// metodo que añade el boton creado a la lista
        listaBotones.add(elem);
    }
    
    @Override
    public void borrarElemGUI(CreadorElemGUI elem){// metodo que borrar un boton creado de la lista
        listaBotones.remove(elem);
    }
}
