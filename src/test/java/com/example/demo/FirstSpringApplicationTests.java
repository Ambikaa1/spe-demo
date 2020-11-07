package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FirstSpringApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	controllers controllers; //this brings controllers from the main code
	controllers x; //brings the variable x from controllers.java

	@Test
	void addNames() { //our test case
		assert(!controllers.helloWorld(null)); //asserts the name isn't null
		assert(controllers.helloWorld("test")); //passes "test" to controllers
		assert(controllers.names.contains("test")); //checks whether has been correctly added.
		assertEquals(7, controllers.x); //checks if x is equal to 7
		assertTrue(controllers.x > 6);
		assertFalse(controllers.x < 5);

	}

}
