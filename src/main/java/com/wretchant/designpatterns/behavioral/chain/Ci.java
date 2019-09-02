package com.wretchant.designpatterns.behavioral.chain;

import lombok.extern.slf4j.Slf4j;

/** @author Created by 谭健 on 2019/8/16. 星期五. 11:22. © All Rights Reserved. */
@Slf4j
public class Ci extends Handler {
  public Ci(Handler successor) {
    super(successor);
  }

  @Override
  protected void execute(XxRequest request) {
    if (DuteEnum.C.equals(request.getDuteEnum())) {
      log.info("Ci");
    }
    next(request);
  }
}
