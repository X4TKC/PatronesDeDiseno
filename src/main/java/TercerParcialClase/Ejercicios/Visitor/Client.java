package TercerParcialClase.Ejercicios.Visitor;

public class Client {

    public static void main (String []args){
        Perro perro = new Perro();
        Gato gato = new Gato();
        Caballo caballo = new Caballo();

        Veterinario veterinario= new Veterinario();
        perro.enfermedad1();
        gato.enfermedad2();
        caballo.enfermedad1();
        System.out.println("Result Perro : "+perro.accept(veterinario));
        System.out.println("Result Gato : "+gato.accept(veterinario));
        System.out.println("Result Caballo : "+caballo.accept(veterinario));


    }
}