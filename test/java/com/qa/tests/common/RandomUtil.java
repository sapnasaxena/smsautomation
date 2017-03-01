package com.qa.tests.common;

import java.util.Random;

public class RandomUtil {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	public static String generateRandomMobileNo()
	{
		Random random=new Random();
	    int randomNumber=0;
	    boolean loop=true;
	    while(loop) {
	        randomNumber=random.nextInt();
	        if(Integer.toString(randomNumber).length()==10 && !Integer.toString(randomNumber).startsWith("-")) {
	            loop=false;
	        }
	        }
	    return Integer.toString(randomNumber); 
	
	}
}

//}
