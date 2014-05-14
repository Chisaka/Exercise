
package jp.co.jjs.java_seminar.exercise_20140514_02;

public class Main {

    public static void main(String[] args) {

        Student student = new Student(0001, "田中太郎");
        
        student.subject();
        student.subject();
        student.subject();
        String report = student.answer();

        
        System.out.println(report);

    }

}
