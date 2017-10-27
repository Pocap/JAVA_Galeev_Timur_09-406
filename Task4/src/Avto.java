import java.util.Scanner;

public class Avto {
    private static int speed = 0;
    private static Door[] doors = new Door[4];
    private static Wheel[] wheels = new Wheel[4];
    private static Engine tarahtelka;
    public static void start(){
        tarahtelka.doStart();
        for (int i=0;i<4;i++) {
            doors[i].doClose();
        }
        System.out.println("You started");
        speed=20;

    }
    public static void acceleration(){
        if (speed==0)
            return;
        System.out.println("Speed is "+ speed);
        Scanner in = new Scanner(System.in);
        boolean done=true;
        while (done) {
            System.out.println("Type \"1\" to increase your speed or \"0\" to reduce speed");
            int a = in.nextInt();
            if (a == 1)
                speed += 10;
            else if (a == 0)
                speed -= 10;
            else {
                System.out.println("retry");
                done = false;
            }
            if (done)
                System.out.println("Speed is " + speed);
            if (speed <= 0) {
                done=false;
                stop();
            }
        }
    }

    public static void stop(){
        speed=0;
        tarahtelka.doStop();
        System.out.println("Машина остановилась, двери отвалились, колёса отвалились, двигатель отвалисля,");
        System.out.println("машина тоже пропала... Беги, пока тебя тоже не съёл Garbage collector!!");
    }
    public static void main(String[] args) {
        start();
        acceleration();
    }
}
