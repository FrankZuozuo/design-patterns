package com.wretchant.designpatterns.creative.factory.abstracted.factory;

import com.wretchant.designpatterns.creative.factory.abstracted.Factory;
import com.wretchant.designpatterns.creative.factory.abstracted.product.style.*;

/** @author Created by 谭健 on 2019/8/16. 星期五. 10:25. © All Rights Reserved. */
public class StyleFactory implements Factory<Style, StyleEnum> {

  @Override
  public Style get(StyleEnum styleEnum) {
    switch (styleEnum) {
      case LEFT:
        return new Left();
      case RIGHT:
        return new Right();
      case CENTER:
        return new Center();
      default:
    }
    throw new IllegalArgumentException("不存在的类型");
  }
}
