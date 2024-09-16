/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesort;

/**
 *
 * @author medin
 */
public class BubbleSort {
    
    // Método que realiza la ordenación utilizando el algoritmo de burbuja
    public static void sort(int[] arr) {
        int n = arr.length;
        boolean intercambio;
        
        for (int i = 0; i < n - 1; i++) {
            intercambio = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (less(arr[j + 1], arr[j])) {
                    exch(arr, j, j + 1);
                    intercambio = true;
                    
                    // Mostramos el arreglo después de cada intercambio
                    System.out.println("Intercambio entre arr[" + j + "] y arr[" + (j + 1) + "]:");
                    show(arr);
                }
            }
            
            // Si no hubo intercambios, el arreglo ya está ordenado
            if (!intercambio) break;
        }
    }

    // Método privado para comparar dos elementos (true si a < b)
    private static boolean less(int a, int b) {
        return a < b;
    }

    // Método privado para intercambiar dos elementos en el arreglo
    private static void exch(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Método público para imprimir el estado actual del arreglo
    public static void show(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}


