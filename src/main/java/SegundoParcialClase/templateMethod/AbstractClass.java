package SegundoParcialClase.templateMethod;

public abstract class AbstractClass {

    abstract void method1();
    abstract void method2();

    public final void templateMethod(){
        System.out.println("Template Method2");
    }
    public void templateMethod2(){
        System.out.println("Template Method2");
    }
}
