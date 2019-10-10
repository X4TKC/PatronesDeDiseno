package BuilderOther;

public class Computadora {

    private String procesador = "";
    private String memory = "";
    private String tarjetaVideo = "";
    public Computadora(){
        procesador ="core2";
    }
    public Computadora(String type){
        procesador =type;
    }

    public void i3Computadora(){
        procesador ="i3";
    }
    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getTarjetaVideo() {
        return tarjetaVideo;
    }

    public void setTarjetaVideo(String attirbute3) {
        this.tarjetaVideo = attirbute3;
    }

}
