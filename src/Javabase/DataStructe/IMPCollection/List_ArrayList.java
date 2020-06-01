package Javabase.DataStructe.IMPCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*Collection接口<-list
                <-set
list:有序,[],可重复
方法：add，get,remove,set
遍历：for，迭代器,list.for
ArrayList原理：数组，不同步(快)，查询快
*/
public class List_ArrayList {
    public static void main(String[] args) {
        System.out.println("==============list的arraylist实现==============");
    //  接口                  实现类
        List<Integer> ls=new ArrayList<Integer>();
        //可重复
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(10);
        ls.add(3,25);
        //有索引值
        System.out.println("取到0号元素的值："+ls.get(0));
        System.out.println("被移除的元素是："+ls.remove(1));
        System.out.println(ls);//有序插入，ArrayList重写toString方法
        System.out.println("被替换的元素："+ls.set(ls.size()-1,100));
        //遍历
        System.out.println("=================遍历=======================");
        //list.for
        System.out.print("使用list.for遍历： ");
        for (Integer ele : ls) {
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.print("使用for遍历： ");
        for (int i = 0; i < ls.size(); i++) {
            System.out.print(ls.get(i)+" ");
        }
        System.out.println();
        System.out.print("使用迭代器遍历： ");
        Iterator<Integer> iterator = ls.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}
