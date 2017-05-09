package com.example;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("devices")
public interface DeviceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/devices")
    List<Device> getStores();

}