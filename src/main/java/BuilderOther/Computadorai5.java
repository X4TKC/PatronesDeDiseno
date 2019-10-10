package BuilderOther;

public class Computadorai5 extends BuilderComputadora {
    @Override
    public void buildAttribute1() {
        computadora.setProcesador("I5");
    }

    @Override
    public void buildAttribute2() {
        computadora.setMemory("16gb");
    }

    @Override
    public void buildAttribute3() {
        computadora.setTarjetaVideo("6gb");
    }
}
