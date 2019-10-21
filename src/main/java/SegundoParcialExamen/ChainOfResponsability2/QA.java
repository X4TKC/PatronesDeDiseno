package SegundoParcialExamen.ChainOfResponsability2;

public class QA implements ISolicitud {
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
		if (solicitud.getSolicitudes() == enumSolicitud.Bug || solicitud.getSolicitudes() == enumSolicitud.Mejora) {
			System.out.println(solicitud.getTitle() + " Atendida por QA - Aisla el error");
		} else {
			next.criteriaSolicitud(solicitud);
		}

	}

}
