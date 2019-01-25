package com.rxliuli.example.springmvcnotgenericparam.service;

import org.springframework.stereotype.Service;

import java.io.File;

/**
 * @author rxliuli
 */
@Service
public class HomeService {
    public String getRoot() {
        return new File("./").getAbsolutePath();
    }
}
