package TercerParcialExamen.Bridge;

public class Paquete {
	private String nombrePaquete;
	private int precio;

	public Paquete(String nombrePaquete, int precio) {
		super();
		this.nombrePaquete = nombrePaquete;
		this.precio = precio;
	}

	public String getNombrePaquete() {
		return nombrePaquete;
	}

	public void setNombrePaquete(String nombrePaquete) {
		this.nombrePaquete = nombrePaquete;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
