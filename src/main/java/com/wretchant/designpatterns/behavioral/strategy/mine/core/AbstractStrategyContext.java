package com.wretchant.designpatterns.behavioral.strategy.mine.core;

import com.google.common.collect.Sets;
        import lombok.extern.slf4j.Slf4j;
        import org.reflections.Reflections;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.context.ApplicationContext;

        import javax.annotation.PostConstruct;
        import java.lang.annotation.Annotation;
        import java.util.Set;

/** @author Created by 谭健 on 2019/8/22. 星期四. 14:59. © All Rights Reserved. */
@Slf4j
public abstract class AbstractStrategyContext {

  @Autowired private ApplicationContext applicationContext;
  private Class<? extends Annotation> strategy;
  private String basePackage;

  public AbstractStrategyContext(Class<? extends Annotation> strategy, String basePackage) {
    this.strategy = strategy;
    this.basePackage = basePackage;
  }

  /** 装载策略的容器，默认大小为7 */
  protected Set<Class<?>> container = Sets.newHashSetWithExpectedSize(7);

  public Strategy getInstance(Class<?> clazz) {
    if (container.contains(clazz)) {
      return (Strategy) applicationContext.getBean(clazz);
    }
    throw new IllegalArgumentException("找不到指定的策略，请确认已经在spring 中注册了指定的策略或者将策略注册到容器");
  }

  @PostConstruct
  public void scan() {
    if (log.isDebugEnabled()) {
      log.debug("开始扫描 [{}] 包下的 [{}] 策略", basePackage, strategy);
    }
    Reflections reflections = new Reflections(basePackage);
    this.container = reflections.getTypesAnnotatedWith(strategy);
    if (log.isDebugEnabled()) {
      log.debug("扫描到 [{}] 个策略", container.size());
    }
  }
}
