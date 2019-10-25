package TercerParcialClase.Bridge.basic;

public class ImplementadorB implements Implementor {

    @Override
    public void operationA() {
        System.out.println("Implementador B : Operation A");
    }

    @Override
    public void operationB() {
        System.out.println("Implementador B : Operation B");
    }
}