package test;

import java.util.Random;

import org.junit.Test;

public class Learn {

	@Test
	public void test() {
		double i=0;
		Random random=new Random();
		//i=Math.random();
		i=random.nextDouble();
		System.out.println(i);
	}

}
