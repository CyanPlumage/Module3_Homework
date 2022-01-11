package Homework2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        //准备一个List集合
        List lt1 = new ArrayList();
        //在List集合中增加三个员工，基本信息如下：  "凤姐" 18 20000  "欧阳峰" 60 8000  "刘德华" 40 30000
        lt1.add(new Worker("凤姐",18,20000));
        lt1.add(new Worker("欧阳峰",60,8000));
        lt1.add(new Worker("刘德华", 40, 30000));
        System.out.println("lt1 = " + lt1);
        System.out.println("----------------------");
        //在"欧阳峰"之前插入一个员工，信息为：姓名："张柏芝"，年龄：35，工资3300
        lt1.add(0, new Worker("张柏芝",35,3300));
        System.out.println("lt1 = " + lt1);
        System.out.println("----------------------");
        //删除"刘德华"的信息

        lt1.remove(3);
        System.out.println("lt1 = " + lt1);
        System.out.println("----------------------");
        //利用for 循环遍历，打印List 中所有员工的信息
        for(int i = 0; i < lt1.size(); i ++){
            System.out.println(lt1.get(i));
        }
        System.out.println("----------------------");
        //利用迭代遍历，对List 中所有的员工调用work 方法
        Iterator it = lt1.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
        //为Worker类重写equals 方法，当姓名、年龄、工资全部相等时候才返回true

    }
}
