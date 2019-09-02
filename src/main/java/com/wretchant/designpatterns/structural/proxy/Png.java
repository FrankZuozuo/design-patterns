package com.wretchant.designpatterns.structural.proxy;

import lombok.extern.slf4j.Slf4j;

/** @author Created by 谭健 on 2019/8/16. 星期五. 10:55. © All Rights Reserved. */
@Slf4j
public class Png implements Image {
  @Override
  public void display() {
    log.info("Png {}", fileName);
  }

  private String fileName;

  public Png(String fileName) {
    this.fileName = fileName;
    load();
  }

  private void load() {
    log.info("Png load");
  }
}
