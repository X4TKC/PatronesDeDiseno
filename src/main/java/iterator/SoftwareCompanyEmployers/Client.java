package iterator.SoftwareCompanyEmployers;


public class Client {
    public static void main (String[] args){
        Empresa1List listaType1 = new Empresa1List();
        Employer c = new Employer();
        c.setDireccion("asdasd");
        c.setNombre("asdasd");
        listaType1.add(c);
        listaType1.add(c);
        listaType1.add(c);
        listaType1.add(c);

        Empresa2List listaType2 = new Empresa2List(4);
        listaType2.add(c);
        listaType2.add(c);
        listaType2.add(c);
        listaType2.add(c);

        Empresa3List listaType3 = new Empresa3List();

        listaType3.add(c);
        listaType3.add(c);
        listaType3.add(c);
        listaType3.add(c);
        Empresa4List listaType4 = new Empresa4List();

        listaType4.add(c);
        listaType4.add(c);
        listaType4.add(c);
        listaType4.add(c);

        EmpresaGeneralList listaGeneral= new EmpresaGeneralList();
        listaGeneral.add(listaType1);
        listaGeneral.add(listaType2);
        listaGeneral.add(listaType3);
        listaGeneral.add(listaType4);

        Iterator iterator;
        iterator = listaGeneral.iterator();
        while(iterator.hasNext()){
            Employer abc = (Employer) iterator.next();
            System.out.println(abc.getNombre());
        }

    }
}
