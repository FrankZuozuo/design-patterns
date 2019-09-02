package com.wretchant.designpatterns.creative.factory.abstracted;

import com.wretchant.designpatterns.creative.factory.abstracted.factory.ColorFactory;
import com.wretchant.designpatterns.creative.factory.abstracted.factory.FactoryEnum;
import com.wretchant.designpatterns.creative.factory.abstracted.factory.StyleFactory;

/** @author Created by 谭健 on 2019/8/16. 星期五. 10:13. © All Rights Reserved. */
public class AbstractFactory implements Factory<Factory, FactoryEnum> {

  @Override
  public Factory get(FactoryEnum factoryEnum) {
    switch (factoryEnum) {
      case COLOR:
        return new ColorFactory();
      case STYLE:
        return new StyleFactory();
      default:
    }
    throw new IllegalArgumentException("不存在的类型");
  }
}
