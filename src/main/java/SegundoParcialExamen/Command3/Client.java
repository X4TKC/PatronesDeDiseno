package SegundoParcialExamen.Command3;

public class Client {

    public static void main(String[] args) {
        Game game = new Game();
        Disparar disparar = new Disparar(game);
        ModoDefensa defensa = new ModoDefensa(game);
        Atacar atacar = new Atacar(game);
        Invoker invoker = new Invoker();

        invoker.setCommand(disparar);
        invoker.setCommand(defensa);
        invoker.setCommand(atacar);
        invoker.setCommand(disparar);
        invoker.runCommands();
    }
}
