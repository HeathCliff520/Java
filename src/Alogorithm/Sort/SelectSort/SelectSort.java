package Alogorithm.Sort.SelectSort;

public class SelectSort {
    public static void select(Comparable[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            int minIndex=i;
            for (int j = i; j < arr.length; j++) {
                if (greater(arr[minIndex],arr[j])){
                    minIndex=j;
                }
            }
            //交换
            exchange(arr,i,minIndex);
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
