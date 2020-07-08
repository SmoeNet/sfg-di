package guru.springframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.ConstructorInjectedGreetingService;

class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		controller = new ConstructorInjectedController(new ConstructorInjectedGreetingService());
	}

	@Test
	void testGetGreeting() {
		assertEquals("Hello World", controller.getGreeting(), "Constructor Injection Test Failed");
//		System.out.println(controller.getGreeting());
	}

}
