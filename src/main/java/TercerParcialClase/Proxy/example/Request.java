package TercerParcialClase.Proxy.example;

public class Request {

    private String url;
    private int port;

    public Request(String url, int port){

        this.url=url;
        this.port=port;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }


}
