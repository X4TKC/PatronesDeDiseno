package Practica3.ejercicio3;

public class Gigante extends FrituraBuilder {

	@Override
	public void buildGaseosas() {
		fritura.setGaseosa("2 grandes");

	}

	@Override
	public void buildChocolate() {
		fritura.setPipoca("Gigante");
	}

	@Override
	public void buildPipoca() {
		fritura.setChocolates("cantidad 2, precio 50");
	}

}
