package SegundoParcialClase.strategy.example;

public class Ataque implements IStrategy {
    @Override
    public void execute() {
        System.out.println("Estrategia Ataque");
    }
}
