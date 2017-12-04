package de.diedavids.springbootintegrationtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("integrationtest")
public class ServiceATest {

	@Autowired
	ServiceB serviceB;


	@Test
	public void realServiceA_willReturnTheSum() throws Exception {

		 int result = serviceB.add(5,5);

		assertEquals(10, result);
	}
}
