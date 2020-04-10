package ExerciseP2.CreatGen;

public class GenInterFaceImplement<TYPE> implements GenInterFace<TYPE>{
    @Override
    public void InterFaceMethod(TYPE Inp) {
        System.out.println(Inp);
    }

    @Override
    public void Dmethon(TYPE Def) {
        System.out.println("泛型接口的默认方法已经被重写了");
    }
}
