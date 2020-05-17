package Alogorithm.Sort.ShellSort;
/*希尔排序
定义增长量 h,利用插入排序
* */
public class ShellSort {
    public static void shell(Comparable[] arr) {
        //定增量h;
        int h=1;
        while (h<=arr.length/2){
            h=2*h+1;
        }
        //排序
        while (h>=1){
            //排序;
            for (int i = h; i <arr.length; i++) {//定位要交换的元素下标i
                for (int j=i;j>=h&&greater(arr[j-h],arr[j]);j-=h){//比较对换；
                    exchage(arr,j-h,j);
                }
            }
            //每次折半缩减h的规模，直至h为1
            h=h/2;
        }
    }

    public static boolean greater(Comparable v,Comparable w) {
        return v.compareTo(w)>0;
    }

    public static void exchage(Comparable[] arr,int u,int v) {
        Comparable temp=arr[u];
        arr[u]=arr[v];
        arr[v]=temp;
    }
}
