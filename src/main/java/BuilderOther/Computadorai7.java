package BuilderOther;

public class Computadorai7 extends BuilderComputadora {
    @Override
    public void buildAttribute1() {
        computadora.setProcesador("I7");
    }

    @Override
    public void buildAttribute2() {
        computadora.setMemory("32gb");
    }

    @Override
    public void buildAttribute3() {
        computadora.setTarjetaVideo("8gb");
    }
}
