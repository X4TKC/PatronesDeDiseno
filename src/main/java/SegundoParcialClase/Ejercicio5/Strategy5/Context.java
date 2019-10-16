package SegundoParcialClase.Ejercicio5.Strategy5;

public class Context {


    private IStrategy strategy;
    private int[] notas;
    private int promedio;

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public IStrategy getStrategy() {
        return strategy;
    }
    public void setAttribute1(int[] notas){
        this.notas=notas;
        setPromedio();
        if(this.promedio>=90)
            defineStrategy1();
        else if(this.promedio>=80)
            defineStrategy2();
        else
            defineStrategy3();
    }

    public void defineStrategy1() {
        this.strategy = new AlgoritmoPromedio1();
    }
    public void defineStrategy2() {
        this.strategy = new AlgoritmoPromedio2();
    }
    public void defineStrategy3() { this.strategy = new AlgoritmoPromedio3();}

    public Context(){
    }

    public void execute(){
        strategy.execute(notas);
    }
    public void setPromedio(){
        int var=0;
        for (int i = 0; i < notas.length; i++) {
            var=var+notas[i];
        }
        promedio=var/notas.length;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
}