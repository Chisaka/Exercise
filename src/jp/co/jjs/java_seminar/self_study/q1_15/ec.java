package jp.co.jjs.java_seminar.self_study.q1_15;

public class ec {
    public static void main(String[] args) {
        
        //1.15.1
        //宣言できない
        
        //1.15.2
        byte[] b = {0, 0, 0, 0};
        for(int i : b){
            System.out.println(i);
        }
        
        //1.15.3
        double[] d = {0.56, 30.635, 10.54, 0.876};
        double avg = 0;
        for(double i : d){
            avg += i; 
        }
        avg /= d.length;
        System.out.println(avg);
        
    }

}
