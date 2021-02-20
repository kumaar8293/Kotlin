import java.util.Arrays;

public class DSA1 {
    // Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5

    // Output: [2.2, 2.8, 2.4, 3.6, 2.8]


    public static double[] findContiguousSubArrayAvg(int[] inputArray, int size) {

        double[] output = new double[inputArray.length - size];

        for (int i = 0; i < inputArray.length - size; i++) {
            double sum = 0;
            for (int j = i; j < i + size; j++) {
                sum = sum + j;
                output[i] = sum / size;
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 6, -1, 4, 1, 8, 2};

        System.out.println(Arrays.toString(findContiguousSubArrayAvg(arr, 5)));

    }


}
