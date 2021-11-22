package org.test;

public class Hello {
	public static void main(String[] args) {
//<<<<<<< HEAD
		System.out.println("Voter's eligibility");
		int age=18;
//=======
		if(age<18){
			System.out.println("Not eligible  to vote" );
			}
			else if(age>=18 && age<60){
				System.out.println("Eligible to vote");
			}
		
//>>>>>>> bb8aaf5ac48c1e64997d182a07d1405ef9a1f879
		
			else if(age>=60) {
				System.out.println("Eligible to vote - Senior citizen");
			}
//<<<<<<< HEAD
		
//=======
			
//>>>>>>> bb8aaf5ac48c1e64997d182a07d1405ef9a1f879
		
		}
}