package TercerParcialClase.Proxy.basic;
public class RealSubject implements ISubject {

    String attribute;
    public RealSubject(String attribute){
        this.attribute= attribute;
    };
    @Override
    public void request() {
        System.out.println("Request Real Subject: "+this.attribute);
    }
}