package TercerParcialClase.Ejercicios.Visitor;

import java.util.Date;

public class Veterinario implements IVisitor {

    @Override
    public Date curar(Perro perro) {
        //some process
        System.out.println("Receta del veterinario para enfermedad "+perro.getEnfermedad());

        return new Date();
    }

    @Override
    public Date curar(Gato gato) {
        //some process
        System.out.println("Receta del veterinario para enfermedad "+gato.getEnfermedad());

        return new Date();
    }

    @Override
    public Date curar(Caballo caballo) {
        //some process
        System.out.println("Receta del veterinario para enfermedad "+caballo.getEnfermedad());

        return new Date();
    }
}