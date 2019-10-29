package TercerParcialClase.Proxy.example;

public class Proxy implements IServer {
    private Request request;
    private Server server;

    public Proxy (Request attribute1){
        this.request= attribute1;
//        server = new Server(request);
    }

    @Override
    public void request() {
        if (server ==null)
            server = new Server(request);
        //some conditions //filters
        if (request.getPort()==80) {
            this.server.request();
        }else{
            System.out.println("blocked");
        }


    }
}