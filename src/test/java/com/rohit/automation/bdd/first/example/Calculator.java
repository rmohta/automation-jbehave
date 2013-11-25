package com.rohit.automation.bdd.first.example;

public class Calculator {

	private int result;
	
	public void add(int number1, int number2){
		this.result = number1+number2;
	}
	
	public int getResult(){
		return this.result;
	}
}
