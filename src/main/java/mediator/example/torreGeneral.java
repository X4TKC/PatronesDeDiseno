package mediator.example;

public class torreGeneral implements ITorre {
    private Vuelo7E7 user1;
    private Vuelo112 user2;
    private Vuelo747 user3;
    private Vuelo1011 user4;

    public void setVuelo7E7(Vuelo7E7 vuelo7e7){
        user1=vuelo7e7;
    }
    public void setVuelo112(Vuelo112 vuelo112){
        user2=vuelo112;
    }
    public void setVuelo747(Vuelo747 vuelo747){
        user3=vuelo747;
    }
    public void setVuelo1011(Vuelo1011 vuelo1011){
        user4=vuelo1011;
    }
    @Override
    public void send(String msg, Vuelo vuelo, String nombre) {
        if (nombre.equals("vuelo747")){
            user3.messageReceived(msg);
        }else if(nombre.equals("vuelo112")){
            user2.messageReceived(msg);
        }
        else if(nombre.equals("vuelo7E7")){
            user1.messageReceived(msg);
        }
        else if(nombre.equals("vuelo1011")){
            user4.messageReceived(msg);
        }
        else if(nombre.equals("")){
            if(vuelo.getName().equals("vuelo747")){
                user1.messageReceived(msg);
                user2.messageReceived(msg);

                user4.messageReceived(msg);
            }
            else if(vuelo.getName().equals("vuelo112")){
                user1.messageReceived(msg);
                user3.messageReceived(msg);

                user4.messageReceived(msg);
            }
            else if(vuelo.getName().equals("vuelo7E7")){
                user2.messageReceived(msg);
                user3.messageReceived(msg);

                user4.messageReceived(msg);
            }
            else if(vuelo.getName().equals("vuelo1011")){
                user1.messageReceived(msg);
                user3.messageReceived(msg);

                user2.messageReceived(msg);
            }

        }
    }
}
