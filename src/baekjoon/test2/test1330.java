package baekjoon.test2;
import java.util.Scanner;

//두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
public class test1330 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A>B){
            System.out.print(">");
        } else if (A<B) {
            System.out.print("<");
        } else {
            System.out.print("==");
        }
    }
}
