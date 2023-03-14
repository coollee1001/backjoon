package backjoonProject.chap1.ch_2558;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 
 * input : 첫째 줄에 A, 둘째 줄에 B가 주어진다. (0 < A, B < 10)
 * 
 * output : 첫째 줄에 A+B를 출력한다.
 * 
 * @author siwon
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        st = new StringTokenizer(Integer.toString(a + b), "\n");

        System.out.println(st.nextToken());
    }
}