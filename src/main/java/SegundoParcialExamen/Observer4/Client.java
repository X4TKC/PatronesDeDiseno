package SegundoParcialExamen.Observer4;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args){
        CompaniaTelefonica empresa = new CompaniaTelefonica();

        ArrayList<enumCategoria>var=new ArrayList<>();
        var.add(enumCategoria.Promociones);
        var.add(enumCategoria.Precios);
        empresa.attach(new Persona(var, "Persona 1"));

        ArrayList<enumCategoria>var2=new ArrayList<>();
        var2.add(enumCategoria.Precios);
        empresa.attach(new Persona(var2, "Persona 2"));

        ArrayList<enumCategoria>var3=new ArrayList<>();
        var3.add(enumCategoria.Ninguna);
        empresa.attach(new Persona(var3, "Persona 3"));

        ArrayList<enumCategoria>var4=new ArrayList<>();
        var4.add(enumCategoria.Promociones);
        var4.add(enumCategoria.Premios);
        empresa.attach(new Persona(var4, "Persona 4"));

        ArrayList<enumCategoria>var5=new ArrayList<>();
        var5.add(enumCategoria.Noticias);
        var5.add(enumCategoria.Premios);
        empresa.attach(new Persona(var5, "Persona 5"));

        empresa.setAttribute1(new Notificacion("Titulo 1: Promociones", enumCategoria.Promociones));
        System.out.println();
        empresa.setAttribute1(new Notificacion("Titulo 2: Premios", enumCategoria.Premios));
        System.out.println();
        empresa.setAttribute1(new Notificacion("Titulo 3: Noticias", enumCategoria.Noticias));
        System.out.println();
        empresa.setAttribute1(new Notificacion("Titulo 4: Precios", enumCategoria.Precios));

    }
}
