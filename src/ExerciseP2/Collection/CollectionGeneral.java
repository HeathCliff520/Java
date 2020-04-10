package ExerciseP2.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionGeneral {//泛型(不知道元素类型)

    /*
    public static void NoGen() {//不使用泛型存在问题
        //list是一个object类
        ArrayList list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        //1.需要类型转换
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object obj=it.next();
            System.out.println(obj);
            //object要使用子类的方法需要转型
            String s = (String)obj;
            //异常抛出：Integer cannot be cast to String
            System.out.println(s.length());
        }

        // 2.异常在运行期抛出
        list.add("a");//类型指定了，会报错
    }

     */
    public static void GenTest() {
        /*优点
        1.不转换
        2.抛出异常提升到编译期
        */
        ArrayList<String> list =new  ArrayList<String>();
        list.add("abc");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s=it.next();
            System.out.println(s+"++++"+s.length());
        }

    }

    public static void main(String[] args) {
        GenTest();
    }

}
