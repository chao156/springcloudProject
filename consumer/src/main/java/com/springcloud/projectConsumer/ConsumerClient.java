package com.springcloud.projectConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class ConsumerClient {
    @RestController
    public class ConsumerController {

        @Autowired
        ProviderClient providerClient;

        @GetMapping("/hi-feign")
        public String hiFeign(){
            return providerClient.hello("feign");
        }
    }


}
