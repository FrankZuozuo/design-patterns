package com.wretchant.designpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/** @author A-PC */
@RestController
@SpringBootApplication
public class DesignPatternsApplication {

  public static void main(String[] args) {
    SpringApplication.run(DesignPatternsApplication.class, args);
  }
}
