package SegundoParcialExamen.ChainOfResponsability2;

public class Client {

	public static void main(String[] args) {
		ServicioSoftware service = new ServicioSoftware();
		
		service.criteriaSolicitud(new Solicitud("Solicitud 1", enumSolicitud.Insfraestrutura));
		service.criteriaSolicitud(new Solicitud("Solicitud 2", enumSolicitud.Mejora));
		service.criteriaSolicitud(new Solicitud("Solicitud 3", enumSolicitud.Bug));
		service.criteriaSolicitud(new Solicitud("Solicitud 4", enumSolicitud.NuevaFuncionalidad));
		service.criteriaSolicitud(new Solicitud("Solicitud 5", enumSolicitud.Costos));
		service.criteriaSolicitud(new Solicitud("Solicitud 6", enumSolicitud.OtraSolicitud));

	}

}
