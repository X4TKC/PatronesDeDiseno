package TercerParcialClase.Adapter.basic;

public class ConcreteA implements IAdapter {
    @Override
    public void method1() {
        System.out.println("A enfermedad1");
    }

    @Override
    public void method2() {
        System.out.println("A enfermedad2");
    }

    @Override
    public void method3() {
        System.out.println("A method3");
    }
}