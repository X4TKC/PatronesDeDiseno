package SegundoParcialClase.Ejercicio5.Command3;



public class Client {
    public static void main (String[] args){
        Archivo receiver = new Archivo();

        Copiar copiar= new Copiar(receiver);
        Crear crear = new Crear(receiver);
        Mover mover= new Mover(receiver);
        Renombrar renombrar = new Renombrar(receiver);

        Invoker invoker = new Invoker();

        invoker.setCommand(copiar,"copiar");
        invoker.setCommand(crear,"crear");
        invoker.setCommand(mover,"mover");
        invoker.setCommand(renombrar,"renombrar");

        invoker.runCommands();
        invoker.runCommand("copiar");
        invoker.runCommand("crear");
        invoker.runCommand("crear");
        invoker.runCommand("crear");
        invoker.runCommand("renombrar");

    }
}
