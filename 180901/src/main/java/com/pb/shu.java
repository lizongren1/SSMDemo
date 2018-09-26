package com.pb;

public class shu {

	public static void main(String[] args) {
		for(int a=1;a<100000;a++) {
			double q=Math.sqrt(a+100);	
			double w=q*10000;
			int wq=(int)w;
			
			double q1=Math.sqrt(a+268);	
			double w1=q1*10000;
			int wq1=(int)w1;
			
			if(wq%10000==0&wq1%10000==0) {
				System.out.println(a);
			}
		}
	}
}
