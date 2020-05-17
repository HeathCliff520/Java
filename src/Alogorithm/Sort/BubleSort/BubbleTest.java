package Alogorithm.Sort.BubleSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleTest {
    public static void main(String[] args) {
        //包装类实现了comparable接口；
        Integer[] arr = {10, 2, 3, 6, 41, 0, 35, 47, 14};
        Bubble.sort(arr);
        //注意toString的调用
        System.out.println(Arrays.toString(arr));
    }
}
