package TercerParcialExamen.Proxy;



public class Transaccion implements ITarjeta {

	Request request;
	
	
	public Transaccion(Request request) {
		this.request = request;
	}


	@Override
	public void transaccion() {
		
		if (request.getMoneda().equals(Client.Monedas.Dolares)) {
			request.setMontoActual(request.getMontoActual()*7);
			request.setMontoCompra(request.getMontoCompra()*7);
			int montoRestante = request.getMontoActual() - request.getMontoCompra();
			System.out.println("Se realizo la compra con costo de " + request.getMontoCompra() + "Bs. quedo con un saldo de " + montoRestante + "Bs.");
		} else if (request.getMoneda().equals(Client.Monedas.Euros)) {
			request.setMontoActual(request.getMontoActual()*6);
			request.setMontoCompra(request.getMontoCompra()*6);
			int montoRestante = request.getMontoActual() - request.getMontoCompra();
			System.out.println("Se realizo la compra con costo de " + request.getMontoCompra() + "Bs. quedo con un saldo de " + montoRestante + "Bs.");
		} else {
			int montoRestante = request.getMontoActual() - request.getMontoCompra();
			System.out.println("Se realizo la compra con costo de " + request.getMontoCompra() + "Bs. quedo con un saldo de " + montoRestante + "Bs.");
		}
	}

}
