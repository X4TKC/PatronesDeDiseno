package TercerParcialExamen.Bridge;

public class Tierra implements IPaquete {
	public Paquete paquete;
	public int interes = 5;
	public double res = 0;
	
	public Tierra(Paquete paquete) {
		super();
		this.paquete = paquete;
	}


	@Override
	public double enviarPaquete() {
		System.out.println("Paquete: "+this.getPaquete().getNamePackage()+" por tierra, Precio: "+this.paquete.getPrecio());
		res = (interes*this.getPaquete().getPrecio())/100.0;
		System.out.println("Interes: "+interes+"% Se adicionara: "+res);
		return this.getPaquete().getPrecio()+res;
	}


	public Paquete getPaquete() {
		return paquete;
	}
	
}
