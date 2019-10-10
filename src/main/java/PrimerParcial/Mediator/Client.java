package PrimerParcial.Mediator;

public class Client {

    public static void main(String[] args){
        TeamChat chat = new TeamChat();
        SpecificTeam equipoA = new SpecificTeam("equipo A");
        SpecificPlayer jugadorA1 = new SpecificPlayer("jugadorA1",equipoA,chat);
        SpecificPlayer jugadorA2 = new SpecificPlayer("jugadorA2",equipoA,chat);
        SpecificPlayer jugadorA3 = new SpecificPlayer("jugadorA3",equipoA,chat);
        SpecificTeam equipoB = new SpecificTeam("equipo B");
        SpecificPlayer jugadorA4 = new SpecificPlayer("jugadorA4",equipoB,chat);
        SpecificPlayer jugadorA5 = new SpecificPlayer("jugadorA5",equipoB,chat);
        SpecificPlayer jugadorA6 = new SpecificPlayer("jugadorA6",equipoB,chat);

        jugadorA1.send("asdasd",jugadorA4);
       jugadorA2.send("asdasd",jugadorA3);
       jugadorA5.send("asdasd",jugadorA1);
       jugadorA6.send("asdasd",jugadorA2);
       jugadorA1.send("Hola a todos", null);
    }
}
