package Practica3.ejercicio2;

public class Client {

	public static void main(String[] args) {
		Boleto boleto1 = new Boleto();
		boleto1.setCategoria(" 18+ ");
		boleto1.setCine(" Multicine ");
		boleto1.setNombrePelicula("Joker");
		boleto1.setHora("18:00");
		boleto1.setFuncion("Funcion1");
		boleto1.setNumeroDeAsiento(" H1 ");
		boleto1.setRecomendaciones("Quedarse para ver los creditos");
		System.out.println("Asiento 1 " + boleto1.getNumeroDeAsiento() + boleto1.getCine() + boleto1.getCategoria());
		Boleto boleto2 = (Boleto) boleto1.clone();
		boleto2.setNumeroDeAsiento("H2");
		System.out.println("Asiento 2 " + boleto2.getNumeroDeAsiento() + boleto2.getCine() + boleto2.getCategoria());

		Boleto boleto3 = (Boleto) boleto1.clone();
		boleto3.setNumeroDeAsiento("H3");
		System.out.println("Asiento 3 " + boleto3.getNumeroDeAsiento() + boleto3.getCine() + boleto3.getCategoria());
		
	}

}
