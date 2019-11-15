package TercerParcialExamen.Proxy;

public class Client {

	public static void main(String[] args) {
		ITarjeta tarjeta1 = new Proxy(new Request(13,8, enumMoneda.Dolares));
		ITarjeta tarjeta2 = new Proxy(new Request(5,25, enumMoneda.Euros));
		ITarjeta tarjeta3 = new Proxy(new Request(136,130, enumMoneda.Bolivianos));
		
		tarjeta1.transaccion();
		tarjeta2.transaccion();
		tarjeta3.transaccion();
		
	}
}
