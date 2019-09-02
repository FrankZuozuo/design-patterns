package com.wretchant.designpatterns.behavioral.strategy.mine.pay;

import com.wretchant.designpatterns.behavioral.strategy.mine.core.Strategy;
import org.springframework.stereotype.Component;

/** @author Created by 谭健 on 2019/8/22. 星期四. 16:34. © All Rights Reserved. */
@Component
@PayStrategySelector
public class TencentPay implements Strategy<String> {
  @Override
  public void execute(String param) {
    System.out.println("tencent " + param);
  }
}
