package com.wretchant.designpatterns.behavioral.strategy.mine.calc;

import lombok.Data;

/** @author Created by 谭健 on 2019/8/22. 星期四. 17:34. © All Rights Reserved. */
@Data
public class CalcParam {

  private Number one;
  private Number two;

  public CalcParam(Number one, Number two) {
    this.one = one;
    this.two = two;
  }
}
