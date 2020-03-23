package com.frankie.playspringboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Yao Frankie
 * @date: 2020/3/23 15:49
 */
@RestController
@ConfigurationProperties(prefix = "rc")
public class ReadConfigController {

    @Value("${rc.name}")
    private String applicationName;

    @Value("${rc.version}")
    private String applicationVersion;

//    private String name;
//    private String version;

    @GetMapping("/config")
    public String readConfig(){
        return String.format("applicationName: %s, applicationVersion: %s", applicationName, applicationVersion);
//        return String.format("applicationName: %s, applicationVersion: %s", name, version);
    }
}
