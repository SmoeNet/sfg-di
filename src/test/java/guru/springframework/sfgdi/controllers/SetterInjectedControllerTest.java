package guru.springframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.ConstructorInjectedGreetingService;

class SetterInjectedControllerTest {

	SetterInjectedController controller;
	
	@BeforeEach
	void setUp() throws Exception {
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorInjectedGreetingService());
	}

	@Test
	void testGetGreeting() {
		assertEquals("Hello World", controller.getGreeting(), "Setter Injection Test Failed");
//		System.out.println(controller.getGreeting());
	}

}
