package backjoonProject.chap1.ch_1292;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 동호는 내년에 초등학교를 입학한다. 
 * 그래서 동호 어머니는 수학 선행 학습을 위해 쉽게 푸는 문제를 동호에게 주었다.
 * 이 문제는 다음과 같다. 
 * 1을 한 번, 2를 두 번, 3을 세 번, 이런 식으로 1 2 2 3 3 3 4 4 4 4 5 .. 이러한 수열을 만들고 어느 일정한 구간을 주면 그 구간의 합을 구하는 것이다.
 * 하지만 동호는 현재 더 어려운 문제를 푸느라 바쁘기에 우리가 동호를 도와주자.
 * 
 * input : 첫째 줄에 구간의 시작과 끝을 나타내는 정수 A, B(1 ≤ A ≤ B ≤ 1,000)가 주어진다. 
 * 즉, 수열에서 A번째 숫자부터 B번째 숫자까지 합을 구하면 된다.
 * 
 * output : 첫 줄에 구간에 속하는 숫자의 합을 출력한다.
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	String str = br.readLine();
    	br.close();
    	
    	String[] strArr = str.split(" ");
    	List<Integer> intArr = new ArrayList<Integer>();
    	for(int i=0; i<2; i++) {
    		intArr.add(Integer.parseInt(strArr[i]));
    	}
    	
    	List<Integer> seqArr = new ArrayList<Integer>();
    	for(int i=1; i<=intArr.get(1); i++) {
    		for(int j=i; j<=intArr.get(1); j++) {
    			seqArr.add(j);
    		}
    	}
    	Collections.sort(seqArr);

    	int sum = 0;
    	for(int i=intArr.get(0)-1; i<intArr.get(1); i++) {
			sum += seqArr.get(i);
    	}
    	
    	bw.write(String.valueOf(sum));
    	bw.close();
	}
}
