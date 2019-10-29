package TercerParcialClase.Composite.exercise;


public class Client {
    public static void main(String []args){
        Composite subtask = new Composite(0,"Subtask");
        subtask.add(new Item(6,"item"));
        subtask.add(new Item(6,"item"));

        Composite subtask2 = new Composite(0,"Subtask");
        subtask2.add(new Item(6,"item"));
        subtask2.add(new Item(6,"item"));

        Composite subtask3 = new Composite(0,"Subtask");
        subtask3.add(new Item(6,"item"));
        subtask3.add(new Item(6,"item"));


        Composite task = new Composite(0,"task");
        task.add(subtask);
        task.add(subtask2);
        task.add(subtask3);


        Composite userStory = new Composite(0,"UserStory");
        userStory.add(task);
        userStory.add(task);
        userStory.add(task);

        userStory.print();

    }
}