package TercerParcialClase.Composite.basic;


public class Client {
    public static void main(String []args){
        Composite composite = new Composite("composite root1");
        composite.add(new Leaf("leaf1"));
        composite.add(new Leaf("leaf2"));
        composite.add(new Leaf2("leaf3"));
        composite.add(new Leaf("leaf1"));
        composite.add(new Leaf("leaf2"));
        composite.add(new Leaf2("leaf3"));

        Composite composite2 = new Composite("composite root2");
        composite.add(new Leaf("Nleaf1"));
        composite.add(new Leaf("Nleaf2"));
        composite.add(new Leaf2("Nleaf3"));
        composite.add(new Leaf("Nleaf1"));
        composite.add(new Leaf("Nleaf2"));
        composite.add(new Leaf2("Nleaf3"));
        composite.add(composite2);

        composite.operation();
    }
}