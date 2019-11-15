package TercerParcialClase.Adapter.basic;

public class ConcreteB implements IAdapter {
    @Override
    public void method1() {
        System.out.println("B enfermedad1");
    }

    @Override
    public void method2() {
        System.out.println("B enfermedad2");
    }

    @Override
    public void method3() {
        System.out.println("B method3");
    }
}