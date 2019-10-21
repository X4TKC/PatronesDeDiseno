package SegundoParcialExamen.ChainOfResponsability2;

public class ServicioSoftware implements ISolicitud {
	private ISolicitud next;
	@Override
	public void setNext(ISolicitud severidad) {
		next = severidad;
	}

	@Override
	public ISolicitud next() {
		return next;
	}

	@Override
	public void criteriaSolicitud(Solicitud solicitud) {
		DevOps devOps = new DevOps();
		this.setNext(devOps);
		
		QA qa = new QA();
		devOps.setNext(qa);
		
		Developer developer = new Developer();
		qa.setNext(developer);
		
		Finanzas finanzas = new Finanzas();
		developer.setNext(finanzas);
		
		Support support = new Support();
		finanzas.setNext(support);
		
		next.criteriaSolicitud(solicitud);
	}

}
