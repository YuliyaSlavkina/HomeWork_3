import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class bubbleSort {


    public int[] bubbleSort(int[] sortArr) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("logfile.txt");  //создался файл

        for (int i = 0; i < sortArr.length-1; i++) {
            for(int j = 0; j < sortArr.length-i-1; j++) {
                if(sortArr[j+1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
                fileOutputStream.write(Arrays.toString(sortArr).getBytes());
                fileOutputStream.write("\n".getBytes());
            }
        }

        fileOutputStream.close();
        return sortArr;
    }

}