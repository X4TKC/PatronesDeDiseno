package SegundoParcialClase.state.example;

public class Celular {
    private IState state; // requisto --- > attribute interface state

    public void setState( IState state )
    {
        this.state = state;
    }

    public IState getState()
    {
        return state;
    }

    public void request()
    {
        state.handle();
    }
}
