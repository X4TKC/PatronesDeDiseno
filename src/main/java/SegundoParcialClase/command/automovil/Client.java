package SegundoParcialClase.command.automovil;


public class Client {
    public static void main (String[] args){
        Automovil receiver = new Automovil();

        AumentarVelocidad acelerar= new AumentarVelocidad(receiver);
        DisminuirVelocidad desacelerar = new DisminuirVelocidad(receiver);
        IrhaciaAdelante avanzar= new IrhaciaAdelante(receiver);
        IrhaciaAtras retroceder = new IrhaciaAtras(receiver);

        Invoker invoker = new Invoker();

        invoker.setCommand(acelerar,"acelerar");
        invoker.setCommand(desacelerar,"desacelerar");
        invoker.setCommand(avanzar,"avanzar");
        invoker.setCommand(retroceder,"retroceder");

        invoker.runCommands();
        invoker.runCommand("acelerar");
        invoker.runCommand("desacelerar");
        invoker.runCommand("desacelerar");
        invoker.runCommand("desacelerar");
        invoker.runCommand("acelerar");

    }
}
