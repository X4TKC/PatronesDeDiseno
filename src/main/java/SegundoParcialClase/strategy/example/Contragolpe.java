package SegundoParcialClase.strategy.example;

public class Contragolpe implements IStrategy {
    @Override
    public void execute() {
        System.out.println("Estrategia Contra golpe");
    }
}
