package SegundoParcialClase.state.example;

public class Desbloqueado implements IState {


    @Override
    public void handle() {
        this.llamar();
        this.jugar();
        this.sacarFotos();
    }
    public void llamar(){
        System.out.println("Llamando");
    }
    public void jugar(){
        System.out.println("Jugando");

    }
    public void sacarFotos(){
        System.out.println("Camara activada");
    }


}
