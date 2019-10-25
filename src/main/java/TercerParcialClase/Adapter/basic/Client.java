package TercerParcialClase.Adapter.basic;

public class Client {

    public static void main(String[] args){


        Adaptee adapteeObject= new Adaptee();
        ConcreteAdapter concreteAdapter = new ConcreteAdapter(adapteeObject);
        concreteAdapter.method1();
        concreteAdapter.method2();
        concreteAdapter.method3();

    }
}
