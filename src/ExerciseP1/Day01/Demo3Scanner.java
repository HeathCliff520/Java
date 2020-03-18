package ExerciseP1.Day01;

import java.util.Scanner;

public class Demo3Scanner {
    public static void main(String[] args) {
        //创建
        Scanner myinput = new Scanner(System.in);
        System.out.println("输入A：");
        int a = myinput.nextInt();
        System.out.println("输入B：");
        int b = myinput.nextInt();
        System.out.println("输入C：");
        int c = myinput.nextInt();

        int result=a>b ? a : b;
        int Max=c > result ? c: result;
        System.out.println("最大数："+ Max);

    }


}
