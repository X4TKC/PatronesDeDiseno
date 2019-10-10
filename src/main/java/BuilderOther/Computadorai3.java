package BuilderOther;

public class Computadorai3 extends BuilderComputadora {

    @Override
    public void buildAttribute1() {
        computadora.setProcesador("I3");
    }

    @Override
    public void buildAttribute2() {
        computadora.setMemory("8gb");
    }

    @Override
    public void buildAttribute3() {
        computadora.setTarjetaVideo("4gb");
    }
}
