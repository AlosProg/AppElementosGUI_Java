
package InterfacesGenerales;

/*Interfaz con métodos sin implementar que recorren listas de elementos GUI
 */
public interface Iterador {
    public abstract Object primero();
    public abstract Object siguiente();
    public abstract boolean haTerminado();
    public abstract Object elementoActual();
}
