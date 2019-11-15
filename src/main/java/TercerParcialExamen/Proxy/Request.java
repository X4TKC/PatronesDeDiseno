package TercerParcialExamen.Proxy;



public class Request {
	private int montoActual;
	private int montoCompra;
	private enumMoneda moneda;
	
	public Request(int montoActual, int montoCompra, enumMoneda moneda) {

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

	public enumMoneda getMoneda() {
		return moneda;
	}

	public void setMoneda(enumMoneda moneda) {
		this.moneda = moneda;
	}
	
	
	
}
