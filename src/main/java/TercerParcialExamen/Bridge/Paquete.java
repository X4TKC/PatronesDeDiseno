package TercerParcialExamen.Bridge;

public class Paquete {
	private String namePackage;
	private int precio;

	public Paquete(String namePackage, int precio) {
		super();
		this.namePackage = namePackage;
		this.precio = precio;
	}

	public String getNamePackage() {
		return namePackage;
	}

	public void setNamePackage(String namePackage) {
		this.namePackage = namePackage;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
