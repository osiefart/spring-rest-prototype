package com.example;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;
import java.util.List;

@FeignClient("devmgmt-service")
public interface DeviceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/devices")
    Resources<Device> getDevices();

}