package com.cicdpipeline.jendockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class JenDockerDemoApplication {

    @GetMapping
    public String message() {
        return "Jenkins and Docker demo";
    }

    public static void main(String[] args) {
        SpringApplication.run(JenDockerDemoApplication.class, args);
    }

}
