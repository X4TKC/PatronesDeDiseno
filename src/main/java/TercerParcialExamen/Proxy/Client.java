package TercerParcialExamen.Proxy;

public class Client {
	enum Monedas {Bolivianos, Dolares, Euros};
	
	public static void main(String[] args) {
		ITarjeta proxy = new Proxy(new Request(13,8, Monedas.Dolares));
		ITarjeta proxy2 = new Proxy(new Request(5,25, Monedas.Euros));
		ITarjeta proxy3 = new Proxy(new Request(136,130, Monedas.Bolivianos));
		
		proxy.transaccion();
		proxy2.transaccion();
		proxy3.transaccion();
		
	}
}
