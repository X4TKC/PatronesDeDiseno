package SegundoParcialClase.memento.exercise;

public class Originator {
    private SoftwareProyect state;

    public void setCommit(SoftwareProyect state)
    {
        System.out.println("Originator: Setting state to "+state.getVersion());
        state.show();
        this.state = state;
    }

    public Memento createCommit()
    {
        System.out.println("Originator: Create Repository.");
        state.show();
        return new Memento(state);
    }

    public void retoreFromCommit(Memento m)
    {
        state = m.getSavedState();
        System.out.println("Originator: State after restoring from Repository: commit"+state.getVersion());
        state.show();
    }
}