package Practica3.ejercicio3;

public class Mediana extends FrituraBuilder {

	@Override
	public void buildGaseosas() {
		fritura.setGaseosa("2 medianas");

	}

	@Override
	public void buildChocolate() {
		fritura.setPipoca("Mediana");

	}

	@Override
	public void buildPipoca() {
		fritura.setChocolates("Cantidad 0, precio 30");

	}

}
