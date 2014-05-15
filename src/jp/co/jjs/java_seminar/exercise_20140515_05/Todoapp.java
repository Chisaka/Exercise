package jp.co.jjs.java_seminar.exercise_20140515_05;

import java.util.HashMap;

public class Todoapp {
    public static void main(String[] args) {
        
        HashMap<Integer, String> task = new HashMap<>();
        Complete comp = new Complete();
        
        task.put(1, "牛乳を買う");
        task.put(2, "卵を買う");
        task.put(3, "ArrayListを使いこなす");
        task.put(4, "家を買う");
        
        task.put(1, comp.complete(task.get(1)));
        
        for(int i = 1; i <= task.size(); i++){
            System.out.println(i + "．" + task.get(i));
        }
    }
}
