package PrimerParcial.Mediator;

import java.util.ArrayList;

abstract class Team {
    private String name;

    public String getName() {
        return name;
    }

    public ArrayList<Player> getMembers() {
        return members;
    }

    protected ArrayList<Player> members;
public Team(String name){
    this.name=name;
    this.members=new ArrayList<>();
}
    public abstract void addPlayers(Player player);
    public abstract boolean checkTeam(Player destino);
}
