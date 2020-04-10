package ExerciseP2.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class CollectionIterator {
//迭代器测试
public static void IteratorTest(){
    //创建集合并添加元素
    Collection<Integer> arrlist= new ArrayList<Integer>();
    Random CreatedRandom=new Random();
    CreatedRandom.setSeed(System.currentTimeMillis());
    for (int i = 0; i < 20; i++) {
        arrlist.add(CreatedRandom.nextInt(1024));
    }
    //使用迭代器方法创建迭代器
            //起始位为-1；
    Iterator<Integer> ItorBeenCreated = arrlist.iterator();
    //取出下一个位置值：boolean hasNext();
    while(ItorBeenCreated.hasNext()){//下一位置有元素循环继续
        //使用next取出元素
        System.out.println(ItorBeenCreated.next());
        //while循环不知道边界
    }

    //foreach 的使用 ，since 1.5
    System.out.println("================使用foreach遍历元素=====================");
    for (int ele:arrlist) {
        System.out.print(ele + " ");
    }

}

//程序入口
public static void main(String[] args) {
    IteratorTest();
}

}
