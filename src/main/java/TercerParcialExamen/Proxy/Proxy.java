package TercerParcialExamen.Proxy;

public class Proxy implements ITarjeta{

	private Request request;
	private Transaccion transaccion = null;
		
	public Proxy(Request request) {
		this.request = request;
	}
	@Override
	public void transaccion() {
		if(transaccion == null)
			transaccion = new Transaccion(request);
		if (request.getMontoActual() >= request.getMontoCompra() ) {
			this.transaccion.transaccion();
		} else {
			System.out.println("Tu transaccion no pudo ser completada.");
		}
		
	}
	
}
