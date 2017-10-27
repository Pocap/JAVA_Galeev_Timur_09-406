public class Door {
    public static boolean open;
    public String color="Black";
    public static void doOpen(){
        if (open)
            System.out.println("Already opened");
        else
            System.out.println("Door opened.");
    }
    public static void doClose(){
        if (!open)
            System.out.println("Already closed");
        else
            System.out.println("Door closed.");
    }
}
