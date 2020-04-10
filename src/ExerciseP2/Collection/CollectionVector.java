package ExerciseP2.Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class CollectionVector {
    //ArrayList集合测试
    public static void MytestCollection(){
        Collection<Integer> Arr= new ArrayList<>();
        Random CreatedRandom= new Random();//随机数的使用
        CreatedRandom.setSeed(System.currentTimeMillis());

//公共方法的使用测试
        //添加：boolean add(E e);
        for (int i = 0; i <3 ; i++) {
            if (Arr.add(CreatedRandom.nextInt(100))){
                System.out.println("ele add success!!!");
            }
        }
        //移除：boolean remove(Object o)
        Arr.add(20);
        int ExistEle=20;int NoExistEle=21;
        if (Arr.remove(ExistEle)){//有元素被删除，则true
            System.out.println("元素20已经成功移除");
        }
        else {
            System.out.println("not find the ele of 21");
        }
        //判空：boolean isEmpty();
        if(!Arr.isEmpty()){
            System.out.println("集合不空");
        }
        //转为数组:Object[] toArray();
        Object[] ReceiveArr = Arr.toArray();//可以使用[]访问数组
        System.out.println("转为数组后，pos[1]的元素值是："+ReceiveArr[1]);

        //清空集合(只移除元素)：void clear();
        Arr.clear();
        if (Arr.isEmpty()){
            System.out.println("集合中没有元素了");
        }
    }

//程序入口
    public static void main(String[] args) {
        MytestCollection();
    }
}
