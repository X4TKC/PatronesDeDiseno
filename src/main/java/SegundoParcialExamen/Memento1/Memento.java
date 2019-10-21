package SegundoParcialExamen.Memento1;

public class Memento {

    private Document state;

    public Memento(Document stateToSave)
    {
        state = stateToSave;
    }

    public Document getSavedState()
    {
        return state;
    }

}