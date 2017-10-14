import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        Scanner readNumber = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);

        int n = readNumber.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = reader.nextInt();
            if ((a[i]!=0)&&TestPrime.compositeOrPrime(a[i]))
                a[i] = 0;
        }
        for (int i : a) {
            System.out.println(i);
        }

    }

}
