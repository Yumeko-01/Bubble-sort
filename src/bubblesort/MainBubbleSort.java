/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesort;

/**
 *
 * @author medin
 */
public class MainBubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

        
        System.out.println("Arreglo original: ");
        BubbleSort.show(arr);  // Mostramos el arreglo antes de ordenar

        // Ordenamos el arreglo usando el algoritmo de burbuja
        BubbleSort.sort(arr);

        System.out.println("Arreglo ordenado: ");
        BubbleSort.show(arr);  // Mostramos el arreglo después de ordenar
    }
    
}
