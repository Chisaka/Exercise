package jp.co.jjs.java_seminar.exercise_20140513_06;

public class Exercise8_1 {
    public static void main(String[] args) {

        String str = "日";

        /*
        String sun = "日";
        String mun = "月";
        String tue = "火";
        String wed = "水";
        String thu = "木";
        String fri = "金";
        String sut = "土";
        */
        
        switch (str) {
        case "日":
            System.out.println("今日は" + str + "曜日、土曜日に戻れ");
            break;

        case "月":
            System.out.println("今日は" + str + "曜日、日曜日に戻れ");
            break;

        case "火":
            System.out.println("今日は" + str + "曜日、先は長いです");
            break;

        case "水":
            System.out.println("今日は" + str + "曜日、折り返し地点です");
            break;

        case "木":
            System.out.println("今日は" + str + "曜日、もうちょっとだ頑張ろう");
            break;

        case "金":
            System.out.println("今日は" + str + "曜日、明日は休みだ！");
            break;

        case "土":
            System.out.println("今日は" + str + "曜日、明日も休みだ！");
            break;

        default:
            break;
        }
    }

}
