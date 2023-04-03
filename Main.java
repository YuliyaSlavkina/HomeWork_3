import java.io.IOException;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        bubbleSort secondTask = new bubbleSort();
        int[] array = {1, 5, 9, 2, 3, 5, 8};
        try {
            int[] sortedArray = secondTask.bubbleSort(array);
            System.out.println("sortedArray: " + Arrays.toString(sortedArray));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}