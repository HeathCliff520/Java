package Alogorithm.Sort.BubleSort;

public class Bubble {
    public static void sort(Comparable[] arr) {
        for (int i = arr.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (greater(arr[j],arr[j+1])){
                    exchange(arr,j,j+1);
                }
            }
        }
    }
    public static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }
    public static void exchange(Comparable[] arr,int i,int j){
        Comparable temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
/*
* 时间：最坏（o（n^2））
*
* */