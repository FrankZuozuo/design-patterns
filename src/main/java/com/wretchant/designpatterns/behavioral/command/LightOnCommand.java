package com.wretchant.designpatterns.behavioral.command;

import lombok.AllArgsConstructor;

/** @author Created by 谭健 on 2019/8/16. 星期五. 11:37. © All Rights Reserved. */
@AllArgsConstructor
public class LightOnCommand implements Command {

  private Light light;

  @Override
  public void execute() {
    light.on();
  }
}
