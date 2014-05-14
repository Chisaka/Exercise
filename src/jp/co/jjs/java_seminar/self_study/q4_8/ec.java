package jp.co.jjs.java_seminar.self_study.q4_8;

public class ec {
    public static void main(String[] args) {

        int i = 1;
        int j = 2;
        
        int k = 653;
        k %= 2;
        
        /*4.8_1
         * case式に変数は使用できないためコンパイルエラーとなる
         */

        //4.8_2
        
        switch (k) {
        case 1:
            System.out.println(i + "位");
            break;
        case 2:
            System.out.println(j + "位");
            break;
        default:
            System.out.println("Default");
        }
    }

}
