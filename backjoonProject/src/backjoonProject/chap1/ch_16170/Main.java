package backjoonProject.chap1.ch_16170;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * https://www.acmicpc.net/problem/16170
 * 
 * @author siwon
 *
 */
public class Main {
	public static void main(String[] args){
		TimeZone now = TimeZone.getTimeZone("GMT-0");
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		df.setTimeZone(now);
		int index = 0;
		System.out.println(df.format(date).substring(index, index+=4));
		System.out.println(df.format(date).substring(index+=1, index+=2));
		System.out.print(df.format(date).substring(index+=1, index+=2));
	}
}
