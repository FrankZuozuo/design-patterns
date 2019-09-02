package com.wretchant.designpatterns.creative.singleton.inner;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/** @author Created by 谭健 on 2019/8/16. 星期五. 10:39. © All Rights Reserved. */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Singleton {

  private static class SingletonHolder {
    private static final CoreHandler INSTANCE = new CoreHandler();
  }

  public static CoreHandler getUniqueInstance() {
    return SingletonHolder.INSTANCE;
  }
}
