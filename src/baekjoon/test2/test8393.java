package baekjoon.test2;
import java.util.Scanner;

//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
public class test8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for(int i =1;i<n+1;i++){
            result += i;
        }
        System.out.print(result);
    }
}
