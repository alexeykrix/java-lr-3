import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        int size = 300;

        int minValue = -100;
        int maxValue = 100;

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * (maxValue - minValue + 1) + minValue);
        }

        List<List<Integer>> result = findSubarraysWithZeroSum(array);

        System.out.println("Масив: " + java.util.Arrays.toString(array));
        System.out.println("Неперервні ділянки зі сумою 0: " + result);
    }

    private static List<List<Integer>> findSubarraysWithZeroSum(int[] array) {
        List<List<Integer>> result = new ArrayList<>();

        for (int start = 0; start < array.length; start++) {
            int sum = 0;
            for (int end = start; end < array.length; end++) {
                sum += array[end];

                if (sum == 0) {
                    List<Integer> subarray = new ArrayList<>();
                    for (int i = start; i <= end; i++) {
                        subarray.add(array[i]);
                    }
                    result.add(subarray);
                }
            }
        }

        return result;
    }
}
