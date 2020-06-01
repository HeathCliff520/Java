package Alogorithm.Sort.MergeSort;

import java.util.Arrays;

public class MergeSortTest {
    public static void main(String[] args) {
        Integer[] arr={10,7,5,4,2,3,11,15,9};
        MergeSort.mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
