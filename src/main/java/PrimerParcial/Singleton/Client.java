package PrimerParcial.Singleton;

public class Client {
    public static void main(String[] args){
        Student s2= new Student("Pedro");
        Student s1= new Student("Pedro2");
        Student s3= new Student("Pedro3");


//        Account acc= Account.getInstance();

        Thread thread1 = new Thread(new Runnable() {
              @Override
              public void run() {
                  PrimerParcial.Singleton.Account a=PrimerParcial.Singleton.Account.getInstance();
                  System.out.println("Memoria Hilo1 : " + a.hashCode());
                  s2.payTuition(1500);
                  s1.payTuition(1200);
                  s3.payTuition(500);
                  System.out.println(a.getTuition().get(1).getDate());
        System.out.println(a.getTuition().get(0).getAmount()+"hola");
        System.out.println(a.getTuition().get(2).getNombre());
              }
          });
          Thread thread2 = new Thread(new Runnable() {
              @Override
              public void run() {
                  PrimerParcial.Singleton.Account b=PrimerParcial.Singleton.Account.getInstance();
                  System.out.println("Memoria Hilo2 : " + b.hashCode());
                  s2.payTuition(1300);
                  s1.payTuition(100);
                  s3.payTuition(800);
                  System.out.println(b.getTuition().get(3).getDate());
                  System.out.println(b.getTuition().get(4).getAmount()+"asd");
                  System.out.println(b.getTuition().get(5).getNombre());

              }
          });
          thread1.start();
          thread2.start();


    }
}
