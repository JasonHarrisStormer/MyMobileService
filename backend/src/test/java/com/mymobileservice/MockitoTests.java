package com.mymobileservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.mymobileservice.services.AccountService;
import com.mymobileservice.services.LinesService;


@SpringBootTest
public class MockitoTests {
    
    @MockBean //mock account services
    private AccountService accService;

    @Test
    void findByEmail(){   }

    @MockBean //mock line services
    private LinesService lineService;

    @Test
    void findByPhoneNumber(){  }
}
