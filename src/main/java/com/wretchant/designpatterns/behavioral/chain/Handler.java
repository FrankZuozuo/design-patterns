package com.wretchant.designpatterns.behavioral.chain;

import lombok.AllArgsConstructor;

/** @author Created by 谭健 on 2019/8/16. 星期五. 11:08. © All Rights Reserved. */
@AllArgsConstructor
public abstract class Handler {

  protected Handler successor;

  private boolean hasNext() {
    return successor != null;
  }

  protected void next(XxRequest request) {
    if (hasNext()) {
      successor.execute(request);
    }
  }

  protected abstract void execute(XxRequest request);
}
