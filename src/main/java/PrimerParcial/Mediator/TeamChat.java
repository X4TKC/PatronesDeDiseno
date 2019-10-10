package PrimerParcial.Mediator;

import java.util.ArrayList;

public class TeamChat implements Chat {
    @Override
    public void send(String msg, Player playerDestination,Player playerFrom) {
        Team team= playerFrom.getTeam();

        if(team.checkTeam(playerDestination)){
            playerDestination.messageReceived(msg);
        }
        else if(playerDestination==null){
            ArrayList<Player> miembros=team.members;
            for (int i = 0; i <miembros.size() ; i++) {
                if(miembros.get(i)!=playerFrom) {
                    miembros.get(i).messageReceived(msg);
                }
            }
        }
        else{
            System.out.println("El jugador " + playerDestination.getName() + " no se encuentra en el mismo equipo que el jugador "+
                    playerFrom.getName());
        }
    }
}

