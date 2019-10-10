package singleton;

import singleton.Singleton3;

public class Main {

    public static void main(String[] args){



        Singleton3 singletonClone= (Singleton3) Singleton3.getUniqueInstance();
//          Thread thread1 = new Thread(new Runnable() {
//              @Override
//              public void run() {
//                  singleton.Singleton a=singleton.Singleton.getUniqueInstance();
//                  System.out.println("Memoria Hilo1 : " + a.hashCode());
//              }
//          });
//          Thread thread2 = new Thread(new Runnable() {
//              @Override
//              public void run() {
//                  singleton.Singleton b= singleton.Singleton.getUniqueInstance();
//                  System.out.println("Memoria Hilo2 : " + b.hashCode());
//              }
//          });
//          thread1.start();
//          thread2.start();



//        singleton.Singleton.getUniqueInstance().myInstance();
//        singleton.Singleton.getUniqueInstance().myInstance();
//        singleton.Singleton.getUniqueInstance().myInstance();
//        singleton.Singleton.getUniqueInstance().myInstance();
//        singleton.Singleton.getUniqueInstance().myInstance();
//        singleton.Singleton.getUniqueInstance().myInstance();

//        singleton.Singleton2 first = singleton.Singleton2.getUniqueInstance();
//        singleton.Singleton2 second = singleton.Singleton2.getUniqueInstance();
//        singleton.Person person1 = new singleton.Person();
//        singleton.Person person2 = new singleton.Person();
//        System.out.println(person1.hashCode());
//        System.out.println(person2.hashCode());
//        System.out.println("Memory : " + first.hashCode());
//        System.out.println("Memory : " + second.hashCode());
//        System.out.println("Memory : " + singleton.Singleton2.getUniqueInstance().hashCode());

    }
}
