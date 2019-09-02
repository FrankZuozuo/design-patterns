package com.wretchant.designpatterns.behavioral.strategy.simple;

/** @author Created by 谭健 on 2019/8/22. 星期四. 17:45. © All Rights Reserved. */
public class Subtract implements Strategy {
  @Override
  public int doOperation(int one, int two) {
    return one - two;
  }
}
