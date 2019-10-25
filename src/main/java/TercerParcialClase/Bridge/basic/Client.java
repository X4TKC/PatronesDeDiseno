package TercerParcialClase.Bridge.basic;


public class Client {
    public static void main (String []args){

        ImplementadorA implementadorA = new ImplementadorA();
        ConcreateAbstractionA concreateAbstractionA = new ConcreateAbstractionA(implementadorA);
        concreateAbstractionA.method1();
        concreateAbstractionA.method2();
    }
}