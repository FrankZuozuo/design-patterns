package com.wretchant.designpatterns.behavioral.command;

import lombok.AllArgsConstructor;

/** @author Created by 谭健 on 2019/8/16. 星期五. 11:38. © All Rights Reserved. */
@AllArgsConstructor
public class LightOffCommand implements Command {

  private Light light;

  @Override
  public void execute() {
    light.off();
  }
}
