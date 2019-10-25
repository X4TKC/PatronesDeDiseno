package TercerParcialClase.Adapter.basic;

public class ConcreteAdapter implements IAdapter {
    Adaptee adaptee = new Adaptee();
    public ConcreteAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void method1() {
        adaptee.method1Different();
    }

    @Override
    public void method2() {
        adaptee.method2Different();
    }

    @Override
    public void method3() {
        adaptee.method3Different();
    }
}