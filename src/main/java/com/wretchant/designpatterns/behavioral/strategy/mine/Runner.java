package com.wretchant.designpatterns.behavioral.strategy.mine;

import com.wretchant.designpatterns.behavioral.strategy.mine.calc.CalcGroup;
import com.wretchant.designpatterns.behavioral.strategy.mine.calc.CalcParam;
import com.wretchant.designpatterns.behavioral.strategy.mine.calc.Subtract;
import com.wretchant.designpatterns.behavioral.strategy.mine.core.StrategyGroup;
import com.wretchant.designpatterns.behavioral.strategy.mine.pay.PayGroup;
import com.wretchant.designpatterns.behavioral.strategy.mine.pay.TencentPay;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/** @author Created by 谭健 on 2019/8/22. 星期四. 17:28. © All Rights Reserved. */
@Configuration
public class Runner {

  @Bean
  ApplicationRunner payRunner(StrategyGroup<PayGroup> pay) {
    return args -> pay.getInstance(TencentPay.class).execute("$5.00");
  }

  @Bean
  ApplicationRunner calcRunner(StrategyGroup<CalcGroup> calc) {
    return args -> calc.getInstance(Subtract.class).execute(new CalcParam(1, 2));
  }
}
