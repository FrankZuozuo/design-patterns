package com.wretchant.designpatterns.creative.factory.abstracted.product.style;

import lombok.extern.slf4j.Slf4j;

/** @author Created by 谭健 on 2019/8/16. 星期五. 10:15. © All Rights Reserved. */
@Slf4j
public class Right implements Style {
  @Override
  public void execute() {
    log.info("Right");
  }
}
