
package ClasesBotonoes;

/*Clase que muestra el botón cuadrado concreto e implementa el método de la interfaz Boton
 */
public class BotonCuadrado implements Boton{
    
    @Override
    public void mostrarBoton() { // Método que mostrará el objeto botón cuadrado
        int n = 3;
        System.out.println("Mostrando botón cuadrado:");
        for (int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < n-2; i++){
            System.out.print("*");
            for (int j = 0; j < n-2; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < n;i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
