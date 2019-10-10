package TiposProfundaSuperficial;

public class Client {

    public static void main(String[] args){


        Guerrero A = new Guerrero();
        A.set_arma(2);
        A.set_armadura(2);
        A.set_dano(2);
        A.set_nivel(2);
        A.set_velocidad(2);

//        Guerrero B = new Guerrero();
//        Guerrero C = new Guerrero();
//        Guerrero D = new Guerrero();
//        Guerrero E = new Guerrero();
//        Guerrero F = new Guerrero();
        Guerrero B = (Guerrero) A.clone();
        Guerrero C = (Guerrero) A.clone();
        Guerrero D = (Guerrero) A.clone();
        Guerrero E = (Guerrero) A.clone();
        Guerrero F= (Guerrero) A.clone();
        B.set_dano(3);
        C.set_arma(3);
        D.set_armadura(3);
        E.set_nivel(3);
        F.set_velocidad(3);
        System.out.println(B.get_dano()+" "+ A.get_dano());
        System.out.println(C.get_arma()+" "+ A.get_arma());
        System.out.println(D.get_armadura()+" "+ A.get_armadura());
        System.out.println(E.get_nivel()+" "+ A.get_nivel());
        System.out.println(F.get_velocidad()+" "+ A.get_velocidad());
    }
}
