package org.test;

public class Hello {
	public static void main(String[] args) {
		System.out.println("eligibility");
		int age=66;
		if(age<18){
		System.out.println("Not eligible  to vote" );
		}
		else if(age>=18 && age<60){
			System.out.println("Eligible to vote");
		}
		
		else if(age>=60) {
			System.out.println("Eligible to vote - Senior citizen");
		}
		
		}
}