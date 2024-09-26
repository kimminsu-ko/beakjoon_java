package baekjoon.test3;
import java.util.Scanner;

//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
public class test2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j =0; j<i+1;j++){
                System.out.print("*");
            }
            if(i<n-1) {
                System.out.println();
            }else{
                break;
            }
        }
    }
}
