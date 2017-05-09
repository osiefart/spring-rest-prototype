package com.example;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * Created by osiefart on 29.04.17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DemoApplication.class})
@AutoConfigureMockMvc
public class MvcBase {

    @Autowired
    private MockMvc mockMvc;

    @Before
    public void setup() {
        RestAssuredMockMvc.mockMvc(mockMvc);
    }

}
