package example;

public class Robot {

    private String accionCanminar;
    private String accionMano;
    private String accionPies;
    private String accionCabeza;

    public Robot(){

    }
    public String getAccionCanminar() {
        return accionCanminar;
    }

    public void setAccionCanminar(String accionCanminar) {
        this.accionCanminar = accionCanminar;
        Logger.getInstance().write("INFO","R Caminar "+accionCanminar);
        Connection.getInstance().save(accionCanminar);

    }

    public String getAccionMano() {
        return accionMano;
    }

    public void setAccionMano(String accionMano) {
        this.accionMano = accionMano;
        Logger.getInstance().write("INFO","R Mano "+accionMano);
        Connection.getInstance().save(accionMano);
    }

    public String getAccionPies() {
        return accionPies;
    }

    public void setAccionPies(String accionPies) {
        this.accionPies = accionPies;
        Logger.getInstance().write("INFO","R Pies "+accionPies);
        Connection.getInstance().save(accionPies);
    }

    public String getAccionCabeza() {
        return accionCabeza;
    }

    public void setAccionCabeza(String accionCabeza) {
        this.accionCabeza = accionCabeza;
        Logger.getInstance().write("INFO","R Cabeza "+accionCabeza);
        Connection.getInstance().save(accionCabeza);
    }



}
