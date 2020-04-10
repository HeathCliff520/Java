package ExerciseP2.CreatGen;

public class MyDifineGenClass<E> {//定义泛类
    private E Name;

    public MyDifineGenClass(E name) {
        Name = name;
    }
    public E getName() {
        return Name;
    }
    public void setName(E name) {
        Name = name;
    }
    //定义泛型方法
    public <E> void Method01(E In){
        System.out.println(In);
    }
    //静态泛型方法
    public static <TYPE> void StillMethod(TYPE IN){
        System.out.println(IN);
    }



}
