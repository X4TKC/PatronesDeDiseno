package Practica3.ejercicio1;

public class Client {

	public static void main(String[] args) {
		FactoryPelicula.make(Peliculas.Terror).create();
		FactoryPelicula.make(Peliculas.Drama).create();
		FactoryPelicula.make(Peliculas.Accion).create();

	}

}
