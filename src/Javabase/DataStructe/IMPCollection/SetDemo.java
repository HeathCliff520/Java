package Javabase.DataStructe.IMPCollection;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Person> hs = new HashSet<>();
        hs.add(new Person(19,"li"));
        hs.add(new Person(34,"o"));
        hs.add(new Person(55,"car"));
        hs.add(new Person(30,"zhao"));
        hs.add(new Person(22,"hgaah"));//重写equels方法
        hs.add(new Person(22,"hgaah"));//不包含重复值
        Iterator<Person> iterator = hs.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
