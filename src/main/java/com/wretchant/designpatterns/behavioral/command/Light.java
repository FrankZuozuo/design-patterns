package com.wretchant.designpatterns.behavioral.command;

import lombok.extern.slf4j.Slf4j;

/** @author Created by 谭健 on 2019/8/16. 星期五. 11:36. © All Rights Reserved. */
@Slf4j
public class Light {

  public void on() {
    log.info("Light is on!");
  }

  public void off() {
    log.info("Light is off!");
  }
}
