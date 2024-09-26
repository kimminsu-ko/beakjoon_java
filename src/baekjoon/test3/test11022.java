package baekjoon.test3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

//첫 줄에 케이스번호 T를 주어준다. 몇번의 덧셈이 일어나는지 알려주는 번호이다. 그 뒤에 입력되는 A,B를 더하여 출력형식에 맞추어 출력하라.
//각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
public class test11022 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        //첫번째 케이스번호 변수T에 int형으로 저장
        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            //출력부분
            bw.write("Case #"+(i+1)+": "+A+" + "+B+" = "+(A+B)+"\n");
        }
        bw.close();
    }
}
