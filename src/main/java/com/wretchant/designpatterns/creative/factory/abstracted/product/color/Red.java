package com.wretchant.designpatterns.creative.factory.abstracted.product.color;

import lombok.extern.slf4j.Slf4j;

/** @author Created by 谭健 on 2019/8/16. 星期五. 9:51. © All Rights Reserved. */
@Slf4j
public class Red implements Color {
  @Override
  public void execute() {
    log.info("Red");
  }
}
