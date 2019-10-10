package mediator.roomchat;

import java.util.ArrayList;

public class chatGeneral implements IChat {
   // private PersonSpecific user1;

    private ArrayList<Persona> users= new ArrayList<>();


    public void addUsers(Persona user){
        users.add(user);
    }
    @Override
    public void send(String msg, Persona persona, String destino) {
        for (int i = 0; i < users.size(); i++) {
            if (destino.equals("")) {


                if (persona.getName().equals(users.get(i).getName())) {
                    users.get(i).messageReceived(msg);

                } else if (persona.getName().equals(users.get(i).getName())) {
                    users.get(i).messageReceived(msg);
                } else if (persona.getName().equals(users.get(i).getName())) {
                    users.get(i).messageReceived(msg);
                }

            } else if (destino.equals(users.get(i).getName())) {
                users.get(i).messageReceived(msg);
            } else if (destino.equals(users.get(i).getName())) {
                users.get(i).messageReceived(msg);
            } else if (destino.equals(users.get(i).getName())) {
                users.get(i).messageReceived(msg);
            }

        }
    }

}
