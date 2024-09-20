package baekjoon.test1;
import java.util.Scanner;

//두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
public class test1001 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int sub = x-y;
        System.out.print(sub);
    }
}
