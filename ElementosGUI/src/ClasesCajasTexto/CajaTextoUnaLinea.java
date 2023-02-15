
package ClasesCajasTexto;

/*Clase que muestra la caja de texto de una linea concreta e implementa el método de la interfaz CajaTexto
 */
public class CajaTextoUnaLinea implements CajaTexto {

    @Override
    public void mostrarCajaTexto() {//algoritmo de la caja de texto de una linea
        int n = 14;
        System.out.println("Mostrando caja de texto de una linea:");
        for (int i = 0; i < n; i++){
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < 1; i++){
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
