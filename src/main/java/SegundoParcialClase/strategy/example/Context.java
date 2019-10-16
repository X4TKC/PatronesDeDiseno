package SegundoParcialClase.strategy.example;

public class Context {
    private int time;
    private Boolean tirolibre;
    private final int total=90;
    private IStrategy strategy;


    public Context(int time,boolean tirolibre){
        this.time=time;
        this.tirolibre=tirolibre;
    }
    public void setStrategy(){

        if(tirolibre){
            defineStrategyTiroLibre();
        }
        else{
            if(time<=10&&time>=0){
                defineStrategyAtaque();
            }
            else if(time>=80&&time<=total){
                defineStrategyDefensa();
            }
            else if(time>=45&&time<=50){
                defineStrategyContraGolpe();
            }
        }
    }
    public void defineStrategyAtaque() {
        this.strategy = new Ataque();
    }
    public void defineStrategyDefensa() {
        this.strategy = new Defensa();
    }
    public void defineStrategyTiroLibre() {
        this.strategy = new TiroLibre();
    }
    public void defineStrategyContraGolpe() {
        this.strategy = new Contragolpe();
    }
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Boolean getTirolibre() {
        return tirolibre;
    }

    public void setTirolibre(Boolean tirolibre) {
        this.tirolibre = tirolibre;
    }
    public void execute(){
        strategy.execute();
    }
}
