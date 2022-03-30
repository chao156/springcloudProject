package com.springcloud.projectConsumer;

import com.springcloud.projectProvider.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    ProviderClient providerClient;

    @GetMapping("hi-feign")
    public String helloFeigh(){
        return providerClient.hello("Feigh");
    }
}
