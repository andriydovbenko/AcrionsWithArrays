import java.util.Arrays;
import java.util.Collections;

public class DescendingArraySort {

    private Integer[] array;

    DescendingArraySort() {
        array = new Integer[]{2, 3, 1, 7, 11};
    }

    DescendingArraySort(Integer[] arr) {
        array = arr;
    }

    public void transformInDescendingOrder() {
        System.out.println("old array: " + Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("new array: " + Arrays.toString(array));
    }
}
