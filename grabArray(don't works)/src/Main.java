import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter lenght:");
        int n = scan.nextInt(); //считывание длины массива
        int[] a = new int[n];

        System.out.print("Enter maximum number (minimal will be created as maximum *(-1): ");
        int b = scan.nextInt(); // максимально возможное число (+-)

        for (int i= 0; i<n;i++){
            a[i] = -b + (int) (Math.random() *2* b);
            System.out.print(a[i]+ "\t");
        }
        ArrayList<Integer> arrB=new ArrayList<Integer>();
        arrB.add(a[0]);
        for (int i=1;i<n;i++) {
            boolean has=false;
            int j=0;
            while (j<=n) {
                if(arrB.get(j)==a[i]) {
                    has = true;
                    break;
                }
                j++;
            }
            if(!has)
                arrB.add(a[i]);

        }
        System.out.println();
        for (int i=0;i<arrB.size()  ;i++) {
            System.out.print(arrB.get(i)+"\t");
        }
    }

}
 