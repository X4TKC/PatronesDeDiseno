package TercerParcialClase.Proxy.example;

public class Server implements IServer {

    Request request;
    public Server(Request request){
        this.request = request;
    };
    @Override
    public void request() {
        System.out.println("Request Real Subject: "+this.request.getUrl()+" " +this.request.getPort());
    }
}