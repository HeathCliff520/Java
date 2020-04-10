package ExerciseP2.CreatGen;

public class TestMyGenClass {
    public static void main(String[] args) {
        MyDifineGenClass<String> TestGen=new MyDifineGenClass<String>("li");
        System.out.println(TestGen.getName());
        TestGen.Method01("hello gen");
        //静态方法的使用：
        TestGen.StillMethod("不建议用对象调用静态方法");
        MyDifineGenClass.StillMethod("建议直接使用类调用静态方法");
        //使用泛型接口
        GenInterFaceImplement<String> geninter=new GenInterFaceImplement<>();
        geninter.InterFaceMethod("泛型类实现泛型接口的抽象方法");
        geninter.Dmethon("泛型接口的默认方法被覆盖重写了");
    }
}
