package Homework1;

public class IntArray {

    public static String toString(int[] arr){

        //如果int类型数组arr为null，toString方法返回字符串"null"
        if(arr == null) return "null";
        //如果int类型数组arr长度为0，toString方法返回字符串"[]"
        if(arr.length == 0) return "[]";
        //如果int类型数组arr的内容为{1,2,3,4,5},toString方法返回字符串"[1, 2, 3, 4, 5]"
        String s = "[";
        for (int i :
                arr) {
            s = s+i+",";
        }
        return s.substring(0,s.length()-1)+"]"; //去除末尾逗号并添加"]"
    }

    public static void main(String[] args) {
        int[] arr = {8,1,0,9,7,5};
        System.out.println(IntArray.toString(arr));
    }
}
