package jp.co.jjs.java_seminar.exercise_20140513_08;

public class Exercise10 {
    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {

            if (0 == i % 3 && 0 == i % 5) {
                System.out.println("FizzBuzz!!");
            } else if (0 == i % 3) {
                System.out.println("Fizz!");
            } else if (0 == i % 5) {
                System.out.println("Buzz!");
            } else {
                System.out.println(i);
            }
        }
    }
}
