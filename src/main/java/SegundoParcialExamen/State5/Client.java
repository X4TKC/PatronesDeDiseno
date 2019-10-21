package SegundoParcialExamen.State5;


import java.util.Arrays;

public class Client {

    public static void main(String arg[]){
        Computadora computadora = new Computadora();
        IState state1 = new Apagado(computadora);
        IState state2 = new Reiniciar(computadora);
        IState state3 = new Prendido(computadora);

        computadora.setState(state1);
        computadora.request();
        System.out.println(computadora.getConsumoCPU()+" "+computadora.getConsumoRAM()+" "+ Arrays.toString(computadora.getProgramasAbiertos()));
        computadora.setState(state2);
        computadora.request();
        System.out.println(computadora.getConsumoCPU()+" "+computadora.getConsumoRAM()+" "+ Arrays.toString(computadora.getProgramasAbiertos()));

        computadora.setState(state3);
        computadora.request();
        System.out.println(computadora.getConsumoCPU()+" "+computadora.getConsumoRAM()+" "+ Arrays.toString(computadora.getProgramasAbiertos()));



    }
}
