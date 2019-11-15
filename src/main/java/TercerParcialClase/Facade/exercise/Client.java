package TercerParcialClase.Facade.exercise;

public class Client {
    public static void main(String[] args){
        SolicitudDePrestamosVivienda solicitud = new SolicitudDePrestamosVivienda("disponibilidad"
        ,enumCooperativas.Cop1,enumBancos.BancoSol);
        solicitud.process();
    }
}
