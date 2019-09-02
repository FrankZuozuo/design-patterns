package com.wretchant.designpatterns.behavioral.observer.jdk;

import lombok.Getter;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Created by 谭健 on 2019/8/30. 星期五. 17:04. © All Rights Reserved.
 *     <p>Light 是一个被观察者
 */
@Getter
public class Light extends Observable {

  private String state;

  public Light(Observer... observers) {
    for (Observer observer : observers) {
      this.addObserver(observer);
    }
  }

  public void setState(String state) {
    this.state = state;
    // 通知改变
    setChanged();
    // 通知所有的观察者
    notifyObservers();
  }

  /**
   * 携带参数进行通知
   *
   * @param state 状态变更
   * @param args 携带参数
   */
  public void setState(String state, Object args) {
    this.state = state;
    // 通知改变
    setChanged();
    // 通知所有的观察者
    notifyObservers(args);
  }
}
