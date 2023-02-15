
package ClasesCajasTexto;

/*Clase que muestra la caja de texto multilinea concreta e implementa el método de la interfaz CajaTexto
 */
public class CajaTextoMultilinea implements CajaTexto{

    @Override
    public void mostrarCajaTexto() {//algoritmo de la caja de texto multilinea
        int n = 14;
        System.out.println("Mostrando caja de texto multilinea:");
        for (int i = 0; i < n; i++){
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < 3; i++){
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
