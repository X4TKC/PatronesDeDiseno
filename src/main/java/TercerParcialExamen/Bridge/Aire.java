package TercerParcialExamen.Bridge;

public class Aire implements IPaquete {
	public Paquete paquete;
	public int interes = 10;
	public double res = 0;
	
	public Aire(Paquete paquete) {
		super();
		this.paquete = paquete;
	}


	@Override
	public double enviarPaquete() {
		System.out.println("Enviando el paquete: "+this.getPaquete().getNombrePaquete()+" por aire con precio de "+this.paquete.getPrecio());
		res = (interes*this.getPaquete().getPrecio())/100.0;
		System.out.println("El interes del "+interes+"% del paquete es: "+res);
		return this.getPaquete().getPrecio()+res;
	}


	public Paquete getPaquete() {
		return paquete;
	}
	
}
