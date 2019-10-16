package SegundoParcialClase.strategy.example;

public class Client {
    public static void main(String[] args){
        Context context = new Context(45,false);

        context.setStrategy();
        context.execute();
        context.setTime(8);
        context.setStrategy();
        context.execute();
        context.setTirolibre(true);
        context.setStrategy();
        context.execute();
        context.setTime(81);
        context.setTirolibre(false);
        context.setStrategy();
        context.execute();
        context.setTime(30);
        context.setStrategy();
        context.execute();

    }
}
