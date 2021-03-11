package com.cg.lab9.service;


public class Factorial implements IFindFactorial{

	private int fact;
	
	public int getFact() {
		return fact;
	}
	public void setFact(int fact) {
		this.fact = fact;
	}
	
	/**
	 * @param fact
	 */
	public Factorial(int fact) {
		super();
		this.fact = fact;
	}
	public Factorial() {
		
	}
	@Override
	public int getFactorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++){    
		      fact=fact*i;    
		  }
		return fact;
	}
	

}
