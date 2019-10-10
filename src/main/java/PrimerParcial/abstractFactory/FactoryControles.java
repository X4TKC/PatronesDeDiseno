package PrimerParcial.abstractFactory;

public class FactoryControles {
	
	public static AbsControles make(Elementos c) {
		AbsControles elemento;
		
		switch(c) {
			case TextBox:
				elemento = new TextBox();
				break;
			
			case Table:
				elemento = new Table();
				break;
				
			case Link:
				elemento = new Link();
				break;
				
			case ComboBox:
				elemento = new ComboBox();
				break;
				
			case CheckBox:
				elemento = new CheckBox();
				break;
			
			default:
				elemento = new Table();
				break;
		}
		
		return elemento;
	}
	
	enum Elementos{
		CheckBox, ComboBox, Link, Table, TextBox
	}

}
