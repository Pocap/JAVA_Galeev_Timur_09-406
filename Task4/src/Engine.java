public class Engine {
    public static boolean started;
    public int power=300;
    public static void doStart(){
        if (started)
            System.out.println("Already started");
        else
            System.out.println("Engine started [WRRRUUUMM!!]");
    }

    public static void doStop() {
        if(!started)
            System.out.println("Already stopped");
        else
            System.out.println("Engine muted");
    }
}
