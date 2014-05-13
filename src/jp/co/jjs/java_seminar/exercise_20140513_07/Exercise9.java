package jp.co.jjs.java_seminar.exercise_20140513_07;

public class Exercise9 {
    public static void main(String[] args) {
        
        //int配列
        int[] x;
        x = new int[5];
        
        x[0] = 10;
        x[1] = 4;
        x[2] = 56;
        x[3] = 86;
        x[4] = 340;
        
        int[] y = {0,0,0,0,0};
        
        //String配列
        String[] c;
        c = new String[5];
        
        c[0] = "a";
        c[1] = "b";
        c[2] = "cd";
        c[3] = "efg";
        c[4] = "hijk";
        
        String[] s = {"","","","",""};
        
        System.out.println("配列 ｘ[]の長さ："+ x.length);
        System.out.println("x[3]の中身は："+ x[3]);
        System.out.println("c[3]の中身は："+ c[3]);
    }

}
//要素数の長さ
//添え字を使って値がとれる