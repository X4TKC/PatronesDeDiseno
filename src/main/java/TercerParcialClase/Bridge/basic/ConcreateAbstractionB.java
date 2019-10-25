package TercerParcialClase.Bridge.basic;

public class ConcreateAbstractionB implements IAbstraction {
    private Implementor implementor;

    public ConcreateAbstractionB(Implementor implementor){
        this.implementor= implementor;
    }

    @Override
    public void method1() {
        System.out.println("Concreate Abstraction B - method 1");
        this.implementor.operationA();
    }

    @Override
    public void method2() {
        System.out.println("Concreate Abstraction B - method 2");
        this.implementor.operationB();
    }
}