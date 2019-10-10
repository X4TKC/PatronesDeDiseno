package TiposProfundaSuperficial;

public class Guerrero implements IPrototype {
    private int _armadura;
    private int _arma;
    private int _nivel;
    private int _dano;
    private int _velocidad;
    public Guerrero(){

    }
    public int get_armadura() {
        return _armadura;
    }

    public void set_armadura(int _armadura) {
        this._armadura = _armadura;
    }

    public int get_arma() {
        return _arma;
    }

    public void set_arma(int _arma) {
        this._arma = _arma;
    }

    public int get_nivel() {
        return _nivel;
    }

    public void set_nivel(int _nivel) {
        this._nivel = _nivel;
    }

    public int get_dano() {
        return _dano;
    }

    public void set_dano(int _dano) {
        this._dano = _dano;
    }

    public int get_velocidad() {
        return _velocidad;
    }

    public void set_velocidad(int _velocidad) {
        this._velocidad = _velocidad;
    }


    @Override
    public Object clone() {
        Guerrero cloneObj = new Guerrero();
        cloneObj.set_dano(this._dano);
        cloneObj.set_velocidad(this._velocidad);
        cloneObj.set_nivel(this._nivel);
        cloneObj.set_armadura(this._armadura);
        cloneObj.set_arma(this._arma);
        return cloneObj;
    }
}
