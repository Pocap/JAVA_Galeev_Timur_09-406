public class Result {
    private static int n = 10;
    public void changeTotal(int a){
        n=a;
    }
    private static Student[] students =new Student[n];
    private static int[] results = new int[n];
    private static void swap(int i) {
        int temp = results[i];
        results[i] = results[i - 1];
        results[i - 1] = temp;
        Student tempS = new Student(students[i]);
        students[i] = students[i - 1];
        students[i - 1] = tempS;
        i--;
    }
    private static void show(int maxi){
        for (int i=0;i<maxi;i++) {
            System.out.println(students[i].getName()+" ("+students[i]+") - "+ results[i]);
        }
    }
    public static void sortUp(){
        int i=1;
        while (i<n){
            if(i == 0 || results[i - 1] <= results[i])
                i++;
            else {
                swap(i);
            }
        }
    }
    public static void sortDown(){
        int i=1;
        while (i<n){
            if(i == 0 || results[i - 1] >= results[i])
                i++;
            else {
                swap(i);
            }
        }
    }

    public static void leader() {
        sortUp();
        show(1);
    }
    public static void leader3() {
        sortUp();
        show(3);
    }
    public static void agreg(){
        System.out.println("Total: "+n);
        int sum=0;
        for (int i:results) {
            sum+=results[i];
        }
        double avg = sum/n;
        System.out.println("Average time: "+avg);
    }
}
