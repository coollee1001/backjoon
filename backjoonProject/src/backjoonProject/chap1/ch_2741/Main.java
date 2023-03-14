package backjoonProject.chap1.ch_2741;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 * 
 * input : 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 * 
 * output : 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 * 
 * @author siwon
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}