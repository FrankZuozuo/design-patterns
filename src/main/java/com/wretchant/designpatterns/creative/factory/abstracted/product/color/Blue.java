package com.wretchant.designpatterns.creative.factory.abstracted.product.color;

import lombok.extern.slf4j.Slf4j;

/** @author Created by 谭健 on 2019/8/16. 星期五. 9:53. © All Rights Reserved. */
@Slf4j
public class Blue implements Color {
  @Override
  public void execute() {
    log.info("Blue");
  }
}
