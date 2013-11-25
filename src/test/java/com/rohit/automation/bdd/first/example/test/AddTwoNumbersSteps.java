package com.rohit.automation.bdd.first.example.test;

import static org.hamcrest.CoreMatchers.*;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.*;

import com.rohit.automation.bdd.first.example.Calculator;

public class AddTwoNumbersSteps {
	
	public AddTwoNumbersSteps(){
		super();
	}
	
	private Calculator calculator;
	
	@Given("a calculator")
	public void given_a_calculator(){
		this.calculator = new Calculator();
	}
	
	@When("I add $n1 and $n2")
	public void when_add_two_numbers(int n1, int n2){
		this.calculator.add(n1, n2);
	}
	
	@Then("the outcome should be $result")
	public void then_match_result(int result){
		assertThat(calculator.getResult(),equalTo(result));
	}
	
	@When("I add <number1> an <number2>")
	public void when_add_two_numbers_table(@Named("number1")int n1, @Named("number2")int n2){
		this.calculator.add(n1, n2);
	}
	
	@Then("the outcome should be <result>")
	public void then_match_result_table(@Named("result")int result){
		assertThat(calculator.getResult(),equalTo(result));
	}

}
