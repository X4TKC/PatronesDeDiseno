package SegundoParcialClase.memento.exercise;

public class Memento {

    private SoftwareProyect state;

    public Memento(SoftwareProyect stateToSave)
    {
        state = stateToSave;
    }

    public SoftwareProyect getSavedState()
    {
        return state;
    }

}