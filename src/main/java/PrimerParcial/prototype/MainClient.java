package PrimerParcial.prototype;

public class MainClient {

	public static void main(String[] args) {
		Cellphone celular1 = new Cellphone();
		System.out.println("modelo: " + celular1.getModelo() + " peso: " + celular1.getPeso() + " foco: "+celular1.getCamaraFoco() +
				" lente: "+ celular1.getCamaraLente() + " imei: "+ celular1.getImei() + " origen: " +celular1.getOrigen());
	
		Cellphone celular2 = (Cellphone) celular1.clone();
		celular2.setImei(10002);
		System.out.println("modelo: " + celular2.getModelo() + " peso: " + celular2.getPeso() + " foco: "+celular2.getCamaraFoco() +
				" lente: "+ celular2.getCamaraLente() + " imei: "+ celular2.getImei() + " origen: " +celular2.getOrigen());
	
		Cellphone celular3 = (Cellphone) celular1.clone();
		celular3.setImei(10003);
		System.out.println("modelo: " + celular3.getModelo() + " peso: " + celular3.getPeso() + " foco: "+celular3.getCamaraFoco() +
				" lente: "+ celular3.getCamaraLente() + " imei: "+ celular3.getImei() + " origen: " +celular3.getOrigen());
	}

}
