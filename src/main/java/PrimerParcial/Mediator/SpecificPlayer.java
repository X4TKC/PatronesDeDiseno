package PrimerParcial.Mediator;

public class SpecificPlayer extends Player {
    public SpecificPlayer(String name,Team team, Chat chat) {
        super(name,team, chat);
    }

    @Override
    public void send(String msg, Player destino) {
        System.out.println("Jugador "+ this.getName()+ " mando el mensaje "+ msg);
        chat.send(msg,destino,this);
    }

    @Override
    public void messageReceived(String msg) {
        System.out.println(this.getName()+" recibio el mensaje "+ msg);
    }
}
