package baekjoon.test2;
import java.util.Scanner;

//훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때,
// 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
public class test2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int worktime = sc.nextInt();

        int worktime_h = 0;
        int worktime_m = 0;

        worktime_h = worktime/60;
        worktime_m = worktime%60;
        hour += worktime_h;
        minute += worktime_m;

        if(minute>=60){
            hour+=1;
            minute -=60;
            if(hour>=24){
                hour-=24;
            }
        }else if(hour>=24){
            hour-=24;
        }
        System.out.printf("%d ",hour);
        System.out.print(minute);
    }
}
