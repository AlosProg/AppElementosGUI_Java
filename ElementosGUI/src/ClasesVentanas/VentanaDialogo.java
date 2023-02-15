
package ClasesVentanas;

/*Clase que muestra la ventana dialogo concreta e implementa el método de la interfaz Ventana
 */
public class VentanaDialogo implements Ventana {

    @Override
    public void mostrarVentana() {
        int n = 26;
        System.out.println("Mostrando ventana dialogo:");
        for (int i = 0; i < n; i++){
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < 8; i++){
            System.out.print("|");
            for (int j = 0; j < n-2; j++){
                System.out.print("X");
            }
            System.out.println("|");
        }
        for (int i = 0; i < n;i++){
            System.out.print("-");
        }
        System.out.println();
    }

    
    
}
