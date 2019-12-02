public class AverageNumber {

    public static double computingTheAverageValue(int[] arrayOfDigit) {
        int tempValue = 0;
        for (int i : arrayOfDigit) {
            tempValue += i;
        }
        if (tempValue != 0) {
            return (tempValue/ (double) arrayOfDigit.length);
        }else return 0;
    }
}
