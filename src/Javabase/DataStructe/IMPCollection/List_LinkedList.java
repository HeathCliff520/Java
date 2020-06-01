package Javabase.DataStructe.IMPCollection;

import java.util.LinkedList;

/*Collection接口<-list
                <-set
list:有序,[],可重复
方法：add，get,remove,set
遍历：for，迭代器,list.for
LinkedList原理：链表，增删快，不使用多态
*/
public class List_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkls= new LinkedList<>();
        linkls.add(8);
        linkls.add(3);
        linkls.addFirst(30);
        linkls.addLast(50);
        System.out.println(linkls);//重写了toString方法
        System.out.println(linkls.getFirst());
        System.out.println(linkls.getLast());
        linkls.clear();
        while (!linkls.isEmpty()){
            System.out.println(linkls);
        }
        linkls.add(33);
        System.out.println(linkls.removeFirst());
    }
}
