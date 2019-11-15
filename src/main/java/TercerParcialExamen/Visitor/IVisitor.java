package TercerParcialExamen.Visitor;



public interface IVisitor {

     void save(Notepad notepad);
     void save(Sublime sublime);
     void save(Word word);


}