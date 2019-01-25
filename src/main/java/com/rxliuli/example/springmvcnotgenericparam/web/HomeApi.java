package com.rxliuli.example.springmvcnotgenericparam.web;

import com.rxliuli.example.springmvcnotgenericparam.service.HomeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author rxliuli
 */
@RestController
@RequestMapping("/")
public class HomeApi {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private HomeService homeService;

    @PostMapping("testMap")
    public Map<Integer, Integer> testMap(@RequestBody Map<Integer, Integer> map) {
        log.info("map: {}", map);
        return map;
    }

    @GetMapping
    public String index() {
        return homeService.getRoot();
    }
}
