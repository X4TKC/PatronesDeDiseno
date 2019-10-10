package Practica3.ejercicio3;

public class Director {
	private FrituraBuilder FrituraBuilder;

	public void setFrituraBuilder(FrituraBuilder builder) {
		FrituraBuilder = builder;
	}

	public Fritura getProducto() {
		return FrituraBuilder.getFritura();
	}

	public void buildProduct() {
		FrituraBuilder.createProduct();
		FrituraBuilder.buildGaseosas();
		FrituraBuilder.buildChocolate();
		FrituraBuilder.buildPipoca();

	}

}
