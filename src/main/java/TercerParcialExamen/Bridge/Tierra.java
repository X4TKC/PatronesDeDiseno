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
		System.out.println("Enviando el paquete: "+this.getPaquete().getNombrePaquete()+" por tierra con precio de: "+this.paquete.getPrecio());
		res = (interes*this.getPaquete().getPrecio())/100.0;
		System.out.println("El interes del "+interes+"% del paquete es: "+res);
		return this.getPaquete().getPrecio()+res;
	}


	public Paquete getPaquete() {
		return paquete;
	}
	
}
