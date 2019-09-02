package com.wretchant.designpatterns.behavioral.strategy.mine;

import com.wretchant.designpatterns.behavioral.strategy.mine.calc.CalcGroup;
import com.wretchant.designpatterns.behavioral.strategy.mine.calc.CalcStrategySelector;
import com.wretchant.designpatterns.behavioral.strategy.mine.core.StrategyGroup;
import com.wretchant.designpatterns.behavioral.strategy.mine.pay.PayGroup;
import com.wretchant.designpatterns.behavioral.strategy.mine.pay.PayStrategySelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** @author Created by 谭健 on 2019/8/22. 星期四. 15:51. © All Rights Reserved. */
@Configuration
public class StrategyConfiguration {

  @Bean
  StrategyGroup<PayGroup> pay() {
    return new PayGroup(
        PayStrategySelector.class, "com.wretchant.designpatterns.behavioral.strategy.mine.pay");
  }

  @Bean
  StrategyGroup<CalcGroup> calc() {
    return new CalcGroup(
        CalcStrategySelector.class, "com.wretchant.designpatterns.behavioral.strategy.mine.calc");
  }
}
