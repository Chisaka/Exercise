package jp.co.jjs.java_seminar.exercise_20140514_02;

public class Student {

    int id;
    double number;
    char grade;
    byte age;
    String name;
    String sex;
    int sub;
    String str = "問解きました！";

    public Student(int id, String name) {
        this.id = id;
        this.name = name;

    }
    
    public int subject(){
        sub += 1;
        return sub;
    }
    
    public String answer(){
        return sub + str;
    }
}
