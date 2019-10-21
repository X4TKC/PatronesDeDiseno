package SegundoParcialExamen.State5;

import java.util.Random;

public class Prendido implements IState {
    private Computadora computadora;
    public Prendido(Computadora computadora){
        this.computadora=computadora;
    }
    @Override
    public void handle() {

        Random rnd = new Random();
        int numerorandom= rnd.nextInt(20 - 1 + 1) + 1;
        String[] programasabiertos=new String[numerorandom];
        for (int i = 0; i < programasabiertos.length; i++) {
            programasabiertos[i]="Programa"+(i+1);
        }
        computadora.setProgramasAbiertos(programasabiertos);

        computadora.setConsumoCPU((numerorandom*5)+"%");
        computadora.setConsumoRAM((numerorandom*5)+"%");


    }
}
