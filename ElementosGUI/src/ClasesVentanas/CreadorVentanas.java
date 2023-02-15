
package ClasesVentanas;

import InterfacesGenerales.*;
import java.util.ArrayList;

/*Clase abstracta que representa al Creador. Tiene el método de fábrica abstracto de creación que será implementado por
las clases creadoras concretas. Además contine el patron COMPOSITE ya que estara formada por un conjunto de ventanas
 */
public abstract class CreadorVentanas implements CreadorElemGUI{
    private static ArrayList<CreadorElemGUI> listaVentanas = new ArrayList<>(); // lista de ventanas para hacer patron Composite
    
    public static void getCantidadVentanas(){ // metodo que almacena las ventanas creadas y muestra la cantidad
        // es estatico porque al ser la clase CreadorVentanas abstracta no se pueden instanciar objetos de esta y
        // asi se puede poner el metodo de forma directa en la clase Cliente
        int contador = 0;
        for (CreadorElemGUI ventana : listaVentanas) {
            contador+=1;
        }
        System.out.println("La cantidad de ventanas creadas son " + contador);
    }
    public abstract Ventana crearVentana(); // metodo sin implementar para crear ventanas de cualquier tipo
    
    @Override
    public void mostrarElemGUI() { // metodo fabrica que muestra la ventana creada
        Ventana ventana = crearVentana();
        ventana.mostrarVentana();
    }
    @Override
    public void addElemGUI(CreadorElemGUI elem) {// metodo que añade la ventana creada a la lista
        listaVentanas.add(elem);
    }

    @Override
    public void borrarElemGUI(CreadorElemGUI elem) {// metodo que borra de la lista una ventana creada
        listaVentanas.remove(elem);
    }
}
