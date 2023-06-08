package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "test",url = "https://www.baidu.com")
public interface TestFeign {

    @GetMapping
    String get();
}
