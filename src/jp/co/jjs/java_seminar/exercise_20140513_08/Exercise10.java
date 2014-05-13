package jp.co.jjs.java_seminar.exercise_20140513_08;

public class Exercise10 {
    public static void main(String[] args) {

        int fb;
        for (int i = 1; i <= 30; i++) {
            
            fb = i;

            if (0 == fb % 3 && 0 == fb % 5) {
                System.out.println("FizzBuzz!!");
            } else if (0 == fb % 3) {
                System.out.println("Fizz!");
            } else if (0 == fb % 5) {
                System.out.println("Buzz!");
            } else {
                System.out.println(fb);
            }
        }
    }
}
