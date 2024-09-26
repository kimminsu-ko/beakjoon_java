package baekjoon.test3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

//종료점을 안잡아주는 덧셈문 -> EOF를 사용하시오.
//A+B를 출력하는 프로그램을 작성하시오.
public class test10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st ;
        String input = "";

        while((input = br.readLine()) != null){
            st = new StringTokenizer(input);
            int A= Integer.parseInt(st.nextToken());
            int B= Integer.parseInt(st.nextToken());

            bw.write((A+B)+"\n");
        }
        bw.close();
    }

}
