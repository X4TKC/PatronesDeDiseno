package SegundoParcialExamen.Command3;

public class Disparar implements IAccion {
    private Game game;

    public Disparar(Game game) {
        this.game = game;
    }

    public void execute() {
        this.game.disparar();
    }
}
