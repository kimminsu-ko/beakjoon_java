package baekjoon.test2;
import java.util.Scanner;

//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
public class test9498 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();

        if(90<=grade){
            System.out.print("A");
        } else if (80<=grade) {
            System.out.print("B");
        } else if (70<=grade) {
            System.out.print("C");
        } else if (60<=grade) {
            System.out.print("D");
        } else {
            System.out.print("F");
        }
    }
}
