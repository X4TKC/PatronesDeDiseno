package PizzaBuilder;

public class Pizza {
    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getTipoDeQueso() {
        return tipoDeQueso;
    }

    public void setTipoDeQueso(String tipoDeQueso) {
        this.tipoDeQueso = tipoDeQueso;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    private String salsa;
    private String tipoDeQueso;
    private String masa;

}
