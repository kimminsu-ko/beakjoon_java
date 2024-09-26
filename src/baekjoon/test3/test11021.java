package baekjoon.test3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

//T값을 받아서 다음에오는 A,B값을 더해서 Case #1: 2 이런식으로 출력해주기
public class test11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st ;

        //첫줄에 들어오는 입력 N에 int형으로 넣어주기
        int N = Integer.parseInt(br.readLine());

        //반복해서 입력되오는 값을 st에 저장하고 nextToken으로 구분자로 분리된 값을 반환하고 int값으로 변환해서 출력해줌
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            bw.write("case #"+(i+1)+": "+(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
        }
        bw.close();
    }
}
