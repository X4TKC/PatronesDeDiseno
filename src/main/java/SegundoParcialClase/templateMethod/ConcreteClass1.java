package SegundoParcialClase.templateMethod;

public class ConcreteClass1 extends AbstractClass {
    @Override
    void method1() {
        System.out.println("method1");
    }

    @Override
    void method2() {
        System.out.println("method2");

    }
    @Override
    public void templateMethod2(){System.out.println("Template Method2 Override");}
}
