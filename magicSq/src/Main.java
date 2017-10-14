/*********************************************************************
 * Выяснить является ли квадрат магическим (суммы чисел на диагоналях, в столбцах и строках равны)
 *      - Для удобства получения квадрата, он задаётся случайными числами.
 *      - При задании квадрата требуется указать только размерность и максимально возможное число
 *********************************************************************/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter matrix size: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n==1){
            System.out.println("Тривиальный случай");
            return;
        }
        int[][]a = new int[n][n];

        System.out.print("Enter maximum number (minimal will be created as maximum *(-1): ");
        int b = scan.nextInt(); // максимально возможное число (+-)

        // создание квадрата случайных чисел
        for (int i=0;i<n;i++) {
            for (int j=0; j<n; j++){
                a[i][j] = -b + (int) (Math.random() *2* b);
                System.out.print(a[i][j]+ "\t");
            }
            System.out.println();
        }

        boolean ans = true;         //"флажок" выполнения условия - true, пока не найдём хотя бы одну отличающуюся сумму

        //Т.к. должны быть равны все суммы, находим одну из сумм (побочной диагонали в данном случае)
        int sum=0;
        for (int i=0;i<n;i++) {
            for (int j=0; j<n; j++){
                if (i+j==n-1) sum+=a[i][j];
            }
        }
        //отдельно сравниваем главную диагональ, т.к. её высчитывание отличается от других оставшихся ссумм
        int temp = 0;
        for (int i = 0; i<n; i++) temp+=a[i][i];
        if (temp!=sum)
            ans=false;
        // циклически высчитываем суммы по строкам и столбцам и сравниваем с "эталонной" суммой
        // если нашли хотя бы одну отличающуюся сумму, останые не высчитываем, т.к. полученный ответ false уже не изменится
        for (int i=0;(i<n)&&(ans);i++) {
            int temp1=0, temp2=0;
            for (int j=0; j<n; j++){
                temp1+=a[i][j];
                temp2+=a[j][i];
            }
            if ((temp1!=sum)||(temp2!=sum)) ans=false;
        }
        System.out.println(ans);
    }
}
