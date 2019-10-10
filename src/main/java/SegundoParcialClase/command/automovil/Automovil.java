package SegundoParcialClase.command.automovil;

public class Automovil {

    private String vel = "default";

    private int velocidad=10;


    public void acelerar() {
        System.out.println("acelerando "+ velocidad + " a " + (velocidad+10));
        velocidad=velocidad+10;
    }
    public void desacelerar(){
        int var=velocidad;
        velocidad=velocidad-10;
        if(velocidad<0){
            velocidad=0;
        }
        System.out.println("desacelerando "+ var + " a " + velocidad);


    }
    public void avanzar(){
        System.out.println("avanzando con una velocidad de "+ velocidad );
    }
    public void retroceder(){
        System.out.println("retrocediendo con una velocidad de "+ velocidad);

    }
}
