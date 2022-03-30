package com.springcloud.projectProvider;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="provider")
public interface ProviderClient {

    @GetMapping("/hello")
    String hello(@RequestParam(value = "name", defaultValue = "NACOS", required = false) String name);
}
