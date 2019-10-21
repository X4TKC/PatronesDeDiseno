package SegundoParcialExamen.ChainOfResponsability2;

public class Finanzas implements ISolicitud {
	private ISolicitud next;
	@Override
	public void setNext(ISolicitud solicitud) {
		next = solicitud;
	}

	@Override
	public ISolicitud next() {
		return next;
	}

	@Override
	public void criteriaSolicitud(Solicitud solicitud) {
		if (solicitud.getSolicitudes() == enumSolicitud.Costos) {
			System.out.println(solicitud.getTitle() + " Atendida por Finanzas - Relacionado con costos");
		} else {
			next.criteriaSolicitud(solicitud);
		}

	}

}
