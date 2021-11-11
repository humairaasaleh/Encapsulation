package com.qa.encapsulation;

public class Encapsulation {

	private String name;
	private int age;
	private double balancein;
	private float balanceout;
	private long accountnumber;

//	CONSTRUCTORS

	public Encapsulation(String name, int age, double balancein, float balanceout, long accountnumber) {
		this.name = name;
		this.age = age;
		this.balancein = balancein;
		this.balanceout = balanceout;
		this.accountnumber = accountnumber;
	}

	public Encapsulation() {
	}

//	GETTERS AND SETTERS

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getBalancein() {
		return balancein;
	}

	public void setBalancein(double balancein) {
		this.balancein = balancein;
	}

	public float getBalanceout() {
		return balanceout;
	}

	public void setBalanceout(float balanceout) {
		this.balanceout = balanceout;
	}

	public long getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}

	@Override
	public String toString() {
		return "Encapsulation [name=" + name + ", age=" + age + ", balancein=" + balancein + ", balanceout="
				+ balanceout + ", accountnumber=" + accountnumber + "]";
	}

}
