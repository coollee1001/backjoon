package backjoonProject.chap1.ch_10189;
/**
 * https://www.acmicpc.net/problem/10170
 * 
 * @author siwon
 *
 */
public class Main {
    public static void main(String[] args){
    	
    	String[] str = {"#  # #### #### #  #", "#### #  # #  # # #"};
    	boolean flag = true;
    	for(int i = 1; i <= 4; i++) {
    		if(i%2 == 0) flag = !flag;
    		if(flag) {
    			System.out.println(str[0]);
    		}else {
    			System.out.println(str[1]);
    		}
    	}
    }
}