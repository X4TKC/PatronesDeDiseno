package TercerParcialExamen.Bridge;

public class Client {

	public static void main(String[] args) {
		Paquete paquete1 = new Paquete("paquete de galletas", 70);
		Paquete paquete2 = new Paquete("paquete de cereales", 120);
		Paquete paquete3 = new Paquete("paquete de chocolate", 500);
		
		Aire aire = new Aire(paquete1);
		Tierra tierra = new Tierra(paquete2);
		Mar mar = new Mar(paquete3);
		
		EmpresaSRL empresa1 = new EmpresaSRL(aire);
		EmpresaSA empresa2 = new EmpresaSA(tierra);
		EmpresaSA empresa3 = new EmpresaSA(mar);
		
		empresa1.tipoDeEnvio();
		empresa2.tipoDeEnvio();
		empresa3.tipoDeEnvio();
		
		

	}

}
