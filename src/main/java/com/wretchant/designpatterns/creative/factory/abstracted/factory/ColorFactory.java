package com.wretchant.designpatterns.creative.factory.abstracted.factory;

import com.wretchant.designpatterns.creative.factory.abstracted.Factory;
import com.wretchant.designpatterns.creative.factory.abstracted.product.color.*;

/** @author Created by 谭健 on 2019/8/16. 星期五. 10:21. © All Rights Reserved. */
public class ColorFactory implements Factory<Color, ColorEnum> {

  @Override
  public Color get(ColorEnum colorEnum) {
    switch (colorEnum) {
      case YELLOW:
        return new Yellow();
      case BLUE:
        return new Blue();
      case RED:
        return new Red();
      default:
    }
    throw new IllegalArgumentException("不存在的类型");
  }
}
