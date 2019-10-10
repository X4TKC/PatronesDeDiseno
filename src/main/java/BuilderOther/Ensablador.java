package BuilderOther;

public class Ensablador {
    private BuilderComputadora computadoraBuilder;


    public void setComputadoraBuilder(BuilderComputadora builder){computadoraBuilder=builder; }

    public Computadora getComputadora(){return computadoraBuilder.getComputadora();}

    public void buildComputadora(){
        computadoraBuilder.createComputadora();
        computadoraBuilder.buildAttribute1();
        computadoraBuilder.buildAttribute2();
        computadoraBuilder.buildAttribute3();
    }
}
