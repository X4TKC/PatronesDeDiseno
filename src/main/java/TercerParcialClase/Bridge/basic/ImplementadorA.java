package TercerParcialClase.Bridge.basic;

public class ImplementadorA implements Implementor {
    @Override
    public void operationA() {
        System.out.println("Implementador A : Operation A");
    }

    @Override
    public void operationB() {
        System.out.println("Implementador A : Operation B");
    }
}