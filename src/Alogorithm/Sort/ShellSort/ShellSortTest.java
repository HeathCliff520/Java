package Alogorithm.Sort.ShellSort;

import java.util.Arrays;

class ShellSortTest {
    public static void main(String[] args) {
        Integer[] arr = {10, 2, 3, 6, 41, 0, 35, 47, 14};
        ShellSort.shell(arr);
        System.out.println(Arrays.toString(arr));
    }
}