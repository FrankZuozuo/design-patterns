package com.wretchant.designpatterns.behavioral.strategy.mine.calc;

import com.wretchant.designpatterns.behavioral.strategy.mine.core.Strategy;
import org.springframework.stereotype.Component;

/** @author Created by 谭健 on 2019/8/22. 星期四. 17:36. © All Rights Reserved. */
@Component
@CalcStrategySelector
public class Subtract implements Strategy<CalcParam> {
  @Override
  public void execute(CalcParam param) {
    System.out.println(param.getOne().intValue() - param.getTwo().intValue());
  }
}
