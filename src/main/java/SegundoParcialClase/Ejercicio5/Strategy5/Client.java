package SegundoParcialClase.Ejercicio5.Strategy5;

import java.util.Arrays;

public class Client {

    public static void main(String[] args){
        Context context = new Context();
        int[] var={80,80,80,85};
        context.setAttribute1(var);
        context.execute();
        System.out.println(context.getPromedio());
        System.out.println(Arrays.toString(context.getNotas()));
        var[0]=90;
        var[1]=95;
        var[2]=99;
        var[3]=97;
        context.setAttribute1(var);
        context.execute();
        System.out.println(context.getPromedio());
        System.out.println(Arrays.toString(context.getNotas()));
        var[0]=65;
        var[1]=60;
        var[2]=70;
        var[3]=45;
        context.setAttribute1(var);
        context.execute();
        System.out.println(context.getPromedio());
        System.out.println(Arrays.toString(context.getNotas()));


    }
}