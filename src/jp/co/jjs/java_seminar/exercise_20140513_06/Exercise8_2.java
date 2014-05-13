package jp.co.jjs.java_seminar.exercise_20140513_06;

public class Exercise8_2 {
    public static void main(String[] args) {
        
        String str = "木";
        

        if(str.equals("日")){
            System.out.println("今日は" + str + "曜日、土曜日に戻れ");
        }
        else if(str.equals("月")){
            System.out.println("今日は" + str + "曜日、日曜日に戻れ");
        }
        else if(str.equals("火")){
            System.out.println("今日は" + str + "曜日、先は長いです");
        }
        else if(str.equals("水")){
            System.out.println("今日は" + str + "曜日、折り返し地点です");
        }
        else if(str.equals("木")){
            System.out.println("今日は" + str + "曜日、もうちょっとだ頑張ろう");
        }
        else if(str.equals("金")){
            System.out.println("今日は" + str + "曜日、明日は休みだ！");
        }
        else if(str.equals("土")){
            System.out.println("今日は" + str + "曜日、明日も休みだ！");
        }
    }
}


    