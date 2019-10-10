package example;

public class Client {

    public static void main(String []args){
            Robot a = new Robot();
            a.setAccionPies("Valor Robot A");
            System.out.println("Robot A "+a.getAccionPies());
            Robot b = new Robot();
            b=a;
            System.out.println("Robot B "+b.getAccionPies());
            b.setAccionPies("Valor Robot B");

            System.out.println("Robot A "+a.getAccionPies());

        System.out.println("Robot B "+b.getAccionPies());



//        Thread threadRobot= new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Robot robot1 = new Robot();
//                robot1.setAccionCabeza("Girar Derecha");
//                robot1.setAccionCanminar("Adelante");
//                robot1.setAccionMano("Levantar");
//                robot1.setAccionPies("Girar");
//            }
//        });
//
//        Thread threadPersona= new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Persona persona1 = new Persona();
//
//
//                persona1.setAccionCabeza("Girar Derecha");
//                persona1.setAccionCanminar("Adelante");
//                persona1.setAccionMano("Levantar");
//                persona1.setAccionPies("Girar");
//
//            }
//        });
//        threadPersona.start();
//        threadRobot.start();

    }
}
