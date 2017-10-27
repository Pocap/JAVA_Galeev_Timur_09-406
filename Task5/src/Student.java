public class Student {
    private static String name;
    private static int groop;
    public Student(Student last){
        this.name=last.name;
        this.groop=last.groop;
    }
    public static String getName(){
        return name;
    }
    public static int getGroop(){
        return groop;
    }
}
