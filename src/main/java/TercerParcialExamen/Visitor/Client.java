package TercerParcialExamen.Visitor;

public class Client {
    public static void main(String[] args){
        Notepad notepad = new Notepad();
        Word word = new Word();
        Sublime sublime = new Sublime();

        word.crear("Texto de muestra 1 prueba","Ejemplo1");
        notepad.crear("Texto de muestra 2","Ejemplo2");
        sublime.crear("Texto de muestra","Ejemplo3");
        Plugin plugin= new Plugin();
        word.addPlugin(plugin);
        notepad.addPlugin(plugin);
        sublime.addPlugin(plugin);


    }
}
