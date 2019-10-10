package Practica3.ejercicio3;
public class Pequena extends FrituraBuilder{

    @Override
    public void buildGaseosas() {
        fritura.setGaseosa("1");

    }

    @Override
    public void buildChocolate() {
        fritura.setPipoca("Economica");

    }

    @Override
    public void buildPipoca() {
        fritura.setChocolates("Cantidad 0, precio 15");

    }
}
