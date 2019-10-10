package PrimerParcial.Mediator;

abstract class Player {
    protected Chat chat;


    private Team team;
    private String name;

    public String getName() {
        return name;
    }

    public Team getTeam() {
        return team;
    }


    public Player(String name,Team team, Chat chat){
        this.chat=chat;
        this.team=team;

        this.name=name;
        team.addPlayers(this);
    }
    public abstract void send(String msg,Player destino);
    public abstract void messageReceived ( String msg);
}
