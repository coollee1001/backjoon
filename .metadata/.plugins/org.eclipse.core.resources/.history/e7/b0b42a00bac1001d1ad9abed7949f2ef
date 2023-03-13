package backjoonProject.chap1.ch_1000;

import java.util.Scanner;

/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *  
 * input : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * output : 첫째 줄에 A+B를 출력한다.
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    	String arr = scan.nextLine();
    	String[] integerArr = arr.split(" ");
    	int sum = 0;
    	int index = 0;
    	for(String integerStr : integerArr) {
    		int changeInt = Integer.parseInt(integerStr);
    		sum += changeInt;
    		if(index == 1) {
    			System.out.println(sum);
    			return;
    		}
    		index++;
    	}
	}
}
