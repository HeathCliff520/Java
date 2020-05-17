package Alogorithm.Sort.InsertSort;

import java.util.Arrays;

public class InsertSortTest {

    public static void main(String[] args) {
        Integer[] arr = {2,45,74,1,43,14,12,4,23,10,3};
        InsertSort.insert(arr);
        System.out.println(Arrays.toString(arr));
    }
}
