package day32;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		Random random =new Random();
		Random random1 =new Random();
		Random random2 =new Random(2);
		Random random3 =new Random(2);
		System.out.println(System.currentTimeMillis());
		for(int i=0; i<5; i++) {
			System.out.println("random: "+i+"번째 값: " +random.nextInt(10));
		}
		for(int i=0; i<5; i++) {
			System.out.println("random1: "+i+"번째 값: " +random.nextInt(10));
		}
		for(int i=0; i<5; i++) {
			System.out.println("random2: "+i+"번째 값: " +random2.nextInt(10));
		}
		for(int i=0; i<5; i++) {
			System.out.println("random3:"+i+"번째 값:" +random3.nextInt(10));
		}
		
	}
	

}
