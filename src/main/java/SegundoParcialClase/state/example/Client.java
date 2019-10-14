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
        celular.request();
        Thread.sleep(1000);
        celular.setState(state2);
        celular.request();
        celular.request();
        celular.request();
        celular.request();
        Thread.sleep(2000);
        celular.setState(state3);
        celular.request();
        celular.request();
        celular.request();
        celular.request();
        Thread.sleep(7000);
        celular.setState(state4);
        celular.request();
        celular.request();
        celular.request();
        Thread.sleep(8000);
        celular.request();
        celular.setState(state5);
        celular.request();
        celular.request();



        if(((Bloqueado) state5).isComprobante()) {
            state = new Desbloqueado();
            celular.setState(state);
            celular.request();
        }
    }
}
