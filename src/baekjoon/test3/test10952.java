package baekjoon.test3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//입력의 마지막 2수가 0 0이면 종료하는 프로그램을 작성하시오.
public class test10952 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        for(;true;){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken(),10);
            int B = Integer.parseInt(st.nextToken(),10);

            if(A!=0 && B!=0){
                bw.write((A+B)+"\n");
            }
            if(A==0 && B==0){
                break;
            }
        }
        bw.close();
    }
}
