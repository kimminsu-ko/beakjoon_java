package baekjoon.test1;
import java.util.Scanner;

//두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
public class test1008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double div = x/y;
        System.out.printf("%.9f",div);
    }
}
