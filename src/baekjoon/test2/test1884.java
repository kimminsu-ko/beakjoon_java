package baekjoon.test2;
import java.util.Scanner;

//입력한 시간에서 45분을 뺀 시간을 출력하는 프로그램
//첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 알람 시간 H시 M분을 의미한다.
//
//입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다.
//시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
public class test1884 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hore = sc.nextInt();
        int minute = sc.nextInt();

        minute -= 45;
        if(minute<0){
            if(hore==0){
                hore += 24;
            }
            hore -= 1;
            minute += 60;
        }
        System.out.printf("%d ",hore);
        System.out.print(minute);
    }
}
