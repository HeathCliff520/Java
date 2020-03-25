package ExerciseP1.Day02.ParentClass;
//抽象方法必须定义在抽象类中
public abstract class Animal {
    //动物种类
    String Kind="哺乳动物";
    String animalName;
    public abstract void GoMethod();
    public abstract void WhatKindOf();
    public abstract void WhatName();
}
