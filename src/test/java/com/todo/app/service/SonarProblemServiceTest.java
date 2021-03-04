package com.todo.app.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class SonarProblemServiceTest {

    @Mock
    SonarProblemService service;

    @Before
    public void init(){
        service = new SonarProblemService();
    }

    /*
    @Test
    public void testSum(){
        service.setNumberOne(10);
        service.setNumberTwo(20);
        assertEquals(30, service.getSum());
    }
    */

}
