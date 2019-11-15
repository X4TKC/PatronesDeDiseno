package TercerParcialExamen.Bridge;

public class Client {

	public static void main(String[] args) {
		Paquete package1 = new Paquete("package1", 20);
		Paquete package2 = new Paquete("package2", 50);
		Paquete package3 = new Paquete("package3", 250);
		
		Aire aire = new Aire(package1);
		Tierra tierra = new Tierra(package2);
		Mar mar = new Mar(package3);
		
		EmpresaSRL empresa1 = new EmpresaSRL(aire);
		EmpresaSA empresa2 = new EmpresaSA(tierra);
		EmpresaSA empresa3 = new EmpresaSA(mar);
		
		empresa1.enviar();
		empresa2.enviar();
		empresa3.enviar();
		
		

	}

}
