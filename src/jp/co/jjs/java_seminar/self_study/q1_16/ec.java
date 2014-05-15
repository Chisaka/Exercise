package jp.co.jjs.java_seminar.self_study.q1_16;

public class ec {
    public static void main(String[] args) {
        

        float[] a = {-56.7f};
        float[] b = {500.1f,70.70f};
        float[] c = {100.9f,0.5f,20.20f};
        float[][] d = {a,b,c};
        System.out.println(d[0][0]);
        System.out.println(d[1][0] + " " + d[1][1]);
        System.out.println(d[2][0] + " " + d[2][1] + " " + d[2][2]);

        
        int[] q = {1};
        int[] w = {1,2};
        int[] e = {1,2,3};
        int r[][] = {q,w,e};
        System.out.println(r.length);
        System.out.println(r[0].length + " " + r[1].length + " " + r[2].length);

        
        /*
        byte[][][] b = new byte[3][3][3];
        for(int i = 0 ;i < b.length;i++){
            for(int j = 0;j < b[i].length;j++){
                for(int k = 0;k < b[i][j].length;k++){
                    System.out.print(+b[i][j][j] + " ");
                }
                System.out.println();
            }
        
        }
        */
    }
}
