package com.spring.cal.beans;

import java.util.Arrays;

public class Mul {
	private int num1;
	private int num2;

	public Mul() {
		super();
	}

	public Mul(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public void Display() {
		System.out.println("Action of Multipication [num1=" + num1 + ", num2=" + num2 + "]");
	}
	
	public int mul() {
		return num1 * num2;
	}
	
	public int mul(int...numbers) {
//		int sum = 0;
//		
//		for(int num: numbers) {
//			sum *= num;
//		}
//		
//		return sum;
		
		return Arrays.stream(numbers).reduce(0, (sum, num) -> sum * num);
	}
	
}