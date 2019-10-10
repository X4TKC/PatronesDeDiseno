package Practica3.ejercicio1;

enum Peliculas {
	Accion, Comedia, Drama, Terror
}

public class FactoryPelicula {

	public static Pelicula make(Peliculas type) {
		Pelicula pelicula;

		switch (type) {
		case Accion:
			pelicula = new Accion();
			break;
		case Comedia:
			pelicula = new Comedia();
			break;
		case Drama:
			pelicula = new Drama();
			break;
		case Terror:
			pelicula = new Terror();
			break;
		default:
			pelicula = new Accion();
			break;
		}
		return pelicula;
	}

}
