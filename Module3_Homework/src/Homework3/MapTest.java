package Homework3;

import java.util.*;

public class MapTest {

    public static void main(String[] args) {

        //定义一个hashMap对象
        Map m1 = new HashMap();
        //添加学生
        m1.put(new Student("张三",30), "北京");
        m1.put(new Student("李四",35), "上海");
        m1.put(new Student("王五",40), "广州");
        m1.put(new Student("赵六",40), "深圳");

        //1.获取Map中所有的key并组成Set视图
        Set<Student> s1 = m1.keySet();
        for(Student st : s1){
            System.out.println(st + "::" + m1.get(st));
        }
        System.out.println("------------------------------");

        //2.获取Map中所有的Value并组成Collection视图
        Collection<String> co = m1.values();
        for(String st : co){
            System.out.println(st);
        }
        System.out.println("------------------------------");

        //3.获取Map集合中所有的键值并组成Set视图
        Set entrySet = m1.entrySet();
        for(Object st : entrySet){
            System.out.println(st);
        }
        System.out.println("------------------------------");

        //4.Iterator
        Iterator iterator = m1.entrySet().iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
