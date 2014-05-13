package jp.co.jjs.java_seminar.self_study.q1_11;

public class ec {
    public static void main(String[] args) {
        
        //1.11_1
        
        System.out.println((5 % 3 + 1)); // 3
        System.out.println((5 / 3 + 1)); // 2
        System.out.println((5 * 3 + 1)); //16
        
        //1.1_2
        
        int m = 3000;
        int mile = 75;
        
        double c = (double)m / mile;
        
        System.out.println(c);
        
        //1.11_3
        
        int d = ((10) + (((5))) / 3); //有効
        
        System.out.println(d);
        
        //1.11_4
        
        double wari = 0;
        
        wari = -5.9 % 3.3;
        System.out.println(wari); //-2.6000000000000005
        
        wari = -5.9 % -3.3;
        System.out.println(wari); //-2.6000000000000005
    }

}
