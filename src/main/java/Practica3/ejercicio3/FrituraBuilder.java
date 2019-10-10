package Practica3.ejercicio3;

public abstract class FrituraBuilder {
	protected Fritura fritura;

	public Fritura getFritura() {
		return fritura;
	}

	public void createProduct() {
		fritura = new Fritura();
	}

	public abstract void buildGaseosas();

	public abstract void buildChocolate();

	public abstract void buildPipoca();

}
