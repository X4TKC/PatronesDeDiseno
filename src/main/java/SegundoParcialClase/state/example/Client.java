package SegundoParcialClase.state.example;


public class Client {

    public static void main(String arg[]) throws InterruptedException {

        IState state = new Bloqueado("asdasd");
        IState state2 = new Bloqueado("asdasd");
        IState state3 = new Bloqueado("asdasd");
        IState state4 = new Bloqueado("asdasd");
        IState state5 = new Bloqueado("tovilas");
        Celular celular = new Celular();
        celular.setState(state);

        celular.request();
        Thread.sleep(1000);
        celular.request();
        Thread.sleep(1000);
        celular.setState(state2);
        celular.request();
        Thread.sleep(1000);
        celular.request();
        Thread.sleep(1000);
        celular.request();
        Thread.sleep(1000);
        celular.request();
        Thread.sleep(1000);
        celular.setState(state3);
        celular.request();
        Thread.sleep(1000);
        celular.request();
        Thread.sleep(1000);
        celular.request();
        Thread.sleep(1000);
        celular.request();
        Thread.sleep(1000);
        celular.setState(state4);
        celular.request();
        Thread.sleep(1000);
        celular.request();
        Thread.sleep(1000);
        celular.request();
        Thread.sleep(1000);
        celular.request();
        Thread.sleep(1000);

        celular.request();
        Thread.sleep(1000);
        celular.request();
        Thread.sleep(1000);
        celular.request();
        Thread.sleep(1000);
        celular.request();
        Thread.sleep(1000);
        celular.request();
        Thread.sleep(1000);
        celular.setState(state5);
        celular.request();
        Thread.sleep(1000);



        if(((Bloqueado) celular.getState()).isComprobante()) {
            state = new Desbloqueado();
            celular.setState(state);
            celular.request();
        }
    }
}
