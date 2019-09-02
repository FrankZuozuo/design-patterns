package com.wretchant.designpatterns.behavioral.observer.jdk;

/** @author Created by 谭健 on 2019/8/30. 星期五. 17:15. © All Rights Reserved. */
public class Main {
  public static void main(String[] args) {
    Light light = new Light(new Student(), new Driver());

    light.setState("red");
    light.setState("green");
    light.setState("yellow", "warning");
  }
}
