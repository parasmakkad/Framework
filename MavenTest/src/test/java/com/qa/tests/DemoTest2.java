package com.qa.tests;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DemoTest2 {
	@Test
	public void sum()
	{
		
		System.out.println("Sum");
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
	}
	@Test
	public void sub()
	{
		
		System.out.println("Sub");
		int a=10;
		int b=20;
		Assert.assertEquals(10, b-a);
	}
	@Test
	public void mul()
	{
		
		System.out.println("Mul");
		int a=10;
		int b=20;
		Assert.assertEquals(200, a*b);
	}
	@Test
	public void div()
	{
		
		System.out.println("Div");
		int a=10;
		int b=20;
		Assert.assertEquals(2, b/a);
	}
	
	
}
	
	

