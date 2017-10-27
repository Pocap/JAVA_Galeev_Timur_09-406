public class Wheel {
    public static int diameter=20;
    enum type{
        summer, winter
    }
    public static type wheelType=type.summer;
    public static void change(){
        if (wheelType==type.summer){
            wheelType=type.winter;
            System.out.println("Now this wheel type: winter");
        }
        else if (wheelType==type.winter){
            wheelType=type.summer;
            System.out.println("Now this wheel type: summer");
        }else System.out.println("Seems, you haven't this wheel");
    }
}
