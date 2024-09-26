package baekjoon.test2;
import java.util.Scanner;

//1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
//
//같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
//같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
//모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
//예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면
// 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면
// 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
//
//3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
public class test2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        int[] dice = {one, two, three};
        int max = 0;
        int result = 0;
        int SameNumber =0;      //같은 주사위 눈의 수

        //최댓값(max)구하는 조건문
        if(one > two) {
            if(one > three) {
                max = one;
            }else{
                max = three;
            }
        }else{
            if(two>three){
                max = two;
            }else{
                max = three;
            }
        }
        int A=0;
        for(int i=0;i<dice.length-1;i++){
            for(int j=0;j+i<dice.length-1;j++) {
                if (dice[i] == dice[j+1+i]) {
                    A++;
                    SameNumber = dice[i];
                }
            }
        }
        //A가 1일때 같은수가 2개 A가 3개일때 같은수가 3개인 수식
        if(A==1){
            result = 1000+SameNumber*100;
            System.out.print(result);
        }else if(A==3){
            result = 10000+SameNumber*1000;
            System.out.print(result);
        }else if(A==0){
            result = 100*max;
            System.out.print(result);
        }
    }
}
