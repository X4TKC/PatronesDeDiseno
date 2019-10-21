package SegundoParcialExamen.ChainOfResponsability2;

public class Support implements ISolicitud {
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
		if (solicitud.getSolicitudes() == enumSolicitud.OtraSolicitud) {
			System.out.println(solicitud.getTitle() + " Atendida por Support - Otra solicitud");
		}
		else{
		    System.out.println("Tarea no atendida");
        }

	}

}
