import java.util.HashSet;
import java.util.Scanner;

public class Task3 {
    private static int countOfUnique(int[] array) {
        var set = new HashSet<Integer>();
        for (int i : array) {
            set.add(i);
        }
        return set.size();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        System.out.println(countOfUnique(array));
    }
}
