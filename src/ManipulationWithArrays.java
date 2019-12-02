import java.text.DecimalFormat;
import java.util.Arrays;

public class ManipulationWithArrays {

    public static void main(String[] args) {
        //first task:
        DescendingArraySort descendingArraySort = new DescendingArraySort();
        descendingArraySort.transformInDescendingOrder();

        //second task:
        int[] numbersArray = {1, 4, -45, 12, 8, -22, 0, -3, 7, -89, 7};
        int sumOfPositive = SumOfThePositiveNumbers.computingPositiveNumbers(numbersArray);
        System.out.println("Sum of positive digits of array : " + sumOfPositive);

        //third task:
        double averageValue = AverageNumber.computingTheAverageValue(numbersArray);
        DecimalFormat formater = new DecimalFormat("#0.00");
        System.out.println("Average of a list of numbers: " + formater.format(averageValue));

        //last one
        DuplicatesOff duplicatesOff = new DuplicatesOff();
        int[] newArray = duplicatesOff.replacingDuplicates();
        System.out.println("Modified array: " + Arrays.toString(newArray));
    }
}
