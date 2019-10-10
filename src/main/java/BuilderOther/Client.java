package BuilderOther;

public class Client {
    public static void main (String[] args){
        Ensablador ensablador = new Ensablador();

        BuilderComputadora computadorai3 = new Computadorai3();
        ensablador.setComputadoraBuilder(computadorai3);
        ensablador.buildComputadora();
        Computadora computadora = ensablador.getComputadora();
        System.out.println(computadora.getMemory());
    }
}
