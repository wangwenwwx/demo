package com.example.demo;

import com.example.demo.service.MyTableService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;

@SpringBootTest
@Transactional
public class MyTableServiceTestA {

    @MockBean
    TestFeign feign;

    @Autowired
    MyTableService service;

    @Test
    void delete() {
        service.removeBatchByIds(Collections.singletonList(10001));
        Assertions.assertNull(service.getById(10001));
    }

    @Test
    void testIsExist() {
        Assertions.assertNotNull(service.getById(10001));
    }
}
