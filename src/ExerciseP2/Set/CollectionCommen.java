package ExerciseP2.Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/*测试Collections类的公共方法
* */
public class CollectionCommen {
    public static void main(String[] args) {
        TestCollectionFunction();
    }

    private static void TestCollectionFunction() {
        ArrayList<Integer> Myarr=new ArrayList<>();
        //利用addall给对象一次添加多个元素
        Collections.addAll(Myarr,11,24,14,7);
        //置乱器：shuffle
        Collections.shuffle(Myarr);
        System.out.println(Myarr);
        //sort默认升序
        Collections.sort(Myarr);
        System.out.println("排序之后："+Myarr);
        Collections.sort(Myarr, Comparator.reverseOrder());
        System.out.println("降序排序后："+Myarr);


        //测试Collections.sort(List<T> list, Comparator<? super T> c)方法
        ArrayList<Person> MyPerson = new ArrayList<>();
        MyPerson.add(new Person("li",10));
        MyPerson.add(new Person("zhao",14));
        MyPerson.add(new Person("sun",13));
        MyPerson.add(new Person("qian",22));
        System.out.println("未调用sort："+MyPerson.toString());
        Collections.sort(MyPerson,Person::compareTo);
        System.out.println("调用sort之后："+MyPerson.toString());
    }
}
