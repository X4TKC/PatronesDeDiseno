package SegundoParcialExamen.ChainOfResponsability2;

public class Developer implements ISolicitud {
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
		if (solicitud.getSolicitudes() == enumSolicitud.NuevaFuncionalidad) {
			System.out.println(solicitud.getTitle() + " Atendida por Developer - Estima la nueva funcionalidad");
		} else {
			next.criteriaSolicitud(solicitud);
		}

	}

}
