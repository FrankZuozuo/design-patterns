package com.wretchant.designpatterns.behavioral.observer.jdk;

import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

/** @author Created by 谭健 on 2019/8/30. 星期五. 17:08. © All Rights Reserved. */
@Slf4j
public class Driver implements Observer {
  @Override
  public void update(Observable o, Object arg) {
    log.info("{} 观察到了变更 {}，携带参数 {}", this.getClass(), ((Light) o).getState(), arg);
  }
}
