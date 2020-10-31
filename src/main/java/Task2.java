import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    private static int[] shuffleElements(int[] array) {
        int[] result = new int[array.length];
        int length = array.length;

        Random gen = new Random();

        for (int i = 0; i < array.length; i++) {
            int r = gen.nextInt(length);

            while(r == i) {
                r = gen.nextInt(length);
            }

            result[i] = array[r];

            array[r] = array[length-1];
            length--;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(shuffleElements(array)));
    }
}
