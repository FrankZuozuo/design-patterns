package com.wretchant.designpatterns.behavioral.strategy.mine.calc;

import com.wretchant.designpatterns.behavioral.strategy.mine.core.AbstractStrategyContext;
import com.wretchant.designpatterns.behavioral.strategy.mine.core.StrategyGroup;

import java.lang.annotation.Annotation;

/** @author Created by 谭健 on 2019/8/22. 星期四. 17:31. © All Rights Reserved. */
public class CalcGroup extends AbstractStrategyContext implements StrategyGroup<CalcGroup> {

  public CalcGroup(Class<? extends Annotation> strategy, String basePackage) {
    super(strategy, basePackage);
  }
}
