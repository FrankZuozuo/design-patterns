package com.wretchant.designpatterns.creative.factory.simple;

/** @author Created by 谭健 on 2019/8/16. 星期五. 9:54. © All Rights Reserved. */
public class ColorFactory {
  public static Color get(ColorEnum color) {
    switch (color) {
      case RED:
        return new Red();
      case BLUE:
        return new Blue();
      case YELLOW:
        return new Yellow();
      default:
    }
    throw new IllegalArgumentException("不存在的类型");
  }
}
