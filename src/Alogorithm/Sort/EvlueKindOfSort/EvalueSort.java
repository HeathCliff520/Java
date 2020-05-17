package Alogorithm.Sort.EvlueKindOfSort;

import Alogorithm.Sort.InsertSort.InsertSort;
import Alogorithm.Sort.ShellSort.ShellSort;

import java.util.*;

public class EvalueSort {
    //测试数据总数
    public static int NUM=100000;

    public static void main(String[] args) {
        //最坏情况测试
        TestShellTime(BadTestdata(new ArrayList<Integer>()));//Shell排序花费的时间：8
        TestInsertTime(BadTestdata(new ArrayList<Integer>()));//插入排序花费的时间：214
        //随机情况测试
        TestShellTime(RandTestData(new ArrayList<Integer>()));
        TestInsertTime(RandTestData(new ArrayList<Integer>()));
    }



    public static Integer[] BadTestdata(ArrayList<Integer> list){
        //最坏情况下的算法评估；
        for (int i = NUM; i > 0; i--) {
            list.add(i);
        }
        Integer[] toBetest=list.toArray(new Integer[list.size()]);

        return toBetest;
    }

    public static Integer[] RandTestData(ArrayList<Integer> list) {
        //随机放入相同数量的数
        Random sand=new Random();
        sand.setSeed(System.currentTimeMillis());
        for (int i = 0; i < NUM; i++) {
            list.add(sand.nextInt());
        }
        Integer[] randTest=list.toArray(new Integer[list.size()]);
        return randTest;
    }

    public static void TestInsertTime(Integer[] arr) {
        long start = System.currentTimeMillis();
        InsertSort.insert(arr);
        long lengthTime = System.currentTimeMillis()-start;
        System.out.println("插入排序花费的时间："+lengthTime);
    }

    public static void TestShellTime(Integer[] arr) {
        long start = System.currentTimeMillis();
        ShellSort.shell(arr);
        long lengthTime = System.currentTimeMillis()-start;
        System.out.println("Shell排序花费的时间："+lengthTime);
    }
}
