package ExerciseP2.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;

public class TestHashSet {
    public static void main(String[] args) {
        TestHash();
        TestLinLinkedHashSet();
    }

    private static void TestLinLinkedHashSet() {
//it maintains a doubly-linked list running through all of its entrie
        LinkedHashSet<Integer> Mylhs=new LinkedHashSet<>();
        Random RdLhs=new Random();
        RdLhs.setSeed(System.currentTimeMillis());
        for (int i = 0; i < 20; i++) {

            Mylhs.add(RdLhs.nextInt(50));
        }
        System.out.println("LinkedHashSet输出结果："+Mylhs);
        System.out.println("LinkedHashSet共计放入元素："+Mylhs.size());
    }

    private static void TestHash() {
        HashSet<Integer> Myhash = new HashSet<>();
        Random Rd =new Random();
        Rd.setSeed(System.currentTimeMillis());
        for (int i = 0; i < 20; i++) {
            //1.不会包含重复元素
            //2.hashcode下的链表一旦超过存储数组的一半，链表自动转为红黑树
            Myhash.add(Rd.nextInt(50));
        }
        System.out.println("HashSet输出结果："+Myhash);
        System.out.println("Set中的的元素数共计："+Myhash.size());
    }
}
