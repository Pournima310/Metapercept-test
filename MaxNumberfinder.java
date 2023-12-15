import java.util.List;

public class MaxNumberFinder {

    public static int findMax(List<Object> array) {
        int max = Integer.MIN_VALUE;

        for (Object element : array) {
            if (element instanceof List) {
                int maxInSubArray = findMax((List<Object>) element);
                max = Math.max(max, maxInSubArray);
            } else if (element instanceof Integer) {
                max = Math.max(max, (Integer) element);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        List<Object> inputArray = List.of(2, 4, 10, List.of(12, 4, List.of(100, 99), 4), List.of(3, 2, 99), 0);

        int result = findMax(inputArray);
        System.out.println("Maximum Number: " + result);
    }
}
