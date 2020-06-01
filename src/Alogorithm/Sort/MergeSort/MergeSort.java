package Alogorithm.Sort.MergeSort;

public class MergeSort {
    //定义一个辅助数组
    private static Comparable[] assist;//归并时使用

    public static boolean less(Comparable u,Comparable v){//若u小，则…………
        return u.compareTo(v)<0;//u-v是否小于0；
    }

    public static void exchange(Comparable[] arr,int i,int j){
        Comparable temp=arr[i];
        arr[i] =arr[j];
        arr[j]=temp;
    }

    public static void mergesort(Comparable[] arr){
        //初始化辅助数组
        assist=new Comparable[arr.length];
        //定义lo,hi;
        int lo=0;
        int hi=arr.length-1;
        //指定范围排序（重载）
        mergesort(arr,lo,hi);
    }
    public static void mergesort(Comparable[] arr,int lo,int hi){
        if(hi<=lo) return;
        int mid=(hi+lo)/2;
        //递归调用，分解数组，直至最小
        mergesort(arr,lo,mid);
        mergesort(arr,mid+1,hi);
        merge(arr,lo,mid,hi);
    }
    //归并的核心
    private static void merge(Comparable[] arr,int lo,int mid,int hi) {
        //定义指针（遍历，移动，比较）
        int assist_point=lo;//辅助数组指针
        int left_point=lo;//左子组指针
        int right_point=mid+1;//右子组指针

        //比较放值；
        while (left_point<=mid && right_point<=hi){
            if (less(arr[left_point],arr[right_point])){
                assist[assist_point++]=arr[left_point++];//先赋值再++
            }else {
                assist[assist_point++]=arr[right_point++];
            }
        }
        //遍历剩余子组元素
            //左遍历
        while (left_point<=mid){
                assist[assist_point++]=arr[left_point++];
        }
            //右遍历
        while (right_point<=hi){
            assist[assist_point++]=arr[right_point++];
        }
        //回写数据到原数组
        for (int i = lo; i <=hi ; i++) {
            arr[i]=assist[i];
        }
    }
}
