package TercerParcialClase.Proxy.basic;

public class Proxy implements ISubject {
    private String attribute;
    private RealSubject realSubject=null;

    public Proxy (String attribute1){
        this.attribute= attribute1;
//        realSubject = new Server(attribute);
    }

    @Override
    public void request() {
        if (realSubject==null)
            realSubject = new RealSubject(attribute);
        //some conditions //filters
        if (attribute.contains("filter")) {
            this.realSubject.request();
        }else{
            System.out.println("blocked");
        }


    }
}