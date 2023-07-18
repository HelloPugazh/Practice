package com.junit;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JunitApplicationTests {

	@Autowired
	UnitController un;
	
	@Test
	public void testNull() {
		assertNotNull(un.getString());
	}

}
