package baekjoon.test3;
import java.util.Scanner;

//첫번째 줄에 N이 입력되고 N을 4로 나눈갑만큼 "long "을 출력하고 마지막에 int를 출력하면 된다.
public class test25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int number = N/4;

        //long 출력하는 수식
        for(int i =0;i<number;i++){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
