package com.wretchant.designpatterns.behavioral.strategy.mine.core;

/**
 * @author Created by 谭健 on 2019/8/22. 星期四. 16:02. © All Rights Reserved.
 *     <p>策略组，代表一组策略
 */
public interface StrategyGroup<T> {

  Strategy getInstance(Class<?> clazz);
}
