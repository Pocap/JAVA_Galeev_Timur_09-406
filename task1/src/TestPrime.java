import java.util.Arrays;

public class TestPrime {


    public static boolean compositeOrPrime(int number) {
        //решето Эйлера
        boolean[] forDo = new boolean[number + 1];
        Arrays.fill(forDo, true);
        forDo[0] = forDo[1] = false;
        for (int i = 4; i < forDo.length; i += 2) forDo[i] = false;
        int powIndex = 0;
        int n = 0;
        for (int i = 3; i * i < forDo.length; i += 2) {
            if (forDo[i] == true) {
                powIndex = i * i;
                forDo[powIndex] = false;
                n = i + 2;
                while (n * i <= forDo.length) {
                    forDo[n * i] = false;
                    n += 2;
                }
            }
        }
        return forDo[number];
    }
}
