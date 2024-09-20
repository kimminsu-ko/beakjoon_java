package baekjoon.test1;
import java.util.Scanner;

//두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.+줄바꿈
public class test10869 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int [] A ={
                x+y,
                x-y,
                x*y,
                x/y,
                x%y
        };
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
    }
}
