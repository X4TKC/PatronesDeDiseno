package mediator.roomchat;

public class Client {
    public static void main (String[] args){
        chatGeneral chat = new chatGeneral();

        PersonSpecific user1 = new PersonSpecific("Pedro",chat);
        PersonSpecific user2 = new PersonSpecific("Juan",chat);
        PersonSpecific user3 = new PersonSpecific("Valdez",chat);


        chat.addUsers(user1);
        chat.addUsers(user2);
        chat.addUsers(user3);

        user2.send("hola pedro", "Pedro");


    }
}
