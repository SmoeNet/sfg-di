package guru.springframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.GreetingServiceImpl;

class PropertyInjectedControllerTest extends PropertyInjectedController {

	PropertyInjectedController controller;

	@BeforeEach
	void setUp() throws Exception {
		controller = new PropertyInjectedController();
		
		controller.greetingService = new GreetingServiceImpl();
	}

	@Test
	void testGetGreeting() {
		assertEquals("Hello World", controller.getGreeting(), "Property Injection Test Failed");
//		System.out.println(controller.getGreeting());
		
	}

}
