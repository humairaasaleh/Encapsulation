package com.qa.encapsulation;

public class Runner {
	
	public static void main(String[] args) {
		Encapsulation example = new Encapsulation();
		
		example.setAccountnumber(6256392387l);
		example.setAge(21);
		example.setBalancein(198.99);
		example.setBalanceout(19.99f);
		example.setName("Dave");
		
		System.out.println(example.getAccountnumber());
		System.out.println(example.getAge());
		System.out.println(example.getBalancein());
		System.out.println(example.getBalanceout());
		System.out.println(example.getName());
		System.out.println(example.toString());
		
	}

}
