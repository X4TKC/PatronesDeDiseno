package SegundoParcialClase.state.example;


public class Client {

    public static void main(String arg[]) throws InterruptedException {

        IState state =   FactoryState.make(EnumState.Bloqueado,"asdasd");
        IState state2 =  FactoryState.make(EnumState.Bloqueado,"asdasd");
        IState state3 =  FactoryState.make(EnumState.Bloqueado,"asdasd");
        IState state4 =  FactoryState.make(EnumState.Bloqueado,"asdasd");
        IState state5 =  FactoryState.make(EnumState.Bloqueado,"tovilas");
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
            state =  FactoryState.make(EnumState.Desbloqueado,"");;
            celular.setState(state);
            celular.request();
        }

    }

}
