package PrimerParcial.prototype;

public class Cellphone implements IPrototype {
	private String modelo = "A1";
	private int peso = 60;
	private int camaraFoco = 10;
	private String camaraLente = "5mp";
	private int imei = 10001;
	private String origen = "Bolivia";

	public Cellphone() {
	}

	@Override
	public Object clone() {
		Cellphone cloneObj = new Cellphone();
		cloneObj.setModelo(this.modelo);
		cloneObj.setPeso(this.peso);
		cloneObj.setCamaraFoco(this.camaraFoco);
		cloneObj.setCamaraLente(this.camaraLente);
		cloneObj.setImei(this.imei);
		cloneObj.setOrigen(this.origen);
		return cloneObj;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getCamaraFoco() {
		return camaraFoco;
	}

	public void setCamaraFoco(int camaraFoco) {
		this.camaraFoco = camaraFoco;
	}

	public String getCamaraLente() {
		return camaraLente;
	}

	public void setCamaraLente(String camaraLente) {
		this.camaraLente = camaraLente;
	}

	public int getImei() {
		return imei;
	}

	public void setImei(int imei) {
		this.imei = imei;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

}
