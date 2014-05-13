package jp.co.jjs.java_seminar.exercise_20140513_09;


public class Exercise11 {
    public static void main(String[] args) {

        int buy = 4300;
        int mny = 5000;

        int m10s = 0;
        int m5s  = 0;
        int m2s  = 0;
        int m1s  = 0;
        int m50h = 0;
        int m10h = 0;
        int m5h  = 0;
        int m1h  = 0;
        int m5e  = 0;
        int m1e  = 0;

        int change = mny - buy;
        
        for (; change >= 5000;) {
            if (5000 <= change)
                m5s += 1;
                change -= 5000;
        }
        for (; change >= 2000;) {
            if (2000 <= change)
                m2s += 1;
                change -= 2000;
        }
        for (; change >= 1000;) {
            if (1000 <= change)
                m1s += 1;
                change -= 1000;
        }
   
        for (; change >= 500;) {
            if (500 <= change)
                m50h += 1;
                change -= 500;
        }
   
        for (; change >= 100;) {
            if (100 <= change)
                m10h += 1;
                change -= 100;
        }
   
        for (; change >= 50;) {
            if (50 <= change)
                m5h += 1;
                change -= 50;
        }
        for (; change >= 10;) {
            if (10 <= change)
                m5e += 1;
                change -= 10;
        }
        for (; change >= 1;) {
            if (1 <= change)
                m1e += 1;
                change -= 1;
        }
   
        

        System.out.println("買い物した金額：" + buy);
        System.out.println("支払った金額　：" + mny);
        System.out.println("10000円："+ m10s);
        System.out.println(" 5000円："+ m5s);
        System.out.println(" 2000円："+ m2s);
        System.out.println(" 1000円："+ m1s);
        System.out.println("  500円："+ m50h);
        System.out.println("  100円："+ m10h);
        System.out.println("   50円："+ m5h);
        System.out.println("   10円："+ m5e);
        System.out.println("    1円："+ m1e);
    }

}
