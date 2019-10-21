package TercerParcialClase.Visitor.basic;

public class Client {

    public static void main (String []args){
        ElementConcreateA concreateA = new ElementConcreateA();
        ElementConcreateB concreateB = new ElementConcreateB();

        ConcreateVisitor visitor= new ConcreateVisitor();

        System.out.println("Result A : "+concreateA.accept(visitor));
        System.out.println("Result B : "+concreateB.accept(visitor));


    }
}