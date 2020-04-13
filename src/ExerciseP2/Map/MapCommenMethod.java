package ExerciseP2.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*双列特性
*
*
* */
public class MapCommenMethod {

    public static void main(String[] args) {
        TestMapCommon();
        TestTravelofMap();
        TestSelfClassOfMapKey();
    }

    private static void TestSelfClassOfMapKey() {
        System.out.println("=================自定义类作map关键字的使用==============================");
//自定义类型作map的关键字使用要重写hashcode与equals方法
                            //Sma: save amount of animal into a map
        Map<Animal,Integer> Sma= new HashMap<>();
                        //Animal作key使用，已经重写了hashcode方法
        Sma.put(new Animal("eatfood","dog"),10);
        Sma.put(new Animal("eatfish","cat"),15);
        Sma.put(new Animal("runing","house"),16);
        System.out.println("                        keyset()方法的使用");
        //1.使用keyset()方法获取关键字并使用set集合存取；
        Set<Animal> GetKey=Sma.keySet();
        //2.利用for循环遍历set集合
        for (Animal AnimalAskey:GetKey) {
        //3.使用map的get(k)方法获取k对应的值
            Integer aamount = Sma.get(AnimalAskey);
                                //使用了关键值的属性
            System.out.println(AnimalAskey.getName()+"的数量："+aamount);
        }
        System.out.println("                        EntrySet()方法的使用");
                                        //GEPS：Get Entry Put It into Set
        Set<Map.Entry<Animal, Integer>> GEPS=Sma.entrySet();
                                    //get a entry from geps
        for (Map.Entry<Animal,Integer> GAE:GEPS) {
            //entry的两个自有方法getkey,getvalue;
            Animal getkey=GAE.getKey();
            Integer getamount =GAE.getValue();
            System.out.println(getkey.getName()+"的数量："+getamount);
        }

    }

    //测试Map的两种遍历方法(keyset,entryset)
    private static void TestTravelofMap() {
        System.out.println("==============Map的两种遍历方法======================");
        Map<String,Integer> student = new HashMap<>();
        student.put("J",1069);
        student.put("Y",1032);
        student.put("B",1024);
//Set<K> keySet()方法的使用
        System.out.println("        KeySet方法");
        //1.存关键值
        Set<String> GetASetOfKey = student.keySet();
        //2.遍历存k的集合
        for (String Name:GetASetOfKey) {
        //3.使用get方法取出k的值
            Integer IDOfstudent = student.get(Name);
            System.out.println(Name+"="+IDOfstudent);
        }
//Set<Map.Entry<K, V>> entrySet()方法的使用
        System.out.println("        entrySet方法");
        //1.存值
        Set<Map.Entry<String, Integer>> Save_entries = student.entrySet();
        //2.for遍历set集合
        for (Map.Entry<String, Integer> entry : Save_entries) {
        //3.使用get(k)或者get(v)取值
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"--->"+value);
        }

    }

    //测试公共方法
    private static void TestMapCommon() {
        System.out.println("==============Map的四大公共方法=======================");
        Map<String,Integer> testMap=new HashMap<>();
        //1.put方法
        testMap.put("li",12);
        testMap.put("zhao",20);
        testMap.put("wang",18);
        //2.get方法
        Integer age=testMap.get("zhao");
        System.out.println(age);
        //3.remove
        boolean If_Can_del = testMap.remove("li", 12);
        System.out.println(If_Can_del);
        //4.containsKey
        boolean IfhasKey = testMap.containsKey("li");
        System.out.println(IfhasKey);
    }
}
