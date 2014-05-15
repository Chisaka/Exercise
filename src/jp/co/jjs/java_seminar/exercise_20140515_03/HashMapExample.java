package jp.co.jjs.java_seminar.exercise_20140515_03;

import java.util.HashMap;

public class HashMapExample {
    
    public static void main(String[] args) {
        
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        map.put("カレー", 450);
        map.put("カツカレー", 570);
        map.put("牛丼", 300);

        System.out.println(map.keySet());
        
        System.out.println(map.values());

        System.out.println(map.get("カツカレー"));
        
        System.out.println(map.entrySet());
    }

    private static char[] Collection() {
        // TODO 自動生成されたメソッド・スタブ
        return null;
    }

}
