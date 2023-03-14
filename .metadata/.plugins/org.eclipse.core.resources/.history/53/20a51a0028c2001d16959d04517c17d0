package backjoonProject.chap1.ch_1330;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 * 
 * input : 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
 * 
 * output : 첫째 줄에 다음 세 가지 중 하나를 출력한다.
 *　・　A가 B보다 큰 경우에는 '>'를 출력한다.
 *　・　A가 B보다 작은 경우에는 '<'를 출력한다.
 *　・　A와 B가 같은 경우에는 '=='를 출력한다.
 * @author siwon
 *
 */
public class Main {
	private final static int maxLimit = 2; //몇개의 정수를 받을 건지
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	String arr = scan.nextLine();
    	String[] integerArr = arr.split(" ");
    	int j = 0;
    	List<Integer> a = new ArrayList<Integer>();
    	for(int i=0; i<maxLimit; i++) {
			a.add(Integer.parseInt(integerArr[j++]));    		
    	}
    	
    	if(a.get(0)<a.get(1)) {
			System.out.println("<");
		}else if(a.get(0)>a.get(1)) {
			System.out.println(">");
		}else {
			System.out.println("==");
		}
    }
}
