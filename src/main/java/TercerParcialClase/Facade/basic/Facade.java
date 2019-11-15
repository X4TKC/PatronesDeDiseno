package TercerParcialClase.Facade.basic;
public class Facade {

    private ConcreteObjectA concreteObjectA = new ConcreteObjectA();
    private ConcreteObjectB concreteObjectB = new ConcreteObjectB();
    private ConcreteObjectC concreteObjectC = new ConcreteObjectC();
    private ConcreteObjectD concreteObjectD = new ConcreteObjectD();

    public void operation(){
        concreteObjectA.operationA();
        concreteObjectB.operationB();
        concreteObjectC.operationC();
        concreteObjectD.operationD();
    }

}