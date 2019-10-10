package PrimerParcial.builder;

public class Parrillas {
    private String tipoCarne = "";
    private String saborRefresco = "";
    private String guarniciones = "";

    public Parrillas() {

        tipoCarne = "Bife";
    }

    public Parrillas(String type) {
        tipoCarne = type;
    }

//    public void Bife() {
//        tipoCarne = "Bife";
//
//    }
//
//    public void Lomito() {
//        tipoCarne = "Lomo";
//    }
//
//    public void Tira() {
//        tipoCarne = "Tira de Carne";
//    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String attribute1) {
        this.tipoCarne = attribute1;
    }

    public String getSaborRefresco() {
        return saborRefresco;
    }

    public void setSaborRefresco(String attribute2) {
        this.saborRefresco = attribute2;
    }

    public String getGuarniciones() {
        return guarniciones;
    }

    public void setGuarniciones(String attribute3) {
        this.guarniciones = attribute3;
    }

}
