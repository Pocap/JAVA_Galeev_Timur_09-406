/*
* Дан массив размерности n. Найти самую длинную последовательность
* подряд идущих элементов массива, равных нулю, подсчитать их количество,
* указать индекс первого нуля.
*/
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
        int max=0;
        int indx=0;
        int indxt;
        int i=0;
        while (i<n){
            int cur=0;

            if (a[i]==0){
                indxt=i;
                do {
                    cur++;
                    i++;
                }while((a[i]==0)&&(i<n-1));
               if (cur>=max){
                   max=cur;
                   indx=indxt;
               }
            }
            i++;
        }
        System.out.println();
        System.out.println("from "+indx +" maximum zeros:"+max);
    }
}
