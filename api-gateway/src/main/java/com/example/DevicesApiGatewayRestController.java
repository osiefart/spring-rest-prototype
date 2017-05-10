package com.example;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by osiefart on 10.05.17.
 */
@RestController
@RequestMapping("/devices")
public class DevicesApiGatewayRestController {

    @Autowired
    private DeviceClient deviceClient;

    @RequestMapping(method = RequestMethod.GET, value="names")
    public List<String> getDeviceNames(){
        return Lists.newArrayList(deviceClient.getDevices()).stream().map(Device::getName).collect(Collectors.toList());
    }


}
