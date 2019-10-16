package SegundoParcialClase.Ejercicio5.Observer4;



public class Client {
    public static void main(String[] args){
        Youtube youtube = new Youtube();
        youtube.attach(new Persona(enumCategoria.Comedy,"Persona1"));
        youtube.attach(new Persona(enumCategoria.Gaming,"Persona2"));
        youtube.attach(new Persona(enumCategoria.Movies,"Persona3"));
        youtube.attach(new Persona(enumCategoria.Music,"Persona4"));
        youtube.attach(new Persona(enumCategoria.anyCategory,"Persona5"));

        youtube.setAttribute1(new Video("tipo","titulo 1","tiempo",enumCategoria.Comedy));
        youtube.setAttribute1(new Video("tipo","titulo 2","tiempo",enumCategoria.Gaming));
        youtube.setAttribute1(new Video("tipo","titulo 3","tiempo",enumCategoria.Movies));
        youtube.setAttribute1(new Video("tipo","titulo 4","tiempo",enumCategoria.Music));

    }
}
