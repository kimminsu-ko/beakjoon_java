package baekjoon.test3;
import java.util.Scanner;

//N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오.
public class test2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < 9; i++) {
            System.out.printf("%d * %d = %d\n",n,i,i*n);
        }
        System.out.printf("%d * 9 = %d",n,n*9);
    }
}
