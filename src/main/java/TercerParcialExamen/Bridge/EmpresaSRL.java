package TercerParcialExamen.Bridge;

public class EmpresaSRL implements IEmpresa {
	private IPaquete paquete;

	public EmpresaSRL(IPaquete paquete) {
		super();
		this.paquete = paquete;
	}

	@Override
	public void enviar() {
		System.out.println("Empresa SRL");
		System.out.println("El monto que se tiene que pagar es: "+this.paquete.enviarPaquete());

	}

}
