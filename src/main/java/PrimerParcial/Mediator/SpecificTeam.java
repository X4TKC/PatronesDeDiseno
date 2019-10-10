package PrimerParcial.Mediator;

public class SpecificTeam extends Team {
    public SpecificTeam(String name) {
        super(name);
    }

    @Override
    public void addPlayers(Player player) {
        members.add(player);
    }

    @Override
    public boolean checkTeam( Player destino) {
        //System.out.println("Un miembro del equipo "+ this.getName()+" mando un mensaje ");

        for (int i = 0; i < members.size(); i++) {

            if(members.get(i)==destino){

                return true;
            }

        }
        return false;
    }
}
