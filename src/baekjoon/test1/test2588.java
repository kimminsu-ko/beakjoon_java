package baekjoon.test1;
import java.util.Scanner;

//3자리의 곱셈계산과정중 1의자리 곱과 2의자리 곱을 나타내는 프로그램을 만들어라
public class test2588 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int B_100 = (B/100)*100;        //100의자리
        int B_10 = ((B-B_100)/10)*10;   //10의자리
        int B_1 = B-B_100-B_10;         //1의자리

        System.out.println(A*B_1);
        System.out.println(A*B_10/10);
        System.out.println(A*B_100/100);
        System.out.println(A*B);
    }
}
