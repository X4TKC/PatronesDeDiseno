package SegundoParcialClase.Ejercicio5.Strategy5;


public class AlgoritmoPromedio1 implements IStrategy {
    private int[] notas;

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    @Override
    public void execute(int[] notas) {
        this.notas=notas;
       quickSort(this.notas,0,notas.length-1);
        System.out.println("Algoritmo 1 ejecutado");
    }

    static int partition(int[] array, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;

        return counter;
    }

    public void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot-1);
        quickSort(array, pivot+1, end);

    }
}