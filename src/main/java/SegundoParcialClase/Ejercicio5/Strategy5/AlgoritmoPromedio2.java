package SegundoParcialClase.Ejercicio5.Strategy5;

public class AlgoritmoPromedio2 implements IStrategy {
    private int[] notas;
    @Override
    public void execute(int[] notas) {

        this.notas=notas;
        bubbleSort(this.notas);
        System.out.println("Algoritmo 2 ejecutado");
    }
    public int[] bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }
}