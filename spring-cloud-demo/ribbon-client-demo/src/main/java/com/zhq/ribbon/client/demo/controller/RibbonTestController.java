package com.zhq.ribbon.client.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : ZHQ
 * @date : 2020/3/22
 */
@RestController
@Slf4j
public class RibbonTestController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon/test1")
    public String ribbonTest1() {

        String url = "http://ribbon-service-demo/ribbon/service/hello";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        MultiValueMap<String, String> map= new LinkedMultiValueMap<>();
        map.add("name", "zhq");

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(map, headers);
        ResponseEntity<String> response = restTemplate.postForEntity( url, request , String.class );
        log.info("response = " + response.getBody());

        return "success";
    }
}
