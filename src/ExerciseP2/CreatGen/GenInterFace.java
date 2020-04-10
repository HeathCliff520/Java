package ExerciseP2.CreatGen;

//定义泛型接口
public interface GenInterFace<TYPE> {
    //抽象方法
    public abstract void InterFaceMethod(TYPE Inp);
    //默认方法
    public default void Dmethon(TYPE Def){
        System.out.println(Def);
    }
}
