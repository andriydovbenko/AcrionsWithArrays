public class SumOfThePositiveNumbers {

    public static int computingPositiveNumbers(int[] array) {
        int sum = 0;
        for (int i : array) {
            if (i > 0) sum += i;
        }
        return sum;
    }
}
