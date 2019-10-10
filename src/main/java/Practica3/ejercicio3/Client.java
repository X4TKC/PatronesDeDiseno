package Practica3.ejercicio3;

public class Client {

	public static void main(String[] args) {
		Director director = new Director();
		
		FrituraBuilder mediana = new Mediana();
		director.setFrituraBuilder(mediana);
		director.buildProduct();
		System.out.println(director.getProducto().getPipoca());
		
		FrituraBuilder gigante = new Gigante();
		director.setFrituraBuilder(gigante);
		director.buildProduct();
		System.out.println(director.getProducto().getPipoca());
		
		FrituraBuilder pequena = new Pequena();
		director.setFrituraBuilder(pequena);
		director.buildProduct();
		System.out.println(director.getProducto().getPipoca());
	}

}
