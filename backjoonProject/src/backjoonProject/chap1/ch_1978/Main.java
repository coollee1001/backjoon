package backjoonProject.chap1.ch_1978;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 * 
 * input : 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
 * 
 * output : 주어진 수들 중 소수의 개수를 출력한다.
 * @author siwon
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	int count = Integer.parseInt(br.readLine());
    	String str = br.readLine();
    	String[] strArr = str.split(" ");
    	List<Integer> intArr = new ArrayList<Integer>();
    	for(int i=0; i<count; i++) {
    		intArr.add(Integer.parseInt(strArr[i]));
    	}
    	br.close();
    	
    	int sum = 0;
    	for(int i=0; i<intArr.size(); i++) {
    		boolean flag = true;
    		if(intArr.get(i) <= 1) flag = false;
    		for(int j=2; j<intArr.get(i); j++) {
    			if(intArr.get(i)%j==0) {
    				flag = false;
    			}
    		}
    		if(flag) sum++;
    	}
    	bw.write(String.valueOf(sum));
    	bw.close();
    }
}
