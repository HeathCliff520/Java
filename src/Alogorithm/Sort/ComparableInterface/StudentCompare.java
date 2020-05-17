package Alogorithm.Sort.ComparableInterface;

import Alogorithm.Sort.ComparableInterface.Student;

public class StudentCompare {
    public static void main(String[] args) {
        Student s1=new Student("li",15);
        Student s2=new Student("zhao",25);
        Comparable MaxAgeOfstudent =getMax(s1,s2);
        System.out.println(MaxAgeOfstudent);
    }
    public static Comparable getMax(Comparable c1, Comparable c2){
        int Result = c1.compareTo(c2);
        if (Result>0){
            return c1;
        }else {
            return c2;
        }
    }

}
