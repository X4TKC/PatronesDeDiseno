package SegundoParcialClase.strategy.basic;

public class Client {

    public static void main(String[] args){
        Context context = new Context();
        context.setAttribute1(9);
        context.execute();


    }
}