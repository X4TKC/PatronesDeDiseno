package TercerParcialClase.Ejercicios.Decorador;

import java.util.Random;

public class Promocion extends Decorator {

    public Promocion(IBanco componente) {
        super(componente);
    }
    public void operation(){
        super.operation();
        Random rnd = new Random();
        int answer = rnd.nextInt(2) + 1;
        System.out.println("Monto: "+getMonto());
        if(answer%2==0){

            setMonto(getMonto()*2);
            System.out.println("Monto duplicado "+ getMonto());
        }else{
            System.out.println("Mala suerte ");
        }
    }
}
