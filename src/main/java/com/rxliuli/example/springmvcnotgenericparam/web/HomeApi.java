package com.rxliuli.example.springmvcnotgenericparam.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author rxliuli
 */
@RestController
@RequestMapping("/")
public class HomeApi {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @PostMapping("testMap")
    public Map<Integer, Integer> testMap(@RequestBody Map<Integer, Integer> map) {
        log.info("map: {}", map);
        return map;
    }
}
