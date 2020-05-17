package Alogorithm.Sort.SelectSort;

import java.util.Arrays;

public class SelectTest {
    public static void main(String[] args) {
        Integer[] arr = {1,41,24,34,741,1,4,51,54,12,23};
        SelectSort.select(arr);
        System.out.println(Arrays.toString(arr));
    }

}
