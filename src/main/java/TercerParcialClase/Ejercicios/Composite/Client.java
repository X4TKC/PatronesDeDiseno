package TercerParcialClase.Ejercicios.Composite;


public class Client {
    public static void main(String []args){
        Composite laboratorio = new Composite();
        laboratorio.add(new Computadora(100));
        laboratorio.add(new Computadora(100));
        laboratorio.add(new Computadora(100));

        Composite laboratorio2 = new Composite();
        laboratorio2.add(new Computadora(200));
        laboratorio2.add(new Computadora(100));
        laboratorio2.add(new Computadora(100));

        Composite laboratorio3 = new Composite();
        laboratorio3.add(new Computadora(100));
        laboratorio3.add(new Computadora(100));
        laboratorio3.add(new Computadora(100));


        Composite contenedor = new Composite();
        contenedor.add(laboratorio);
        contenedor.add(laboratorio2);
        contenedor.add(laboratorio3);




        contenedor.print();

    }
}