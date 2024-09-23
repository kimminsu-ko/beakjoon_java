package baekjoon.test2;
import java.util.Scanner;

//첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
//주어진 좌표가 제n분면임을 확인하고 n을 출력하시오.
public class test14681 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x>0){
            if(y>0){
                System.out.print("1");
            }
            if(y<0){
                System.out.print("4");
            }
        } else if(x!=0){
            if(y>0){
                System.out.print("2");
            }
            if(y<0){
                System.out.print("3");
            }
        }
    }
}
