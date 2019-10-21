package SegundoParcialExamen.Command3;

public class ModoDefensa implements IAccion {
    private Game game;

    public ModoDefensa(Game game) {
        this.game = game;
    }

    public void execute() {
        this.game.modoDefensa();
    }
}
