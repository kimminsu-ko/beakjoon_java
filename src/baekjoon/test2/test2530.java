package baekjoon.test2;
import java.util.Scanner;

//영수증에 적힌,
//
//구매한 각 물건의 가격과 개수
//구매한 물건들의 총 금액
//을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
//첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.
//둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
//이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
//1 <= X <= 1000000000  1<=N<=100 1<= a <= 1000000 1 <= b <= 10
public class test2530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilge = sc.nextInt();
        int typenum = sc.nextInt();
        int result = 0;

        for(int i = 0;i<typenum;i++){
            int object = sc.nextInt();
            int count = sc.nextInt();
            result += object*count;
        }
        if(result ==bilge){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}
