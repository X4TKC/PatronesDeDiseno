package SegundoParcialExamen.ChainOfResponsability2;

public class Solicitud {
	public String title;
	public enumSolicitud solicitudes;

	public Solicitud(String title, enumSolicitud solicitudes) {
		this.title = title;
		this.solicitudes = solicitudes;
	} 

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public enumSolicitud getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(enumSolicitud solicitudes) {
		this.solicitudes = solicitudes;
	}

}
