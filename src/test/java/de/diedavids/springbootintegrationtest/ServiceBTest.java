package de.diedavids.springbootintegrationtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("integrationtest")
public class ServiceBTest {

    @MockBean
    ServiceA serviceA;


    @Test
    public void mockedServiceA_willReturnWhatIsPredefined() throws Exception {

        int expectedSum = 15;

        given(serviceA.add(5, 5)).willReturn(expectedSum);


        int result = serviceA.add(5, 5);

        assertEquals(expectedSum, result);
    }
}
