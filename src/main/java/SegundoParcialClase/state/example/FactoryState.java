package SegundoParcialClase.state.example;

public class FactoryState {
    public static IState make(EnumState type, String pass){
        IState state;
        switch(type){
            case Bloqueado:
                state = new Bloqueado(pass);
                break;

            case Desbloqueado:
                state = new Desbloqueado();
                break;


            default:
                state = new Bloqueado(pass);
                break;
        }
        return state;
    }
}
