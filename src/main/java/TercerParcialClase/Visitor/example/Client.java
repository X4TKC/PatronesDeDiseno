package TercerParcialClase.Visitor.example;

public class Client {

    public static void main (String []args){
        Estudiante estudiante = new Estudiante();
        Director director = new Director();

        Matriculacion matriculacion= new Matriculacion();
        Graduacion graduacion=new Graduacion();
        PagarMatricula pagarMatricula = new PagarMatricula();

        System.out.println("Result A : "+estudiante.accept(matriculacion));
        System.out.println("Result B : "+director.accept(matriculacion));

        System.out.println("Result A : "+estudiante.accept(graduacion));
        System.out.println("Result B : "+director.accept(graduacion));
        estudiante.setDinero(100);
        director.setDinero(100);
        System.out.println("Result A : "+estudiante.accept(pagarMatricula));
        System.out.println("Result B : "+director.accept(pagarMatricula));


    }
}