package TercerParcialExamen.Bridge;

public class EmpresaSA implements IEmpresa {
	private IPaquete paquete;

	public EmpresaSA(IPaquete paquete) {
		super();
		this.paquete = paquete;
	}

	@Override
	public void enviar() {
		System.out.println("Empresa SA");
		System.out.println("El monto que se tiene que pagar es: "+this.paquete.enviarPaquete());

	}

}
