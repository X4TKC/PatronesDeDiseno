package TercerParcialClase.Bridge.basic;
public class ConcreateAbstractionA implements IAbstraction {
    private Implementor implementor;

    public ConcreateAbstractionA(Implementor implementor){
        this.implementor= implementor;
    }

    @Override
    public void method1() {
        System.out.println("Concreate Abstraction A - method 1");
        this.implementor.operationA();
    }

    @Override
    public void method2() {
        System.out.println("Concreate Abstraction A - method 2");
        this.implementor.operationB();
    }
}