package SegundoParcialExamen.Observer4;

import java.util.ArrayList;

public interface IObserver {

    ArrayList<enumCategoria> getKey();
    void update(String msg);

}
