package SegundoParcialExamen.ChainOfResponsability2;

public class DevOps implements ISolicitud {
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
		if (solicitud.getSolicitudes() == enumSolicitud.Insfraestrutura) {
			System.out.println(solicitud.getTitle() + " Atendida por DevOps - Pide informacion sobre el error");
		} else {
			next.criteriaSolicitud(solicitud);
		}

	}

}
