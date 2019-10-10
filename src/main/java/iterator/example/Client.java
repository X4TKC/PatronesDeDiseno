package iterator.example;

public class Client {
    public static void main (String[] args){
        BancoAList listaType1 = new BancoAList();
        Cliente c = new Cliente();
        c.setDireccion("asdasd");
        c.setNombre("asdasd");
        listaType1.add(c);
        listaType1.add(c);
        listaType1.add(c);
        listaType1.add(c);

        BancoBList listaType2 = new BancoBList();
        listaType2.add(c);
        listaType2.add(c);
        listaType2.add(c);
        listaType2.add(c);
        BancoCList listaType3 = new BancoCList();

        listaType3.add(0,c);
        System.out.println(listaType3.iterator().next());
        listaType3.add(1,c);
        listaType3.add(2,c);
        listaType3.add(3,c);

        Iterator iterator;
        iterator = listaType1.iterator();
        while(iterator.hasNext()){
            Cliente abc = (Cliente) iterator.next();
            System.out.println(abc.getNombre());
        }
        iterator = listaType2.iterator();
        while(iterator.hasNext()){
            Cliente abcd = (Cliente) iterator.next();
            System.out.println(abcd.getNombre());
        }
        iterator = listaType3.iterator();
        while(iterator.hasNext()){
            Cliente abcd = (Cliente) iterator.next();
            System.out.println(abcd.getNombre());
        }
    }
}
