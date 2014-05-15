package jp.co.jjs.java_seminar.exercise_20140515_02;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        // 追加
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        
        // 削除
        list.remove(0);
        
        // size
        System.out.println(list.size());
        
        System.out.println(list.toString());
        
    }

}
