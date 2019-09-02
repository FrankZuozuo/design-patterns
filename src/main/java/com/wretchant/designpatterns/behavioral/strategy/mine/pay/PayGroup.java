package com.wretchant.designpatterns.behavioral.strategy.mine.pay;

import com.wretchant.designpatterns.behavioral.strategy.mine.core.AbstractStrategyContext;
import com.wretchant.designpatterns.behavioral.strategy.mine.core.StrategyGroup;

import java.lang.annotation.Annotation;

/** @author Created by 谭健 on 2019/8/22. 星期四. 15:49. © All Rights Reserved. */
public class PayGroup extends AbstractStrategyContext implements StrategyGroup<PayGroup> {

  public PayGroup(Class<? extends Annotation> strategy, String basePackage) {
    super(strategy, basePackage);
  }
}
