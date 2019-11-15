package TercerParcialExamen.Proxy;



public class Transaccion implements ITarjeta {

	private Request request;
	public Transaccion(Request request) {
		this.request = request;
	}
	@Override
	public void transaccion() {
		
		if (request.getMoneda().equals(enumMoneda.Dolares)) {
			request.setMontoActual(request.getMontoActual()*7);
			request.setMontoCompra(request.getMontoCompra()*7);
			int montoRestante = request.getMontoActual() - request.getMontoCompra();
			System.out.println("Transaccion completada");
			System.out.println("Costo: " + request.getMontoCompra() + "Bs. Saldo actual: " + montoRestante + "Bs.");
		} else if (request.getMoneda().equals(enumMoneda.Euros)) {
			request.setMontoActual(request.getMontoActual()*10);
			request.setMontoCompra(request.getMontoCompra()*10);
			int montoRestante = request.getMontoActual() - request.getMontoCompra();
            System.out.println("Transaccion completada");
            System.out.println("Costo: " + request.getMontoCompra() + "Bs. Saldo actual: " + montoRestante + "Bs.");
		} else {
			int montoRestante = request.getMontoActual() - request.getMontoCompra();
            System.out.println("Transaccion completada");
            System.out.println("Costo: " + request.getMontoCompra() + "Bs. Saldo actual: " + montoRestante + "Bs.");		}
	}

}
