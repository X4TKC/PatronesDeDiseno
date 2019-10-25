package TercerParcialClase.Adapter.example;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args){
        Docente docente=new Docente();
        docente.setNacimiento(1990);
        Seguridad seguridad=new Seguridad();
        seguridad.setNacimiento(1985);
        Estudiante estudiante=new Estudiante();
        estudiante.setEdad(29);
        Director director=new Director();
        director.setEdad(30);
        Secretaria secretaria=new Secretaria();
        secretaria.setEdad(15);

        AdapterDocente adapterDocente = new AdapterDocente(docente);
        AdapterSeguridad adapterSeguridad = new AdapterSeguridad(seguridad);


        ArrayList<IPersona> personas = new ArrayList<>();
        personas.add(adapterDocente);
        personas.add(adapterSeguridad);
        personas.add(secretaria);
        personas.add(director);
        personas.add(estudiante);
        for (int i = 0; i <personas.size() ; i++) {
            System.out.println(personas.get(i).getEdad());
        }

    }
}
