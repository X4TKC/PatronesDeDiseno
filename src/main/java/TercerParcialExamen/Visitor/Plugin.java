package TercerParcialExamen.Visitor;

public class Plugin implements IVisitor {
    @Override
    public void save(Notepad notepad) {
            notepad.getDocumento().setFormato("pdf");
            notepad.getDocumento().setNumChar(notepad.getDocumento().getText().replaceAll("\\s+","").length());
        System.out.println("Se guardo el documento en formato: "+notepad.getDocumento().getFormato()+
                " y el numero de caracteres del texto es: " +
        notepad.getDocumento().getNumChar());
    }

    @Override
    public void save(Sublime sublime) {
        sublime.getDocumento().setFormato("pdf");
        sublime.getDocumento().setNumChar(sublime.getDocumento().getText().replaceAll("\\s+","").length());
        System.out.println("Se guardo el documento en formato: "+sublime.getDocumento().getFormato()+
                " y el numero de caracteres del texto es: " +
                sublime.getDocumento().getNumChar());
    }

    @Override
    public void save(Word word) {
        word.getDocumento().setFormato("pdf");
        word.getDocumento().setNumChar(word.getDocumento().getText().replaceAll("\\s+","").length());
        System.out.println("Se guardo el documento en formato: "+word.getDocumento().getFormato()+
                " y el numero de caracteres del texto es: " +
                word.getDocumento().getNumChar());
    }
}
