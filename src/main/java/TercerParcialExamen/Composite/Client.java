package TercerParcialExamen.Composite;


public class Client {
    public static void main(String []args){
        Composite folder = new Composite();
        folder.add(new Archivo("TExto1 asd e"));
        folder.add(new Archivo("TExto1 as"));
        folder.add(new Archivo("TExto1 d d d"));

        Composite folder2 = new Composite();
        folder2.add(new Archivo("TExto1wqeq qwe"));
        folder2.add(new Archivo("TExto1"));
        folder2.add(new Archivo("TExto1 qweqwe qweqwe"));

        Composite folder3 = new Composite();
        folder3.add(new Archivo("TExto1 sss"));
        folder3.add(new Archivo("TExto1 ss"));
        folder3.add(new Archivo("TExto1 aqwe asd eqwe"));


        Composite disco = new Composite();
        disco.add(folder);
        disco.add(folder2);
        disco.add(folder3);




        disco.print();

    }
}