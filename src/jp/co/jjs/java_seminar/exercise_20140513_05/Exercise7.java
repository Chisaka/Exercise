package jp.co.jjs.java_seminar.exercise_20140513_05;

public class Exercise7 {

    public static void main(String[] args) {
        
        int n = 5;
        
        if(0 == n % 4 && 0 == n % 5){
            System.out.println("20の倍数です");
        }
        else if(0 == n % 4){
            System.out.println("4の倍数です");
        }
        else if(0 == n % 5){
            System.out.println("5の倍数です");
        }
        else{
            System.out.println("3以下の値です");
        }
    }
}
