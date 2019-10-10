package SegundoParcialClase.command.exercise;



public class Client {
    public static void main (String[] args){
        Computadora computadora = new Computadora();

        Apagar apagar= new Apagar(computadora);
        Suspender suspender = new Suspender(computadora);
        Reiniciar reiniciar= new Reiniciar(computadora);
        CerrarSesion cerrarSesion = new CerrarSesion(computadora);

        Invoker invoker = new Invoker();

        invoker.setCommand(apagar,"apagar");
        invoker.setCommand(suspender,"suspender");
        invoker.setCommand(reiniciar,"reiniciar");
        invoker.setCommand(cerrarSesion,"cerrarsesion");
        String user="Kevin";
        invoker.runCommands(user);
        invoker.runCommand("apagar",user);
        invoker.runCommand("suspender",user);
        String user2= "Kevin2";
        invoker.runCommand("reiniciar",user2);
        invoker.runCommand("cerrarsesion",user2);
        invoker.runCommand("apagar",user2);

    }
}
