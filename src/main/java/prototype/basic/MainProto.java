package prototype.basic;

public class MainProto {

    public static void main (String [] args){

        // Problem when we do not use prototype
        NoPrototype obj1 = new NoPrototype();
        obj1.setAttribute2("objeto numero 1");
        System.out.println("value obj1 "+obj1.getAttribute2());
        NoPrototype obj2 = new NoPrototype();
        obj2 = obj1;
        System.out.println("value obj2 "+obj2.getAttribute2());
        obj2.setAttribute2("objeto numero 2");
        System.out.println("value obj1 "+obj1.getAttribute2());
        System.out.println("value obj2 "+obj2.getAttribute2());

        // Using Protopype
        ConcretePrototype object1 = new ConcretePrototype();

        object1.setAttribute2("objeto1");
        System.out.println(" value 1 "+object1.getAttribute2());
        ConcretePrototype object2 = (ConcretePrototype) object1.clone();
        System.out.println("value obj2 "+object2.getAttribute2());
        object2.setAttribute2("objeto2");
        System.out.println("value obj2 "+object2.getAttribute2());
        System.out.println("value obj1 "+object1.getAttribute2());
    }
}