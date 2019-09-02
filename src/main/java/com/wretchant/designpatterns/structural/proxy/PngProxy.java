package com.wretchant.designpatterns.structural.proxy;

import lombok.extern.slf4j.Slf4j;

/** @author Created by 谭健 on 2019/8/16. 星期五. 10:56. © All Rights Reserved. */
@Slf4j
public class PngProxy implements Image {

  private Png png;
  private String fileName;

  public PngProxy(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void display() {
    if (png == null) {
      png = new Png(fileName);
    }
    png.display();
  }
}
