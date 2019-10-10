package PrimerParcial.abstractFactory;

import PrimerParcial.abstractFactory.FactoryControles.Elementos;

public class Controles {
	
	public static void main(String []args) {
		
		System.out.println("Build : ");
			
		for(Elementos e: Elementos.values()) {
			FactoryControles.make(e).operation();	
		}
		FactoryControles.make(Elementos.Table).operation();
			
		FactoryControles.make(Elementos.Link).operation();
			
		}

}
