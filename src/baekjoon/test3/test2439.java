package baekjoon.test3;
import java.util.Scanner;

//입력된 n층만큼 *을 보기처럼 쌓는 문제
//    *
//   **
//  ***
// ****
//*****

public class test2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0;i<N;i++) {
            for(int j=0;j<N-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            if(i<N-1) {
                System.out.println();
            }else{
                break;
            }

        }
    }
}
