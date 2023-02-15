
package ClasesVentanas;

/*Clase que muestra la ventana normal concreta e implementa el método de la interfaz Ventana
 */
public class VentanaNormal implements Ventana {

    @Override
    public void mostrarVentana() {// Método que mostrará el objeto ventana normal
        int n = 26;
        System.out.println("Mostrando la ventana normal:");
        for (int i = 0; i < n; i++){
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < 8; i++){
            System.out.print("|");
            for (int j = 0; j < n-2; j++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
        for (int i = 0; i < n;i++){
            System.out.print("-");
        }
        System.out.println();
    }
}
