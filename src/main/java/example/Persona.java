package example;

public class Persona {

    private String accionCanminar;
    private String accionMano;
    private String accionPies;
    private String accionCabeza;

    public Persona(){

    }
    public String getAccionCanminar() {
        return accionCanminar;
    }

    public void setAccionCanminar(String accionCanminar) {
        this.accionCanminar = accionCanminar;
        Logger.getInstance().write("INFO","Caminar "+accionCanminar);
    }

    public String getAccionMano() {
        return accionMano;
    }

    public void setAccionMano(String accionMano) {
        this.accionMano = accionMano;
        Logger.getInstance().write("INFO","Mano "+accionMano);
    }

    public String getAccionPies() {
        return accionPies;
    }

    public void setAccionPies(String accionPies) {
        this.accionPies = accionPies;
        Logger.getInstance().write("INFO","Pies "+accionPies);
    }

    public String getAccionCabeza() {
        return accionCabeza;
    }

    public void setAccionCabeza(String accionCabeza) {
        this.accionCabeza = accionCabeza;
        Logger.getInstance().write("INFO","Cabeza "+accionCabeza);
    }

}
