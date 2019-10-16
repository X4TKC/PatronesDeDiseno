package SegundoParcialClase.Ejercicio5.Strategy5;


public class AlgoritmoPromedio3 implements IStrategy {
    private int[] notas;
    @Override
    public void execute(int[] notas) {
        this.notas=notas;
        insertionSort(this.notas);
        System.out.println("Algoritmo 3 ejecutado");
    }


    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            // at this point we've exited, so j is either -1
            // or it's at the first element where current >= a[j]
            array[j+1] = current;
        }
    }
}