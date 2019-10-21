package SegundoParcialExamen.ChainOfResponsability2;

public interface ISolicitud {
	 void setNext(ISolicitud severidad);
	 ISolicitud next();
	 void criteriaSolicitud(Solicitud solicitud);
}
