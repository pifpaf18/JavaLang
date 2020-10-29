import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size1 = in.nextInt();
        int size2 = in.nextInt();
        int[][] array = new int[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                array[i][j] = in.nextInt();
            }
        }

        int minOfMax = Integer.MAX_VALUE;
        int line = -1;
        for (int i = 0; i < size1; i++) {
            int maxElemInLine = Integer.MIN_VALUE;
            for (int j = 0; j < size2; j++) {
                if (array[i][j] > maxElemInLine) {
                    maxElemInLine = array[i][j];
                }
            }
            if (maxElemInLine < minOfMax) {
                minOfMax = maxElemInLine;
                line = i;
            }
        }

        int[][] newArray = new int[size1 - 1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (i < line) {
                    newArray[i][j] = array[i][j];
                }
                if (i > line) {
                    newArray[i - 1][j] = array[i][j];
                }
            }
        }

        for (int i = 0; i < size1 - 1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.print('\n');
        }
    }
}