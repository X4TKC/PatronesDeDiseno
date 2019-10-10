package SegundoParcialClase.memento.basic;

public class Originator {
    private ConcreteObject state;

    public void setMemento(ConcreteObject state)
    {
        System.out.println("Originator: Setting state to "+state.getState());
        state.show();
        this.state = state;
    }

    public Memento createMemento()
    {
        System.out.println("Originator: Create  Memento.");
        state.show();
        return new Memento(state);
    }

    public void restoreFromMemento(Memento m)
    {
        state = m.getSavedState();
        System.out.println("Originator: State after restoring from Memento: "+state.getState());
        state.show();
    }
}