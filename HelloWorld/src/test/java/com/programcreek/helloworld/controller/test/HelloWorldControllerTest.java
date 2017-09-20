package com.programcreek.helloworld.controller.test;

import org.junit.Test;

import com.programcreek.helloworld.controller.HelloWorldController;

import junit.framework.Assert;

public class HelloWorldControllerTest {
	static String message = "Welcome to Spring MVC!";
	
	@Test
	public void testPrintHelloWorld() {

		
		Assert.assertEquals(HelloWorldController.showMessage1(message), message);

	}
}
