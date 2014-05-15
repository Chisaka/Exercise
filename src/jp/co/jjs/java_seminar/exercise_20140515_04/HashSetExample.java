package jp.co.jjs.java_seminar.exercise_20140515_04;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
    
        HashSet<String> hashset = new HashSet<>();
        
        hashset.add("abc");
        hashset.add("def");
        hashset.add("hij");
        
        hashset.add("hij");
        
        System.out.println(hashset);
        
        hashset.remove("hij");
        
        System.out.println(hashset);
}
}
