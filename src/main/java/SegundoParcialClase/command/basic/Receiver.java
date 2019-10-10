package SegundoParcialClase.command.basic;

public class Receiver {

    private String attribute1 = "default";

    private int attribute2=100;

    public void operation1(){
        System.out.println("[COMMAND ---> Operacion1] "+attribute1+" "+attribute2);
    }
    public void operation2(){
        System.out.println("[COMMAND ---> Operacion2] "+attribute1+" "+attribute2);
    }
}
