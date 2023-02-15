
package Cliente;

import ClasesBotonoes.*;
import static ClasesBotonoes.CreadorBotones.getCantidadBotones;
import ClasesCajasTexto.*;
import static ClasesCajasTexto.CreadorCajasTexto.getCantidadCajasTexto;
import ClasesVentanas.*;
import static ClasesVentanas.CreadorVentanas.getCantidadVentanas;
import InterfacesGenerales.Iterador;

/*Clase Cliente que pide todo tipo de elementos GUI
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CreadorBotones boton = new CreadorBotonRedondo(); // se crea el objeto boton que va a crear un boton redondo
        boton.mostrarElemGUI(); // el boton muestra el boton redondo creado
        CreadorBotones boton2 = new CreadorBotonCuadrado();
        boton2.mostrarElemGUI();
        
        boton.addElemGUI(boton);// se añade el primer boton a la lista de botones
        boton2.addElemGUI(boton2);// se añade el segundo boton a la lista de botones
        
        getCantidadBotones();// se saca por pantalla la cantidad de botones creados y añadidos a la lista
        
        boton2.borrarElemGUI(boton2);// se borra 
        
        getCantidadBotones();// se vuelve a sacar por pantalla la cantidad de botones que hay en la lista despues de borrar
        
        CreadorVentanas ventana = new CreadorVentanaNormal();
        ventana.mostrarElemGUI();
        
        CreadorVentanas ventana2 = new CreadorVentanaDialogo();
        ventana2.mostrarElemGUI();
        
        ventana.addElemGUI(ventana);
        ventana2.addElemGUI(ventana2);
        
        getCantidadVentanas();
        
        CreadorCajasTexto caja = new CreadorCajaTextoUnaLinea();
        caja.mostrarElemGUI();
        
        CreadorCajasTexto caja2 = new CreadorCajaTextoMultilinea();
        caja2.mostrarElemGUI();
        
        caja.addElemGUI(caja);
        caja2.addElemGUI(caja2);
        
        getCantidadCajasTexto();
        
        //LA PARTE QUE HAY A CONTINUACIÓN (ITERADORES) NO ME FUNCIONA
        
        /*AgregadoBotones agregado1 = new AgregadoBotones();
        
        Iterador iterador = agregado1.crearIterador();
        
        Boton bot = (Boton) iterador.primero();
        
        System.out.println(bot);*/
        
        
        
    }
    
}


