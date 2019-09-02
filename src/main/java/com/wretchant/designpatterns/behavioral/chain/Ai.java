package com.wretchant.designpatterns.behavioral.chain;

import lombok.extern.slf4j.Slf4j;

/** @author Created by 谭健 on 2019/8/16. 星期五. 11:22. © All Rights Reserved. */
@Slf4j
public class Ai extends Handler {
  public Ai(Handler successor) {
    super(successor);
  }

  @Override
  protected void execute(XxRequest request) {
    if (DuteEnum.A.equals(request.getDuteEnum())) {
      log.info("Ai");
    }
    next(request);
  }
}
