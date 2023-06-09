package backjoonProject.chap1.ch_2609;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * 두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.
 * 
 * input : 첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
 * 
 * output : 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
 * 
 * @author siwon
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	String n = bf.readLine();
    	String[] nArr = n.split(" ");
    	int[] nIntArr = new int[nArr.length];
    	List<List<Integer>> int2Arr = new ArrayList<List<Integer>>();
    	for(int i=0; i<nIntArr.length; i++) {
    		List<Integer> intArr = new ArrayList<Integer>();
    		nIntArr[i] = Integer.parseInt(nArr[i]);
    		if(2 <= nIntArr[i]) {
    			for(int ni=2; ni<nIntArr[i]; ni++) {
    				if(nIntArr[i]%ni == 0) {
    					intArr.add(ni);        				
        			}
    			}    			
    			intArr.add(nIntArr[i]);
    		}
    		Collections.sort(intArr);
    		int2Arr.add(intArr);
    	}
    	//최대공약수
    	if(nIntArr[0] <= 0 || nIntArr[1] <= 0) {
    		System.out.println(0);
    		System.out.println(0);
    	}else {
    		if(nIntArr[0] < nIntArr[1]) {
    			int2Arr.get(0).retainAll(int2Arr.get(1));
    			if(Objects.equals(0, int2Arr.get(0).size())) {
    				System.out.println(1);
    			}else {
    				System.out.println(Collections.max(int2Arr.get(0)));      			
    			}
    		}else {
    			int2Arr.get(1).retainAll(int2Arr.get(0));
    			if(Objects.equals(0, int2Arr.get(1).size())) {
    				System.out.println(1);
    			}else {
    				System.out.println(Collections.max(int2Arr.get(1)));      			
    			}
    		}
    		
    		//최소공배수
        	int a = nIntArr[0];
        	int b = nIntArr[1];
        	while(true) {
        		if(nIntArr[0] == nIntArr[1]) {
        			break;
        		}
        		if(nIntArr[0]<nIntArr[1]) nIntArr[0] += a;
        		else nIntArr[1] += b;
        	}
        	System.out.println(nIntArr[0]);
    	}
    }
}