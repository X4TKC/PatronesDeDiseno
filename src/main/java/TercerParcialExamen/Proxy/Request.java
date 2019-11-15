package TercerParcialExamen.Proxy;



public class Request {
	private int montoActual;
	private int montoCompra;
	private Client.Monedas moneda;
	
	public Request(int montoActual, int montoCompra, Client.Monedas moneda) {
		super();
		this.montoActual = montoActual;
		this.montoCompra = montoCompra;
		this.moneda = moneda;
	}

	public int getMontoActual() {
		return montoActual;
	}

	public void setMontoActual(int montoActual) {
		this.montoActual = montoActual;
	}

	public int getMontoCompra() {
		return montoCompra;
	}

	public void setMontoCompra(int montoCompra) {
		this.montoCompra = montoCompra;
	}

	public Client.Monedas getMoneda() {
		return moneda;
	}

	public void setMoneda(Client.Monedas moneda) {
		this.moneda = moneda;
	}
	
	
	
}
